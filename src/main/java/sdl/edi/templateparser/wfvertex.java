/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.templateparser;

/**
 *
 * @author Sebastian Russ
 */
public class wfvertex {
    private wftorso rule;
    private Object graphvt;

    public wfvertex(wftorso rule, Object graphvt) {
        this.rule = rule;
        this.graphvt = graphvt;
    }

    public wftorso getRule() {
        return rule;
    }

    public void setRule(wftorso rule) {
        this.rule = rule;
    }

    public Object getGraphvt() {
        return graphvt;
    }

    public void setGraphvt(Object graphvt) {
        this.graphvt = graphvt;
    }
    
    
    
}
