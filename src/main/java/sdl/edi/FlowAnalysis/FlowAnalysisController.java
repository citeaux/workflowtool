package sdl.edi.FlowAnalysis;


import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;

import javax.xml.bind.JAXBException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ObservableObjectValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.core.FxmlView;
import sdl.edi.flowparser.wfReader;
import sdl.edi.flowparser.wfgraph;
import sdl.edi.wf.MyFxmlController;
import sdl.edi.wf.SearchResult;
import sdl.edi.wf.VisualWfGraph;
import sdl.edi.wf.model.data.Flowtemplates;
import sdl.edi.wf.model.data.FlowtemplatesRepository;
import sdl.edi.wfgraphlib.graph.Graph;




public class FlowAnalysisController extends BorderPane{
	@Autowired
    private FlowtemplatesRepository FlowtemplatesRepository;

	Logger logger = LoggerFactory.getLogger(MyFxmlController.class);
	
	private  ObservableObjectValue<? extends String> FlowNameProperty;
	private SimpleObjectProperty FlowName;
	
	
    @FXML
    private TextField searchphrase;
    @FXML
    private Button serachbutton;
    @FXML
    private ListView<VBox> MyListView;
    
    private FileChooser fileChooser ;
    private VisualWfGraph kk;
    @FXML
    private CheckBox ShowConditions;
    @FXML
    private CheckBox showIgnoreSteps;
    @FXML
    private CheckBox showProcessingSteps;
    @FXML
    private CheckBox ShowMappingSteps;
    @FXML
    private CheckBox ShowPartnerSteps;
    @FXML
    private CheckBox ShowCopySteps;
    @FXML
    private CheckBox ShowSplitSteps;
    
    @FXML
    private ScrollPane scpane;
    @FXML
    private Pane mypane;
    
    @FXML
    private Button FilesChoose;
	


    
    private  FxWeaver fxWeaver;
    


   


  public void setFlowName(String flowname) {
	  FlowName=new SimpleObjectProperty<>(flowname);
	  FlowNameProperty = FlowName;
	
  }



	public ObservableObjectValue<? extends String> getFlowNameProperty() {
	return FlowNameProperty;
}



public void setFlowNameProperty(ObservableObjectValue<? extends String> flowNameProperty) {
	FlowNameProperty = flowNameProperty;
}




	public FlowAnalysisController(FxWeaver fxWeaver, ReadOnlyDoubleProperty hight, ReadOnlyDoubleProperty width ) {

		this.setFlowName("NONAME");
    	logger.debug("csdfds");
    	this.fxWeaver = fxWeaver;
    	FXMLLoader fxmlLoader = new FXMLLoader(

    			   getClass().getResource("/FlowAnalysis.fxml"));
    	
    	fxmlLoader.setRoot(this);
    	   fxmlLoader.setController(this);
    	   this.prefHeightProperty().bind(hight);
    	   this.prefWidthProperty().bind(width);
          
    	   try {
    	      fxmlLoader.load();
    	   } catch (IOException exception) {
    	      throw new RuntimeException(exception);
    	   }
    	
    	fileChooser = new FileChooser();

	}








    









	public void init() {
		
	
    	
    }


	@FXML
    private void ChooseFile(ActionEvent event) {
        
         
         this.fileChooser.setTitle("Open Resource File");

          System.out.println(mypane.getScene() == null);
     

          File file = new File("TEst.text");
          file=fileChooser.showOpenDialog(null);
      
         wfReader wfr = null;
        
          try {
            wfr = new wfReader(file.getParent());
        } catch (JAXBException ex) {
        	
        } catch (IOException ex) {
        	
        }
          
           this.setFlowName(wfr.getWflist().get(0).wfname);
          
            wfgraph hhh= new wfgraph(wfr.getWflist());
            kk=new VisualWfGraph(fxWeaver);
            Graph tree = new Graph();
            kk.addwfComponents(tree, hhh.getGraph(), wfr.getWflist());
           
             try {
            Insets insets_2 =  new Insets(70.0f, 70.0f, 70.0f, 70.0f);            
            tree.getCanvas().setPadding(insets_2 );
             } catch (Exception ex) {
            	
        }
            
            
		
                scpane.setContent(tree.getCanvas());
            
           
             
                
              
    
    }      
    
    
    @FXML
    private void searchaction(ActionEvent event) {
        ObservableList<VBox> items = FXCollections.observableArrayList();
        kk.unmarkall();
        
      
        List<SearchResult> list= new ArrayList<>();
        list=kk.searchForTextInFlowSteps(searchphrase.getText());
         System.out.println("count" + list.size());
         for (Iterator<SearchResult>tm = list.iterator();tm.hasNext(); ){
             System.out.println("xx");
             SearchResult hh=tm.next();
                            hh.getCell().mark();
                            
                    Label label=new Label();
                    label.setTextFill(Color.RED);
                    label.setFont(new Font("Arial",20));
                    
                      Label label2 =new Label();
                      Label label3 =new Label();
                      label3.setTextFill(Color.GREEN);
                      Label label4 =new Label();
                            label.setText(hh.getResultlocation().get("Flowname"));

                            label2.setText(hh.getPrestring());
                            label3.setText(searchphrase.getText());
                            label4.setText(hh.getPoststring());
                            //System.out.print("search name flow" + hh.getResultlocation().get("Flowname"));
                    VBox svbox= new VBox();
                    svbox.getChildren().add(label);
                    svbox.getChildren().add(label2);
                    svbox.getChildren().add(label3);
                    svbox.getChildren().add(label4);
                    items.add(svbox);
                    
         }
         MyListView.setItems(items);
         
         
                
    }
    
    
    public VisualWfGraph getKk() {
        return kk;
    }

    @FXML
    private void ShowConditions(ActionEvent event) {
        if(ShowConditions.isSelected()){
            kk.showEdgtexts();
           
            
        }else{
               kk.hideEdgtexts(); 
              
               
        }
        
    }

    @FXML
    private void showIgnoreSteps(ActionEvent event) {
          if(showIgnoreSteps.isSelected()){
            kk.showIgnoreSteps();
        }else{
               kk.hideIgnoreSteps(); }
    }

    @FXML
    private void showProcessingSteps(ActionEvent event) {
           if(showProcessingSteps.isSelected()){
            kk.showProcessingSteps();
        }else{
               kk.hideProcessingSteps(); }
    }

    @FXML
    private void ShowMappingSteps(ActionEvent event) {
    }

    @FXML
    private void ShowPartnerSteps(ActionEvent event) {
    }

    @FXML
    private void ShowCopySteps(ActionEvent event) {
    }

    @FXML
    private void ShowSplitSteps(ActionEvent event) {
    }
}
