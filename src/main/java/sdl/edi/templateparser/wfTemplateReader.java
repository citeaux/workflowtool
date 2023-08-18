package sdl.edi.templateparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sdl.edi.wf.FlowBuild.FlowBuildController;
import sdl.edi.wf.model.data.Ruletemplates;
import sdl.edi.wfxml.DeciderRule;
import sdl.edi.wfxml.Property;
import sdl.edi.wfxml.Update;
import sdl.edi.wfxml.Updates;



public class wfTemplateReader {
	Logger logger = LoggerFactory.getLogger(wfTemplateReader.class);

	
	private List<wftorso> wflist;

	private String solutionpath;

	public List<wftorso> getWflist() {
	   return wflist;
	}

	public void setWflist(List<wftorso> wflist) {
	   this.wflist = wflist;
	}

	public wfTemplateReader(List<Ruletemplates> ruletemplates) throws IOException, JAXBException {
		DeciderRule dcr = new DeciderRule();
		 wflist = new ArrayList<>();
		 
		 
		 Iterator<Ruletemplates> ruleiterator= ruletemplates.iterator();
		
		 
		 
		 Ruletemplates currentrule= new Ruletemplates();
		 
		 while(ruleiterator.hasNext()) {
			 currentrule = ruleiterator.next();
		     Reader targetReader = new StringReader(currentrule.getRulexml());
		 
	
		    BufferedReader br = new BufferedReader(targetReader) ;

            StringBuilder sb = new StringBuilder();
            wftorso wfg= new wftorso(); 
            
            String line;
            while ((line = br.readLine()) != null) {

                sb.append(line);

                if (line != null) {
                    sb.append(System.lineSeparator());
                }
		
	        }
	
            wfg.setWfsoucecode(sb.toString());
            StringReader reader = new StringReader(sb.toString());
            
            
            JAXBContext context = JAXBContext.newInstance(DeciderRule.class);
            dcr= (DeciderRule) context.createUnmarshaller().unmarshal(reader);
            
            List<Updates> ulist= new ArrayList<>();
            wfg.setRuleid(currentrule.getId());
            wfg.setRuleidafter(currentrule.getAfterruleid());
            wfg.setRuleidbefore(currentrule.getBeforeruleid());
            wfg.wfrulename=dcr.getName();
            wfg.wfname = dcr.getFlowName();
            wfg.setWfdestination(dcr.getDestination());
            
            
            for(int i=0;i<=dcr.getConditions().getNotExistsOrProperty().size()-1; i++){
                
//              
               String fdfd= ""; 
                Property pt= new Property();
                if(pt.getClass().equals(dcr.getConditions().getNotExistsOrProperty().get(i).getClass())){

				                      pt=  (Property) dcr.getConditions().getNotExistsOrProperty().get(i);
				                      logger.debug("Property Name: " + pt.getName());      
					               if(pt.getName().contains("EDI_Stage")){
					                      wfg.wfstageexpectetd= pt.getEquals();
					                      
					                      
					                      
					                      if(pt.getEquals()!=null){
				                               
				                            	
				                                wfg.adProp(pt.getName(),"equals",pt.getEquals());
				                            }else if(pt.getRegexp() != null){
				                            	
				                                
				                                 wfg.adProp(pt.getName(),"regex",pt.getRegexp());
				                            }else if (pt.getNotEquals()!=null){    
				                           
				                                 wfg.adProp(pt.getName(),"notequals",pt.getNotEquals());
				                            }else {}
					                      
					                      logger.debug("Property Name2: " + fdfd);     
					                      
						               }else{
						                  
						                     
						                     
						                     try {
						                    	 fdfd=pt.getName() ;
						                            
						                            // System.out.println(fdfd);
						                            if(pt.getEquals()!=null){
						                               
						                            	
						                                wfg.adProp(pt.getName(),"equals",pt.getEquals());
						                            }else if(pt.getRegexp() != null){
						                            	
						                                
						                                 wfg.adProp(pt.getName(),"regex",pt.getRegexp());
						                            }else if (pt.getNotEquals()!=null){    
						                           
						                                 wfg.adProp(pt.getName(),"notequals",pt.getNotEquals());
						                            }else if(pt.toString() != null){
						                            	
						                                fdfd+="  " + pt.toString() ;
						                                wfg.adProp(fdfd);
						                                
						                            }
						                            System.out.println("### addprop before ###" + pt.getEquals() + "//" + pt.getRegexp() + "//" + pt.getNotEquals() + "// " + pt.toString() );
						                            
						                            if(pt.getEquals() == null && pt.getRegexp() == null &&  pt.getNotEquals() == null ) {
						                            	
						                            }else {
						                            	logger.debug("all prperties2: " + fdfd);
						                            	
						                            }
						                   
						                               
						                    	
						                      
						                   } catch (Exception e) {
						                       e.printStackTrace();
						                   }
					                  
                  
					            }
                }
           }
            logger.debug("all prperties: " + wfg.getProp());
           
            for(int i=0;i<=dcr.getUpdates().getUpdate().size()-1;i++){
                Update up=new Update();
                if(dcr.getUpdates().getUpdate().get(i).getProperty().contains("EDI_Stage")){
                    wfg.setWfstage(dcr.getUpdates().getUpdate().get(i).getValue());
                }
        
                
             
                 
                  
                  if(dcr.getUpdates().getUpdate().get(i).getActions()!= null) {  
                	 
                    for (int pi = 0; pi <= dcr.getUpdates().getUpdate().get(i).getActions().getAction().size()-1; pi++) {
                    	   try {

                            
                            for (int pis = 0; pis <= dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().size()-1; pis++) {
                      
		                            	 
		                            if(dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getName().contains("MappingName")){    
		                                String hhk=dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getContent();
		                               wfg.adUpdate("mapping-xquery",hhk , true);
		                               wfg.setWfmapping(Boolean.TRUE);
		                            }
		                            
		                            
		                            
		                            if(dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getName().contains("Schema")){    
		                                String hhk=dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getContent();
		                               wfg.adUpdate("validate-xsd",hhk , true);
		                              
		                            }
		                            
		                            
		                            if(dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getName().contains("MFL") && dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getType().contains("xml-parse")){    
		                                String hhk=dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getContent();
		                               wfg.adUpdate("xml-parse",hhk , true);
		                              
		                            }
		                            
		                            if(dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getName().contains("MFL") && dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getType().contains("xml-serialize")){    
		                                String hhk=dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getContent();
		                               wfg.adUpdate("xml-serialize",hhk , true);
		                              
		                            }
		                            
		                            if(dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getName().contains("UnwrapNodes") && dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getType().contains("xml-serialize")){    
		                                String hhk=dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getContent();
		                               wfg.adUpdate("xml-serialize",hhk , true);
		                              
		                            }
		                            
		                            if(dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getName().contains("WrapNodes") && dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getType().contains("xml-parse")){    
		                                String hhk=dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getContent();
		                               wfg.adUpdate("xml-parse",hhk , true);
		                              
		                            }
                            
                            }
                            wfg.setWfmapping(Boolean.TRUE);
                     
                        
                        
                        
                        if (dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getType().contains("split")) {
                            
                        

                               wfg.setWfSpitStep(Boolean.TRUE);
                  
                      
                        }
                        
                          if (dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getType().contains("copy")) {
                            
                        

                               wfg.setWfCopyStep(Boolean.TRUE);
                  
                      
                        }
                    } catch (Exception e) {
                    	logger.debug("Exception1:" + e.toString());
                    	
                    }
                    }
                  }
            
                
                try {
                    if (dcr.getUpdates().getUpdate().get(i).getProperty().contains("EDI_Protocol")) {
                        
                        wfg.setWfpartner(Boolean.TRUE);
                        System.out.println("Partner! " +dcr.getName());
           
                    }
                } catch (Exception e) {
                }
                
                
                
                
                
                try {
                    if (dcr.getUpdates().getUpdate().get(i).getProperty().contains("EDI_Partner")) {
                       wfg.adUpdate("EDI_Partner", dcr.getUpdates().getUpdate().get(i).getValue(),false);
                        wfg.setWfpartner(Boolean.TRUE);
                        System.out.println("Partner! " +dcr.getName());
           
                    }
                } catch (Exception e) {
                }
                
                
                String fdfd= ""; 
                try {
                   
                    // System.out.println(fdfd);
                    if(dcr.getUpdates().getUpdate().get(i).getValue()!=null){
                        //fdfd+="=" + pt.getEquals();
                        wfg.adUpdate(dcr.getUpdates().getUpdate().get(i).getProperty(),dcr.getUpdates().getUpdate().get(i).getValue(),false);
                    }
                        
                    }
                    
                               
              
            catch (Exception e) {
               e.printStackTrace();
           }
                
            }
               
             
            System.out.println(wfg.getWfstage() + "<-" + wfg.wfstageexpectetd);
         
            wflist.add(wfg);
             
             // C:\Users\russseba\Documents\SVN\ediresources\final\DGF4open\rules\DGF4open_Airbus\DGF4open_Airbus_STD_MAN_incoming
             
         }
	    }
     }
	


