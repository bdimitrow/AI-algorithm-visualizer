package com.sofia.uni.ai.aialgorithmvisualizer.logic.traversals;

import com.sofia.uni.ai.aialgorithmvisualizer.logic.AbstractGraph;
import com.sofia.uni.ai.aialgorithmvisualizer.logic.State;
import javafx.util.Pair;

import java.util.List;

public class BFS extends AbstractGraph {
    public BFS(List<Integer> nodes, List<Pair<Integer, Integer>> edges) {
        super(nodes, edges);
    }

    @Override
    public State getNextState() {
        return null;
    }
}
