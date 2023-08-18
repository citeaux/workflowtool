package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MYWORKTEMPLATEFIELDS")
public class MyworkTemplatefields {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    private long flowtemplateid;
    
    private String fieldname;
    
    private String description;
    
    

}
