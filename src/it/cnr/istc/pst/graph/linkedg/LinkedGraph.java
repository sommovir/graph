/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.pst.graph.linkedg;

import it.cnr.istc.pst.graph.abstracts.Graph;
import it.cnr.istc.pst.graph.abstracts.Vertex;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it> ISTC-CNR
 */
public class LinkedGraph<T> extends Graph<LVertex<T>> {

    private List<LVertex<T>> nodes = new LinkedList<>();

    @Override
    public List<LVertex<T>> getNodes() {
        return this.nodes;
    }

    public void linkNode(LVertex<T> node, LVertex<T> nodeToAdd) {
        if (nodes.contains(node)) {
            node.addAdjacentVertex(nodeToAdd);
        } else {
            System.err.println("errore");
        }
    }

    public void addNode(LVertex<T> node) {
        this.nodes.add(node);
    }

    private void printNode(LVertex<T> node) {
        if (!node.isVisited()) {
            System.out.println("element: " + node.getElement());
            node.setVisited(true);
            for (LVertex<T> n : node.getAdjacents()) {

                printNode(n);
            }
        }
    }

    public void visit() {
        for (LVertex<T> node : nodes) {
            printNode(node);
        }

    }

    @Override
    public void bfs(LVertex<T> node) {

        Queue<LVertex> queue = new LinkedBlockingQueue<>();
        queue.offer(node);

        while (!queue.isEmpty()) {
            LVertex<T> head = queue.remove();
            System.out.println("[BFS] element = " + head.getElement());

            head.setVisited(true);
            for (LVertex<T> a : head.getAdjacents()) {
                if (!a.isVisited() && !a.isMarked()) {
                    queue.offer(a);
                    a.setMarked(true);
                }
            }
        }
    }

    /**
     * supposing clearVisit is already called
     *
     * @param node
     */
    @Override
    public void dfs(LVertex<T> node) {
        System.out.println("Element = " + node.getElement());
        node.setVisited(true);
        for (LVertex<T> adjacent : node.getAdjacents()) {
            if(!adjacent.isVisited()){
                dfs(adjacent);
            }
        }

    }

}
