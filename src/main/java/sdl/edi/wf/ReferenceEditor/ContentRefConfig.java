package sdl.edi.wf.ReferenceEditor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import sdl.edi.wf.PartnerEditor.FieldParameters;
import sdl.edi.wf.file.Filehandling;
import sdl.edi.wfxml.contentref.Reference;
import sdl.edi.wf.ReferenceEditor.contentreffields;


public class ContentRefConfig {
	Logger logger = LoggerFactory.getLogger(ContentRefConfig.class);
	
	
	public HashMap<String, List<contentreffields>> getContentRefRegularFields(String flowname, String LocalPath) throws ParserConfigurationException, SAXException, IOException, JAXBException{
		
        HashMap<String, List<contentreffields>> Fields = new HashMap<String, List<contentreffields>>();
		
        
		Filehandling hhp = new Filehandling();
		
		
		HashMap<String, List<String>> contentefPaths = hhp.getPathNamesByFlowname(LocalPath,flowname);
		
		
	
		
		List<contentreffields> msa = new ArrayList<>();
		
		List<String> allreffiles= 	contentefPaths.get(flowname);
	
		for(Iterator<String> wfit = allreffiles.iterator(); wfit.hasNext(); ){
			
			String contentreffile= wfit.next();
			File ms =  new File(contentreffile);
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
	         
	          StringReader reader = new StringReader(sb.toString());
	          JAXBContext context = JAXBContext.newInstance(Reference.class);
	          Reference reference;
	          
	          reference= (Reference) context.createUnmarshaller().unmarshal(reader);
	          
	          contentreffields fields= new contentreffields();
	          
	          
	          
	          fields.setCode(reference.getXmlPath().toString());
	          fields.setFilename(contentreffile);
	          fields.setDescription(reference.getDescription());
	          fields.setName(reference.getName());
	    
			msa.add(fields);
		}
		
		Fields.put(flowname, msa);
	
		return Fields;
		
		
	}
}
