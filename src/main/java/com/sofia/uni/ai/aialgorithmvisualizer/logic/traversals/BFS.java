package com.sofia.uni.ai.aialgorithmvisualizer.logic.traversals;

import com.sofia.uni.ai.aialgorithmvisualizer.logic.AbstractGraph;
import com.sofia.uni.ai.aialgorithmvisualizer.logic.NodeColor;
import com.sofia.uni.ai.aialgorithmvisualizer.logic.State;
import javafx.util.Pair;

import java.util.List;
import java.util.*;


public class BFS extends AbstractGraph {
    LinkedList<Map<Integer, LinkedList<Integer>>> graph;
    Queue<State> states;

    public BFS(List<Integer> nodes, List<Pair<Integer, Integer>> edges) {
        super(nodes, edges);
    }

    public void traverse(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        for (Map<Integer, LinkedList<Integer>> map : graph) {
            int node = map.keySet().iterator().next();
            if (node == start) {
                states.add(new State(node, NodeColor.RED));
                queue.offer(node);
                visited.add(node);
            }
            while (!queue.isEmpty()) {
                int current = queue.peek();
                for (Map<Integer, LinkedList<Integer>> m : graph) {
                    if (m.containsKey(current)) {
                        LinkedList<Integer> neighbors = m.get(current);
                        for (int neighbor : neighbors) {
                            if (!visited.contains(neighbor)) {
                                states.offer(new State(neighbor, NodeColor.RED));
                                queue.offer(neighbor);
                                visited.add(neighbor);
                            }
                        }
                    }
                }
                int removed = queue.poll();
                states.offer(new State(removed, NodeColor.GREEN));
            }
        }
    }

    public State getNextState() {
        return this.states.poll();
    }

//    public static void main(String[] args) {
//        List<Integer> nodes = List.of(1,2,3,4,5,6,7,8,9,10);
//        List<Pair<Integer,Integer>> edges = List.of(
//                new Pair<>(1,2),
//                new Pair<>(1,3),
//                new Pair<>(1,4),
//                new Pair<>(2,5),
//                new Pair<>(2,6),
//                new Pair<>(3,7),
//                new Pair<>(3,8),
//                new Pair<>(4,9),
//                new Pair<>(5,10)
//        );
//        BFS bfsgraph = new BFS(nodes,edges);
//        bfsgraph.traverse();
//        State st = bfsgraph.getNextState();
//        System.out.print(st.toString());
//    }
}

