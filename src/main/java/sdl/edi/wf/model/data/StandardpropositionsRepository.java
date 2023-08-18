package sdl.edi.wf.model.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StandardpropositionsRepository extends CrudRepository<Standardpropositions, Long> {
	
	List<Standardpropositions> findByRelatedprogrammobject(String relatedprogrammobject);


}
