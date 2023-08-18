package sdl.edi.wf.FlowBuild;

import java.io.File;
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
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.MutableGraph;


import eu.mihosoft.vrl.workflow.ConnectionResult;
import eu.mihosoft.vrl.workflow.Connector;
import eu.mihosoft.vrl.workflow.DefaultValueObject;
import eu.mihosoft.vrl.workflow.FlowFactory;
import eu.mihosoft.vrl.workflow.VFlow;
import eu.mihosoft.vrl.workflow.VNode;
import eu.mihosoft.vrl.workflow.ValueObject;
import eu.mihosoft.vrl.workflow.fx.FXValueSkinFactory;
import eu.mihosoft.vrl.workflow.skin.VNodeSkin;
import freemarker.cache.FileTemplateLoader;
import freemarker.cache.StringTemplateLoader;
import freemarker.core.ParseException;
import freemarker.template.Configuration;
import freemarker.template.MalformedTemplateNameException;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.TemplateExceptionHandler;
import freemarker.template.TemplateNotFoundException;
import javafx.application.Platform;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
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
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.util.Callback;
import javafx.util.Pair;
import jfxtras.labs.scene.layout.ScalableContentPane;
import net.rgielen.fxweaver.core.FxWeaver;
import sdl.edi.flowparser.wfReader;
import sdl.edi.templateparser.wfTemplateReader;
import sdl.edi.templateparser.wfUpdates;
import sdl.edi.templateparser.wfgraph;
import sdl.edi.templateparser.wfproperties;
import sdl.edi.templateparser.wftorso;
import sdl.edi.wf.BuilderDTO;
import sdl.edi.wf.MyFxmlController;
import sdl.edi.wf.PartnerEditor.PartnerEditor;
import sdl.edi.wf.ReferenceEditor.ReferenceEditor;
import sdl.edi.wf.SolutionsEditor.SolutionsEditor;
import sdl.edi.wf.file.Filehandling;
import sdl.edi.wf.model.data.Edisolutions;
import sdl.edi.wf.model.data.EdisolutionsRepository;
import sdl.edi.wf.model.data.Flowtemplates;
import sdl.edi.wf.model.data.FlowtemplatesRepository;
import sdl.edi.wf.model.data.Ruletemplates;
import sdl.edi.wf.model.data.Standardpropositions;
import sdl.edi.wf.model.data.Templatefieldproposition;
import sdl.edi.wf.model.data.Templatefields;
import sdl.edi.wfgraphlib.cells.RectangleCell;
import sdl.edi.wfgraphlib.edges.Edge;
import sdl.edi.wfgraphlib.graph.ICell;
import sdl.edi.xml.general.ReadXML;


public class FlowBuildController extends BorderPane{

	Logger logger = LoggerFactory.getLogger(FlowBuildController.class);
	
	
	
	 @FXML
	    private VBox AllTabDetailsVbox;

	    @FXML
	    private Button ButtonAddConentRef;

	    @FXML
	    private Button ButtonAddPartner;

	    @FXML
	    private Button ButtonCreateAddPartner;

	    @FXML
	    private Button ButtonRemoveConentRef;

	    @FXML
	    private Button ButtonShowConentRefCode;

	    @FXML
	    private Button ButtonShowPartnerCode;

	    @FXML
	    private TableView<?> ComtentRefTableView;

	    @FXML
	    private TableColumn<?, ?> ComtentRefTableViewDescription;

	    @FXML
	    private TableColumn<?, ?> ComtentRefTableViewName;
	    
	    @FXML
	    private Tab Ger;
	    
	    private  ObservableList<flowpartners> partnerslist;
	    
	    @FXML
	    private TableView<flowpartners> PartnerTabelView;

	    @FXML
	    private TableColumn<flowpartners, String> PartnerTabelViewName;

	    @FXML
	    private TableColumn<flowpartners, String> PartnerTabelViewRule;

	    @FXML
	    private TableColumn<flowpartners, String> PartnerTabelViewType;

    @FXML
	private Tab Contentrefs;

    @FXML
    private VBox DetailsVbox;
    
    @FXML
    private CheckBox onlyOwnTemplates;

    @FXML
    private ChoiceBox<String> Flowtemplate;

    @FXML
    private Button FlowtemplateEdit;
    
    @FXML
    private Button refresh;

    @FXML
    private Button FlowtemplateNew;

    @FXML
    private Button FlowtemplateOpen;

 
    
    @FXML
    private Button SaveFlow;

    @FXML
    private ChoiceBox<String> Solutiontt;

    @FXML
    private Button SolutionEdit;

    @FXML
    private Button SolutionNew;

    @FXML
    private Tab Partners;

    @FXML
    private VBox GeneralTabVbox;
    

    @FXML
    private CheckBox SavePartners;

    @FXML
    private CheckBox SaveRefs;

 

 

    @FXML
    private Pane mypane;

    @FXML
    private ScrollPane scpane;

    @FXML
    private Button splittingRule;

    @FXML
    private CheckBox showWithData;
    
    @FXML
    private ChoiceBox<String> System;
    
 
    private List<Node> hboxnodes;
    
   
    private BuilderDTO DTO;
    
    
    private  VFlow flow;
    
    List<wftorso> usedtorso;

	private FxWeaver fxWeaver;
	
	private List<VNode> vnodes;
	
	  private DirectoryChooser fileChooser ;
	
    @FXML
    private Button SaveFlowToSystem;
	
    
    private FXValueSkinFactory  fXSkinFactory;
	
    private SolutionsEditor editsolution; 
    
    private PartnerEditor partnereditor; 
    
    private ReferenceEditor referenceeditor;
    
    @FXML
    void ButtonAddConentRefAction(ActionEvent event) {
    	referenceeditor= new ReferenceEditor(DTO.getSolutions(),
    			                             String.valueOf(this.Solutiontt.getSelectionModel().getSelectedItem()),
    			                             String.valueOf(System.getSelectionModel().getSelectedItem()), 
    			                             DTO.getFlowcontentreftemplatesrepo());
    	Dialog dialog = new Dialog<String>();
    	dialog.setTitle("Reference Configuration");
    	dialog.setHeaderText("Configure PartReferences");
    	ButtonType loginButtonType = new ButtonType("OK", ButtonData.OK_DONE);
    	dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);
    	dialog.getDialogPane().setContent(referenceeditor);
    	dialog.showAndWait();
    	
    }

    @FXML
    void ButtonAddPartnerAction(ActionEvent event) throws ParserConfigurationException, SAXException, IOException {
    	
    	partnereditor = new PartnerEditor(DTO.getSolutions(),
    			                          String.valueOf(this.Solutiontt.getSelectionModel().getSelectedItem()), 
    			                          String.valueOf(System.getSelectionModel().getSelectedItem()), 
    			                          DTO.getFlowpartnertemprepo());
    	
    	Dialog dialog = new Dialog<String>();
    	dialog.setTitle("Partner Configuration");
    	dialog.setHeaderText("Configure Partners");
    	//dialog.setGraphic(new ImageView(this.getClass().getResource("login.png").toString()));
    	ButtonType loginButtonType = new ButtonType("OK", ButtonData.OK_DONE);
    	dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);
    	dialog.getDialogPane().setContent(partnereditor);

    	
    	
    	dialog.setResultConverter(new Callback<ButtonType, String>() {
    	    @Override
    	    public String call(ButtonType b) {
    	 
    	        if (b == loginButtonType) {
    	 
    	            return new String(partnereditor.SelectedPartnername);
    	        }
    	 
    	        return null;
    	    }
    	});
    	         
    	Optional<String> result = dialog.showAndWait();
    	         
    	if (result.isPresent()) {
    		logger.debug("Choosen File 9898 " + result.get());
    		partnerslist.add(new flowpartners(result.get()," ", ""));
    	  
    	}
    	
    	
    	
    	
    	
    }

    @FXML
    void ButtonCreateAddPartnerAction(ActionEvent event) {

    }

    @FXML
    void ButtonRemoveConentRefAction(ActionEvent event) {

    }

    @FXML
    void ButtonShowConentRefCodeAction(ActionEvent event) {

    }

    @FXML
    void ButtonShowPartnerCodeAction(ActionEvent event) {

    }
    
	

    @FXML
    void ChooseFile(ActionEvent event) {

    }


    
    @FXML
    void SaveFlowToSystemEvent(ActionEvent event) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
    	
    	// logger.debug("Weltordung: " + hboxnodes.get(0).getId());
    	
    	fileChooser = new DirectoryChooser();
    	  this.fileChooser.setTitle("Open Folder");
    	

     
          
        
         String folder= fileChooser.showDialog(null).getPath();
      
         logger.debug("Folder: " + folder);
        
         generateFlowOnFileSys(folder);

    }
    
    
    public static class flowpartners{
        private SimpleStringProperty  partnername;
        private SimpleStringProperty   rulenname;
        private SimpleStringProperty  partnertype;
		public String  getPartnername() {
			return partnername.get();
		}
		public void setPartnername(String partnername) {
			this.partnername.set(partnername);
		}
		public String getRulenname() {
			return rulenname.get();
		}
		public void setRulenname(String rulenname) {
			this.rulenname.set(rulenname);
		}
		public String  getPartnertype() {
			return partnertype.get();
		}
		public void setPartnertype(String partnertype) {
			this.partnertype.set(partnertype);
		}
		private flowpartners(String partnername, String rulenname,
				String partnertype) {
			super();
			this.partnername =new SimpleStringProperty(partnername);
			this.rulenname = new SimpleStringProperty(rulenname);
			this.partnertype = new SimpleStringProperty(partnertype);
		}
		
		
        
    }
    
    
    
    public void generateFlowOnFileSys(String path) throws TemplateNotFoundException, MalformedTemplateNameException, ParseException, IOException, TemplateException {
    	
    	Configuration cfg = new Configuration(Configuration.VERSION_2_3_29);
    	cfg.setDefaultEncoding("UTF-8");
    	cfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);
    	cfg.setLogTemplateExceptions(false);
    	cfg.setWrapUncheckedExceptions(true);
    	cfg.setFallbackOnNullLoopVariable(false);
    	
    	Map root = new HashMap();
    	
    	String Filename="";
    	
    	for(Iterator<Node> wfit = hboxnodes.iterator(); wfit.hasNext(); ){
    		Node last=wfit.next();
    		
    		ComboBox gg = (ComboBox) last; 
    		
    		for(Iterator<wftorso> wfits = usedtorso.iterator(); wfits.hasNext(); ){
                wftorso  ffg =  wfits.next();
                Filename = ffg.getWfrulename().replace(last.getId(), gg.getValue().toString());
                Filename = Filename.replaceAll("(\\$\\{)(.*)(\\})(.*)", "$2$4");
                ffg.setWfrulename(Filename);
             
                
            }
    	
    		String fxid= last.getId();
    
    	    root.put(fxid,gg.getValue());
    	}
    	 logger.debug("Frema: " + root.toString());
    	
    	 for(Iterator<wftorso> wfits = usedtorso.iterator(); wfits.hasNext(); ){
             wftorso  ffg =  wfits.next();

             logger.debug("Frema2: " + ffg.getWfrulename());
             
             StringTemplateLoader ftl1 = new StringTemplateLoader();
            
          
           
            
            cfg.setTemplateLoader(ftl1);
            OutputStream       outputStream       = new FileOutputStream(path +"\\" + ffg.getWfrulename());
            Writer out  = new OutputStreamWriter(outputStream);
            ftl1.putTemplate("Main", ffg.getWfsoucecode());
            Template mytpl = cfg.getTemplate("Main");
            mytpl.process(root, out);
        
            
            outputStream.close();
          out.close();
       
            
             
         }
         
    	 
    	
    	//Template temp = cfg.getTemplate("test.ftlh");
    	
    }
    
     
	public FlowBuildController(FxWeaver fxWeaver, ReadOnlyDoubleProperty hight, ReadOnlyDoubleProperty width, BuilderDTO give) {
    	this.fxWeaver = fxWeaver;

    	FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource("/FlowBuild.fxml"));
    	fxmlLoader.setRoot(this);
 	   fxmlLoader.setController(this);
 	  this.prefHeightProperty().bind(hight);
	   this.prefWidthProperty().bind(width);
	   try {
  	      fxmlLoader.load();
  	   } catch (IOException exception) {
  	      throw new RuntimeException(exception);
  	   }
		
 	
	   DTO= give;
	   
	   partnerslist= FXCollections.observableArrayList();
	   
	   PartnerTabelViewName.setCellValueFactory(
               new PropertyValueFactory<flowpartners, String>("partnername"));
	   PartnerTabelViewRule.setCellValueFactory(
               new PropertyValueFactory<flowpartners, String>("rulename"));
	   PartnerTabelViewType.setCellValueFactory(
               new PropertyValueFactory<flowpartners, String>("partnertype"));
	   
	   PartnerTabelView.setItems(partnerslist);
	   
	   long my=1;
		Flowtemplates fltmp=  give.getFlowtemplate().findById((long) 1).get(); 	  
    	logger.debug("dddddcc " + fltmp.getName());
    	
        
    	
    	System.setItems(FXCollections.observableArrayList("GENERAL","PSDEV","DEMO","FINAL"));
    	System.getSelectionModel().select(2);
    	
    	System.getSelectionModel().selectedIndexProperty().addListener( new 
    			 ChangeListener<Number>() {
    		         public void changed(ObservableValue ov, Number value, Number new_value) {
    		        	 Solutiontt.getItems().clear();
    		        
    		        	   	Iterable<Edisolutions> edisolution=  give.getSolutions().findBySystem(System.getItems().get((int) new_value));	
    		        	 Stream<Edisolutions> nn= StreamSupport.stream(edisolution.spliterator(),false);
    		         	ObservableList<String> hh=	FXCollections.observableArrayList(nn.map(p->p.getSystemsolution()).collect(Collectors.toList()));
    		  
    		         	Solutiontt.setItems(hh);
    		        	 
    		         }
    	});

 
    	Solutiontt.getSelectionModel().selectedIndexProperty().addListener( new 
   			 ChangeListener<Number>() {
	         public void changed(ObservableValue ov, Number value, Number new_value) {
	        	 Flowtemplate.getItems().clear();
	        	 logger.debug("TEMPSEARCH0: "); 
	        	 logger.debug("TEMPSEARCH4: " + Solutiontt.getItems().get((int) new_value)); 
	        	 logger.debug("TEMPSEARCH5: " + give.getSolutions().findBySystemsolution(Solutiontt.getItems().get((int) new_value)
              		   ).get(0).getName()); 
	        	 Iterable<Flowtemplates> ediflow=  give.getFlowtemplate().findBySolution(
	        			 give.getSolutions().findBySystemsolution(Solutiontt.getItems().get((int) new_value)
		                		   ).get(0)
	        			                   );	
	        	 Iterable<Flowtemplates> ediflow2=  give.getFlowtemplate().findBySolution(give.getSolutions().findBySystemsolution("GENERAL").get(0));	
	        	 logger.debug("TEMPSEARCH1: " +  Solutiontt.getItems().get((int) new_value) );
	        	 logger.debug("TEMPSEARCH2: " +  ediflow );
	        	 logger.debug("TEMPSEARCH3: " +  ediflow2 );
	         	Stream<Flowtemplates> combinestream=Stream.concat(
	         			StreamSupport.stream(ediflow.spliterator(),false),
	         			StreamSupport.stream(ediflow2.spliterator(),false));
	         	ObservableList<String> hhm=	FXCollections.observableArrayList(combinestream.map(p->p.getName()).collect(Collectors.toList()));
	         
	         	Flowtemplate.setItems(hhm);
	        	 
	         }
});
    	
    	
   
  

    	
		
    	   
           
    	   
	}

	
public void init() {
    	
    }


public void visualiseFlow(MutableGraph<sdl.edi.templateparser.wftorso> mutableGraph, List<wftorso> wtl, List<Flowtemplates> selectedFlowTemplate) {
	usedtorso=wtl;
	GeneralTabVbox.getChildren().clear();
	hboxnodes = new ArrayList<Node>();
	 vnodes=new ArrayList<>();
    List<Edge> alledges = new ArrayList<>();
     List<String> alledgetexts = new ArrayList<>();
     
     

     MutableGraph<sdl.edi.templateparser.wftorso> graphguava = mutableGraph;

	// ------------------------------
	this.getStylesheets().add("default.css");
 if(flow != null) {
        flow.clear();
        flow = FlowFactory.newFlow();
       flow.setVisible(true);
       }else {
    		     flow = FlowFactory.newFlow();
    		       flow.setVisible(true);   
       }
      

    //---------------   
       for(Iterator<wftorso> wfit = wtl.iterator(); wfit.hasNext(); ){
           wftorso  ffg =  new wftorso();
           ffg = wfit.next();
           
           String test;
           
           test = ffg.getWfrulename();
                
           VNode hh = flow.newNode();
           

           try {
        	 
               hh.setTitle(test);
           
               
               Connector input = hh.addInput("data");
               Connector output = hh.addOutput("data");

               hh.setMainOutput(output);
               hh.setMainInput(input);
           

               hh.getValueObject().setValue(ffg);
           } catch (Exception e) {
            
               e.printStackTrace();
           }
           
           
           vnodes.add(hh);

       }
       
       
       //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
       
       
       for(Iterator<EndpointPair<wftorso>> iter=graphguava.edges().iterator();iter.hasNext();){
    	   logger.debug("Start connection buidling");
           EndpointPair<wftorso> jj=iter.next();
           VNode hlk ;
           List<VNode> icellconnecta = new ArrayList<>();
           List<VNode> icellconnectb = new ArrayList<>();
             for(Iterator<VNode> imer = vnodes.iterator(); imer.hasNext();){
            	 logger.debug("Start connection buidling2");
                     hlk= (VNode)imer.next();
             
                     wftorso tos=(wftorso)hlk.getValueObject().getValue();
         
                  
                     
                     if(tos.getWfrulename()==jj.nodeU().getWfrulename()){
                         logger.debug("Roetgern " + hlk.getTitle());
                         icellconnecta.add(hlk);
                     }
                      if(tos.getWfrulename()==jj.nodeV().getWfrulename()){
                    	  logger.debug("Roetgern2 " + hlk.getTitle());
                         icellconnectb.add(hlk);
                     }
                 }
             for(Iterator<VNode> icl = icellconnecta.iterator(); icl.hasNext();){
                     for(Iterator<VNode> icla = icellconnectb.iterator(); icla.hasNext();){
                    	 logger.debug("Start connection buidling3");
                    	 VNode jjl= icla.next();
                    	 VNode klk = (VNode) jjl;
                    	 ConnectionResult may=flow.connect(icl.next(), jjl, "data");
                         
                         logger.debug("ConnectionResult: " + may);
                         
                        
                   
                         
                }
             }
             
             
          }
       
       
   
       
       ScalableContentPane canvas = new ScalableContentPane();

       canvas.setStyle("-fx-background-color: linear-gradient(to bottom, rgb(10,32,60), rgb(42,52,120));");

       fXSkinFactory = new FXValueSkinFactory(mypane);


      canvas.setVisible(true);
 


      fXSkinFactory.addSkinClassForValueType(wftorso.class, WFtorsoFlowNodeSkin.class);


      
      flow.addSkinFactories(fXSkinFactory);
       flow.setSkinFactories(fXSkinFactory);
       
  
       

       
       scpane.setContent(mypane);
       
       
       
       
       for(Iterator<Templatefields> wfit = DTO.getTemplatefields().findByFlowtemplateid(selectedFlowTemplate.get(0).getId()).iterator(); wfit.hasNext(); ){
    	   logger.debug("Field name-----" + selectedFlowTemplate.get(0).getId());
    	   Templatefields fielddate=wfit.next();
    	   final HBox hbox = new HBox();
    	   
    	   	Iterable<Templatefieldproposition> templatefieldproposition=  DTO.getFieldpropositons().findByTemplatefieldid(fielddate.getId());	
        	
        	
        	Stream<Templatefieldproposition> nn= StreamSupport.stream(templatefieldproposition.spliterator(),false);
        	ObservableList<String> hhlk=	FXCollections.observableArrayList(nn.map(p->p.getFieldproposition()).collect(Collectors.toList()));
        	ObservableList<String> hhcc=	FXCollections.observableArrayList(getPropositionsForField(fielddate.getFieldname()));
        	
    	   
    	   ComboBox<String> dsfd = new ComboBox();
    	   dsfd.setId(fielddate.getFieldname());
    	   logger.debug("Field name!!: " +  fielddate.getFieldname());
    	   if(hhlk.size()>0) {

    	   dsfd.setItems(hhlk);
    	   }else if(hhcc.size() > 0){

    		   dsfd.setItems(hhcc);
    	   }else {
    		   logger.debug("Fill it3!!!"); 
    		   dsfd.setItems(FXCollections.observableArrayList("Nothing found"));
    	   }
    	   dsfd.setEditable(true);
    	 
    	   bindAutoCompleteToComboBox(dsfd);
    	   
    	   hboxnodes.add(dsfd);
    	   Label lbs = new Label(fielddate.getFieldname());
          
    	   
    	   
    	  
    	
           hbox.getChildren().add(lbs);   
           hbox.getChildren().add(dsfd); 
    	   GeneralTabVbox.getChildren().add(hbox);
       }
       
}


List<String> getPropositionsForField(String field) {
	
	
	List<Standardpropositions>  stprop = DTO.getStandardPropositions().findByRelatedprogrammobject("EDISOLUTIONS");
	List<String> databaseobjekts =  new ArrayList<>();
    List<Edisolutions> sol= DTO.getSolutions().findBySystemAndSystemsolution(this.System.getSelectionModel().getSelectedItem(), this.Solutiontt.getSelectionModel().getSelectedItem());
	logger.debug("Fieldgetter 1");
	Boolean parsedir=false;
	Boolean onlyname=false;
	List<String>paths = new ArrayList<>();
	
	for(Iterator<Standardpropositions> wfit = stprop.iterator(); wfit.hasNext(); ) {
		Standardpropositions mlp = wfit.next();
		if(field.matches(mlp.getRegextags())) {
			parsedir = mlp.getParsedir();
			onlyname = mlp.getOnlyname();
		databaseobjekts.add(mlp.getRelatedobjectproperty());

		}
		
	}

	String path ="";
	String syspath="";
	String name="";
	if(databaseobjekts.size() > 0) {
		path = sol.get(0).getObjektByName(databaseobjekts.get(0));
		syspath = sol.get(0).getSolutionObjektByName(databaseobjekts.get(0));
		
	}
	
	
	Filehandling fh = new  Filehandling();
	
	
	
	if(!path.equals("") && parsedir.booleanValue() == true && onlyname.booleanValue() == false) {
		paths = fh.getFilenNamesFromDirectory(path, syspath);
	}else if(!path.equals("")  && parsedir.booleanValue() == false) {	
		logger.debug("NoDirParsing");
		paths.add(syspath);
	}else if(!path.equals("")  && parsedir.booleanValue() == true && onlyname.booleanValue() == true) {	
		logger.debug("NoDirParsing");
		try {
			paths = fh.getAssetNamesFromDirectory(path);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}else {
		paths.add("");
	}
	
	
	return paths;
	
	
}






@FXML
void refresh(ActionEvent event) {

}

@FXML
void EditFlowtemplate(ActionEvent event) {

}

@FXML
void EditSolution(ActionEvent event) {
	editsolution = new SolutionsEditor(DTO.getSolutions());
	
	Dialog dialog = new Dialog<>();
	dialog.setTitle("Solution Configuration");
	dialog.setHeaderText("Configure Edi Solution");
	//dialog.setGraphic(new ImageView(this.getClass().getResource("login.png").toString()));
	ButtonType loginButtonType = new ButtonType("OK", ButtonData.OK_DONE);
	dialog.getDialogPane().getButtonTypes().addAll(loginButtonType, ButtonType.CANCEL);
	dialog.getDialogPane().setContent(editsolution);
	dialog.show();

}

@FXML
void NewFlowtemplate(ActionEvent event) {

}

@FXML
void NewSolution(ActionEvent event) {

}

@FXML
void OpenFlowtemplate(ActionEvent event) throws IOException, JAXBException {
	
	String flowtemplatename = Flowtemplate.getSelectionModel().getSelectedItem();
List<Flowtemplates> myflw=	DTO.getFlowtemplate().findByName(flowtemplatename);

List<Ruletemplates> myRules =DTO.getRuletemplates().findByFlowid(myflw.get(0).getId());

wfTemplateReader rulemodel = new wfTemplateReader(myRules);

wfgraph  flowgraph = new wfgraph(rulemodel.getWflist());



	visualiseFlow(flowgraph.getGraph(), rulemodel.getWflist() , myflw);

}

@FXML
void SaveFlow(ActionEvent event) {
	
	logger.debug("SaveFlow: " );

}

@FXML
void showWithData(ActionEvent event) {
	
	if(this.showWithData.isSelected()) {
	
	for(Iterator<VNode> node = vnodes.iterator();node.hasNext(); ){
		VNode nodesave= node.next();
		wftorso torso = (wftorso) nodesave.getValueObject().getValue();
		for(Iterator<wfproperties> wfit=torso.getProps().iterator();wfit.hasNext();) {
			wfproperties  wfprops = 	wfit.next();

			String  FilenameVisual="";
	    	for(Iterator<Node> wfits = hboxnodes.iterator(); wfits.hasNext(); ){
	    		Node last=wfits.next();
	    		
	    		ComboBox gg = (ComboBox) last; 
	    		
	    		if(torso.getWfrulename().matches(".*" + gg.getId()+ ".*") ) {
	    		 FilenameVisual = torso.getWfrulename().replace(gg.getId(), gg.getValue().toString());
	    		 logger.debug("Filename: " + last.getId() + " -- " +gg.getValue().toString() + "  ## " + FilenameVisual);
	             FilenameVisual = FilenameVisual.replaceAll("(\\$\\{)(.*)(\\})(.*)", "$2$4");
	             logger.debug("Filename2: " + FilenameVisual);
	             nodesave.setTitle(FilenameVisual);
	    		}
	    		
	    		if( wfprops.getParameter().matches(".*" + gg.getId() + ".*")){  
	    		
	    			wfprops.setTempparameter(gg.getValue().toString());
	    		}
	           
	    	
	    		//String fxid= last.getId();
	    
	    	    //root.put(fxid,gg.getValue());
	    	}
		}
		
		for(Iterator<wfUpdates> wfitt=torso.getUpdates().iterator();wfitt.hasNext();) {
			wfUpdates  wfprops = 	wfitt.next();

			
	    	for(Iterator<Node> wfitsk = hboxnodes.iterator(); wfitsk.hasNext(); ){
	    		Node last=wfitsk.next();
	    		
	    		ComboBox gg = (ComboBox) last; 
	    		if( wfprops.getParameter().matches(".*" + gg.getId() + ".*")){  
	    		
	    			wfprops.setTempParameter(gg.getValue().toString());
	    			logger.debug("Propsset:" + gg.getId() + " " + gg.getValue().toString() + "### " + wfprops.getTempParameter() );
	    		}
	           
	    	
	    		//String fxid= last.getId();
	    
	    	    //root.put(fxid,gg.getValue());
	    	}
		}
		
		
	     
		nodesave.getValueObject().setValue(torso);
		
		}
	
	flow.setSkinFactories(fXSkinFactory);
	
	}else {
		
		
		
		for(Iterator<VNode> node = vnodes.iterator();node.hasNext(); ){
			VNode nodesave= node.next();
			wftorso torso = (wftorso) nodesave.getValueObject().getValue();
			for(Iterator<wfproperties> wfit=torso.getProps().iterator();wfit.hasNext();) {
				wfproperties  wfprops = 	wfit.next();

				
		    	for(Iterator<Node> wfits = hboxnodes.iterator(); wfits.hasNext(); ){
		    		Node last=wfits.next();
		    		
		    		 String  FilenameVisual = torso.getWfrulename();
		         
		             nodesave.setTitle(FilenameVisual);
		    		
		    			wfprops.setTempparameter(wfprops.getParameter());
		    		

		    	}
			}
			
			for(Iterator<wfUpdates> wfitt=torso.getUpdates().iterator();wfitt.hasNext();) {
				wfUpdates  wfprops = 	wfitt.next();

				
		    	for(Iterator<Node> wfitsk = hboxnodes.iterator(); wfitsk.hasNext(); ){
		    		Node last=wfitsk.next();
		    		
		    		
		    		
		    			wfprops.setTempParameter(wfprops.getParameter());
		    	
		    		
		           
		    
		    	}
			}
			
         
		     
			nodesave.getValueObject().setValue(torso);
			
			}
		
		flow.setSkinFactories(fXSkinFactory);
		
		
	}
	
		
	}
	
	


public static void bindAutoCompleteToComboBox(ComboBox<String> categoryComboBox) {
	java.lang.System.out.println("Intelisense");

    /**
     * backup the original list
     */
    List<String> categoryComboBoxItemsList = new ArrayList<String>(categoryComboBox.getItems());

    /**
     * if mouse pressed: select all of the text field
     */
   
    categoryComboBox.getEditor().setOnMouseClicked(new EventHandler<Event>() {

      

		@Override
		public void handle(Event event) {
			 Platform.runLater(new Runnable() {
	                @Override
	                public void run() {
	                    if (categoryComboBox.getEditor().isFocused() && !categoryComboBox.getEditor().getText().isEmpty()) {
	                        categoryComboBox.getEditor().selectAll();
	                    }
	                }
	            });
			
		}
    });

    /**
     * events on text input
     */
    categoryComboBox.setOnKeyReleased(new EventHandler<KeyEvent>() {

        private List<String> reducedList = new ArrayList<String>();

        @Override
        public void handle(KeyEvent event) {
        	java.lang.System.out.println("Intelisense3");

            if (event.getCode().isLetterKey() || event.getCode().isDigitKey() || event.getCode().equals(KeyCode.BACK_SPACE)) {
            	java.lang.System.out.println("Intelisense2");

                /**
                 * Open comboBox if letter, number or backspace
                 */
                categoryComboBox.show();

                String temp = categoryComboBox.getEditor().getText();
                reducedList = new ArrayList<String>();

                /**
                 * If backspace pressed, selection refers to the basic list again
                 */
                if (event.getCode().equals(KeyCode.BACK_SPACE)) {
                    categoryComboBox.getItems().clear();
                    categoryComboBox.getItems().addAll(categoryComboBoxItemsList);

                    // java fx workaround to restore the default list height of 10
                    categoryComboBox.hide();
                    categoryComboBox.setVisibleRowCount(10);
                    categoryComboBox.show();
                }

                /**
                 * loop through all entrys and look whether input contains this text.
                 *
                 * after that, entry will be added to the reduced list
                 */
                for (String element : categoryComboBox.getItems()) {
                    if (StringUtils.containsIgnoreCase(element, temp)) {
                        reducedList.add(element);
                    }
                }

                /**
                 * all elements are cleared, the reduced list will be added. First element is selected
                 */
                categoryComboBox.getItems().clear();
                categoryComboBox.getItems().addAll(reducedList);
                categoryComboBox.getSelectionModel().select(0);
                categoryComboBox.getEditor().setText(temp);

            } else if (event.getCode().equals(KeyCode.ENTER)) {

                /**
                 * if enter, the element which is selected will be applied to the text field and the dropdown will be closed
                 */
                if (categoryComboBox.getSelectionModel().getSelectedIndex() != -1) {
                    categoryComboBox.getEditor().setText(categoryComboBox.getItems().get((categoryComboBox.getSelectionModel().getSelectedIndex())));
                } else {
                    categoryComboBox.getEditor().setText(categoryComboBox.getItems().get(0));
                }

            } else if (event.getCode().equals(KeyCode.DOWN)) {
            	java.lang.System.out.println("Intelisense44");

                /**
                 * arrow down shows the dropdown
                 */
                categoryComboBox.show();
            }

            /**
             * Tab marks everything (when tabbing into the field
             */
            if (event.getCode().equals(KeyCode.TAB)) {
            	java.lang.System.out.println("Intelisense5");

                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        if (categoryComboBox.getEditor().isFocused() && !categoryComboBox.getEditor().getText().isEmpty()) {
                            categoryComboBox.getEditor().selectAll();
                        }
                    }
                });

            } else {
                /**
                 * all entries except for tab put the caret on the last character
                 */
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        categoryComboBox.getEditor().positionCaret(categoryComboBox.getEditor().getText().length());
                    }
                });
            }

        }
    });

    /**
     * focus lost
     */
    categoryComboBox.focusedProperty().addListener(new ChangeListener<Boolean>() {

        /**
         * if focus lost: refill the category combo box with the original items
         */
        @Override
        public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
        	java.lang.System.out.println("Intelisense88");

            if (oldValue) {

                /**
                 * saves whether textfield was empty before reset the comboBox
                 */
                boolean emptyTextField = categoryComboBox.getEditor().getText().isEmpty();

                if (categoryComboBox.getSelectionModel().getSelectedIndex() != -1) {
                    categoryComboBox.getEditor().setText(categoryComboBox.getItems().get(categoryComboBox.getSelectionModel().getSelectedIndex()));
                }

                String temp = categoryComboBox.getEditor().getText();

                categoryComboBox.getItems().clear();
                categoryComboBox.getItems().addAll(categoryComboBoxItemsList);

                if (!emptyTextField) {
                    categoryComboBox.getSelectionModel().select(temp);
                } else {
                    categoryComboBox.getEditor().setText("");
                }
            }
        }
    });
}



     
}
