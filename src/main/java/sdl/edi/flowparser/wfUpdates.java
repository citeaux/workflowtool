/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.flowparser;

/**
 *
 * @author russseba
 */
public class wfUpdates {
    String Property;
    String Parameter;
    Boolean isAnAction;
    
    String tempProperty;
    String tempParameter;
    Boolean tempisAnAction;

    public String getProperty() {
        return Property;
    }

    public void setProperty(String Property) {
        this.Property = Property;
    }

    public String getParameter() {
        return Parameter;
    }

    public void setParameter(String Parameter) {
        this.Parameter = Parameter;
    }

    public Boolean getIsAnAction() {
        return isAnAction;
    }

    public void setIsAnAction(Boolean isAnAction) {
        this.isAnAction = isAnAction;
    }

    public wfUpdates(String Property, String Parameter, Boolean isAnAction) {
        this.Property = Property;
        this.Parameter = Parameter;
        this.isAnAction = isAnAction;
        this.tempProperty = Property;
        this.tempParameter = Parameter;
        this.tempisAnAction = isAnAction;
    }
    
    public wfUpdates(){
        
    }

	public String getTempProperty() {
		return tempProperty;
	}

	public void setTempProperty(String tempProperty) {
		this.tempProperty = tempProperty;
	}

	public String getTempParameter() {
		return tempParameter;
	}

	public void setTempParameter(String tempParameter) {
		this.tempParameter = tempParameter;
	}

	public Boolean getTempisAnAction() {
		return tempisAnAction;
	}

	public void setTempisAnAction(Boolean tempisAnAction) {
		this.tempisAnAction = tempisAnAction;
	}
    
    
           
}
