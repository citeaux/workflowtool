/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.wf;

import com.google.common.graph.EndpointPair;
import com.google.common.graph.MutableGraph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Orientation;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import net.rgielen.fxweaver.core.FxWeaver;
import sdl.edi.flowparser.wftorso;
import sdl.edi.flowparser.wfvertex;
import sdl.edi.wfgraphlib.cells.RectangleCell;
import sdl.edi.wfgraphlib.cells.TriangleCell;
import sdl.edi.wfgraphlib.edges.CorneredEdge;
import sdl.edi.wfgraphlib.edges.DoubleCorneredEdge;
import sdl.edi.wfgraphlib.edges.Edge;
import sdl.edi.wfgraphlib.graph.Graph;
import sdl.edi.wfgraphlib.graph.ICell;
import sdl.edi.wfgraphlib.graph.Model;
import sdl.edi.wfgraphlib.layout.AbegoTreeLayout;

import org.abego.treelayout.Configuration;

/**
 *
 * @author russsebal
 */
public class VisualWfGraph {
       private List<wftorso> wtl;
       private List<RectangleCell> recCell;
       
       private List<Edge> alledges;
       private List<String> alledgetexts;
       private final FxWeaver fxWeaver;
       
    private  MutableGraph<wftorso> graphguava;

    public VisualWfGraph(FxWeaver fxWeaver) {
    	this.fxWeaver = fxWeaver;
        recCell= new ArrayList<RectangleCell>();
        alledges= new ArrayList<>();
           alledgetexts= new ArrayList<>();
    }
    
    
 
    
    public void addwfComponents(Graph graph, MutableGraph<wftorso> graphguava,List<wftorso> wtl ) {
                        this.graphguava = graphguava;
                         this.wtl=wtl;
                
                   List<wfvertex> vobj= new ArrayList<>();      
                         
                   List<ICell> icell = new ArrayList<>();
                   
        
		final Model model = graph.getModel();
		graph.beginUpdate();
                
                
                for(Iterator<wftorso> wfit = wtl.iterator(); wfit.hasNext(); ){
                    wftorso  ffg =  new wftorso();
                    ffg = wfit.next();
                    
                    String test;
                    
                    test = ffg.getWfrulename();
                                        System.out.println(">>> wfnamen");
                    System.out.println(test);
                    
                    RectangleCell hh = new RectangleCell(fxWeaver);
                    try {
                        hh.setWfname(test);
                        hh.setWft(ffg);
                    } catch (Exception e) {
                        System.out.println(">>> wfname expection");
                        e.printStackTrace();
                    }
                    this.recCell.add(hh);
                    final ICell cellA = hh;
                    icell.add(cellA);
                }

		
                for (Iterator<ICell> wficell= icell.iterator(); wficell.hasNext();){
                    model.addCell(wficell.next());
                }
                
		System.out.println("Build finished");
                
                System.out.println(model.getAddedCells().size());
		
                
                
                 for(Iterator<EndpointPair<wftorso>> iter=graphguava.edges().iterator();iter.hasNext();){
                  EndpointPair<wftorso> jj=iter.next();
                  RectangleCell hlk = new RectangleCell(fxWeaver);
                  List<ICell> icellconnecta = new ArrayList<>();
                  List<ICell> icellconnectb = new ArrayList<>();
                    for(Iterator<ICell> imer = model.getAddedCells().iterator(); imer.hasNext();){
                            hlk= (RectangleCell)imer.next();

                            if(hlk.getWfname()==jj.nodeU().getWfrulename()){
                                
                                icellconnecta.add(hlk);
                            }
                             if(hlk.getWfname()==jj.nodeV().getWfrulename()){
                                icellconnectb.add(hlk);
                            }
                        }
                    for(Iterator<ICell> icl = icellconnecta.iterator(); icl.hasNext();){
                            for(Iterator<ICell> icla = icellconnectb.iterator(); icla.hasNext();){
                                ICell jjl= icla.next();
                                RectangleCell klk = (RectangleCell) jjl;
                                
                                 Edge edgeAB = new Edge(icl.next(),jjl);
                                
                                String hh  =  new String();
                                hh = klk.getWft().getProp();
                                edgeAB.textProperty().set(hh );
                                edgeAB.setSaveStringProperty(hh);
                                
                            
                                alledges.add(edgeAB);
                                
                                alledgetexts.add(hh);
                                model.addEdge(edgeAB);
                                
                                
                       }
                    }
                    
                    
                 }
                
               
                	 
                	 
                 
					    for (Iterator<Edge> edfges = alledges.iterator(); edfges.hasNext();) {
					   	 Edge kkl = edfges.next();
					   	 RectangleCell klk = (RectangleCell) kkl.getSource();
					   	 klk.AddEdge(kkl);
					   	 klk = (RectangleCell) kkl.getTarget();
					   	 klk.AddEdge(kkl);
					    }
                 
	       /*

		final Edge edgeAB = new Edge(cellA, cellB);
		edgeAB.textProperty().set("Edges can have text too!");
		model.addEdge(edgeAB);
		final CorneredEdge edgeAC = new CorneredEdge(cellA, cellC, Orientation.HORIZONTAL);
		edgeAC.textProperty().set("Edges can have corners too!");
		model.addEdge(edgeAC);
		model.addEdge(cellB, cellD);
		final DoubleCorneredEdge edgeBE = new DoubleCorneredEdge(cellB, cellE, Orientation.HORIZONTAL);
		edgeBE.textProperty().set("You can implement custom edges and nodes too!");
		model.addEdge(edgeBE);
		model.addEdge(cellC, cellF);
		model.addEdge(cellC, cellG);
                */
                Graphlistener gl = new Graphlistener();
               
               
		graph.endUpdate();
		graph.layout(new AbegoTreeLayout(200, 200, Configuration.Location.Top));
                
	}

    
    public void showEdgtexts(){
                     for (Iterator<Edge>rcell= alledges.iterator();rcell.hasNext(); ){
              Edge mm= rcell.next();
              mm.textProperty().set(mm.getSaveStringProperty());
          }
    } 
    
    public void hideEdgtexts(){
         for (Iterator<Edge>rcell= alledges.iterator();rcell.hasNext(); ){
              Edge mm= rcell.next();
              mm.textProperty().set("");
          }
        
         
    }
    
    
     public void hideProcessingSteps(){
    
        
         
                       for (Iterator<RectangleCell>rcell= recCell.iterator();rcell.hasNext(); ){
              RectangleCell mm= rcell.next();
              if(mm.getWft().getWfdestination().contains("ProcessorQueue")){
                  mm.hide();
              }
              
              
          }
         
    }
    
     
     public void showProcessingSteps(){
    
        
         
                       for (Iterator<RectangleCell>rcell= recCell.iterator();rcell.hasNext(); ){
              RectangleCell mm= rcell.next();
              if(mm.getWft().getWfdestination().contains("ProcessorQueue")){
                  mm.unhide();
              }
              
              
          }
         
    } 
     
     
     
     
         public void hideIgnoreSteps(){
    
        
         
                       for (Iterator<RectangleCell>rcell= recCell.iterator();rcell.hasNext(); ){
              RectangleCell mm= rcell.next();
              if(mm.getWft().getWfdestination().contains("IGNORE")){
                  mm.hide();
              }
              
              
          }
         
    }
         
         
    public void markConnectionsFromVertex(ICell icell, Paint paint ){
//                   for(Iterator<Edge> edges = edges.iterator(); edges.hasNext();){
//                            for(Iterator<ICell> icla = icellconnectb.iterator(); icla.hasNext();){
//                                ICell jjl= icla.next();
//                                RectangleCell klk = (RectangleCell) jjl;
//                                
//                                final Edge edgeAB = new Edge(icl.next(),jjl);
//                                
//                                String hh  =  new String();
//                                hh = klk.getWft().getProp();
//                                edgeAB.textProperty().set(hh );
//                                edgeAB.setSaveStringProperty(hh);
//                                
//                                System.out.println("EdgeCreaed");
//                                alledges.add(edgeAB);
//                                alledgetexts.add(hh);
//                                model.addEdge(edgeAB);
//                                
//                       }
//                    }
    }     
    
     
     public void showIgnoreSteps(){
    
        
         
                       for (Iterator<RectangleCell>rcell= recCell.iterator();rcell.hasNext(); ){
              RectangleCell mm= rcell.next();
              if(mm.getWft().getWfdestination().contains("IGNORE")){
                  mm.unhide();
              }
              
              
          }
         
    } 
     
    
    public List<RectangleCell> getRecCell() {
        return recCell;
    }

    public void setRecCell(List<RectangleCell> recCell) {
        this.recCell = recCell;
    }
    
    
    public void unmarkall(){
          for (Iterator<RectangleCell>rcell= recCell.iterator();rcell.hasNext(); ){
              RectangleCell mm= rcell.next();
              mm.unmark();
          }
    }
    
    
    public String getStringBefore(String codephrase,String searchphrase ){
         
         char[] beforec = new char[100];
         int k =  codephrase.indexOf(searchphrase);
                int  p =  k-100;
        if(p<0){
            p = 0;
           }
        codephrase.getChars(p, k-1, beforec, 1);
        return String.copyValueOf(beforec);
        
    }
    
        public String getStringAfter(String codephrase,String searchphrase ){
         
         char[] beforec = new char[100];
         int k =  codephrase.indexOf(searchphrase);
                int  p =  k+100;
        if(p> codephrase.length()){
            p = codephrase.length();
           }
        codephrase.getChars( k+searchphrase.length(),p, beforec, 1);
        return String.copyValueOf(beforec);
        
    }
    
    
    public List<SearchResult>searchForTextInFlowSteps(String searchphrase){
            System.out.println("serach function" + searchphrase);
            String hh;
            List<SearchResult> list= new ArrayList<>();
            
            for (Iterator<RectangleCell>rcell= recCell.iterator();rcell.hasNext(); ){
                   RectangleCell mm= rcell.next();
                  if(mm.getWft().getWfsoucecode().contains(searchphrase)){
                      
                      Map<String,String>mapl=new HashMap<String, String>();
                      mapl.put("Flowname", mm.getWfname());
                      SearchResult sr= new SearchResult(mapl);
                      sr.setPrestring(getStringBefore(mm.getWft().getWfsoucecode(),searchphrase));
                      sr.setPoststring(getStringAfter(mm.getWft().getWfsoucecode(), searchphrase));
                      System.out.println("serach function kk:" + sr.getResultlocation());
                      sr.setCell(mm);
                      list.add(sr);
                         
                  }
                
            }
            
            return list;
    }
    
    
    
}
