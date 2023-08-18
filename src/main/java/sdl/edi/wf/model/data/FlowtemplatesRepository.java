package sdl.edi.wf.model.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FlowtemplatesRepository extends CrudRepository<Flowtemplates, Long> {
	
	List<Flowtemplates> findByName(String name);
	List<Flowtemplates> findBySolutionId(Long solutionid);
	List<Flowtemplates> findBySolution(Edisolutions solution);

}
