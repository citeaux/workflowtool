package sdl.edi.xml.general;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;

public class ReadXML {
	
	 static final String PERSISTENCE_UNIT = "persitence_unit";
	    static final String DATABASE_URL = "database_url";
	    static final String DATABASE = "database";
	    static final String DATABASE_TYPE = "database_type";
	    static final String DATABASE_PATH = "database_path";

	    @SuppressWarnings({"unchecked", "null"})
	    public List<String> readXMLbyINTERFACE(String configFile) {
	        List<String> items = new ArrayList<String>();
	        try {
	            // First, create a new XMLInputFactory
	            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
	            // Setup a new eventReader
	            InputStream in = new FileInputStream(configFile);
	            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
	            // read the XML document
	            String item = null;

	            while (eventReader.hasNext()) {
	                XMLEvent event = eventReader.nextEvent();

	                if (event.isStartElement()) {
	                    StartElement startElement = event.asStartElement();
	                    // If we have an item element, we create a new item
	                    if (startElement.getName().getLocalPart() == (DATABASE)) {
	                        item = new String();
	            // We read the attributes from this tag and add the date
	                        // attribute to our object
	                        Iterator<Attribute> attributes = startElement
	                                .getAttributes();
	                       
	                    }

	                    
	                }
	                
	                 if (event.isStartElement()) {
	            if (event.asStartElement().getName().getLocalPart()
	                .equals(PERSISTENCE_UNIT)) {
	              event = eventReader.nextEvent();
	             // item.setPersitence_unit(event.asCharacters().getData());
	              continue;
	            }
	            if (event.asStartElement().getName().getLocalPart()
	                .equals(DATABASE_URL)) {
	              event = eventReader.nextEvent();
	           //   item.setDatabase_url(event.asCharacters().getData());
	              continue;
	            }
		    if (event.asStartElement().getName().getLocalPart()
	                .equals(DATABASE_TYPE)) {
	              event = eventReader.nextEvent();
	           //   item.setDatabase_type(event.asCharacters().getData());
	              continue;
	            }
		    
		    if (event.asStartElement().getName().getLocalPart()
	                .equals(DATABASE_PATH)) {
	              event = eventReader.nextEvent();
	           //   item.setDatabase_path(event.asCharacters().getData());
	              continue;
	            }
		    
	          }
	                
	                
	                // If we reach the end of an item element, we add it to the list
	                if (event.isEndElement()) {
	                    EndElement endElement = event.asEndElement();
	                    if (endElement.getName().getLocalPart() == (DATABASE)) {
	                        items.add(item);
	                    }
	                }

	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (XMLStreamException e) {
	            e.printStackTrace();
	        }
	        return items;
	    }

	    
	    public String getTagFromXML(File  file, String tagname) throws ParserConfigurationException, SAXException, IOException {
	    	DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
	    	  DocumentBuilder db = dbf.newDocumentBuilder();
	            Document doc = db.parse(file);
	            doc.getDocumentElement().normalize();
	            return doc.getElementsByTagName(tagname).item(0).getTextContent();
	    	
	  
	    }
	    
}
