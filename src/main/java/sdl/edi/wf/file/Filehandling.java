package sdl.edi.wf.file;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import sdl.edi.wf.FlowBuild.FlowBuildController;
import sdl.edi.xml.general.ReadXML;

public class Filehandling {
	Logger logger = LoggerFactory.getLogger(Filehandling.class);
	

	public List<String> getFilenNamesFromDirectory(String LocalPath, String SolutionPath) {
		List<String> test = new ArrayList<>();
		

		Iterator it = FileUtils.iterateFiles(new File(LocalPath), null, true);
		
		  while(it.hasNext()){
			  String name = ((File) it.next()).getName();
			  if(SolutionPath == null || SolutionPath.equals("")) {
			  test.add(name);
			  }else {
				  test.add(SolutionPath + "/" + name);
			  }
		  }
		  
		return test;
	}
	
	public List<String> getAssetNamesFromDirectory(String LocalPath) throws ParserConfigurationException, SAXException, IOException {
		ReadXML xmlreader = new ReadXML();
		List<String> test = new ArrayList<>();
		
	
		Iterator it = FileUtils.iterateFiles(new File(LocalPath), null, true);
		
		  while(it.hasNext()){
			  File name = ((File)it.next()).getAbsoluteFile();
			  
			  test.add(xmlreader.getTagFromXML(name, "name"));
			  
		  }
		
		return test;
	}
	
	
	public List<String> getAssetNamesFromDirectory(String LocalPath,String Type, Boolean external) throws ParserConfigurationException, SAXException, IOException {
		ReadXML xmlreader = new ReadXML();
		List<String> test = new ArrayList<>();
		
	
		
		
	
		Iterator it = FileUtils.iterateFiles(new File(LocalPath), null, true);
		
		if(Type.equals("sftpclient") && external == true ){
			  while(it.hasNext()){
				  File name = ((File)it.next()).getAbsoluteFile();
			
				  if(xmlreader.getTagFromXML(name,"providername").equals(Type) && xmlreader.getTagFromXML(name,"host").equals("sv-baldmz")) {
					
				        test.add(xmlreader.getTagFromXML(name, "name"));
				  }
		
		  }
		  
		}else if(Type.equals("sftpclient") && external != true ) {
			  while(it.hasNext()){
				  File name = ((File)it.next()).getAbsoluteFile();
			
				  if(xmlreader.getTagFromXML(name,"providername").equals(Type) && !xmlreader.getTagFromXML(name,"host").equals("sv-baldmz") ) {
					 
				        test.add(xmlreader.getTagFromXML(name, "name"));
				  }
			  }
		}else {
				while(it.hasNext()){
					  File name = ((File)it.next()).getAbsoluteFile();
				
					  if(xmlreader.getTagFromXML(name,"providername").equals(Type)) {
					
					        test.add(xmlreader.getTagFromXML(name, "name"));
					  }
				}
		}
	
		return test;
	}
	
	
	public List<String> getAssetFilenameFromDirectoryByAssetName(String assetname, String LocalPath) throws ParserConfigurationException, SAXException, IOException {
		ReadXML xmlreader = new ReadXML();
		List<String> test = new ArrayList<>();
		
	
		
		
	
		Iterator it = FileUtils.iterateFiles(new File(LocalPath), null, true);
		
		
			  while(it.hasNext()){
				  File name = ((File)it.next()).getAbsoluteFile();
				
				  if(xmlreader.getTagFromXML(name,"name").equals(assetname)) {
					
				        test.add(name.getAbsolutePath());
				  }
			  }
		  		  
		
		 
		return test;
	}
	
	
	public HashMap<String, List<String>>getAssetNamesGroupedByFlowname(String LocalPath) throws ParserConfigurationException, SAXException, IOException{
		HashMap<String, List<String>> map = new HashMap<>();
		
		ReadXML xmlreader = new ReadXML();
		Iterator it = FileUtils.iterateFiles(new File(LocalPath), null, true);
		
		  while(it.hasNext()){
			  File name = ((File)it.next()).getAbsoluteFile();
			
			  if(map.get(xmlreader.getTagFromXML(name,"flow"))== null) {
				  List<String> contentrefs = new  ArrayList<>();
				  contentrefs.add(xmlreader.getTagFromXML(name,"name").toString());
				  map.put(xmlreader.getTagFromXML(name,"flow").toString(), contentrefs);
			  }else   if(map.get(xmlreader.getTagFromXML(name,"flow").toString())!= null) {
				 map.get(xmlreader.getTagFromXML(name,"flow").toString()).add(xmlreader.getTagFromXML(name,"name").toString());
				  
			  }
			
				
			
				
				Set<String> keys= map.keySet();
			  
		  }
		
		
		return map;
	}
	
	
	
	public HashMap<String, List<String>>getPathNamesByFlowname(String LocalPath,String flowname) throws ParserConfigurationException, SAXException, IOException{
		HashMap<String, List<String>> map = new HashMap<>();
		
		ReadXML xmlreader = new ReadXML();
		Iterator it = FileUtils.iterateFiles(new File(LocalPath), null, true);
	
		  while(it.hasNext()){
			  File name = ((File)it.next()).getAbsoluteFile();
				  if(map.size()== 0 && xmlreader.getTagFromXML(name,"flow").equals(flowname)) {
		
				  List<String> contentrefs = new  ArrayList<>();
				  contentrefs.add(name.getAbsolutePath());
				  map.put(xmlreader.getTagFromXML(name,"flow").toString(), contentrefs);
		
			  }else   if(map.get(xmlreader.getTagFromXML(name,"flow"))!= null ) {
		
				 map.get(xmlreader.getTagFromXML(name,"flow").toString()).add(name.getAbsolutePath());
				  
			  }
			
				
			
				
				Set<String> keys= map.keySet();
			  
		  }
	
		
		return map;
	}
	
	
}
