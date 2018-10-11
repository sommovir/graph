/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.pst.graph.abstracts;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it> ISTC-CNR
 * @param <E>
 */
public abstract class Graph<E extends Vertex<?>> {

    public abstract List<E> getNodes();

    public void clearVisits() {

        for (E node : this.getNodes()) {
            node.setVisited(false);
        }

    }

    public int size() {
        return this.getNodes().size();
    }

}
