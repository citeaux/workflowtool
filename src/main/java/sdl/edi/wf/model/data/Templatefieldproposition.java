package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEMPLATEFIELDSPROPOSITION")
public class Templatefieldproposition {
	
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private long templatefieldid;
    
    private String fieldproposition;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTemplatefieldid() {
		return templatefieldid;
	}

	public void setTemplatefieldid(long templatefieldid) {
		this.templatefieldid = templatefieldid;
	}

	public String getFieldproposition() {
		return fieldproposition;
	}

	public void setFieldproposition(String fieldproposition) {
		this.fieldproposition = fieldproposition;
	}

}
