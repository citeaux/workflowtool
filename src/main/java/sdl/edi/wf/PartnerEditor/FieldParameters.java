package sdl.edi.wf.PartnerEditor;

public class FieldParameters {

	private String value;
	private String type;
	private String templatefieldname;
	
	
	
	public String getTemplatefieldname() {
		return templatefieldname;
	}
	public void setTemplatefieldname(String templatefieldname) {
		this.templatefieldname = templatefieldname;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public FieldParameters(String value, String type) {
		super();
		this.value = value;
		this.type = type;
	}
	
	
	public FieldParameters(String value, String type, String templatefieldname) {
		super();
		this.value = value;
		this.type = type;
		this.templatefieldname= templatefieldname;
	}
	
	

}
