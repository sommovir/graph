/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.pst.graph.linkedg;

import it.cnr.istc.pst.graph.abstracts.Vertex;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it> ISTC-CNR
 */
public class LVertex<T> extends Vertex<T> {
    
    private final List<LVertex<T>> adjacents = new ArrayList<>();  
    
    private boolean marked = false;

    public LVertex() {
    }
    
    public LVertex(T t) {
        super(t);
    }
    
    
    public void addAdjacentVertex(LVertex<T> vertex){
        this.adjacents.add(vertex);
    }

    public List<LVertex<T>> getAdjacents() {
        return adjacents;
    }

    public boolean isMarked() {
        return marked;
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }
    
    

    @Override
    public String toString() {
        return ""+this.getElement();
    }
    
    
    
    
    
    
    
}
