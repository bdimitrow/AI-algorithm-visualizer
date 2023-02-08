package com.sofia.uni.ai.aialgorithmvisualizer.logic.traversals;

import com.sofia.uni.ai.aialgorithmvisualizer.logic.AbstractGraph;
import com.sofia.uni.ai.aialgorithmvisualizer.logic.NodeColor;
import com.sofia.uni.ai.aialgorithmvisualizer.logic.State;
import javafx.util.Pair;

import java.util.List;
import java.util.*;


public class BFS extends AbstractGraph {
    LinkedList<Map<Integer, LinkedList<Integer>>> graph;
    LinkedList<Map<State, Queue<Integer>>> linkedListStateQueue;

    public BFS(List<Integer> nodes, List<Pair<Integer, Integer>> edges) {
        super(nodes, edges);
        this.linkedListStateQueue = new LinkedList<>();
    }

    public void traverse(int start) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        for (Map<Integer, LinkedList<Integer>> map : graph) {
            int node = map.keySet().iterator().next();
            if (node == start) {
                queue.offer(node);
                visited.add(node);
                linkedListStateQueue.add(new HashMap<>() {{
                    put(new State(node, NodeColor.RED), queue);
                }});
            }
            while (!queue.isEmpty()) {
                int current = queue.peek();
                for (Map<Integer, LinkedList<Integer>> m : graph) {
                    if (m.containsKey(current)) {
                        LinkedList<Integer> neighbors = m.get(current);
                        for (int neighbor : neighbors) {
                            if (!visited.contains(neighbor)) {
                                queue.offer(neighbor);
                                visited.add(neighbor);
                                linkedListStateQueue.add(new HashMap<>() {{
                                    put(new State(neighbor, NodeColor.RED), queue);
                                }});
                            }
                        }
                    }
                }
                int removed = queue.poll();
                linkedListStateQueue.add(new HashMap<>() {{
                    put(new State(removed, NodeColor.GREEN), queue);
                }});
            }
        }
    }

    public LinkedList<Map<State, Queue<Integer>>> getLinkedListStateQueue() {
        return linkedListStateQueue;
    }

    public Map<State, Queue<Integer>> getNextState(int index) {
        return this.linkedListStateQueue.get(index);
    }

}
