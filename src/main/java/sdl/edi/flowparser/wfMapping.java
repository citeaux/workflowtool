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
public class wfMapping {
    String  MappingName;
    String MappingPath;
    String  MappingCode;
    String MappingType;

    public String getMappingName() {
        return MappingName;
    }

    public wfMapping(String Partnername, String SolutionPath, String MappingDictionary) throws FileNotFoundException, IOException{
         Iterator it = FileUtils.iterateFiles(new File(SolutionPath +  MappingDictionary), null, true);
            System.out.println("#########Mappingdic: "+ SolutionPath +  MappingDictionary + Partnername);
          while(it.hasNext()){
   
               if(((File) it.next()).getName().equals(Partnername)) {
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
            
                System.out.println("#########Mappingcode: " +   sb.toString());
                this.MappingCode= sb.toString();
            
          }
          }
        
        
    }
    
    public void setMappingName(String MappingName) {
        this.MappingName = MappingName;
    }

    public String getMappingPath() {
        return MappingPath;
    }

    public void setMappingPath(String MappingPath) {
        this.MappingPath = MappingPath;
    }

    public String getMappingCode() {
        return MappingCode;
    }

    public void setMappingCode(String MappingCode) {
        this.MappingCode = MappingCode;
    }

    public String getMappingType() {
        return MappingType;
    }

    public void setMappingType(String MappingType) {
        this.MappingType = MappingType;
    }
    
    
    
}
