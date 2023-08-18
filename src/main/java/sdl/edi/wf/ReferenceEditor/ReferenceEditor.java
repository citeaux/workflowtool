package sdl.edi.wf.ReferenceEditor;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToolBar;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.util.Callback;
import sdl.edi.wf.PartnerEditor.FieldParameters;

import sdl.edi.wf.codeeditor.CodeeditorController;
import sdl.edi.wf.file.Filehandling;
import sdl.edi.wf.model.data.EdisolutionsRepository;
import sdl.edi.wf.model.data.Flowcontentreftemplates;
import sdl.edi.wf.model.data.FlowcontentreftemplatesRepository;
import sdl.edi.wf.model.data.Flowpartnertemplate;
import sdl.edi.wf.model.data.FlowpartnertemplateRepository;
import sdl.edi.wf.model.data.Flowtemplates;

public class ReferenceEditor extends SplitPane {
	
	Logger logger = LoggerFactory.getLogger(ReferenceEditor.class);
	
	   @FXML
	    private Button NewReference;

	    @FXML
	    private TextField PartnerFilter;

	    @FXML
	    private TreeView<String> PartnerTree;

	    @FXML
	    private Button SaveReference;

	    @FXML
	    private ScrollPane ScrollPaneContent;
	    
	    @FXML
	    private ChoiceBox<String> flowtemplates;

	    @FXML
	    private ToolBar toolbox;
	    
        private Flowcontentreftemplates selectedContentrefTemplate;
	    
	    public String Partnername;
	    
	    public String SelectedPartnername;
	    
	    private EdisolutionsRepository  edisolutions;
	    private String selectedSolution;
	    private String SelectedSystem;
	    private FlowcontentreftemplatesRepository flowcontentrepo;
	    
	    private DirectoryChooser fileChooser ;
	    
	   
	    
	    private List<NewContentRef> allNewContentRefs;
	    

	    @FXML
	    void ActionNewReference(ActionEvent event) {
	    	
	    	VBox glsk = (VBox) ScrollPaneContent.getContent();
	    	
	    	NewContentRef  singelRef = new NewContentRef();
	    	
	    	singelRef.setFlowname(PartnerTree.getSelectionModel().getSelectedItem().getValue());
	    	singelRef.setSolution(selectedSolution);
          
	    	allNewContentRefs.add(singelRef);
    		
	    	logger.debug("dddddd ööö " + singelRef.getNewReferenceGui());
    		
    		glsk.getChildren().add(singelRef.getNewReferenceGui());
	    	
	    	

	    }
	    
	    
	    class NewContentRef{
	    	private VBox singelRef;
	    	private Label lbs,lbm,lbv,lbvk;
	    	private TextField lbk,lbn;
	    	private CodeArea codeArea;
	    	private String Solution,Flowname;
	    	
	    	public NewContentRef() {
	    		
	    		
	    		String cssLayout = "-fx-border-color: black;\n" +
	                    "-fx-border-insets: 5;\n" +
	                    "-fx-border-width: 3;\n" ;
	    		singelRef= new VBox();
	    		Label lbs = new Label("Name");
	    		singelRef.getChildren().add(lbs);
	    	    lbk = new TextField();
	    		singelRef.getChildren().add(lbk);
	    		lbm = new Label("Descripton");
	    		singelRef.getChildren().add(lbm);
	    		lbn = new TextField();
	    		singelRef.getChildren().add(lbn);
	    		lbv = new Label("Definition");
	    		singelRef.getChildren().add(lbv);
	    		
	    		lbvk = new Label("FALSE");
	    		lbvk.setId("IsExitingReference");
	    		lbvk.setVisible(false);
	    		singelRef.getChildren().add(lbvk);
	    		
	    		codeArea = new CodeArea();
	    		codeArea.setMaxWidth(USE_COMPUTED_SIZE);
	    		codeArea.textProperty().addListener((obs, oldText, newText) -> {
	                codeArea.setStyleSpans(0, computeHighlighting(newText));
	            });
	         
	    		 codeArea.replaceText(0, 0, "");
	    	        codeArea.setVisible(true);
	    	        singelRef.getStylesheets().add(CodeeditorController.class.getResource("/xml-highlighting.css").toExternalForm());
	    	        
	    		
	    		
	    		singelRef.getChildren().add(new VirtualizedScrollPane<>(codeArea));
	    		singelRef.setStyle(cssLayout);
	    		
	    		
	    	}
	    	
	    	public VBox getNewReferenceGui() {
	    		return singelRef;
	    	}
	    	
	    	public String getName() {
	    		return lbk.getText();
	    	}
	    	
	    	public String getDescription() {
	    		return lbn.getText();
	    	}
	    	
	    	public String getDefinition() {
	    		return codeArea.getText();
	    	}

			public String getSolution() {
				return Solution;
			}

			public void setSolution(String solution) {
				Solution = solution;
			}

			public String getFlowname() {
				return Flowname;
			}

			public void setFlowname(String flowname) {
				Flowname = flowname;
			}
	    	
	    	
	    	
	    }

	    @FXML
	    void ActionSaveReference(ActionEvent event) throws TemplateException {
	    	
	    	
	    	
	    	fileChooser = new DirectoryChooser();
	    	  this.fileChooser.setTitle("Open Folder");
	    	

	    	 
	          
	        
	         String folder= fileChooser.showDialog(null).getPath();
	         conentRefeCreation(folder);

	    }
	    
	    
	    
	    
	    void conentRefeCreation(String folder) throws TemplateException {
	    	 Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
		    	cfg.setDefaultEncoding("UTF-8");
		    	cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		    	cfg.setLogTemplateExceptions(false);
		    	cfg.setWrapUncheckedExceptions(true);
		    	cfg.setFallbackOnNullLoopVariable(false);
		    	StringTemplateLoader ftl1 = new StringTemplateLoader();
			          
		    	cfg.setTemplateLoader(ftl1); 
		    	Flowcontentreftemplates mfgl=   flowcontentrepo.findById((long) 1).get();
		    	
		    	
		    	
		    	String fullstringxml= mfgl.getContentruledefintion().replace("&gt;", ">");
		    	fullstringxml =fullstringxml.replace("&lt;", "<");
		    	
		    	
		     ftl1.putTemplate("Main", fullstringxml);
		    
		     List<Map> allnewrefs = new ArrayList<Map>();
		     
		     
		     Map root = new HashMap();
		    	
		    	String Filename="";
		    	
		    	for(Iterator<NewContentRef> wfit = allNewContentRefs.iterator(); wfit.hasNext(); ){
		    		NewContentRef last=wfit.next();
		    		
		    
		    	    root.put("REFERENCENAME",last.getName());
		    	    root.put("DESCRIPTION",last.getDescription());
		    	    root.put("REFERENCECODE",last.getDefinition());
		    	    root.put("SOLUTION",last.getSolution());
		    	    root.put("FLOWNAME",last.getFlowname());
		    	    allnewrefs.add(root);
		    	}
		     
		    
		     
		    	for(Iterator<Map> wfit = allnewrefs.iterator(); wfit.hasNext(); ){
		    		Map last=wfit.next();
		    	
					    	
			            try {
							Template mytpl = cfg.getTemplate("Main");
							 OutputStream       outputStream       = new FileOutputStream(folder +"\\" + last.get("REFERENCENAME") + ".xml");
					            Writer out  = new OutputStreamWriter(outputStream);
				
					   
					            mytpl.process(last, out);
							
							 
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		    	}
	    }
	    
	    
	    public ReferenceEditor(EdisolutionsRepository  edisolutions, String selectedSolution, String SelectedSystem, FlowcontentreftemplatesRepository flowcontentrepo) {
	    	this.edisolutions= edisolutions;
	    	this.selectedSolution= selectedSolution;
	    	this.SelectedSystem= SelectedSystem;
	    	this.flowcontentrepo=flowcontentrepo;
	    	selectedContentrefTemplate = new Flowcontentreftemplates();
	    	this.allNewContentRefs = new ArrayList<>();
	    	
	       	FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource("/ContentRefManager.fxml"));
	    	fxmlLoader.setRoot(this);
	 	   fxmlLoader.setController(this);
	 	   
	 	  try {
	  	      fxmlLoader.load();
	  	   } catch (IOException exception) {
	  	      throw new RuntimeException(exception);
	  	   }
	 	  
	 	 Filehandling fh= new Filehandling();
	 	 
	 	 TreeItem<String> rootItem = new TreeItem<String> ("Content references");
		   rootItem.setExpanded(true);
		   
		   
		   try {
			HashMap<String, List<String>> contentrefs = fh.getAssetNamesGroupedByFlowname(edisolutions.findBySystemAndSystemsolution(SelectedSystem,selectedSolution).get(0).getPathcontentrefs());
			
			Set<String> keys= contentrefs.keySet();
			
			
			   for(Iterator<String> wfit = keys.iterator(); wfit.hasNext(); ){
				   String contentrefFlow= wfit.next();
				
		           TreeItem<String> item1 = new TreeItem<String> (contentrefFlow);    
		           rootItem.getChildren().add(item1);
		           
		           
		           for(Iterator<String> wfito = contentrefs.get(contentrefFlow).iterator(); wfito.hasNext(); ){
		        	   String contentrefname= wfito.next();
		        	   TreeItem<String> item2 = new TreeItem<String> (contentrefname);  
		        	   item1.getChildren().add(item2);
		           }
		           
		       
			   }
			   
			   
			   
			   
			   
			   
			   
			
			
			
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    	
		
		   PartnerTree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> { 
	        	// Body would go here
			   logger.debug("fdfsdafa " + newValue.getValue());
			   logger.debug("fdfsdafa4 " + newValue.isLeaf());   
			   logger.debug("fdfsdafa4 " + newValue.getChildren().get(0).getValue());   
			   
	        	   try {
	        		  if( newValue.getParent() != null && newValue.getChildren() != null) {
	        		
	        				ScrollPaneContent.setContent(getContentRefConfig(newValue.getValue()));
	        				allNewContentRefs.clear();
	        				
	        				//SelectedPartnername= newValue.getValue();
	        				
	        		
	        			  
	        		  }else {
	        			  logger.debug("fdfsdafa " + newValue.getValue());
	        		  }
	        		   
				
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					logger.debug("fdfsdafa " + newValue.getValue());
					e.printStackTrace();
				}
	           });
		   
		   
		 
		   
		   this.PartnerTree.setCellFactory(new Callback<TreeView<String>,TreeCell<String>>(){
               @Override
               public TreeCell<String> call(TreeView<String> p) {
                   return new TextFieldTreeCellImpl();
               }
           });
		   
		   this.PartnerTree.setRoot(rootItem);
	        
           this.PartnerTree.setEditable(true);
		   
	    }
	    
	    
	    
	    private final class TextFieldTreeCellImpl extends TreeCell<String> {
	    	 
	        private TextField textField;
	 
	        private ContextMenu addMenu = new ContextMenu();
	        
	        public TextFieldTreeCellImpl() {
	            MenuItem addMenuItem = new MenuItem("New Flow Reference");
	            addMenu.getItems().add(addMenuItem);
	            addMenuItem.setOnAction(new EventHandler() {
	                public void handle(Event t) {
	                    TreeItem newReference = 
	                        new TreeItem<String>("New Flow Reference");
	                    TreeItem newReference2 = 
		                       new TreeItem<String>("New Reference");
	                            getTreeItem().getChildren().add(newReference);
	                            newReference.getChildren().add(newReference2);
	                            
	                            getTreeView().getSelectionModel().select(newReference);
	                            
	                            
	                }
	            });
	        }
	 
	        @Override
	        public void startEdit() {
	            super.startEdit();
	 
	            if (textField == null) {
	                createTextField();
	            }
	            setText(null);
	            setGraphic(textField);
	            textField.selectAll();
	        }
	 
	        @Override
	        public void cancelEdit() {
	            super.cancelEdit();
	            setText((String) getItem());
	            setGraphic(getTreeItem().getGraphic());
	        }
	 
	        @Override
	        public void updateItem(String item, boolean empty) {
	            super.updateItem(item, empty);
	 
	            if (empty) {
	                setText(null);
	                setGraphic(null);
	            } else {
	                if (isEditing()) {
	                    if (textField != null) {
	                        textField.setText(getString());
	                    }
	                    setText(null);
	                    setGraphic(textField);
	                } else {
	                    setText(getString());
	                    setGraphic(getTreeItem().getGraphic());
	                    if (
	                        !getTreeItem().isLeaf()&&getTreeItem().getParent()!= null
	                    ){
	                        setContextMenu(addMenu);
	                    }
	                }
	            }
	        }
	 
	        private void createTextField() {
	            textField = new TextField(getString());
	            textField.setOnKeyReleased(new EventHandler<KeyEvent>() {
	 
	                @Override
	                public void handle(KeyEvent t) {
	                    if (t.getCode() == KeyCode.ENTER) {
	                        commitEdit(textField.getText());
	                    } else if (t.getCode() == KeyCode.ESCAPE) {
	                        cancelEdit();
	                    }
	                }
	            });
	        }
	 
	        private String getString() {
	            return getItem() == null ? "" : getItem().toString();
	        }
	    }
	    
	    public VBox getContentRefConfig(String flowname)  {
	    	
	    	ContentRefConfig refconfig=  new ContentRefConfig();
	    	VBox allContentRefVbox= new VBox();
	    	
	    	allContentRefVbox.setMinWidth(600);
	    	try {
	    	  HashMap<String, List<contentreffields>> allrefs =		 refconfig.getContentRefRegularFields(flowname,edisolutions.findBySystemAndSystemsolution(SelectedSystem,selectedSolution).get(0).getPathcontentrefs());
	    	  logger.debug("ddddxxx555555 " +  flowname);
	    	  logger.debug("ddddxxx " +  allrefs);
	    	logger.debug("ddddxxx " +  allrefs.get(flowname).size());
	    	 
	    	
	    	 for (Iterator<contentreffields> wfit = allrefs.get(flowname).iterator(); wfit.hasNext();) {
	    		 
	    			
	    		String cssLayout = "-fx-border-color: black;\n" +
	                    "-fx-border-insets: 5;\n" +
	                    "-fx-border-width: 3;\n" ;

	    		contentreffields ref= wfit.next();
	    		logger.debug("sixtus  " +  ref.getName());
	    		VBox singelRef= new VBox();
	    		Label lbs = new Label("Name");
	    		singelRef.getChildren().add(lbs);
	    		TextField lbk = new TextField(ref.getName());
	    		singelRef.getChildren().add(lbk);
	    		Label lbm = new Label("Descripton");
	    		singelRef.getChildren().add(lbm);
	    		TextField lbn = new TextField(ref.getDescription());
	    		singelRef.getChildren().add(lbn);
	    		Label lbv = new Label("Definition");
	    		singelRef.getChildren().add(lbv);
	    		
	    		Label lbvk = new Label("TRUE");
	    		lbvk.setId("IsExitingReference");
	    		lbvk.setVisible(false);
	    		singelRef.getChildren().add(lbvk);
	    		
	    		CodeArea codeArea = new CodeArea();
	    		codeArea.setMaxWidth(USE_COMPUTED_SIZE);
	    		codeArea.textProperty().addListener((obs, oldText, newText) -> {
	                codeArea.setStyleSpans(0, computeHighlighting(newText));
	            });
	         
	    		 codeArea.replaceText(0, 0, ref.getCode());
	    	        codeArea.setVisible(true);
	    	        singelRef.getStylesheets().add(CodeeditorController.class.getResource("/xml-highlighting.css").toExternalForm());
	    	        
	    		
	    		
	    		singelRef.getChildren().add(new VirtualizedScrollPane<>(codeArea));
	    		singelRef.setStyle(cssLayout);
	    		
	    		allContentRefVbox.getChildren().add(singelRef);
	    	}
	    	 
	    	}catch  (Exception e){
	    		
	    		
	    		
	    		
	    	}
	    	 
	    	
	    	
	    	return allContentRefVbox;
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    private static final Pattern XML_TAG = Pattern.compile("(?<ELEMENT>(</?\\h*)(\\w+)([^<>]*)(\\h*/?>))"
	    		+"|(?<COMMENT><!--[^<>]+-->)");
	    
	    private static final Pattern ATTRIBUTES = Pattern.compile("(\\w+\\h*)(=)(\\h*\"[^\"]+\")");
	    
	    private static final int GROUP_OPEN_BRACKET = 2;
	    private static final int GROUP_ELEMENT_NAME = 3;
	    private static final int GROUP_ATTRIBUTES_SECTION = 4;
	    private static final int GROUP_CLOSE_BRACKET = 5;
	    private static final int GROUP_ATTRIBUTE_NAME = 1;
	    private static final int GROUP_EQUAL_SYMBOL = 2;
	    private static final int GROUP_ATTRIBUTE_VALUE = 3;
	    
	    private static StyleSpans<Collection<String>> computeHighlighting(String text) {
	        Matcher matcher = XML_TAG.matcher(text);
	        int lastKwEnd = 0;
	        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();
	        while(matcher.find()) {
	        	
	        	spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
	        	if(matcher.group("COMMENT") != null) {
	        		spansBuilder.add(Collections.singleton("comment"), matcher.end() - matcher.start());
	        	}
	        	else {
	        		if(matcher.group("ELEMENT") != null) {
	        			String attributesText = matcher.group(GROUP_ATTRIBUTES_SECTION);
	        			
	        			spansBuilder.add(Collections.singleton("tagmark"), matcher.end(GROUP_OPEN_BRACKET) - matcher.start(GROUP_OPEN_BRACKET));
	        			spansBuilder.add(Collections.singleton("anytag"), matcher.end(GROUP_ELEMENT_NAME) - matcher.end(GROUP_OPEN_BRACKET));

	        			if(!attributesText.isEmpty()) {
	        				
	        				lastKwEnd = 0;
	        				
	        				Matcher amatcher = ATTRIBUTES.matcher(attributesText);
	        				while(amatcher.find()) {
	        					spansBuilder.add(Collections.emptyList(), amatcher.start() - lastKwEnd);
	        					spansBuilder.add(Collections.singleton("attribute"), amatcher.end(GROUP_ATTRIBUTE_NAME) - amatcher.start(GROUP_ATTRIBUTE_NAME));
	        					spansBuilder.add(Collections.singleton("tagmark"), amatcher.end(GROUP_EQUAL_SYMBOL) - amatcher.end(GROUP_ATTRIBUTE_NAME));
	        					spansBuilder.add(Collections.singleton("avalue"), amatcher.end(GROUP_ATTRIBUTE_VALUE) - amatcher.end(GROUP_EQUAL_SYMBOL));
	        					lastKwEnd = amatcher.end();
	        				}
	        				if(attributesText.length() > lastKwEnd)
	        					spansBuilder.add(Collections.emptyList(), attributesText.length() - lastKwEnd);
	        			}

	        			lastKwEnd = matcher.end(GROUP_ATTRIBUTES_SECTION);
	        			
	        			spansBuilder.add(Collections.singleton("tagmark"), matcher.end(GROUP_CLOSE_BRACKET) - lastKwEnd);
	        		}
	        	}
	            lastKwEnd = matcher.end();
	        }
	        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
	        return spansBuilder.create();
	    }

}
