package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STANDARDPROPOSITIONS")
public class Standardpropositions {
	 @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	    private long id;
	 
	    private String proposition;
	    
	    private String shortcut;
	    
	    private String regextags;
	    
	    private String relatedprogrammobject;
	    
	    private String relatedobjectproperty;
	    
	    private Boolean parsedir;
	    
	    private Boolean onlyname;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getProposition() {
			return proposition;
		}

		public void setProposition(String proposition) {
			this.proposition = proposition;
		}

		public String getShortcut() {
			return shortcut;
		}

		public void setShortcut(String shortcut) {
			this.shortcut = shortcut;
		}

		public String getRegextags() {
			return regextags;
		}

		public void setRegextags(String regextags) {
			this.regextags = regextags;
		}

		public String getRelatedprogrammobject() {
			return relatedprogrammobject;
		}

		public void setRelatedprogrammobject(String relatedprogrammobject) {
			this.relatedprogrammobject = relatedprogrammobject;
		}

		public String getRelatedobjectproperty() {
			return relatedobjectproperty;
		}

		public void setRelatedobjectproperty(String relatedobjectproperty) {
			this.relatedobjectproperty = relatedobjectproperty;
		}

		public Boolean getParsedir() {
			return parsedir;
		}

		public void setParsedir(Boolean parsedir) {
			this.parsedir = parsedir;
		}

		public Boolean getOnlyname() {
			return onlyname;
		}

		public void setOnlyname(Boolean onlyname) {
			this.onlyname = onlyname;
		}
		
		
}
