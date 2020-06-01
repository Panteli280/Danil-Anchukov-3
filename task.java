package com.company;
import java.util.Comparator;
import java.util.TreeSet;

public class task {
    static int time;
    static int pages;
    int Priority;
    int randomX;


    public task(int time, int pages, int Priority, int randomX) {
        this.time = time;
        this.pages = pages;
        this.Priority = Priority;
        this.randomX = randomX;
    }

    public static int returner(task t) {
        int i = time*pages;
        return i;
    }

    public static void count(PriorityQueue<task> space) throws Exception {
        int counter = 0;
        for (int i = 0; i < space.getSize(); i++){
            task t = space.check();
            int count = task.returner(t);
            counter = counter + count;
            System.out.println(counter);
            space.remove();
        }
        task t = space.check();
        int count = task.returner(t);
        counter = counter + count;
        System.out.println(counter);
    }
}

class PriceComparator implements Comparator<task> {

    public int compare(task h1, task h2) {
        if (h1.Priority == h2.Priority) {
            if (h1.time == h2.time) {
                if (h1.randomX == h2.randomX) {
                    return 0;
                }
                if (h1.randomX > h2.randomX) {
                    return 1;
                } else {
                    return -1;
                }
            }
            if (h1.time > h2.time) {
                return -1;
            } else {
                return 1;
            }
        }
        if (h1.Priority > h2.Priority) {
            return 1;
        } else {
            return -1;
        }
    }
}




