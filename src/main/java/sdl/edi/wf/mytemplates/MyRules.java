package sdl.edi.wf.mytemplates;

import java.util.HashMap;

public class MyRules {
	
	private String TargetPath;
	private String Name;
	private HashMap<String,myTemplateField> fields;
	public String getTargetPath() {
		return TargetPath;
	}
	public void setTargetPath(String targetPath) {
		TargetPath = targetPath;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public HashMap<String, myTemplateField> getFields() {
		return fields;
	}
	public void setFields(HashMap<String, myTemplateField> fields) {
		this.fields = fields;
	}

}
