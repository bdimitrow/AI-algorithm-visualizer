package com.sofia.uni.ai.aialgorithmvisualizer.logic;

import javafx.util.Pair;

import java.util.*;

public abstract class AbstractGraph implements Traversal {
    LinkedList<Map<Integer, LinkedList<Integer>>> graph;

    public AbstractGraph(List<Integer> nodes, List<Pair<Integer, Integer>> edges) {
        this.graph = new LinkedList<>();
        for (int node : nodes) {
            Map<Integer, LinkedList<Integer>> map = new HashMap<>();
            map.put(node, new LinkedList<>());
            this.graph.add(map);
        }

        for (Pair<Integer, Integer> edge : edges) {
            int node1 = edge.getKey();
            int node2 = edge.getValue();
            for (Map<Integer, LinkedList<Integer>> map : this.graph) {
                if (map.containsKey(node1)) {
                    map.get(node1).add(node2);
                    break;
                }
            }
        }
    }

    void print() {

    }

}

