package sdl.edi.wf.model.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EDITORRULETEMPLATEFIELDSPROPOSITIONS")
public class Editorruletemplatefieldspropositions {
	
	
		    @Id
		    @GeneratedValue(strategy = GenerationType.AUTO)
		    private long id;
		    
		    private long editorruletemplatefieldid;
		    
		    private String proposition;

}
