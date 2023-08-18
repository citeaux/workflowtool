package sdl.edi.wf.model.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface MyworkFlowcontentrefsfieldsRepository extends CrudRepository<MyworkFlowcontentrefsfields, Long> {
	List<MyworkFlowcontentrefsfields> findByFieldname(String fieldname);
}
