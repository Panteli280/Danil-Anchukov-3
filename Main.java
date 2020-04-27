package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws Exception {

        ArrayList<task> myList = new ArrayList<>();

        task firstTask = new task(2, 12,1, 2);
        task secondTask = new task(4, 7, 1 ,5);
        task thirdTask = new task(7, 18, 3, 7);

        myList.add(firstTask);
        myList.add(secondTask);
        myList.add(thirdTask);

        PriceComparator myComparator = new PriceComparator();
        myList.sort(myComparator);

        Workspace<task> list = new Workspace<>();
        list.addList(myList);
        task.count(list);
    }
}