package com.company;

import java.util.Comparator;

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



