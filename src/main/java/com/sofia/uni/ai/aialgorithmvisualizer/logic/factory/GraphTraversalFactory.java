package com.sofia.uni.ai.aialgorithmvisualizer.logic.factory;

import com.sofia.uni.ai.aialgorithmvisualizer.logic.Traversal;
import com.sofia.uni.ai.aialgorithmvisualizer.logic.traversals.BFS;
import javafx.util.Pair;

import java.util.List;

public class GraphTraversalFactory {
    public static Traversal constructGraph(List<Integer> nodes, List<Pair<Integer, Integer>> edges, Algorithm algorithm) {
        if (algorithm == Algorithm.BFS) {
            return new BFS(nodes, edges);
        }

        return null;
    }
}
