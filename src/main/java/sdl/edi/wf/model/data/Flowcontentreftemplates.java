package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="FLOWCONTENTREFTEMPLATES")
public class Flowcontentreftemplates {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    
	    public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getContentruledefintion() {
			return contentruledefintion;
		}

		public void setContentruledefintion(String contentruledefintion) {
			this.contentruledefintion = contentruledefintion;
		}

		private String name;
	    
	    private String description;
	    
	    private String contentruledefintion;

}
