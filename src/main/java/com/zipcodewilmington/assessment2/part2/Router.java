package com.zipcodewilmington.assessment2.part2;

import java.util.TreeMap;

public class Router {
    TreeMap<String, String> treeMap;

    public Router() {
        treeMap = new TreeMap<>();
    }

    public void add(String path, String controller) {
        treeMap.put(path, controller);
    }

    public Integer size() {
        return treeMap.size();
    }

    public String getController(String path) {
        return treeMap.get(path);
    }

    public void update(String path, String studentController) {
        treeMap.replace(path, studentController);
    }

    public void remove(String path) {
        treeMap.remove(path);
    }

    @Override
    public String toString() {
        StringBuilder toStringBuilder = new StringBuilder();
        for (String s : treeMap.keySet()) {
            toStringBuilder.append(s).append(" -> ").append(treeMap.get(s)).append('\n');
        }
        return toStringBuilder.toString();
    }
}
