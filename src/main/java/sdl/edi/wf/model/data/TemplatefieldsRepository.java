package sdl.edi.wf.model.data;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TemplatefieldsRepository extends CrudRepository<Templatefields, Long>  {
	         List<Templatefields> findByFlowtemplateid(long flowtemplateid);
}
