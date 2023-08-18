package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MYWORKFLOWTEMPLATES")
public class MyworkFlowtemplates {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    
	    private String name;
	    
	    private String description;
	    
	    public long getSolutionid() {
			return solutionid;
		}

		public void setSolutionid(long solutionid) {
			this.solutionid = solutionid;
		}

		public boolean isMytemplate() {
			return mytemplate;
		}

		public void setMytemplate(boolean mytemplate) {
			this.mytemplate = mytemplate;
		}

		private long solutionid;
	    
	    private boolean mytemplate;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

}
