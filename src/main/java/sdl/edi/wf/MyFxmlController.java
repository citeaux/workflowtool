package sdl.edi.wf;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.core.FxmlView;
import sdl.edi.FlowAnalysis.FlowAnalysisController;
import sdl.edi.wf.FlowBuild.FlowBuildController;
import sdl.edi.wf.model.data.*;
import sdl.edi.wfgraphlib.graph.Graph;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



import javax.xml.bind.JAXBException;

/**
 * FXML Controller class
 *
 * @author russseba
 */
@Component
@FxmlView("/MyFxml.fxml")
public class MyFxmlController implements Initializable {
	
	
	
	Logger logger = LoggerFactory.getLogger(MyFxmlController.class);
	
	@Autowired
    private FlowtemplatesRepository FlowtemplatesRepository;
	
	@Autowired
	private EdisolutionsRepository solutions;
	 
	
	private List<Tab> tablist;
	
    @FXML
    private BorderPane BorderPaneMain;
  
	@FXML
    private Tab ProjectTab;
	
	@FXML
    private Tab BuildTab;

    @FXML
    private TabPane TabPaneProject;

    
    @FXML
    private MenuItem OpenViewMenu;

    @FXML
    private MenuItem NewWFmenu;
    
   
    private FlowAnalysisController fwAnalysis;
    

    private FlowBuildController fwBuild;
    
    @Autowired
    private BuilderDTO dto;
    
       
    private final FxWeaver fxWeaver;
     Scene test;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	  logger.trace("A TRACE Message");
    	  
    	  tablist = new ArrayList<>();
    	
    	 // FlowAnalysisController  analysis = new FlowAnalysisController(fxWeaver);
    	  logger.debug("dddddddd" +  dto.getSolutions().toString());
    	 fwAnalysis = new FlowAnalysisController(fxWeaver, TabPaneProject.heightProperty(), TabPaneProject.widthProperty());
    	fwBuild = new FlowBuildController(fxWeaver, TabPaneProject.heightProperty(), TabPaneProject.widthProperty(),dto);
    	BuildTab.setContent(fwBuild);
    	  
			ProjectTab.textProperty().bind(fwAnalysis.getFlowNameProperty());
	ProjectTab.setContent(fwAnalysis);
	
	  Edisolutions hhh =solutions.findById((long) 1).get();
			
	long my=1;
	Flowtemplates fltmp=  FlowtemplatesRepository.findById((long) 1).get();
    
	
	
    logger.debug("TEST DB " + hhh.getName());
			// TODO Auto-generated catch block
	

			
		}
    	  
    	 
    
 
   

    



    @FXML
    void NewWF(ActionEvent event) {


    }

    @FXML
    void OpenView(ActionEvent event) {
    	FlowAnalysisController fwAnalysis = new FlowAnalysisController(fxWeaver, TabPaneProject.heightProperty(), TabPaneProject.widthProperty());
    	Tab newtab= new Tab();
    	newtab.setContent(fwAnalysis);
      
    	fwAnalysis.setFlowNameProperty(newtab.textProperty());
    	
    	TabPaneProject.getTabs().add(newtab);

    }


    

    public MyFxmlController(FxWeaver fxWeaver) {
    	 this.fxWeaver = fxWeaver;
    }
    
     
 
    

    

   
        
    }
   
    

