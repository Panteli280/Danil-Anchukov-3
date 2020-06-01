package com.company;

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





