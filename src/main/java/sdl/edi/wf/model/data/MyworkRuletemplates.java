package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MYWORKRULETEMPLATES")
public class MyworkRuletemplates {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private String name;
    
    private long flowid;
    
    private String ruleextension;
    
    private String rulexml;
    
    private long beforeruleid;
    
    private long afterruleid;
    
    private long mappingtemplateid;
    
    private long partnertemplateid;

}
