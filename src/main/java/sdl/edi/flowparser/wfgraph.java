/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdl.edi.flowparser;

import com.google.common.graph.GraphBuilder;
import com.google.common.graph.MutableGraph;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Sebastian Russ
 */
public class wfgraph {
   private  MutableGraph<wftorso> graph;
   private List<wftorso> wtl;
   
    public wfgraph(List<wftorso> torso) {
        graph = GraphBuilder.directed().build();
        wtl= torso;
        buildGraph();
    }

    public MutableGraph<wftorso> getGraph() {
        return graph;
    }
   
   
   
    void buildGraph(){
        for(int i=0;i<=wtl.size()-1;i++){
            
            for(int k=0;k<=wtl.size()-1;k++){
                
                if(k!=i){
                    try {
                        System.out.println(wtl.get(i).getWfstage());
                        System.out.println(wtl.get(k).getWfstageexpectetd());
                        System.out.println("--------------");
                        if (wtl.get(i).getWfstage().contentEquals(wtl.get(k).getWfstageexpectetd())) {
                            graph.putEdge(wtl.get(i), wtl.get(k));
                            System.out.println("add" + wtl.get(i).wfrulename + "<---" + wtl.get(k).wfrulename);
                            
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }
         
        for(Iterator<wftorso> iter =graph.nodes().iterator();iter.hasNext();   ){
            System.out.println(iter.next().wfrulename);
            
        }
    }
    
}
