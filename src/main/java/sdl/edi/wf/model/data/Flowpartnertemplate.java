package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="FLOWPARTNERTEMPLATE")
public class Flowpartnertemplate {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private long id;
	    
	    private String name;
	    
	    private String partnerxml;
	    
	    private String type;
	    
	    private Boolean doublepartner;
	    
	    private long doublepartnerparent;
	    
	    private String system;
	    
	    private Boolean external;
	    
	    private String helptext;

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

		public String getPartnerxml() {
			return partnerxml;
		}

		public void setPartnerxml(String partnerxml) {
			this.partnerxml = partnerxml;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getDoublepartner() {
			return doublepartner;
		}

		public void setDoublepartner(Boolean doublepartner) {
			this.doublepartner = doublepartner;
		}

		public long getDoublepartnerparent() {
			return doublepartnerparent;
		}

		public void setDoublepartnerparent(long doublepartnerparent) {
			this.doublepartnerparent = doublepartnerparent;
		}

		public String getSystem() {
			return system;
		}

		public void setSystem(String system) {
			this.system = system;
		}

		public Boolean getExternal() {
			return external;
		}

		public void setExternal(Boolean external) {
			this.external = external;
		}

		public String getHelptext() {
			return helptext;
		}

		public void setHelptext(String helptext) {
			this.helptext = helptext;
		}
	    
		
		
	    

}
