/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.flowparser;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian Russ
 */
public class wftorso {
    
    String wfsoucecode;
    public String wfname;
    String wfrulename;
    String wfstage;
    String wfstageexpectetd;
    String wfdestination;
    String wfpath;
    String wfFilename;
    String wfsolutionpath;
    List<wfMapping> mappings;
    List<wfPartners> partners;
    List<wfUpdates> updates;
    Boolean wfmapping;
    Boolean wfpartner;
    Boolean wfSpitStep;
    Boolean wfCopyStep;
    List<wfproperties>props;


    public Boolean getWfSpitStep() {
        return wfSpitStep;
    }

    public void setWfSpitStep(Boolean wfSpitStep) {
        this.wfSpitStep = wfSpitStep;
    }

    public Boolean getWfCopyStep() {
        return wfCopyStep;
    }

    public void setWfCopyStep(Boolean wfCopyStep) {
        this.wfCopyStep = wfCopyStep;
    }
    
    
    

    public String getWfsoucecode() {
        return wfsoucecode;
    }

    public void setWfsoucecode(String wfsoucecode) {
        this.wfsoucecode = wfsoucecode;
    }

    public String getWfdestination() {
        return wfdestination;
    }

    public void setWfdestination(String wfdestination) {
        this.wfdestination = wfdestination;
    }
    

    
    
    public Boolean getWfmapping() {
        return wfmapping;
    }

    public void setWfmapping(Boolean wfmapping) {
        this.wfmapping = wfmapping;
    }

    public Boolean getWfpartner() {
        return wfpartner;
    }

    public void setWfpartner(Boolean wfpartner) {
        this.wfpartner = wfpartner;
    }
    
    

    public String getWfFilename() {
		return wfFilename;
	}

	public void setWfFilename(String wfFilename) {
		this.wfFilename = wfFilename;
	}

	public String getWfsolutionpath() {
		return wfsolutionpath;
	}

	public void setWfsolutionpath(String wfsolutionpath) {
		this.wfsolutionpath = wfsolutionpath;
	}

	public wftorso() {
         props= new ArrayList<>();
         updates =  new ArrayList<>();
         this.wfpartner=false;
         this.wfmapping=false;
         this.partners = new ArrayList<wfPartners>();
         this.mappings = new ArrayList<wfMapping>();
    }

    public String getWfname() {
        return wfname;
    }

    public List<wfUpdates> getUpdates() {
        return updates;
    }

    public void setUpdates(List<wfUpdates> updates) {
        this.updates = updates;
    }
      public void adUpdate(String property, String  parameter, Boolean isAnActon) throws IOException {
         wfUpdates hh = new wfUpdates(property, parameter, isAnActon);
         this.updates.add(hh);
         if(property.equals("EDI_Partner")){
             wfPartners np = new wfPartners(parameter,this.wfsolutionpath,"\\partners");
                       this.partners.add(np);
         }
         
         
           if(property.equals("mapping-xquery")){
               
               String[] parts =  parameter.split("/");
              
               
             wfMapping np = new wfMapping(parts[parts.length-1],this.wfsolutionpath,"\\saxon\\Mappings");
                    System.out.println("Mapping:" + np);
                       this.mappings.add(np);
         }
        
    }
    

    public void setWfname(String wfname) {
        this.wfname = wfname;
    }

    public String getWfrulename() {
        return wfrulename;
    }

    public void setWfrulename(String wfrulename) {
        this.wfrulename = wfrulename;
    }

    public String getWfstage() {
        return wfstage;
    }

    public void setWfstage(String wfstage) {
        this.wfstage = wfstage;
    }

    public String getWfstageexpectetd() {
        return wfstageexpectetd;
    }

    public void setWfstageexpectetd(String wfstageexpectetd) {
        this.wfstageexpectetd = wfstageexpectetd;
    }
    
    public void adProp(String name, String operation, String parameter) throws IOException{
        System.out.println("---- AddProp ---- " + name + "//" +  operation + "//" + parameter);
        
        if(name.equals("EDI_Partner")){
                
                 if(operation.equals("equals")){
                     
                     System.out.println("---- EDIPartner ---- "  + this.wfsolutionpath);
                       wfPartners np = new wfPartners(parameter,this.wfsolutionpath,"\\partners");
                       this.partners.add(np);
                 }
        }
        
         if(name.equals("EDI_Sender")){
                 if(operation == "equals" &&  parameter == "jmsexporter.*"){
                       wfPartners np = new wfPartners("AX4EXPORT");
                       np.setPartnerType("AX4EXPORT");
                       this.partners.add(np);
                 }
        }
        
         props.add(new wfproperties(name, operation, parameter));
    }
        public void adProp(String name){
         props.add(new wfproperties(name, "", ""));
    }
    
    public String getProp(int i){
        return props.get(i).getName() + "  " + props.get(i).operation + " " + props.get(i).parameter;
    }
    
    
    public String getProp(){
        String sm=""; 
        for( int i=0; i<=props.size()-1; i++){
              sm=sm + props.get(i).getName() + "  " + props.get(i).operation + " " + props.get(i).parameter + " \n ";
        }
        
        return sm;
    }

    public String getWfpath() {
        return wfpath;
    }

    public void setWfpath(String wfpath) {
  
        this.wfpath = wfpath;
         File Sk = new File(wfpath);
          
          
         Sk = new File(Sk.getParent());
         Sk = new File(Sk.getParent());
                
          this.wfsolutionpath= Sk.getAbsolutePath();
          System.out.println("---- setWfpath ---- "  + this.wfsolutionpath);
    }

    public List<wfMapping> getMappings() {
        return mappings;
    }

    public void setMappings(List<wfMapping> mappings) {
        this.mappings = mappings;
    }
    
        public void adMappings(wfMapping mappings) {
        this.mappings.add(mappings);
    }

    public List<wfPartners> getPartners() {
        return partners;
    }

    public void setPartners(List<wfPartners> partners) {
        this.partners = partners;
    }
    
       public void adPartners(wfPartners partners) {
        this.partners.add(partners);
    }

	
    
}
