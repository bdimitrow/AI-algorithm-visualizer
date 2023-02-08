package com.sofia.uni.ai.aialgorithmvisualizer.logic.traversals;

import com.sofia.uni.ai.aialgorithmvisualizer.logic.AbstractGraph;
import com.sofia.uni.ai.aialgorithmvisualizer.logic.State;
import javafx.util.Pair;

import java.util.List;

public class DFS extends AbstractGraph {
    public DFS(List<Integer> nodes, List<Pair<Integer, Integer>> edges) {
        super(nodes, edges);
    }

    public State getNextState() {
        return null;
    }
}
