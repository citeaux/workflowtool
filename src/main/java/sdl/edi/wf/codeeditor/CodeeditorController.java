/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.wf.codeeditor;

import com.sun.javafx.cursor.CursorFrame;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxWeaver;
import net.rgielen.fxweaver.core.FxmlView;
import sdl.edi.flowparser.wftorso;

import org.fxmisc.flowless.VirtualizedScrollPane;
import org.fxmisc.richtext.CodeArea;
import org.fxmisc.richtext.LineNumberFactory;
import org.fxmisc.richtext.model.StyleSpans;
import org.fxmisc.richtext.model.StyleSpansBuilder;
import org.springframework.stereotype.Component;

/**
 * FXML Controller class
 *
 * @author russseba
 */
@FxmlView("/Codeeditor.fxml")
@Component
public class CodeeditorController implements Initializable {
    

    @FXML
    private VBox dialog;
    @FXML
    private BorderPane BorderPane;
    @FXML
    private MenuItem Save;
    @FXML
    private MenuItem SaveAs;
    @FXML
    private Label Path;
    
    
    private Stage stage;

    
    private wftorso wft;

    private CodeArea codeArea;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	 
    	//this.stage = new Stage();
    	//stage.setScene(new Scene(dialog));
    	
    	/*
    	FxWeaver fxWeaver = new FxWeaver(applicationContext::getBean, applicationContext::close);
        Scene scene = new Scene(fxWeaver.loadView(MainController.class), 400, 300);

        
        stage.setScene(new Scene(fxWeaver.loadView(dialog.class)));
        */
        // CodeArea codeArea = new CodeArea();
        //codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));
        /*
        codeArea.textProperty().addListener((obs, oldText, newText) -> {
            codeArea.setStyleSpans(0, computeHighlighting(newText));
        });
        codeArea.replaceText(0, 0, sampleCode);
        */
        /*
        try {
             BorderPane.getStylesheets().add(CodeeditorController.class.getResource("/xml-highlighting.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }
        */
         /*
        BorderPane.setCenter(new VirtualizedScrollPane<>(codeArea));
        codeArea.setVisible(true);
        BorderPane.setVisible(true);
        
        stage.setScene(new Scene(dialog));
        */
    }    
    

    
    public void init(String code, wftorso wft){
    	//this.dialog = new VBox();
    	this.stage = new Stage();
        stage.setScene(new Scene(dialog));
    	
    	//this.stage = new Stage();
    	//stage.setScene(new Scene(dialog));
    	
        
         codeArea = new CodeArea();
        //codeArea.setParagraphGraphicFactory(LineNumberFactory.get(codeArea));

        codeArea.textProperty().addListener((obs, oldText, newText) -> {
            codeArea.setStyleSpans(0, computeHighlighting(newText));
        });
     
        codeArea.replaceText(0, 0, code);
        codeArea.setVisible(true);
        
        try {
             BorderPane.getStylesheets().add(CodeeditorController.class.getResource("/xml-highlighting.css").toExternalForm());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
       
        BorderPane.setCenter(new VirtualizedScrollPane<>(codeArea));
        Path.setText(wft.getWfpath() +  "\\" + wft.getWfrulename());
        this.wft= wft;
        
    }
    
    private static final Pattern XML_TAG = Pattern.compile("(?<ELEMENT>(</?\\h*)(\\w+)([^<>]*)(\\h*/?>))"
    		+"|(?<COMMENT><!--[^<>]+-->)");
    
    private static final Pattern ATTRIBUTES = Pattern.compile("(\\w+\\h*)(=)(\\h*\"[^\"]+\")");
    
    private static final int GROUP_OPEN_BRACKET = 2;
    private static final int GROUP_ELEMENT_NAME = 3;
    private static final int GROUP_ATTRIBUTES_SECTION = 4;
    private static final int GROUP_CLOSE_BRACKET = 5;
    private static final int GROUP_ATTRIBUTE_NAME = 1;
    private static final int GROUP_EQUAL_SYMBOL = 2;
    private static final int GROUP_ATTRIBUTE_VALUE = 3;
    
    
    private static final String sampleCode = String.join("\n", new String[] {
    		"<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>",
    		"<!-- Sample XML -->",
    		"< orders >",
    		"	<Order number=\"1\" table=\"center\">",
    		"		<items>",
    		"			<Item>",
    		"				<type>ESPRESSO</type>",
    		"				<shots>2</shots>",
    		"				<iced>false</iced>",
    		"				<orderNumber>1</orderNumber>",
    		"			</Item>",
    		"			<Item>",
    		"				<type>CAPPUCCINO</type>",
    		"				<shots>1</shots>",
    		"				<iced>false</iced>",
    		"				<orderNumber>1</orderNumber>",
    		"			</Item>",
    		"			<Item>",
    		"			<type>LATTE</type>",
    		"				<shots>2</shots>",
    		"				<iced>false</iced>",
    		"				<orderNumber>1</orderNumber>",
    		"			</Item>",
    		"			<Item>",
    		"				<type>MOCHA</type>",
    		"				<shots>3</shots>",
    		"				<iced>true</iced>",
    		"				<orderNumber>1</orderNumber>",
    		"			</Item>",
    		"		</items>",
    		"	</Order>",
    		"</orders>"
    		});
    
    
    	   private static StyleSpans<Collection<String>> computeHighlighting(String text) {
        Matcher matcher = XML_TAG.matcher(text);
        int lastKwEnd = 0;
        StyleSpansBuilder<Collection<String>> spansBuilder = new StyleSpansBuilder<>();
        while(matcher.find()) {
        	
        	spansBuilder.add(Collections.emptyList(), matcher.start() - lastKwEnd);
        	if(matcher.group("COMMENT") != null) {
        		spansBuilder.add(Collections.singleton("comment"), matcher.end() - matcher.start());
        	}
        	else {
        		if(matcher.group("ELEMENT") != null) {
        			String attributesText = matcher.group(GROUP_ATTRIBUTES_SECTION);
        			
        			spansBuilder.add(Collections.singleton("tagmark"), matcher.end(GROUP_OPEN_BRACKET) - matcher.start(GROUP_OPEN_BRACKET));
        			spansBuilder.add(Collections.singleton("anytag"), matcher.end(GROUP_ELEMENT_NAME) - matcher.end(GROUP_OPEN_BRACKET));

        			if(!attributesText.isEmpty()) {
        				
        				lastKwEnd = 0;
        				
        				Matcher amatcher = ATTRIBUTES.matcher(attributesText);
        				while(amatcher.find()) {
        					spansBuilder.add(Collections.emptyList(), amatcher.start() - lastKwEnd);
        					spansBuilder.add(Collections.singleton("attribute"), amatcher.end(GROUP_ATTRIBUTE_NAME) - amatcher.start(GROUP_ATTRIBUTE_NAME));
        					spansBuilder.add(Collections.singleton("tagmark"), amatcher.end(GROUP_EQUAL_SYMBOL) - amatcher.end(GROUP_ATTRIBUTE_NAME));
        					spansBuilder.add(Collections.singleton("avalue"), amatcher.end(GROUP_ATTRIBUTE_VALUE) - amatcher.end(GROUP_EQUAL_SYMBOL));
        					lastKwEnd = amatcher.end();
        				}
        				if(attributesText.length() > lastKwEnd)
        					spansBuilder.add(Collections.emptyList(), attributesText.length() - lastKwEnd);
        			}

        			lastKwEnd = matcher.end(GROUP_ATTRIBUTES_SECTION);
        			
        			spansBuilder.add(Collections.singleton("tagmark"), matcher.end(GROUP_CLOSE_BRACKET) - lastKwEnd);
        		}
        	}
            lastKwEnd = matcher.end();
        }
        spansBuilder.add(Collections.emptyList(), text.length() - lastKwEnd);
        return spansBuilder.create();
    }

    @FXML
    private void Save(ActionEvent event)  {
        
        System.out.println("Save File");
        try {
            System.out.println("Save File II");
            System.out.println(wft.getWfpath() + '\\' +wft.getWfFilename());
            System.out.println(codeArea.getText());
            FileWriter writer = new FileWriter(wft.getWfpath() + "\\" + wft.getWfFilename(), false);
            writer.write(codeArea.getText());
            wft.setWfsoucecode(codeArea.getText());
            

                    
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        

        
        
        
    }

    @FXML
    private void SaveAs(ActionEvent event) {
        
        
    }


	public void show() {
		
		stage.show();
		
	}
    
    
}
