package sdl.edi.wf;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

public class WFviewer extends Application {
	Logger logger = LoggerFactory.getLogger(WFviewer.class);
	private ConfigurableApplicationContext applicationContext;

    @Override
    public void init() {
    	  logger.trace("A TRACE Message init");
        applicationContext = new SpringApplicationBuilder(WfApplication.class).run();
    }

    @Override
    public void start(Stage stage) {
    	 logger.trace("A TRACE Message start");
        applicationContext.publishEvent(new StageReadyEvent(stage));
    }

    @Override
    public void stop() {
    	logger.trace("A TRACE Message stop");
        applicationContext.close();
        Platform.exit();
    }

    static class StageReadyEvent extends ApplicationEvent {
    	
        public StageReadyEvent(Stage stage) {
        
            super(stage);
        }

        public Stage getStage() {
        	
            return ((Stage) getSource());
        }
    }
	

}
