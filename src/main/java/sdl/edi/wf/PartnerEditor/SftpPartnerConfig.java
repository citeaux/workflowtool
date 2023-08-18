package sdl.edi.wf.PartnerEditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import sdl.edi.wf.file.Filehandling;
import sdl.edi.wfxml.DeciderRule;
import sdl.edi.wfxml.sftpclient.Common;
import sdl.edi.wfxml.sftpclient.Partner;
import sdl.edi.wfxml.sftpclient.Scheduling;
import sdl.edi.wfxml.sftpclient.Schedulings;
import sdl.edi.wfxml.sftpclient.Sftpclient;

public class SftpPartnerConfig {
	
	Logger logger = LoggerFactory.getLogger(SftpPartnerConfig.class);
   
	private String SourceCode;
	
	
	public HashMap<String, FieldParameters> getPartnerTemplateFields(String xmlPartnerTemplate) throws IOException, ParserConfigurationException, SAXException, JAXBException, IllegalArgumentException, IllegalAccessException {	
		HashMap<String, FieldParameters> Fields = new HashMap<String, FieldParameters>();
		
		
		 

          StringReader reader = new StringReader(xmlPartnerTemplate);
           
           
        JAXBContext context = JAXBContext.newInstance(Partner.class);
        Partner sftpartner;
       
        sftpartner= (Partner) context.createUnmarshaller().unmarshal(reader);
        
        
        
        
        Common common=sftpartner.getCommon();
       
       Field[] fields3 = common.getClass().getDeclaredFields();
       for(Field f : fields3){
       	 FieldParameters jj;
       	   Class t = f.getType();
       	   Object v = f.get(common);

       	   if(t == boolean.class && Boolean.FALSE.equals(v)) {
       	     // found default value

       	     // found default value
       	   }else if(t == String.class) {	   
       		   if(v.toString().matches("(.*)(\\$\\{)(.*)(\\})(.*)") && !v.toString().matches("(^#if)")) {
       			   jj =  new FieldParameters("" ,"String",v.toString().replaceAll("(.*)(\\$\\{)(.*)(\\})(.*)","$3"));
                      Fields.put(f.getName(), jj);
       		   }
       		   
       		  
       	  }
       	   else if(!t.isPrimitive() && v == null) {
       		   
       	   }
       	     // found default value
       	}
         
        
        
        
         Sftpclient sftpclient=sftpartner.getSftpclient();
        
        Field[] fields = sftpclient.getClass().getDeclaredFields();
        for(Field f : fields){
        	 FieldParameters jj;
        	   Class t = f.getType();
        	   Object v = f.get(sftpclient);

        	   if(t == boolean.class && Boolean.FALSE.equals(v)) {
        	     // found default value

        	     // found default value
        	   }else if(t == String.class) {	   
        		   if(v.toString().matches("(.*)(\\$\\{)(.*)(\\})(.*)") && !v.toString().matches("(^#if)")) {
        			   jj =  new FieldParameters("" ,"String",v.toString().replaceAll("(.*)(\\$\\{)(.*)(\\})(.*)","$3"));
                       Fields.put(f.getName(), jj);
        		   }
        		   
        		  
        	  }
        	   else if(!t.isPrimitive() && v == null) {
        		   
        	   }
        	     // found default value
        	}
          
        
        
        
        Schedulings sftpsched=sftpartner.getSchedulings();
        Scheduling sftpsched2= sftpsched.getScheduling();
        
        Field[] fields2 = sftpsched2.getClass().getDeclaredFields();
        for(Field f : fields2){
        	 FieldParameters jj;
        	   Class t = f.getType();
        	   Object v = f.get(sftpsched2);

        	   if(t == boolean.class && Boolean.FALSE.equals(v)) {
        	     // found default value

        	     // found default value
        	   }else if(t == String.class) {	   
        		   if(v.toString().matches("(.*)(\\$\\{)(.*)(\\})(.*)") && !v.toString().matches("(^#if)")) {
        			   jj =  new FieldParameters("" ,"String",v.toString().replaceAll("(.*)(\\$\\{)(.*)(\\})(.*)","$3"));
                       Fields.put(f.getName(), jj);
        		   }
        	  
        	   
		        }else if(t == BigInteger.class) {
		        	if(v.toString().matches("(.*)(\\$\\{)(.*)(\\})(.*)") && !v.toString().matches("(^#if)")) {
	        			   jj =  new FieldParameters("" ,"String",v.toString().replaceAll("(.*)(\\$\\{)(.*)(\\})(.*)","$3"));
	                       Fields.put(f.getName(), jj);
	        		   }
		        	 
		  	  }
        	   else if(!t.isPrimitive() && v == null) {
        		   
        	   }
        	     // found default value
        	}
          
		return Fields;
	
	}
	
	public HashMap<String, FieldParameters> getPartnerRegularFields(String partnerName, String pathpartners) throws IOException, ParserConfigurationException, SAXException, JAXBException, IllegalArgumentException, IllegalAccessException {
		
		
		HashMap<String, FieldParameters> Fields = new HashMap<String, FieldParameters>();
		
		Filehandling hhp = new Filehandling();
		
		logger.debug("Path parters 333:   " + pathpartners);
		
		 File ms =  new File(hhp.getAssetFilenameFromDirectoryByAssetName(partnerName, pathpartners).get(0));
         FileReader hh =  new FileReader(ms);  
		
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
      
          


    
          StringReader reader = new StringReader(sb.toString());
           
           
        JAXBContext context = JAXBContext.newInstance(Partner.class);
        Partner sftpartner;
       
        sftpartner= (Partner) context.createUnmarshaller().unmarshal(reader);
        
        
       
        
        
        
        Sftpclient sftpclient=sftpartner.getSftpclient();
        
        Field[] fields = sftpclient.getClass().getDeclaredFields();
        for(Field f : fields){
        	 FieldParameters jj;
        	   Class t = f.getType();
        	   Object v = f.get(sftpclient);

        	   if(t == boolean.class && Boolean.FALSE.equals(v)) {
        	     // found default value

        	     // found default value
        	   }else if(t == String.class) {	   
        		  jj =  new FieldParameters(v.toString() ,"String");
                  Fields.put(f.getName(), jj);
        	  }
        	   else if(!t.isPrimitive() && v == null) {
        		   
        	   }
        	     // found default value
        	}
        
        
        Schedulings sftpsched=sftpartner.getSchedulings();
        Scheduling sftpsched2= sftpsched.getScheduling();
        
        Field[] fields2 = sftpsched2.getClass().getDeclaredFields();
        for(Field f : fields2){
        	 FieldParameters jj;
        	   Class t = f.getType();
        	   Object v = f.get(sftpsched2);

        	   if(t == boolean.class && Boolean.FALSE.equals(v)) {
        	     // found default value

        	     // found default value
        	   }else if(t == String.class) {	   
        		  jj =  new FieldParameters(v.toString() ,"String");
                  Fields.put(f.getName(), jj);
        	  
        	   
		        }else if(t == BigInteger.class) {	   
		  		  jj =  new FieldParameters(v.toString() ,"Integer");
		            Fields.put(f.getName(), jj);
		  	  }
        	   else if(!t.isPrimitive() && v == null) {
        		   
        	   }
        	     // found default value
        	}
       
		return Fields;
	}
	
	
	private void getPartnerTemplateFields() {
		
		
	}
	
	private void saverPartnertoDisk() {
		
	}
	
	
	private void readFile() {
		
	}
	
	
	
	
}
