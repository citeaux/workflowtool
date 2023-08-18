package sdl.edi.wf.model.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MyworkFlowcontentrefsRepository extends CrudRepository<MyworkFlowcontentrefs, Long> {
	List<MyworkFlowcontentrefs> findByName(String name);
}
