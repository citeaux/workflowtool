package sdl.edi.wfgraphlib.cells;

import com.sun.xml.bind.v2.runtime.unmarshaller.Loader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;

import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxWeaver;
import sdl.edi.flowparser.wftorso;
import sdl.edi.wf.codeeditor.CodeeditorController;
import sdl.edi.wf.codeeditor.codeeditor;
import sdl.edi.wfgraphlib.edges.Edge;
import sdl.edi.wfgraphlib.graph.Graph;

public class RectangleCell extends AbstractCell {

	private final FxWeaver fxWeaver;
        private String  wfname;
        private     Label label;
          private     Label labelsteptype;
        private     Button code;
        private     Button partner;
          private     Button mapping;
          private CheckBox connections;
         private Tooltip tooltip;
        private  wftorso wft;
        private GridPane pane;
       
        
       private List<Edge> ConnctionsList;

   private ChoiceBox choiceBox;
    public String getWfname() {
        return wfname;
    }

    public void setWfname(String wfname) {
        this.wfname = wfname;
        label.setText(wfname);
        
    }

    public wftorso getWft() {
        return wft;
    }

    public void setWft(wftorso wft) {
        this.wft = wft;
    }

    public List<Edge> getConnctionsList() {
        return ConnctionsList;
    }

    public void setConnctionsList(List<Edge> ConnctionsList) {
        this.ConnctionsList = ConnctionsList;
    }
        
    public void AddEdge(Edge dgf){
        this.ConnctionsList.add(dgf);
    }
        
        
    
	public RectangleCell(FxWeaver fxWeaver) {
		 
            choiceBox = new ChoiceBox();
            choiceBox.getItems().add("ParentStep");
            choiceBox.getItems().add("ChildStep");
            choiceBox.setVisible(false);
            this.fxWeaver = fxWeaver;
            label= new Label("Testnachricht");
            labelsteptype = new Label("Type");
            code = new Button("Code");
            
            ConnctionsList=new ArrayList<Edge>();
               
                  partner = new Button("Partner");
                  mapping = new Button("Mapping");
                  connections = new CheckBox("Show Connections");
                  
                  
                  connections.setOnAction(
                		 
                  new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent t) {
                           if(((CheckBox) t.getSource()).isSelected()) {
                            for(Iterator<Edge> wfit = ConnctionsList.iterator(); wfit.hasNext(); ){
                            	
                                Edge   ffg = wfit.next();
                           
                                ffg.setSaveStrokePaintProprty(Paint.valueOf(Color.RED.toString()));

                        }
                           }else {
                        	   for(Iterator<Edge> wfit = ConnctionsList.iterator(); wfit.hasNext(); ){
                               	
                                   Edge   ffg = wfit.next();
                              
                                   ffg.setSaveStrokePaintProprty(Paint.valueOf(Color.BLACK.toString()));
                           }
                           }
                  }
                  }
                  );
                  
                  
                         mapping.setOnAction(new EventHandler<ActionEvent>() {
                @Override 
                public void handle(ActionEvent e) {
          
                
       

	 
	
  
	    /*
 URL url = null;
                    try {
                        url = new File("C:\\Users\\russseba\\Experimental\\wfTools\\wftools3\\src\\main\\resources\\fxml\\Codeeditor.fxml").toURI().toURL();
                    } catch (MalformedURLException ex) {
                    
                        ex.printStackTrace();
                    }
       FXMLLoader loader = new FXMLLoader(url);   
	    
	    
    */
       
     
    
     
                
               
    
                    CodeeditorController controller = fxWeaver.loadController(CodeeditorController.class);
                    
       controller.init(wft.getMappings().get(0).getMappingCode(),wft);
                    
       controller.show();
                   
                }
    });
          
            
             //------------------------------------------------------------------------------------------- 
            
            partner.setOnAction(new EventHandler<ActionEvent>() {
                @Override 
                public void handle(ActionEvent e) {
          
                         
               
    
       
     
                	  CodeeditorController controller = fxWeaver.loadController(CodeeditorController.class);
       controller.init(wft.getPartners().get(0).getPartnercode(),wft);
                    
                    
       controller.show();
                   
                }
});
            
           
               
            //  ------------------------------------------------------------------------------------------- 
            
            code.setOnAction(new EventHandler<ActionEvent>() {
                @Override 
                public void handle(ActionEvent e) {
                	
                	 CodeeditorController controller = fxWeaver.loadController(CodeeditorController.class);
                	 
       controller.init(wft.getWfsoucecode(),wft);
                    
       controller.show();
                   
                   
                }
});
	}
        
      

	@Override
	public Region getGraphic(Graph graph) {
		//final Rectangle view = new Rectangle(50, 50);
                
                label.setLayoutX(100);
                label.setLayoutY(50);
                label.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(5))));
              try{  
                if(wft.getWfmapping()){
                label.setBackground(new Background(new BackgroundFill(Color.BISQUE, CornerRadii.EMPTY, Insets.EMPTY)));
                labelsteptype.setText("Mapping");
                }else if(wft.getWfpartner()){
                     label.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                     labelsteptype.setText("Partner");
                }
                else if(wft.getWfdestination().equals("IGNORE")){
                     label.setBackground(new Background(new BackgroundFill(Color.DARKRED, CornerRadii.EMPTY, Insets.EMPTY)));
                     labelsteptype.setText("Ignored");
                }else if(wft.getWfdestination().contains("ImporterQueue")){
                     label.setBackground(new Background(new BackgroundFill(Color.GREY, CornerRadii.EMPTY, Insets.EMPTY)));
                     labelsteptype.setText("Import");
                }
                
                         else if(wft.getWfsoucecode().contains("modify-plugin")){
                     label.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                     labelsteptype.setText("Modification");
                }
                 else if(wft.getWfCopyStep() || wft.getWfsoucecode().contains("CopyNames") ){
                     label.setBackground(new Background(new BackgroundFill(Color.GREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                     labelsteptype.setText("Copy Step");
                }
                else if(wft.getWfSpitStep() || wft.getWfsoucecode().contains("SplitPluginClass")){
                     label.setBackground(new Background(new BackgroundFill(Color.DARKSEAGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                     labelsteptype.setText("Split Step");
                } 
                
                     else if( wft.getWfsoucecode().contains("schedulemerge")){
                     label.setBackground(new Background(new BackgroundFill(Color.DARKSEAGREEN, CornerRadii.EMPTY, Insets.EMPTY)));
                     labelsteptype.setText("Merge Step");
                } 
                
                else if(wft.getWfdestination().contains("ProcessorQueue")){
                     label.setBackground(new Background(new BackgroundFill(Color.YELLOW, CornerRadii.EMPTY, Insets.EMPTY)));
                     labelsteptype.setText("Processing");
                }
       
                 
                else{
                        label.setBackground(new Background(new BackgroundFill(Color.AQUA, CornerRadii.EMPTY, Insets.EMPTY)));
                }
                
              }catch (Exception ex){
                  ex.printStackTrace();
                  
              }
		//view.setStroke(Color.DODGERBLUE);
		//view.setFill(Color.DODGERBLUE);
                  
                
                
               
                 
                
		GridPane pane = new GridPane();
                this.pane=pane;
                label.setLayoutX(label.getText().length()*30);
                
                pane.add(label,1,1);
                pane.add(labelsteptype, 1, 2);
                 pane.add(choiceBox, 2, 2);
                     if(wft.getPartners().size()>0){
                  pane.add(partner, 2, 3);
                 
            }else{}
            
                     
                     if(wft.getMappings().size()>0){
                  pane.add(mapping, 1, 3);
            }else{}
                      Tooltip tooltip = new Tooltip();
                      tooltip.setText( wft.getProp()
                              
                      );
                      
                      label.setTooltip(tooltip);
                      label.setOnMouseClicked(new EventHandler<MouseEvent>(){

          @Override
          public void handle(MouseEvent arg0) {
            
            
          }

      });
                 pane.add(connections, 3, 2);
                pane.add(code, 3, 3);
	
		//label.widthProperty().bind(pane.prefWidthProperty());
                 //label.layoutXProperty().bind(pane.prefWidthProperty());
		//label.heightProperty().bind(pane.prefHeightProperty());
                //label.layoutYProperty().bind(pane.prefHeightProperty());
		CellGestures.makeResizable(pane);

		return pane;
	}
        
        public void hide(){
            pane.setVisible(false);
        }
        
        public void unhide(){
            pane.setVisible(true);
        }

        
        public void mark(){
            pane.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, null, new BorderWidths(5))));
        }
        
          public void unmark(){
            pane.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.NONE, null, new BorderWidths(0))));
        }
}
