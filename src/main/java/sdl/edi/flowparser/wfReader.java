/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.flowparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.commons.io.FileUtils;


import sdl.edi.wfxml.*;
import sdl.edi.wfxml.actions.*;

/**
 *
 * @author russseba
 */
public class wfReader {

     private List<wftorso> wflist;
     
     private String solutionpath;

    public List<wftorso> getWflist() {
        return wflist;
    }

    public void setWflist(List<wftorso> wflist) {
        this.wflist = wflist;
    }
    
    

    
    
    public wfReader(String DirName) throws JAXBException, FileNotFoundException, IOException {
        DeciderRule dcr = new DeciderRule();
       System.out.println(DirName);
          wflist = new ArrayList<>();
          Iterator it = FileUtils.iterateFiles(new File(DirName), null, true);
          
          
          File Sk = new File(DirName);
          
          Sk.getParent();
          Sk.getParent();
          
          solutionpath = Sk.getAbsolutePath();
          
          
          
          while(it.hasNext()){
             wftorso wfg= new wftorso();
            
             File ms = ((File) it.next()).getAbsoluteFile();
            FileReader hh =  new FileReader(ms);  
            
            
            wfg.setWfpath(DirName);
            wfg.setWfFilename(ms.getName());
            
//            int c;
//            int fr_count = 0;
//            while ( -1 != (c = hh.read()) ) 
//                fr_count++;
//
//             StringBuffer stringBuffer = new StringBuffer();
//             int numCharsRead=0;
//			char[] charArray = new char[fr_count ];
////			while ((numCharsRead = hh.read(charArray)) > 0) {
////				stringBuffer.append(charArray, 0, numCharsRead);
////			}
//			hh.read(charArray);
//                        stringBuffer.append(charArray);
                        
               BufferedReader br = new BufferedReader(hh) ;

            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null) {

                sb.append(line);

                if (line != null) {
                    sb.append(System.lineSeparator());
                }
            }
            
            //System.out.println(sb);
        
            


             wfg.setWfsoucecode(sb.toString());
            StringReader reader = new StringReader(sb.toString());
             
             
            JAXBContext context = JAXBContext.newInstance(DeciderRule.class);
            dcr= (DeciderRule) context.createUnmarshaller().unmarshal(reader);
            System.out.println(dcr.getName());
            List<Updates> ulist= new ArrayList<>();
            wfg.wfrulename=dcr.getName();
            wfg.wfname = dcr.getFlowName();
            wfg.setWfdestination(dcr.getDestination());
            
            
              
            for(int i=0;i<=dcr.getConditions().getNotExistsOrProperty().size()-1; i++){
                
//               
                String fdfd= ""; 
                 Property pt= new Property();
                 if(pt.getClass().equals(dcr.getConditions().getNotExistsOrProperty().get(i).getClass())){

                       pt=  (Property) dcr.getConditions().getNotExistsOrProperty().get(i);
                           System.out.println(pt.getName());
                if(pt.getName().contains("EDI_Stage")){
                    wfg.wfstageexpectetd= pt.getEquals();
                       fdfd+=pt.getName() + "=" + pt.getEquals();
                       wfg.adProp(fdfd); 
                }else{
                   
                      
                      
                      try {
                             fdfd=pt.getName() ;
                             // System.out.println(fdfd);
                             if(pt.getEquals()!=null){
                                 //fdfd+="=" + pt.getEquals();
                                 wfg.adProp(pt.getName(),"equals",pt.getEquals());
                             }else if(pt.getRegexp() != null){
                                  //fdfd+=" Regex=" +pt.getRegexp() ;
                                  wfg.adProp(pt.getName(),"regex",pt.getRegexp());
                             }else if (pt.getNotEquals()!=null){     
                                  fdfd+=" !=" +pt.getNotEquals() ;
                                  wfg.adProp(pt.getName(),"notequals",pt.getNotEquals());
                             }else if(pt.toString() != null){
                                 fdfd+="  " + pt.toString() ;
                                 
                             }
                             System.out.println("### addprop before ###" + pt.getEquals() + "//" + pt.getRegexp() + "//" + pt.getNotEquals() + "// " + pt.toString() );
                          wfg.adProp(fdfd);                     
                       
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                   
                   
}
                 }
            }
            
            
            
            
           for(int i=0;i<=dcr.getUpdates().getUpdate().size()-1;i++){
               Update up=new Update();
               if(dcr.getUpdates().getUpdate().get(i).getProperty().contains("EDI_Stage")){
                   wfg.setWfstage(dcr.getUpdates().getUpdate().get(i).getValue());
               }
               System.out.println(dcr.getUpdates().getUpdate().get(i).getActions());
               try {
                   System.out.println(dcr.getUpdates().getUpdate().get(i).getValue());
                   for (int pi = 0; pi <= dcr.getUpdates().getUpdate().get(i).getActions().getAction().size() - 1; pi++) {
                         System.out.println("xx");
                       
                       if (dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getType().contains("mapping-xquery")) {
                           
                           for (int pis = 0; pis <= dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().size() - 1; pi++) {
                               
                           if(dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getName().contains("MappingName")){    
                               String hhk=dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getParam().get(pis).getContent();
                              wfg.adUpdate("mapping-xquery",hhk , true);
                              wfg.setWfmapping(Boolean.TRUE);
                           }
                           }
                           wfg.setWfmapping(Boolean.TRUE);
                           System.out.println("Mapping!");
                       }
                       
                       
                       if (dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getType().contains("split")) {
                           
                       

                              wfg.setWfSpitStep(Boolean.TRUE);
                 
                     
                       }
                       
                         if (dcr.getUpdates().getUpdate().get(i).getActions().getAction().get(pi).getType().contains("copy")) {
                           
                       

                              wfg.setWfCopyStep(Boolean.TRUE);
                 
                     
                       }
                   }
                   
               } catch (Exception e) {
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
           }
              
            
           System.out.println(wfg.getWfstage() + "<-" + wfg.wfstageexpectetd);
        
           wflist.add(wfg);
            
            // C:\Users\russseba\Documents\SVN\ediresources\final\DGF4open\rules\DGF4open_Airbus\DGF4open_Airbus_STD_MAN_incoming
            
        }
        
    }
    
}
