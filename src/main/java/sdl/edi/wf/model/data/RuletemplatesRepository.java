package sdl.edi.wf.model.data;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RuletemplatesRepository extends CrudRepository<Ruletemplates, Long>  {
  
	List<Ruletemplates> findByName(String name);
	
	List<Ruletemplates> findByFlowid(long flowid);
	
	
	
	
}
