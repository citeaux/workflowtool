/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.templateparser;

/**
 *
 * @author sebastian russ
 */
public class wfproperties {
    public String name;
     public String operation;
     public String parameter;
     public String tempname;
     public String tempoperation;
     public String tempparameter;

    public String getName() {
        return name;
    }

    public wfproperties(String name, String operation, String parameter) {
        this.name = name;
        this.operation = operation;
        this.parameter = parameter;
        this.tempname = name;
        this.tempoperation = operation;
        this.tempparameter = parameter;
        
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

	public String getTempname() {
		return tempname;
	}

	public void setTempname(String tempname) {
		this.tempname = tempname;
	}

	public String getTempoperation() {
		return tempoperation;
	}

	public void setTempoperation(String tempoperation) {
		this.tempoperation = tempoperation;
	}

	public String getTempparameter() {
		return tempparameter;
	}

	public void setTempparameter(String tempparameter) {
		this.tempparameter = tempparameter;
	}
     
     
     
    
}
