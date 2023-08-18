package sdl.edi.wf.PartnerEditor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import com.thoughtworks.xstream.core.util.Fields;

import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SplitPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.SplitPane;
import sdl.edi.templateparser.wftorso;
import sdl.edi.wf.file.Filehandling;
import sdl.edi.wf.model.data.Edisolutions;
import sdl.edi.wf.model.data.EdisolutionsRepository;
import sdl.edi.wf.model.data.Flowpartnertemplate;
import sdl.edi.wf.model.data.FlowpartnertemplateRepository;
import sdl.edi.wf.model.data.FlowtemplatesRepository;
import sdl.edi.wf.model.data.Templatefieldproposition;
import sdl.edi.wf.model.data.Templatefields;
import javafx.util.Callback;
import javafx.scene.control.TreeCell;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.DirectoryChooser;

public class PartnerEditor extends SplitPane {
	Logger logger = LoggerFactory.getLogger(PartnerEditor.class);
	
	
    @FXML
    private Tab MailTab;   
	
	  @FXML
	    private Tab AS2tab;

	    @FXML
	    private Button CopyPartner;
	  
	    @FXML
	    private Tab OFTP2tab;

	    @FXML
	    private BorderPane borderPaneAS2;

	    @FXML
	    private BorderPane borderPaneMail;

	    @FXML
	    private BorderPane borderPaneOFTP2;

	    @FXML
	    private BorderPane borderPaneSFTP;
	    
	    @FXML
	    private TextField PartnerFilter;

	    @FXML
	    private TreeView<String> PartnerTree;

	    @FXML
	    private ListView<?> SFIDList;

	    @FXML
	    private Tab SFTPtab;

	    @FXML
	    private Button SaveAs2Partner;

	    @FXML
	    private Button SaveOFTP2Partner;

	    @FXML
	    private Button SaveSftpPartner;

	    @FXML
	    private Button addPartner;

	    @FXML
	    private Button removePartner;
	    
	    @FXML
	    private Button SaveMailPartner;
	    
	    private List<Node> sftpTemplateFieldEntries;
	    
	    private HashMap<String, FieldParameters> selectedTemplateFields;
	    
	    private Flowpartnertemplate selectedTemplate;
	    
	    public String Partnername;
	    
	    public String SelectedPartnername;
	    
	    private DirectoryChooser fileChooser ;
	    
	    
	    private final Node mailIcon = new ImageView(
	            new Image(getClass().getResourceAsStream("/Icons/internet-mail-3.jpg"))
	        );

	    @FXML
	    void SaveAs2PartnerAction(ActionEvent event) {

	    }
	    
	    @FXML
	    void SaveMailPartnerAction(ActionEvent event) throws TemplateException {
	    	
	    	fileChooser = new DirectoryChooser();
	    	  this.fileChooser.setTitle("Open Folder");
	    	

	     
	          
	        
	         String folder= fileChooser.showDialog(null).getPath();
	    	
	    	partenerCreation(folder);

	    }

	    @FXML
	    void SaveOFTP2PartnerAction(ActionEvent event) {

	    }
	    
	    
	    @FXML
	    void CopyPartnerAction(ActionEvent event) {

	    }

	    @FXML
	    void SaveSftpPartnerAction(ActionEvent event) throws TemplateException {
	    	
	    	fileChooser = new DirectoryChooser();
	    	  this.fileChooser.setTitle("Open Folder");
	    	

	     
	          
	        
	         String folder= fileChooser.showDialog(null).getPath();
	    	
	    	partenerCreation(folder);

	    }

	    private EdisolutionsRepository  edisolutions;
	    private String selectedSolution;
	    private String SelectedSystem;
	    private FlowpartnertemplateRepository flowpartnerrepo;
	    
	    
	    public PartnerEditor(EdisolutionsRepository  edisolutions, String selectedSolution, String SelectedSystem, FlowpartnertemplateRepository flowpartnerrepo) throws ParserConfigurationException, SAXException, IOException {
	    	this.edisolutions= edisolutions;
	    	this.selectedSolution= selectedSolution;
	    	this.SelectedSystem= SelectedSystem;
	    	this.flowpartnerrepo=flowpartnerrepo;
	    	selectedTemplate= new Flowpartnertemplate();
	    	sftpTemplateFieldEntries = new ArrayList<Node>();
	    	selectedTemplateFields= new HashMap<String, FieldParameters>();
	    	FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource("/PartnerManager.fxml"));
	    	fxmlLoader.setRoot(this);
	 	   fxmlLoader.setController(this);
         
		   try {
	  	      fxmlLoader.load();
	  	   } catch (IOException exception) {
	  	      throw new RuntimeException(exception);
	  	   }
	    	
		   
		   Filehandling fh= new Filehandling();
		   
		   
		   TreeItem<String> rootItem = new TreeItem<String> ("Solution Partners");
		   rootItem.setExpanded(true);
		   
		   TreeItem<String> item = new TreeItem<String> ("SFTP Partners Intern", mailIcon);            
           rootItem.getChildren().add(item);
     		   for(Iterator<String> wfit = fh.getAssetNamesFromDirectory(edisolutions.findBySystemAndSystemsolution(SelectedSystem,selectedSolution).get(0).getPathpartners(), "sftpclient",true).iterator(); wfit.hasNext(); ){
			   String partnername= wfit.next();
			
	           TreeItem<String> item1 = new TreeItem<String> (partnername);    
		       item.getChildren().add(item1);
	       
		   }
	      
     		  TreeItem<String> sftpitem = new TreeItem<String> ("SFTP Partners Extern", mailIcon);            
              rootItem.getChildren().add(sftpitem);
        		   for(Iterator<String> wfit = fh.getAssetNamesFromDirectory(edisolutions.findBySystemAndSystemsolution(SelectedSystem,selectedSolution).get(0).getPathpartners(), "sftpclient",false).iterator(); wfit.hasNext(); ){
   			   String partnername= wfit.next();
   			
   	           TreeItem<String> item1 = new TreeItem<String> (partnername);    
   	        sftpitem.getChildren().add(item1);
   	       
   		   }
	       
	       
	       TreeItem<String> Mailitem = new TreeItem<String> ("Mail Partners", mailIcon);            
           rootItem.getChildren().add(Mailitem);
           
           for(Iterator<String> wfit = fh.getAssetNamesFromDirectory(edisolutions.findBySystemAndSystemsolution(SelectedSystem,selectedSolution).get(0).getPathpartners(), "mail", false).iterator(); wfit.hasNext(); ){
			   String partnername= wfit.next();
			   
	           TreeItem<String> item1 = new TreeItem<String> (partnername);    
	           Mailitem.getChildren().add(item1);
	       
		   }
           
           
           TreeItem<String> as2item = new TreeItem<String> ("AS2 Partners", mailIcon);            
           rootItem.getChildren().add(as2item);
           
           for(Iterator<String> wfit = fh.getAssetNamesFromDirectory(edisolutions.findBySystemAndSystemsolution(SelectedSystem,selectedSolution).get(0).getPathpartners(), "as2", false).iterator(); wfit.hasNext(); ){
			   String partnername= wfit.next();
		
	           TreeItem<String> item1 = new TreeItem<String> (partnername);    
	           as2item.getChildren().add(item1);
	       
		   }
           
           
           
           
           PartnerTree.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> { 
        	// Body would go here
        	  
        	   
        	   try {
        		  if(newValue.isLeaf() && newValue.getParent().getValue().toUpperCase().contains("SFTP")) {
        				borderPaneSFTP.setCenter(getPartnerConfigSFTP(newValue.getValue(),newValue));
        				SelectedPartnername= newValue.getValue();
        			  
        		  }else if(newValue.isLeaf() && newValue.getParent().getValue().toUpperCase().contains("MAIL")) {
        			  borderPaneMail.setCenter(getPartnerConfigMail(newValue.getValue(),newValue));
        			  SelectedPartnername= newValue.getValue();
        		  }
        		   
			
			} catch (IllegalArgumentException | IllegalAccessException | IOException | ParserConfigurationException
					| SAXException | JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           });
       
           
    
           
           
           
           this.PartnerTree.setRoot(rootItem);
        
           this.PartnerTree.setEditable(true);
           this.PartnerTree.setCellFactory(new Callback<TreeView<String>,TreeCell<String>>(){
               @Override
               public TreeCell<String> call(TreeView<String> p) {
                   return new TextFieldTreeCellImpl();
               }
           });
           
           // PartnerTree.getSelectionModel().getSelectedItem()
           
	    }
	    
	    
	    
	    
	    
	    
	    private final class TextFieldTreeCellImpl extends TreeCell<String> {
	    	 
	        private TextField textField;
	 
	        private ContextMenu addMenu = new ContextMenu();
	        
	        public TextFieldTreeCellImpl() {
	            MenuItem addMenuItem = new MenuItem("New Partner");
	            addMenu.getItems().add(addMenuItem);
	            addMenuItem.setOnAction(new EventHandler() {
	                public void handle(Event t) {
	                    TreeItem newPartner = 
	                        new TreeItem<String>("New Partner");
	                            getTreeItem().getChildren().add(newPartner);
	                            getTreeView().getSelectionModel().select(newPartner);
	                            
	                            
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
	    
	    public VBox getPartnerConfigSFTP(String Partner,TreeItem item) throws IllegalArgumentException, IllegalAccessException, IOException, ParserConfigurationException, SAXException, JAXBException {
	    	
	    	logger.debug("Partner Call3: "+ Partner);
	    	SftpPartnerConfig ggg= new SftpPartnerConfig();
	    	VBox partnerVbox= new VBox();
	    	HashMap<String, FieldParameters> Fields = new HashMap<>();
	    	
	    	 try {
				Fields = ggg.getPartnerRegularFields(Partner, edisolutions.findBySystemAndSystemsolution(SelectedSystem,selectedSolution).get(0).getPathpartners());
				logger.debug("Partner Call: "+ Partner);
		    	logger.debug("Fields:  " + Fields.toString());
			   	for (HashMap.Entry<String, FieldParameters> set :
		    		Fields.entrySet()) {
		    		HBox partnerHbox = new HBox();
			    	 Label lbs = new Label(set.getKey());
			    	 logger.debug("Fields:  " + set.getKey());
			          TextField tf1=new TextField(set.getValue().getValue());  
			          
			          if(Partner.length() > 0) {
			        tf1.setPrefWidth(Partner.length()*6);
			          }
			          partnerHbox.getChildren().add(lbs);
			          partnerHbox.getChildren().add(tf1);
			          partnerVbox.getChildren().add(partnerHbox);
		    		
		    	}
			} catch (IllegalArgumentException e) {
				logger.debug("IllegalArgumentException");
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				logger.debug("IllegalAccessException");
				e.printStackTrace();
			} catch (IOException e) {
				logger.debug("IOException");
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				logger.debug("ParserConfigurationException");
				e.printStackTrace();
			} catch (SAXException e) {
				logger.debug("SAXException");
				e.printStackTrace();
			} catch (JAXBException e) {
				logger.debug("JAXBException");
				e.printStackTrace();
			}catch (Exception e) {
				if(!Partner.equals("New Partner") && !Partner.equals("") && item.isLeaf() ) {
		    		logger.debug("Partner Call2: "+ Partner);
		    		
		    		
		    		
		    		
		    		
		    	 	Iterable<Flowpartnertemplate> templatepartner= flowpartnerrepo.findByType("SFTP");	
		        	
		        	
		        	Stream<Flowpartnertemplate> nn= StreamSupport.stream(templatepartner.spliterator(),false);
		        	ObservableList<String> hhlk=	FXCollections.observableArrayList(nn.map(p->p.getName()).collect(Collectors.toList()));
		        	
		        	
		    	   
		    	   ComboBox<String> dsfd = new ComboBox();
		    	   dsfd.setId("Partnertempate");
		    	   dsfd.setItems(hhlk);
		    	 
		    	   partnerVbox.getChildren().add(dsfd);
		    	 
		    	   
		    	   
		    	   dsfd.getSelectionModel().selectedItemProperty().addListener( new 
		      			 ChangeListener<String>() {
		      		         public void changed(ObservableValue ov, String value, String new_value) {
		      		        	 List<Flowpartnertemplate> templist =  new ArrayList<Flowpartnertemplate>();
		      		        	 templist= flowpartnerrepo.findByName(new_value);	
		      		        	partnerVbox.getChildren().removeAll(sftpTemplateFieldEntries);
		      		        	selectedTemplate= templist.get(0);
		      		        	HashMap<String, FieldParameters> Fields2 = new HashMap<>();
		      		        	sftpTemplateFieldEntries.clear();
		      		        	
		      		        	 Tooltip tooltip = new Tooltip();
		                         tooltip.setText(templist.get(0).getHelptext() );
		                         dsfd.setTooltip(tooltip);
		      		        	  Partnername=Partner;
		      		        	
		      		        	
		      		        	try {
									Fields2 = ggg.getPartnerTemplateFields(templist.get(0).getPartnerxml());
									
								 	for (HashMap.Entry<String, FieldParameters> set :
							    		Fields2.entrySet()) {
							    		HBox partnerHbox = new HBox();
								    	 Label lbs = new Label(set.getKey());
								    	 logger.debug("Fields:  " + set.getKey());
								          TextField tf1=new TextField(set.getValue().getValue());  
								          tf1.setId(set.getValue().getTemplatefieldname());
								          if(Partner.length() > 0) {
								        tf1.setPrefWidth(Partner.length()*6);
								          }
								          partnerHbox.getChildren().add(lbs);
								          partnerHbox.getChildren().add(tf1);
								         
								          sftpTemplateFieldEntries.add(partnerHbox);
							    		
							    	}
								 	 partnerVbox.getChildren().addAll(sftpTemplateFieldEntries);
									
								} catch (IllegalArgumentException | IllegalAccessException | IOException
										| ParserConfigurationException | SAXException | JAXBException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
		      		        	
		      		        	/*
		      		        	
		      		        	
		      		        	HBox partnerHbox = new HBox();
		   		    		 Label lbs = new Label("New partner:");
		   		    		TextField tf1=new TextField(Partner);
		   		    		 partnerHbox.getChildren().add(lbs);
		   			          partnerHbox.getChildren().add(tf1);
		   			          
		   			       sftpTemplateFieldEntries.add(partnerHbox);
		   			    
		   			          Label lbk = new Label("Partner Type:");
		   			          HBox partnerHbox2 = new HBox();
		   			    		TextField tf2=new TextField(item.getParent().getValue().toString());
		   			    		 partnerHbox2.getChildren().add(lbk);
		   				          partnerHbox2.getChildren().add(tf2);
		   				          
		   				       sftpTemplateFieldEntries.add(partnerHbox2);
		   				       
		   				          
		   				       Label lbt = new Label("Partner Type:");
			   			          HBox partnerHbox3 = new HBox();
			   			    		TextField tf3=new TextField(flowpartnerrepo.findByName(new_value).get(0).getName());
			   			    		 partnerHbox3.getChildren().add(lbk);
			   				          partnerHbox3.getChildren().add(tf3);
			   				       sftpTemplateFieldEntries.add(partnerHbox3);
			   				          partnerVbox.getChildren().addAll(sftpTemplateFieldEntries);
			   				          
			   				    	*/    
			   				          
			   				      
			   	            
			   	      
		      		        	 
		      		         }
		      	});
		    	   
		    	   
                     		    		
		    		
		    		
		    	}
				
			}
	    
	    	
	    	
	    	return partnerVbox;
	    }
	    
	    
	    
	    
	    public VBox getPartnerConfigMail(String Partner,TreeItem item) throws IllegalArgumentException, IllegalAccessException, IOException, ParserConfigurationException, SAXException, JAXBException {
	    	
	    	logger.debug("Partner Call3: "+ Partner);
	    	MailPartnerconfig ggg= new MailPartnerconfig();
	    	VBox partnerVbox= new VBox();
	    	HashMap<String, FieldParameters> Fields = new HashMap<>();
	    	
	    	 try {
				Fields = ggg.getPartnerRegularFields(Partner, edisolutions.findBySystemAndSystemsolution(SelectedSystem,selectedSolution).get(0).getPathpartners());
				logger.debug("Partner Call: "+ Partner);
		    	logger.debug("Fields:  " + Fields.toString());
			   	for (HashMap.Entry<String, FieldParameters> set :
		    		Fields.entrySet()) {
		    		HBox partnerHbox = new HBox();
			    	 Label lbs = new Label(set.getKey());
			    	 logger.debug("Fields:  " + set.getKey());
			          TextField tf1=new TextField(set.getValue().getValue());  
			          
			          if(Partner.length() > 0) {
			        tf1.setPrefWidth(Partner.length()*6);
			          }
			          partnerHbox.getChildren().add(lbs);
			          partnerHbox.getChildren().add(tf1);
			          partnerVbox.getChildren().add(partnerHbox);
		    		
		    	}
			} catch (IllegalArgumentException e) {
				logger.debug("IllegalArgumentException");
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				logger.debug("IllegalAccessException");
				e.printStackTrace();
			} catch (IOException e) {
				logger.debug("IOException");
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				logger.debug("ParserConfigurationException");
				e.printStackTrace();
			} catch (SAXException e) {
				logger.debug("SAXException");
				e.printStackTrace();
			} catch (JAXBException e) {
				logger.debug("JAXBException");
				e.printStackTrace();
			}catch (Exception e) {
				if(!Partner.equals("New Partner") && !Partner.equals("") && item.isLeaf() ) {
		    		logger.debug("Partner Call2: "+ Partner);
		    		
		    		
		    		
		    		
		    		
		    	 	Iterable<Flowpartnertemplate> templatepartner= flowpartnerrepo.findByType("MAIL");	
		        	
		        	
		        	Stream<Flowpartnertemplate> nn= StreamSupport.stream(templatepartner.spliterator(),false);
		        	ObservableList<String> hhlk=	FXCollections.observableArrayList(nn.map(p->p.getName()).collect(Collectors.toList()));
		        	
		        	
		    	   
		    	   ComboBox<String> dsfd = new ComboBox();
		    	   dsfd.setId("Partnertempate");
		    	   dsfd.setItems(hhlk);
		    	 
		    	   partnerVbox.getChildren().add(dsfd);
		    	 
		    	   
		    	   
		    	   dsfd.getSelectionModel().selectedItemProperty().addListener( new 
		      			 ChangeListener<String>() {
		      		         public void changed(ObservableValue ov, String value, String new_value) {
		      		        	 List<Flowpartnertemplate> templist =  new ArrayList<Flowpartnertemplate>();
		      		        	 templist= flowpartnerrepo.findByName(new_value);	
		      		        	partnerVbox.getChildren().removeAll(sftpTemplateFieldEntries);
		      		        	selectedTemplate= templist.get(0);
		      		        	HashMap<String, FieldParameters> Fields2 = new HashMap<>();
		      		        	sftpTemplateFieldEntries.clear();
		      		        	
		      		        	 Tooltip tooltip = new Tooltip();
		                         tooltip.setText(templist.get(0).getHelptext() );
		                         dsfd.setTooltip(tooltip);
		      		        	  Partnername=Partner;
		      		        	
		      		        	
		      		        	try {
									Fields2 = ggg.getPartnerTemplateFields(templist.get(0).getPartnerxml());
									
								 	for (HashMap.Entry<String, FieldParameters> set :
							    		Fields2.entrySet()) {
							    		HBox partnerHbox = new HBox();
								    	 Label lbs = new Label(set.getKey());
								    	 logger.debug("Fields:  " + set.getKey());
								          TextField tf1=new TextField(set.getValue().getValue());  
								          tf1.setId(set.getValue().getTemplatefieldname());
								          if(Partner.length() > 0) {
								        tf1.setPrefWidth(Partner.length()*6);
								          }
								          partnerHbox.getChildren().add(lbs);
								          partnerHbox.getChildren().add(tf1);
								         
								          sftpTemplateFieldEntries.add(partnerHbox);
							    		
							    	}
								 	 partnerVbox.getChildren().addAll(sftpTemplateFieldEntries);
									
								} catch (IllegalArgumentException | IllegalAccessException | IOException
										| ParserConfigurationException | SAXException | JAXBException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								
		      		        	
		      		        	/*
		      		        	
		      		        	
		      		        	HBox partnerHbox = new HBox();
		   		    		 Label lbs = new Label("New partner:");
		   		    		TextField tf1=new TextField(Partner);
		   		    		 partnerHbox.getChildren().add(lbs);
		   			          partnerHbox.getChildren().add(tf1);
		   			          
		   			       sftpTemplateFieldEntries.add(partnerHbox);
		   			    
		   			          Label lbk = new Label("Partner Type:");
		   			          HBox partnerHbox2 = new HBox();
		   			    		TextField tf2=new TextField(item.getParent().getValue().toString());
		   			    		 partnerHbox2.getChildren().add(lbk);
		   				          partnerHbox2.getChildren().add(tf2);
		   				          
		   				       sftpTemplateFieldEntries.add(partnerHbox2);
		   				       
		   				          
		   				       Label lbt = new Label("Partner Type:");
			   			          HBox partnerHbox3 = new HBox();
			   			    		TextField tf3=new TextField(flowpartnerrepo.findByName(new_value).get(0).getName());
			   			    		 partnerHbox3.getChildren().add(lbk);
			   				          partnerHbox3.getChildren().add(tf3);
			   				       sftpTemplateFieldEntries.add(partnerHbox3);
			   				          partnerVbox.getChildren().addAll(sftpTemplateFieldEntries);
			   				          
			   				    	*/    
			   				          
			   				      
			   	            
			   	      
		      		        	 
		      		         }
		      	});
		    	   
		    	   
                     		    		
		    		
		    		
		    	}
				
			}
	    
	    	
	    	
	    	return partnerVbox;
	    }
	    
	    
	    void partenerCreation(String folder) throws TemplateException {
	    	 Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
		    	cfg.setDefaultEncoding("UTF-8");
		    	cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
		    	cfg.setLogTemplateExceptions(false);
		    	cfg.setWrapUncheckedExceptions(true);
		    	cfg.setFallbackOnNullLoopVariable(false);
		    	StringTemplateLoader ftl1 = new StringTemplateLoader();
			          
		    	cfg.setTemplateLoader(ftl1);
		    	String fullstringxml= selectedTemplate.getPartnerxml().replace("&gt;", ">");
		    	fullstringxml =fullstringxml.replace("&lt;", "<");
		    	
		    	
		     ftl1.putTemplate("Main", fullstringxml);
		    
		     
		     Map root = new HashMap();
		    	
		    	String Filename="";
		    	
		    	for(Iterator<Node> wfit = sftpTemplateFieldEntries.iterator(); wfit.hasNext(); ){
		    		Node last=wfit.next();
		    		List<Node> hh = new ArrayList<Node>();
		    		HBox hlk = (HBox) last;
		    		
		    		
	
		    		
		    		
		    		TextField gg = (TextField) hlk.getChildren().get(hlk.getChildren().size()-1); 
		    		
		    		
		    	
		    		String fxid= gg.getId();
		    
		    	    root.put(fxid,gg.getText());
		    	}
		     
		    	root.put("partnername",Partnername);
		     
		     
		     
		    	
		    	
            try {
				Template mytpl = cfg.getTemplate("Main");
				 OutputStream       outputStream       = new FileOutputStream(folder +"\\" + Partnername + ".xml");
		            Writer out  = new OutputStreamWriter(outputStream);
	
		   
		            mytpl.process(root, out);
				
				 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        	
	    }
	    

	    public PartnerEditor(String selectedItem) {
			// TODO Auto-generated constructor stub
		}

		@FXML
	    void addPartnerAction(ActionEvent event) {
			
			

	    }

	    @FXML
	    void removePartnerAction(ActionEvent event) {

	    }


	    public String getSelectedPartnerName() {
	    	if(!PartnerTree.getSelectionModel().getSelectedItem().isLeaf()) {
	    		return PartnerTree.getSelectionModel().getSelectedItem().getValue();
	    	}else {
	    		return " ";
	    	}
	           	
	    }
	    
	    public String getSelectedPartnerType() {
	    	if(PartnerTree.getSelectionModel().getSelectedItem().isLeaf()) {
	    		return PartnerTree.getSelectionModel().getSelectedItem().getParent().getValue();
	    	}else if(!PartnerTree.getSelectionModel().getSelectedItem().isLeaf() && (PartnerTree.getSelectionModel().getSelectedItem().getParent() != null )) {
	    		return PartnerTree.getSelectionModel().getSelectedItem().getValue();
	    	}else {
	    		 return " ";
	    	}
	    	
	    }
	    
}
