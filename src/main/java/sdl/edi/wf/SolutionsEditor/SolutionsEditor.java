package sdl.edi.wf.SolutionsEditor;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.DirectoryChooser;
import sdl.edi.wf.model.data.Edisolutions;
import sdl.edi.wf.model.data.EdisolutionsRepository;


public class SolutionsEditor extends BorderPane{
	
	Logger logger = LoggerFactory.getLogger(SolutionsEditor.class);
	@FXML
    private Button Cancel;

    @FXML
    private Label CodefilePath;

    @FXML
    private TextField CodefilesPath;

    @FXML
    private TextField ContentRefsPath;
    
    
    @FXML
    private TextField SystemCodefilesPath;





  

    @FXML
    private TextField SystemMappingPath;

    @FXML
    private TextField SystemMflwPath;
    
    

    @FXML
    private TextField SystemName;

  



    @FXML
    private CheckBox AutoFillSystemPath;
    
    @FXML
    private TextField CountersPath;

    @FXML
    private Button getCodefilepath_Button;

	@FXML
    private Button Delete;

    @FXML
    private TextArea Description;

    @FXML
    private TextField FlowPath;

    @FXML
    private Button GoBackward;

    @FXML
    private Button GotoEnd;

    @FXML
    private Button GotoNext;

    @FXML
    private Button GotoStart;

    @FXML
    private TextField MappingPath;

    @FXML
    private TextField MflwPath;

    @FXML
    private TextField Name;

    @FXML
    private Button New;

    @FXML
    private Button New2;

    @FXML
    private TextField PartnersPath;

    @FXML
    private TextField Responsible;

    @FXML
    private Button Save;

    @FXML
    private ChoiceBox<String> System;

    @FXML
    private Button getContentrefpath_Button;

    @FXML
    private Button getCounterspath_Button;

    @FXML
    private Button getFlowpath_Button;

    @FXML
    private Button getMFLpath_Button;

    @FXML
    private Button getMappingpath_button;

    @FXML
    private Button getPartnerpath_Button;
    
    @FXML
    private Button cleanFields;
    

    @FXML
    private Button getSolutionpath_button;

    @FXML
    private Button setPaths_button;
    
    private EdisolutionsRepository  edisolutions;
    
    private Long solutionpointer;
    
    private Edisolutions currentsolution;
    
    private List<Long> allsolutionids;

    @FXML
    void cleanFields(ActionEvent event) {
    	CodefilesPath.setText("");
    	ContentRefsPath.setText("");
    	CountersPath.setText("");
    	Description.setText("");
    	FlowPath.setText("");
    	MappingPath.setText("");
    	MflwPath.setText("");
        Name.setText("");
        PartnersPath.setText("");
        Responsible.setText("");
        SystemCodefilesPath.setText("");

        SystemMappingPath.setText("");
        SystemMflwPath.setText("");
        SystemName.setText("");

    }
    
    
    @FXML
    void Cancel(ActionEvent event) {

    }

    @FXML
    void Delete(ActionEvent event) {

    }

    @FXML
    void GoBackward(ActionEvent event) {

    	
    
    	logger.debug("GotoNext2 index: " + allsolutionids.indexOf(currentsolution.getId()));
    	logger.debug("GotoNext : " + currentsolution.getId());
    	
    	logger.debug("GotoNext : " + allsolutionids);
    	
    	int  counter=1;
         if(allsolutionids.indexOf(currentsolution.getId()-counter) == -1) {
    		for(int i=1; allsolutionids.indexOf(currentsolution.getId() - i) == -1 && currentsolution.getId() -i  !=0 ; ) {
    			i++;
    			logger.debug("Backwardtest : " + (allsolutionids.indexOf(currentsolution.getId() - i) == -1 && currentsolution.getId() -i  !=0));
    			counter=i;
    		}
         }
    	
    	logger.debug("GotoBack : " + counter);
    	logger.debug("GotoBack2 : " + (currentsolution.getId() - counter));
        Long id=	allsolutionids.get(allsolutionids.indexOf(currentsolution.getId()) == 0 ? allsolutionids.indexOf(currentsolution.getId())  : allsolutionids.indexOf(currentsolution.getId()-counter));
        currentsolution=edisolutions.findById(id).get();	
        filldialogfields(edisolutions.findById(id).get());
    	
    }

    @FXML
    void GotoEnd(ActionEvent event) {
          
    }

    @FXML
    void GotoNext(ActionEvent event) {
    
    	logger.debug("GotoNext : " + currentsolution.getName());
    	logger.debug("GotoNext Lastindex: " + allsolutionids.lastIndexOf(currentsolution.getId()));
    	logger.debug("GotoNext index: " + allsolutionids.indexOf(currentsolution));
    	logger.debug("GotoNext index: " + (allsolutionids.get(allsolutionids.size()-1) == allsolutionids.indexOf(currentsolution) ? "YES"  : "NO"));
    	logger.debug("GotoNext Next index: " + allsolutionids.indexOf(currentsolution.getId()) + 1);
    	
    Long id=	allsolutionids.get(allsolutionids.get(allsolutionids.size()-1) == allsolutionids.indexOf(currentsolution.getId()) ? allsolutionids.indexOf(currentsolution.getId())  : allsolutionids.indexOf(currentsolution.getId()) + 1);
    currentsolution=edisolutions.findById(id).get();
    filldialogfields(edisolutions.findById(id).get());
    	
    }

    @FXML
    void GotoStart(ActionEvent event) {

    }

    @FXML
    void New(ActionEvent event) {
    	
    	Edisolutions newsolution = new Edisolutions();
    	newsolution.setName(this.Name.getText());
    	newsolution.setSystemsolution(this.SystemName.getText());
    	newsolution.setPathcodefiles(this.CodefilePath.getText());
    	newsolution.setPathcontentrefs(this.ContentRefsPath.getText());
    	newsolution.setPathcounters(this.CountersPath.getText());
    	newsolution.setDescription(this.Description.getText());
    	newsolution.setPathflows(this.FlowPath.getText());
    	newsolution.setPathmapping(this.MappingPath.getText());
    	newsolution.setPathmfls(this.MappingPath.getText());
    	newsolution.setPathpartners(this.PartnersPath.getText());
    	newsolution.setResponsible(this.Responsible.getText());
    	newsolution.setSystem(this.System.getValue());   
    	newsolution.setSystempathcodefiles(this.SystemCodefilesPath.getText());
    	newsolution.setSystempathmapping(this.SystemMappingPath.getText());
    	newsolution.setSystempathmfls(this.SystemMflwPath.getText());
    	
    	edisolutions.save(newsolution);
    
    	}

    @FXML
    void Save(ActionEvent event) {
    	
    	
    	Edisolutions newsolution = currentsolution;
    	newsolution.setName(this.Name.getText());
    	newsolution.setPathcodefiles(this.CodefilesPath.getText());
    	newsolution.setPathcontentrefs(this.ContentRefsPath.getText());
    	newsolution.setPathcounters(this.CountersPath.getText());
    	newsolution.setDescription(this.Description.getText());
    	newsolution.setPathflows(this.FlowPath.getText());
    	newsolution.setPathmapping(this.MappingPath.getText());
    	newsolution.setPathmfls(this.MflwPath.getText());
    	newsolution.setPathpartners(this.PartnersPath.getText());
    	newsolution.setResponsible(this.Responsible.getText());
    	newsolution.setSystem(this.System.getValue());   
    	newsolution.setSystempathcodefiles(this.SystemCodefilesPath.getText());
    	newsolution.setSystempathmapping(this.SystemMappingPath.getText());
    	newsolution.setSystempathmfls(this.SystemMflwPath.getText());
    	newsolution.setSystemsolution(this.SystemName.getText());
    	
    	edisolutions.save(newsolution);
 

    }
    
    
    public SolutionsEditor(  EdisolutionsRepository  edisolutions) {
      	//this.fxWeaver = fxWeaver;
    	

    	FXMLLoader fxmlLoader = new FXMLLoader( getClass().getResource("/SolutionDialog.fxml"));
    	fxmlLoader.setRoot(this);
 	   fxmlLoader.setController(this);

	   try {
  	      fxmlLoader.load();
  	   } catch (IOException exception) {
  	      throw new RuntimeException(exception);
  	   }
	   
	   
	   System.setItems(FXCollections.observableArrayList("PSDEV","DEMO","FINAL"));
   	System.getSelectionModel().select(1); 	   
	   
	   
	   this.edisolutions= edisolutions;
	   
	   currentsolution = this.edisolutions.findById((long)1).get();
	   solutionpointer=(long)+1;
	   
	   Iterable<Edisolutions> edisolutionlist=this.edisolutions.findAll();
	   Stream<Edisolutions> nn= StreamSupport.stream(edisolutionlist.spliterator(),false);
	  allsolutionids=nn.map(p->p.getId()).collect(Collectors.toList());
	  
	  filldialogfields(currentsolution);
	
	   AutoFillSystemPath.setSelected(true);
	   
	   Name.focusedProperty().addListener((obs, oldVal, newVal) -> 
	   changeFieldName(newVal ? false : true));
	   
	   MappingPath.focusedProperty().addListener((obs, oldVal, newVal) -> 
	   changeFieldMapping(newVal ? false : true));
	   
	   CodefilesPath.focusedProperty().addListener((obs, oldVal, newVal) -> 
	   changeFieldcodefile(newVal ? false : true));
	   
	   MflwPath.focusedProperty().addListener((obs, oldVal, newVal) -> 
	   changeFieldMFL(newVal ? false : true));
	   
	}
    
    
    
    void filldialogfields(Edisolutions solution) {
    	solutionpointer=solution.getId();
    	CodefilesPath.setText(solution.getPathcodefiles());
    	ContentRefsPath.setText(solution.getPathcontentrefs());
    	CountersPath.setText(solution.getPathcounters());
    	Description.setText(solution.getDescription());
    	FlowPath.setText(solution.getPathflows());
    	MappingPath.setText(solution.getPathmapping());
    	MflwPath.setText(solution.getPathmfls());
        Name.setText(solution.getName());
        PartnersPath.setText(solution.getPathpartners());
        Responsible.setText(solution.getResponsible());
        SystemCodefilesPath.setText(solution.getSystempathcodefiles());

        SystemMappingPath.setText(solution.getSystempathmapping());
        SystemMflwPath.setText(solution.getSystempathmfls());
        SystemName.setText(solution.getSystemsolution());
    	
    	
    }
    
    
    void changeFieldMFL(Boolean focusleft ) {
    	if(focusleft && AutoFillSystemPath.isSelected() ) {
    	String mysolution= this.Name.getText();
		String mysystemsolution=mysolution.replaceAll("(.*)(\\\\)(.*)$","$3");
      this.SystemMflwPath.setText(mysystemsolution);
    	}
    
    }
    
    
    void changeFieldName(Boolean focusleft ) {
    	if(focusleft && AutoFillSystemPath.isSelected() ) {
    	String mysolution= this.Name.getText();
		String mysystemsolution=mysolution.replaceAll("(.*)(\\\\)(.*)$","$3");
      this.SystemName.setText(mysystemsolution);
    	}
    
    }
    
    void changeFieldcodefile(Boolean focusleft ) {
    	if(focusleft && AutoFillSystemPath.isSelected() ) {
    	String mysolution= this.Name.getText();
		String mysystemsolution=mysolution.replaceAll("(.*)(\\\\)(.*)$","$3");
      this.SystemCodefilesPath.setText(mysystemsolution);
    	}
    
    }
    
    void changeFieldMapping(Boolean focusleft ) {
    	if(focusleft && AutoFillSystemPath.isSelected() ) {
    	String mysolution= this.Name.getText();
		String mysystemsolution=mysolution.replaceAll("(.*)(\\\\)(.*)$","$3");
		  this.SystemMappingPath.setText(mysystemsolution + "/Mappings");
    	}
    
    }
    
    void changeFields(Boolean focusleft ) {
    	if(focusleft ) {
    		String mysolution= this.Name.getText();
    		String mysystemsolution=mysolution.replaceAll("(.*)(\\\\)(.*)$","$3");
          this.SystemName.setText(mysystemsolution);
          
          this.SystemMappingPath.setText(mysystemsolution + "/Mappings");
          this.MappingPath.setText(mysolution + "\\saxon\\Mappings");
          
          this.CodefilesPath.setText(mysolution + "\\codefiles");
           this.SystemCodefilesPath.setText("codefiles/" + mysystemsolution );
           
           this.SystemMflwPath.setText(mysystemsolution + "/Formats" );
    		this.MflwPath.setText(mysolution + "\\alsb\\Formats");
    		
    		this.FlowPath.setText(mysolution + "\\rules" );
    		
    		this.PartnersPath.setText(mysolution + "\\partners");
    		
    		this.ContentRefsPath.setText(mysolution + "\\references");
    		this.CountersPath.setText(mysolution + "\\counters");
    		
    	}
    }
    

    @FXML
    void getContentrefpath(ActionEvent event) {
    	
    	DirectoryChooser  fileChooser = new DirectoryChooser();
    	  fileChooser.setTitle("Solution Reference Path");
    	

     
          
        
         String folder= fileChooser.showDialog(null).getPath();
       this.ContentRefsPath.setText(folder);

    }

    @FXML
    void getCounterspath(ActionEvent event) {
    	
    	DirectoryChooser  fileChooser = new DirectoryChooser();
    	  fileChooser.setTitle("Solution Counter Path");
    	

     
          
        
         String folder= fileChooser.showDialog(null).getPath();
         
         this.CountersPath.setText(folder);


    }

    @FXML
    void getFlowpath(ActionEvent event) {
    	
    	DirectoryChooser  fileChooser = new DirectoryChooser();
  	  fileChooser.setTitle("Solution Flow Path");
  	

   
        
      
       String folder= fileChooser.showDialog(null).getPath();

       this.FlowPath.setText(folder);

    }

    @FXML
    void getMFLpath(ActionEvent event) {
    	
    	DirectoryChooser  fileChooser = new DirectoryChooser();
    	  fileChooser.setTitle("Solution Converter Path");
    	

     
          
        
         String folder= fileChooser.showDialog(null).getPath();
         
         this.MflwPath.setText(folder);

    }

    @FXML
    void getMappingpath(ActionEvent event) {
    	
    	DirectoryChooser  fileChooser = new DirectoryChooser();
    	  fileChooser.setTitle("Solution Mapping Path");
    	

     
          
        
         String folder= fileChooser.showDialog(null).getPath();
         this.MappingPath.setText(folder);

    }

    @FXML
    void getPartnerpath(ActionEvent event) {
    	
    	DirectoryChooser  fileChooser = new DirectoryChooser();
  	  fileChooser.setTitle("Solution Partner Path");
  	

   
        
      
       String folder= fileChooser.showDialog(null).getPath();
       
       this.PartnersPath.setText(folder);
    }

    

    @FXML
    void getCodefilepath(ActionEvent event) {
    	
    	DirectoryChooser  fileChooser = new DirectoryChooser();
  	  fileChooser.setTitle("Solution Path");
  	
       String folder= fileChooser.showDialog(null).getPath();
       
       this.CodefilesPath.setText(folder);

    }
    
    @FXML
    void AutoFillSystemPathAction(ActionEvent event) {

    }
    
    
    @FXML
    void MappingPathReleased(KeyEvent event) {
    	
    	
    	 if( event.getCode() == KeyCode.TAB && AutoFillSystemPath.isSelected() ) {
 		   SystemMappingPath.setText(MappingPath.getText());
 		  }


    }
    
    

    @FXML
    void NamePressed(KeyEvent event) {
 
    }

    @FXML
    void NameReleased(KeyEvent event) {
    	
    	
            
    }
    
    

    @FXML
    void getSolutionpath(ActionEvent event) {
    	
    	
    	DirectoryChooser  fileChooser = new DirectoryChooser();
    	  fileChooser.setTitle("Solution Path");
    	

     
          
        
         String folder= fileChooser.showDialog(null).getPath();
         
         this.Name.setText(folder);

    }

    @FXML
    void setPaths(ActionEvent event) {
    	changeFields(true);
    }
}

