/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.wf;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author russseba
 */
public class ProprtiesController implements Initializable {

    @FXML
    private TableView<?> properytable;
    @FXML
    private TableColumn<?, ?> property;
    @FXML
    private TableColumn<?, ?> operator;
    @FXML
    private TableColumn<?, ?> value;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
