package sdl.edi.wf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sdl.edi.wf.model.data.EdisolutionsRepository;
import sdl.edi.wf.model.data.Flowcontentreftemplates;
import sdl.edi.wf.model.data.FlowcontentreftemplatesRepository;
import sdl.edi.wf.model.data.FlowpartnertemplateRepository;
import sdl.edi.wf.model.data.FlowtemplatesRepository;
import sdl.edi.wf.model.data.RuletemplatesRepository;
import sdl.edi.wf.model.data.Standardpropositions;
import sdl.edi.wf.model.data.StandardpropositionsRepository;
import sdl.edi.wf.model.data.TemplatefieldpropositionRepository;
import sdl.edi.wf.model.data.TemplatefieldsRepository;

@Component
public class BuilderDTO {
	
    @Autowired
    private EdisolutionsRepository solutions;
    
    @Autowired
    private FlowtemplatesRepository flowtemplate;
    @Autowired
    private RuletemplatesRepository ruletemplates;
    
    @Autowired
    private TemplatefieldsRepository templatefields;
    
    @Autowired
    private TemplatefieldpropositionRepository fieldpropositons;
    
    @Autowired
    private StandardpropositionsRepository standardPropositions;
    
    @Autowired
    private FlowpartnertemplateRepository flowpartnertemprepo;
    
    @Autowired
    private FlowcontentreftemplatesRepository flowcontentreftemplatesrepo;

	public StandardpropositionsRepository getStandardPropositions() {
		return standardPropositions;
	}

	public void setStandardPropositions(StandardpropositionsRepository standardPropositions) {
		this.standardPropositions = standardPropositions;
	}

	public EdisolutionsRepository getSolutions() {
		return solutions;
	}

	public void setSolutions(EdisolutionsRepository solutions) {
		this.solutions = solutions;
	}

	public FlowtemplatesRepository getFlowtemplate() {
		return flowtemplate;
	}

	public void setFlowtemplate(FlowtemplatesRepository flowtemplate) {
		this.flowtemplate = flowtemplate;
	}

	public RuletemplatesRepository getRuletemplates() {
		return ruletemplates;
	}

	public void setRuletemplates(RuletemplatesRepository ruletemplates) {
		this.ruletemplates = ruletemplates;
	}

	public TemplatefieldsRepository getTemplatefields() {
		return templatefields;
	}

	public void setTemplatefields(TemplatefieldsRepository templatefields) {
		this.templatefields = templatefields;
	}

	public TemplatefieldpropositionRepository getFieldpropositons() {
		return fieldpropositons;
	}

	public void setFieldpropositons(TemplatefieldpropositionRepository fieldpropositons) {
		this.fieldpropositons = fieldpropositons;
	}

	public FlowpartnertemplateRepository getFlowpartnertemprepo() {
		return flowpartnertemprepo;
	}

	public void setFlowpartnertemprepo(FlowpartnertemplateRepository flowpartnertemprepo) {
		this.flowpartnertemprepo = flowpartnertemprepo;
	}

	public FlowcontentreftemplatesRepository getFlowcontentreftemplatesrepo() {
		return flowcontentreftemplatesrepo;
	}

	public void setFlowcontentreftemplatesrepo(FlowcontentreftemplatesRepository flowcontentreftemplatesrepo) {
		this.flowcontentreftemplatesrepo = flowcontentreftemplatesrepo;
	}
    
    

}
