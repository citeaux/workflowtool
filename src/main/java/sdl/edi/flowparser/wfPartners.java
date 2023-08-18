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
import java.util.Iterator;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author russseba
 */
public class wfPartners {
     String  Partnername;
     String  Partnerpath;
     String PartnerType;
     String Partnercode;

   public wfPartners(String Partnername){
         this.Partnername= Partnername;
   }  
   
   
   public wfPartners(String Partnername, String SolutionPath, String PartnerDictionary) throws FileNotFoundException, IOException{
         this.Partnername= Partnername;
         
         
         System.out.println("PathPartner: " + SolutionPath +  PartnerDictionary);
          
       
          
          Iterator it = FileUtils.iterateFiles(new File(SolutionPath +  PartnerDictionary), null, true);
          
          while(it.hasNext()){
               FileReader hh =  new FileReader(((File) it.next()).getAbsoluteFile());  
                 BufferedReader br = new BufferedReader(hh) ;

            StringBuilder sb = new StringBuilder();

            String line;
            while ((line = br.readLine()) != null) {

                sb.append(line);

                if (line != null) {
                    sb.append(System.lineSeparator());
                }
            }
            
            if(sb.toString().contains(Partnername)){
                this.Partnercode= sb.toString();
            }
            
          }
          
          
   }  
     
    public String getPartnername() {
        return Partnername;
    }

    public void setPartnername(String Partnername) {
        this.Partnername = Partnername;
    }

    public String getPartnerpath() {
        return Partnerpath;
    }

    public void setPartnerpath(String Partnerpath) {
        this.Partnerpath = Partnerpath;
    }

    public String getPartnerType() {
        return PartnerType;
    }

    public void setPartnerType(String PartnerType) {
        this.PartnerType = PartnerType;
    }

    public String getPartnercode() {
        return Partnercode;
    }

    public void setPartnercode(String Partnercode) {
        this.Partnercode = Partnercode;
    }
     
     
}
