package sdl.edi.wf.model.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TemplatefieldpropositionRepository extends CrudRepository<Templatefieldproposition, Long> {
	List<Templatefieldproposition> findByTemplatefieldid(long templatefieldid);
}
