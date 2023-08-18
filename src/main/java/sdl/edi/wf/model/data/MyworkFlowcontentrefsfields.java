package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MYWORKFLOWCONTENTREFSID")
public class MyworkFlowcontentrefsfields {
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	  
	    private long  myworkflowcontentrefsid;
	  
	    private String fieldname;
	   
	    private String  fielddefinition;
	    
	    private String fieldcontent;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getMyworkflowcontentrefsid() {
			return myworkflowcontentrefsid;
		}

		public void setMyworkflowcontentrefsid(long myworkflowcontentrefsid) {
			this.myworkflowcontentrefsid = myworkflowcontentrefsid;
		}

		public String getFieldname() {
			return fieldname;
		}

		public void setFieldname(String fieldname) {
			this.fieldname = fieldname;
		}

		public String getFielddefinition() {
			return fielddefinition;
		}

		public void setFielddefinition(String fielddefinition) {
			this.fielddefinition = fielddefinition;
		}

		public String getFieldcontent() {
			return fieldcontent;
		}

		public void setFieldcontent(String fieldcontent) {
			this.fieldcontent = fieldcontent;
		} 
	    
	    
	    
	  
}
