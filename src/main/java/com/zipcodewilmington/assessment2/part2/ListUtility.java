package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class ListUtility {
    ArrayList<Integer> integerArrayList;

    public ListUtility() {
        integerArrayList = new ArrayList<>();
    }

    public Boolean add(Integer i) {
        integerArrayList.add(i);
        return integerArrayList.contains(i);
    }

    public Integer size() {
        return integerArrayList.size();
    }

    public List<Integer> getUnique() {
        ArrayList<Integer> uniqueArrayList = new ArrayList<>();

        for (Integer i : integerArrayList) {
            if (!uniqueArrayList.contains(i)) {
                uniqueArrayList.add(i);
            }
        }

        return uniqueArrayList;
    }

    public String join() {
        StringBuilder joinedString = new StringBuilder();
        for (Integer i : integerArrayList) {
            joinedString.append(i).append(", ");
        }
        return joinedString.toString().replaceAll(", $", "");
    }


    public Integer mostCommon() {
        Map<Integer, Integer> hashMap = new HashMap<>();


        for (Integer i : integerArrayList) {
            if (hashMap.containsKey(i)) {
                int freq = hashMap.get(i) + 1;
                hashMap.put(i, freq);
            } else {
                hashMap.put(i, 1);
            }
        }

        Integer mostCommonCount = 0;
        Integer mostCommonInteger = null;

        for (Integer i : hashMap.keySet()) {
            if (mostCommonCount < hashMap.get(i)) {
                mostCommonInteger = i;
                mostCommonCount = hashMap.get(i);
            }
        }

        return mostCommonInteger;
    }

    public Boolean contains(Integer valueToAdd) {
        return integerArrayList.contains(valueToAdd);
    }

}
