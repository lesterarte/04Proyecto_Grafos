/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_grafos_conjuntos_listas;

import java.io.Serializable;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author oscarito
 */
public class Grafo extends SingleGraph implements Serializable {
    private TDA_Set allMembers = new TDA_Set();
    public Grafo(String id) {
        super(id);
    }
    
        public void addNode(Member newMember) {
        allMembers.put(newMember.getName(), newMember);
        this.addNode(newMember.getName());
    }

    public void setAllMembers(TDA_Set allMembers) {
        this.allMembers = allMembers;
    }
    
}
