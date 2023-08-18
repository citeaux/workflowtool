package sdl.edi.wf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import javafx.scene.Scene;
import javafx.stage.Stage;
import net.rgielen.fxweaver.core.FxWeaver;
import sdl.edi.wf.WFviewer.StageReadyEvent;


@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent> {
	Logger logger = LoggerFactory.getLogger(StageInitializer.class);
	private final String applicationTitle;
    private final FxWeaver fxWeaver;

    public StageInitializer(@Value("${spring.application.ui.title}") String applicationTitle,
                            FxWeaver fxWeaver) {
    	  logger.trace("A TRACE Message2");
        this.applicationTitle = applicationTitle;
        this.fxWeaver = fxWeaver;
    }

    @Override
    public void onApplicationEvent(StageReadyEvent event) {
        Stage stage = event.getStage();
        Scene newscene=new Scene(fxWeaver.loadView(MyFxmlController.class), 800, 600);
        newscene.getStylesheets().add("/eu/mihosoft/vrl/workflow/fx/default.css");
        
        stage.setScene(newscene);
        stage.setTitle("TEST");
        stage.show();
    }

}
