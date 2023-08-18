package sdl.edi.wf.mytemplates;

public class myTemplateField {
	
	private String Fieldname;
	private String TemplateFieldDeclaration;
	private String FieldContent;
	
	
	
	
	public myTemplateField(String fieldname, String templateFieldDeclaration, String fieldContent) {
		super();
		Fieldname = fieldname;
		TemplateFieldDeclaration = templateFieldDeclaration;
		FieldContent = fieldContent;
	}
	
	public String getFieldname() {
		return Fieldname;
	}
	public void setFieldname(String fieldname) {
		Fieldname = fieldname;
	}
	public String getTemplateFieldDeclaration() {
		return TemplateFieldDeclaration;
	}
	public void setTemplateFieldDeclaration(String templateFieldDeclaration) {
		TemplateFieldDeclaration = templateFieldDeclaration;
	}
	public String getFieldContent() {
		return FieldContent;
	}
	public void setFieldContent(String fieldContent) {
		FieldContent = fieldContent;
	}
	
	
	

}
