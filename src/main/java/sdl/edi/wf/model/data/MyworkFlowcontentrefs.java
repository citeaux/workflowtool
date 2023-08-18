package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MYWORKFLOWCONTENTREFS")
public class MyworkFlowcontentrefs {
	
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	  
	    private long myworkflowid;
	    
	    private String name;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public long getMyworkflowid() {
			return myworkflowid;
		}

		public void setMyworkflowid(long myworkflowid) {
			this.myworkflowid = myworkflowid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	    
	    
}
