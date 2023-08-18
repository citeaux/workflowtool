package sdl.edi.wf;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javafx.application.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WfApplication {
	Logger logger = LoggerFactory.getLogger(WfApplication.class);
	public static void main(String[] args) {
		System.out.print("Testlog");
     
		
		Application.launch(WFviewer.class, args);
	

}}
