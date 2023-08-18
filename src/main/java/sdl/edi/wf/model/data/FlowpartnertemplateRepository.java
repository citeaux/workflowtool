package sdl.edi.wf.model.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface FlowpartnertemplateRepository extends CrudRepository<Flowpartnertemplate, Long>{
	List<Flowpartnertemplate> findByType(String type);
	List<Flowpartnertemplate> findByName(String name);
}
