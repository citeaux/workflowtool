package sdl.edi.wf.model.data;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="EDISOLUTIONS")
public class Edisolutions {



		
		    @Id
		    @GeneratedValue(strategy = GenerationType.SEQUENCE)
		    private long id;
		    
		    private String name;
		    
		    private String description;
		    
		    private String pathmapping;
		    
		    private String pathflows;
		    
		    private String pathpartners;
		    
		    private String system;
		    
		    private String pathcontentrefs;
		    
		    private String pathcounters;
		    
		    private String responsible;
		    
		    private String pathmfls;
		    
		    private String pathcodefiles;
		    
		    @OneToMany(mappedBy = "solution", cascade = CascadeType.ALL)
		    private List<Flowtemplates> flowtmplates;
		    
		    private String systempathmapping;
		    
		    private String systempathflows;
		    
		    private String systempathpartners;
		    
		    
		    private String systempathcontentrefs;
		    
		    private String systempathcounters;
		    
		    private String systemresponsible;
		    
		    private String systempathmfls;
		    
		    private String systempathcodefiles;
		    
		    private String systemsolution;

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

			public String getPathmapping() {
				return pathmapping;
			}

			public void setPathmapping(String pathmapping) {
				this.pathmapping = pathmapping;
			}

			public String getPathflows() {
				return pathflows;
			}

			public void setPathflows(String pathflows) {
				this.pathflows = pathflows;
			}

			public String getPathpartners() {
				return pathpartners;
			}

			public void setPathpartners(String pathpartners) {
				this.pathpartners = pathpartners;
			}

			public String getSystem() {
				return system;
			}

			public void setSystem(String system) {
				this.system = system;
			}

			public String getPathcontentrefs() {
				return pathcontentrefs;
			}

			public void setPathcontentrefs(String pathcontentrefs) {
				this.pathcontentrefs = pathcontentrefs;
			}

			public String getPathcounters() {
				return pathcounters;
			}

			public void setPathcounters(String pathcounters) {
				this.pathcounters = pathcounters;
			}

			public String getResponsible() {
				return responsible;
			}

			public void setResponsible(String responsible) {
				this.responsible = responsible;
			}

			public String getPathmfls() {
				return pathmfls;
			}

			public void setPathmfls(String pathmfls) {
				this.pathmfls = pathmfls;
			}

			public String getPathcodefiles() {
				return pathcodefiles;
			}

			public void setPathcodefiles(String pathcodefiles) {
				this.pathcodefiles = pathcodefiles;
			}

			public String getSystempathmapping() {
				return systempathmapping;
			}

			public void setSystempathmapping(String systempathmapping) {
				this.systempathmapping = systempathmapping;
			}

			public String getSystempathflows() {
				return systempathflows;
			}

			public void setSystempathflows(String systempathflows) {
				this.systempathflows = systempathflows;
			}

			public String getSystempathpartners() {
				return systempathpartners;
			}

			public void setSystempathpartners(String systempathpartners) {
				this.systempathpartners = systempathpartners;
			}

			public String getSystempathcontentrefs() {
				return systempathcontentrefs;
			}

			public void setSystempathcontentrefs(String systempathcontentrefs) {
				this.systempathcontentrefs = systempathcontentrefs;
			}

			public String getSystempathcounters() {
				return systempathcounters;
			}

			public void setSystempathcounters(String systempathcounters) {
				this.systempathcounters = systempathcounters;
			}

			public String getSystemresponsible() {
				return systemresponsible;
			}

			public void setSystemresponsible(String systemresponsible) {
				this.systemresponsible = systemresponsible;
			}

			public String getSystempathmfls() {
				return systempathmfls;
			}

			public void setSystempathmfls(String systempathmfls) {
				this.systempathmfls = systempathmfls;
			}

			public String getSystempathcodefiles() {
				return systempathcodefiles;
			}

			public void setSystempathcodefiles(String systempathcodefiles) {
				this.systempathcodefiles = systempathcodefiles;
			}

			public String getSystemsolution() {
				return systemsolution;
			}

			public void setSystemsolution(String systemsolution) {
				this.systemsolution = systemsolution;
			}

		    public String getObjektByName(String dataobject) {
		    	switch (dataobject.toLowerCase()) {
		    	
		    	case "name":  return this.name;
		    	
		    	case "pathmfls": return this.pathmfls;
		    	
	            case "pathflows":  return this.pathflows;
	                    
	            case "pathmapping":  return this.pathmapping;
	            
	            case "pathpartners":  return this.pathpartners;
	            
	            case "pathcounters":  return this.pathcounters;
	          
	            default: return "";
	                    
	        }
		    }
		    	
		    	  public String getSolutionObjektByName(String dataobject) {
				    	switch (dataobject.toLowerCase()) {
				    	
				    	case "name":  return this.systemsolution;
				    	
			            case "pathflows":  return this.systempathflows;
			                    
			            case "pathmapping":  return this.systempathmapping;
			            
			            case "pathpartners":  return this.systempathpartners;
			            
			            case "pathcounters":  return this.systempathcounters;
			            
			            case "pathmfls": return this.systempathmfls;
			          
			            default: return "";
			                    
			        }	
		    	
		    }
		    
}
