package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="FLOWTEMPLATES")
public class Flowtemplates {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private long id;
	    
	    private String name;
	    
	    private String description;
	    
	    @ManyToOne(optional = false)
	    @JoinColumn(name = "solutionid", nullable = false,
	        referencedColumnName = "id")
	    private Edisolutions solution;
	    
	    

	    
	

		

		public boolean isMytemplate() {
			return mytemplate;
		}

		public void setMytemplate(boolean mytemplate) {
			this.mytemplate = mytemplate;
		}


	    
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

		public Edisolutions getSolution() {
			return solution;
		}

		public void setSolution(Edisolutions solution) {
			this.solution = solution;
		}

		
		
}
