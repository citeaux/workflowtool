package sdl.edi.wf.model.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EdisolutionsRepository extends CrudRepository<Edisolutions, Long>{
	  List<Edisolutions> findBySystemsolution(String systemsolution);
	  List<Edisolutions> findBySystem(String system);
	  List<Edisolutions> findBySystemAndSystemsolution(String system, String systemsolution);
}
