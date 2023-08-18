package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RULETEMPLATES")
public class Ruletemplates {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String name;
    
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

	public long getFlowid() {
		return flowid;
	}

	public void setFlowid(long flowid) {
		this.flowid = flowid;
	}

	public String getRuleextension() {
		return ruleextension;
	}

	public void setRuleextension(String ruleextension) {
		this.ruleextension = ruleextension;
	}

	public String getRulexml() {
		return rulexml;
	}

	public void setRulexml(String rulexml) {
		this.rulexml = rulexml;
	}

	public long getBeforeruleid() {
		return beforeruleid;
	}

	public void setBeforeruleid(long beforeruleid) {
		this.beforeruleid = beforeruleid;
	}

	public long getAfterruleid() {
		return afterruleid;
	}

	public void setAfterruleid(long afterruleid) {
		this.afterruleid = afterruleid;
	}

	public long getMappingtemplateid() {
		return mappingtemplateid;
	}

	public void setMappingtemplateid(long mappingtemplateid) {
		this.mappingtemplateid = mappingtemplateid;
	}

	public long getPartnertemplateid() {
		return partnertemplateid;
	}

	public void setPartnertemplateid(long partnertemplateid) {
		this.partnertemplateid = partnertemplateid;
	}

	private long flowid;
    
    private String ruleextension;
    
    private String rulexml;
    
    private long beforeruleid;
    
    private long afterruleid;
    
    private long mappingtemplateid;
    
    private long partnertemplateid;

}
