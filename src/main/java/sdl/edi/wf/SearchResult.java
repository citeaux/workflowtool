/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.wf;

import java.util.Map;

import sdl.edi.wfgraphlib.cells.RectangleCell;

/**
 *
 * @author russseba
 */
public class SearchResult {
     private String searchphrase;
     private Map<String,String> Resultlocation;
     private String prestring;
     private String poststring;
     private RectangleCell cell;

    public SearchResult(Map<String, String> Resultlocation) {
        this.Resultlocation = Resultlocation;
    }

    public String getSearchphrase() {
        return searchphrase;
    }

    public void setSearchphrase(String searchphrase) {
        this.searchphrase = searchphrase;
    }

    public Map<String, String> getResultlocation() {
        return Resultlocation;
    }

    public void setResultlocation(Map<String, String> Resultlocation) {
        this.Resultlocation = Resultlocation;
    }

    public String getPrestring() {
        return prestring;
    }

    public void setPrestring(String prestring) {
        this.prestring = prestring;
    }

    public String getPoststring() {
        return poststring;
    }

    public void setPoststring(String poststring) {
        this.poststring = poststring;
    }

    public RectangleCell getCell() {
        return cell;
    }

    public void setCell(RectangleCell cell) {
        this.cell = cell;
    }
     
     
     
}
