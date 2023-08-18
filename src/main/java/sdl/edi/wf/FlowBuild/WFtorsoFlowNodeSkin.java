package sdl.edi.wf.FlowBuild;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import eu.mihosoft.vrl.workflow.VFlow;
import eu.mihosoft.vrl.workflow.VNode;
import eu.mihosoft.vrl.workflow.fx.FXSkinFactory;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import sdl.edi.templateparser.wfUpdates;
import sdl.edi.templateparser.wfproperties;
import sdl.edi.templateparser.wftorso;

public class WFtorsoFlowNodeSkin extends CustomFlowNodeSkin {
	
	Logger logger = LoggerFactory.getLogger(WFtorsoFlowNodeSkin.class);
	 public WFtorsoFlowNodeSkin(FXSkinFactory skinFactory,
	            VNode model, VFlow controller) {
	        super(skinFactory, model, controller);
	    }

	    @Override
	    protected Node createView() {
	        
	        // see jfxtras ensemble project for more sample code (gauges by @hansolo_)
	        // https://github.com/JFXtras/jfxtras-ensemble/tree/master/src/ensemble/samples
	        
	        // value
	    	wftorso wft = (wftorso) getModel().getValueObject().getValue();
	        

	        
	        
	        

	        
	         final SplitPane view = new SplitPane();

	       
	        
	         final VBox vbox = new VBox();
	         final VBox vbox2 = new VBox();
	    	
	        
	        
	       for(Iterator<wfproperties> wfit=wft.getProps().iterator();wfit.hasNext();) {
	        	
	        final HBox hbox = new HBox();
	        	
	       
	        	wfproperties  wfprops = 	wfit.next();
	        	
	        logger.debug("WF Props: " + wfprops.getTempparameter());
	    
	       
	        	vbox.setStyle("-fx-background-color: grey");
	        
	        
	     //   view.setPadding(new Insets(5));
	     //   view.setHgap(0);
	     //   view.setVgap(5);
	     //   view.setAlignment(Pos.TOP_CENTER);
	        	if(wfprops.getOperation() != null || !wfprops.getOperation().isEmpty() ) {
	        Label lbs = new Label(wfprops.getName());
	          TextField tf1=new TextField(wfprops.getOperation());  
	          TextField tf2=new TextField( wfprops.getTempparameter());  
	        // create some controls and add them to the layout
	                  hbox.getChildren().add(lbs);   
	                  hbox.getChildren().add(tf1);   
	                  hbox.getChildren().add(tf2);   
	          vbox.getChildren().add(hbox);
	        	}
	           
	        
	       
	        
	       }
	       
	       
	       for(Iterator<wfUpdates> wfit=wft.getUpdates().iterator();wfit.hasNext();) {
	        	
		        final HBox hbox = new HBox();
		        	
		       
		        wfUpdates  wfprops = 	wfit.next();
		        	
		        
		        logger.debug("WF Updates: " + wfprops.getTempProperty());
		       
		        	vbox2.setStyle("-fx-background-color: lightblue");
		        
		        
		     //   view.setPadding(new Insets(5));
		     //   view.setHgap(0);
		     //   view.setVgap(5);
		     //   view.setAlignment(Pos.TOP_CENTER);
		        Label lbs = new Label(wfprops.getProperty());
		          TextField tf1=new TextField("=");  
		          TextField tf2=new TextField( wfprops.getTempParameter());  
		        // create some controls and add them to the layout
		                  hbox.getChildren().add(lbs);   
		                  hbox.getChildren().add(tf1);   
		                  hbox.getChildren().add(tf2);   
		          vbox2.getChildren().add(hbox);
		          
		           
		        
		        
		        
		       }
	       
	       view.setOrientation(javafx.geometry.Orientation.VERTICAL);
	       view.getItems().addAll(vbox,vbox2);
	        return view;
	        
	        
	    }

}
