package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="MYWORKFLOWMAPPINGTEMPLATES")
public class MyworkFlowmappingtemplates {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private long flowtemplateid;
    
    private String name;
    
    private String description;
    
    private String mappingtemplate;
}
