/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.cnr.istc.pst.graph;

import it.cnr.istc.pst.graph.linkedg.LVertex;
import it.cnr.istc.pst.graph.linkedg.LinkedGraph;
import java.util.Random;

/**
 *
 * @author Luca Coraci <luca.coraci@istc.cnr.it> ISTC-CNR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("GRAFONE");
        
        LVertex<Integer> v1 = new LVertex<>(1);
        LVertex<Integer> v2 = new LVertex<>(2);
        LVertex<Integer> v3 = new LVertex<>(3);
        LVertex<Integer> v4 = new LVertex<>(4);
        LVertex<Integer> v5 = new LVertex<>(5);
        LVertex<Integer> v6 = new LVertex<>(6);
        LVertex<Integer> v7 = new LVertex<>(7);
        
        
        LinkedGraph<Integer> graph = new LinkedGraph<>();
        LinkedGraph<Integer> graph2 = new LinkedGraph<>();
        
        graph.addNode(v1);
        graph.addNode(v2);
        graph.addNode(v3);
        graph.addNode(v4);
        graph.addNode(v5);
        graph.addNode(v6);
        graph.addNode(v7);
        
        graph.linkNode(v1, v7);
        graph.linkNode(v1, v2);
        graph.linkNode(v2, v3);
        graph.linkNode(v2, v5);
        graph.linkNode(v3, v4);
        graph.linkNode(v3, v6);
        graph.linkNode(v4, v1);
        graph.linkNode(v4, v2);
        graph.linkNode(v4, v6);
        graph.linkNode(v5, v3);
        graph.linkNode(v6, v7);
        
        //----------------
        
        LVertex<Integer> vv0 = new LVertex<>(0);
        LVertex<Integer> vv1 = new LVertex<>(1);
        LVertex<Integer> vv2 = new LVertex<>(2);
        LVertex<Integer> vv3 = new LVertex<>(3);
        
        graph2.addNode(vv0);
        graph2.addNode(vv1);
        graph2.addNode(vv2);
        graph2.addNode(vv3);
        
        graph2.linkNode(vv0, vv1);
        graph2.linkNode(vv0, vv2);
        graph2.linkNode(vv1, vv2);
        graph2.linkNode(vv2, vv0);
        graph2.linkNode(vv2, vv3);
        graph2.linkNode(vv3, vv3);
        
        
        graph.visit();
        
        graph.clearVisits();
        
        System.out.println("===================");
        
        graph.bfs(v1);
        
        System.out.println("=====================");
        
        graph2.bfs(vv2);
        
        
        
        
        
//
//        Math.random();
////        Random r = new Random(90);
////        r.nextInt();
//        String sette = "A00000000095D7";
//        String otto = "500000000095E8";
//        String nove = "A00000000095F9";
//
//        System.out.println("7 = " + sette.hashCode() % 10);
//        System.out.println("7 = " + sette.hashCode() % 10);
//        System.out.println("8 = " + otto.hashCode() % 10);
//        System.out.println("9 = " + nove.hashCode() % 10);
//
//        System.out.println("================");
//
//        for (int i = 0; i < 40; i++) {
//            Random r = new Random(i*1000);
//            int primo = r.nextInt(10);
//            int secondo = r.nextInt(10);
//            System.out.println("NUMERO: "+i+" --- PRIMO = "+primo+", SECONDO = "+secondo);
//
//        }
    }

}
