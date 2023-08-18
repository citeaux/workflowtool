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
import eu.mihosoft.vrl.workflow.fx.FXFlowNodeSkinBase;
import jfxtras.labs.scene.layout.ScalableContentPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 *
 * @author russseba
 */
public abstract class CustomFlowNodeSkin extends FXFlowNodeSkinBase {

    public CustomFlowNodeSkin(FXSkinFactory skinFactory,
            VNode model, VFlow controller) {
        super(skinFactory, model, controller);
    }

    protected abstract Node createView();

    @Override
    public void updateView() {

        super.updateView();

        // we don't create custom view for flows
        if (getModel() instanceof VFlowModel) {
            return;
        }

        // we don't create a custom view if no value has been defined
        if (getModel().getValueObject().getValue() == null) {
            return;
        }

        // create the view
        Node view = createView();

        // add the view to scalable content pane
        if (view != null) {

            ScalableContentPane scalableContentPane = new ScalableContentPane();
            scalableContentPane.setPadding(new Insets(10));

            GridPane nodePane = new GridPane();
            nodePane.setAlignment(Pos.CENTER);
            scalableContentPane.setContentPane(nodePane);

            scalableContentPane.getContentPane().getChildren().add(view);
            getNode().setContentPane(scalableContentPane);
        }
    }
}
