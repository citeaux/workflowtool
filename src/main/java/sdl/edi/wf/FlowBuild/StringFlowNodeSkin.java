/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.wf.FlowBuild;

import eu.mihosoft.vrl.workflow.VFlow;
import eu.mihosoft.vrl.workflow.VFlowModel;
import eu.mihosoft.vrl.workflow.VNode;
import eu.mihosoft.vrl.workflow.fx.FXSkinFactory;
import eu.mihosoft.vrl.workflow.fx.ScalableContentPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import jfxtras.scene.control.gauge.linear.*;
import jfxtras.scene.control.gauge.linear.elements.CompleteSegment;


/**
 *
 * @author russseba
 */
public class StringFlowNodeSkin extends CustomFlowNodeSkin {

    public StringFlowNodeSkin(FXSkinFactory skinFactory,
            VNode model, VFlow controller) {
        super(skinFactory, model, controller);
    }

    @Override
    protected Node createView() {
        
        // see jfxtras ensemble project for more sample code (gauges by @hansolo_)
        // https://github.com/JFXtras/jfxtras-ensemble/tree/master/src/ensemble/samples
        
        // value
        String string = getModel().getValueObject().getValue().toString();
        

        
        // layout
        final GridPane view = new GridPane();
        if(string.equals("partner")) {
        	view.setStyle("-fx-background-color: red");
        }
        
        view.setPadding(new Insets(5));
        view.setHgap(0);
        view.setVgap(5);
        view.setAlignment(Pos.TOP_CENTER);
        Label lbs = new Label("Ein Label");
          TextField tf1=new TextField(string);  

        // create some controls and add them to the layout
                view.add(lbs, 1, 1);
            view.add(tf1, 2, 1);
        
        
        return view;
    }


}

    
