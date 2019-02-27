package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        if (integerArrayList.get(0) == null) {
            return null;
        }

        Collections.sort(integerArrayList);

        Integer mostCommonInteger = integerArrayList.get(0);
        Integer mostCommonCount = 1;
        Integer currentCount = 1;

        for(int i = 1; i < integerArrayList.size(); i++) {
            if (integerArrayList.get(i).equals(integerArrayList.get(i - 1))) {
                currentCount++;
            } else {
                if (currentCount > mostCommonCount) {
                    mostCommonCount = currentCount;
                    mostCommonInteger = integerArrayList.get(i - 1);
                }
                currentCount = 1;
            }
        }

        if (currentCount > mostCommonCount) {
            mostCommonInteger = integerArrayList.get(integerArrayList.size() - 1);
        }

        return mostCommonInteger;
    }

    public Boolean contains(Integer valueToAdd) {
        return integerArrayList.contains(valueToAdd);
    }

}
