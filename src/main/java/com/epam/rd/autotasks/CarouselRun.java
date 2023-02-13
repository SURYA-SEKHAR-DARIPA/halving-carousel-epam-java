
package com.epam.rd.autotasks;
import java.util.*;

public class CarouselRun {

    private final int[] container;
    private int i;
    private int sum = 0;
    private final int flagHalving;

    public CarouselRun (int[] container, int counter) {
        this.container = Arrays.copyOf(container, container.length);
        i = counter;
        flagHalving = 0;
        for (int elem : container ) {
            sum += elem;
        }
    }
    public CarouselRun (int[] container, int counter, int flag) {
        this.container = Arrays.copyOf(container, container.length);
        i = counter;
        flagHalving = flag;
        for (int elem : container ) {
            sum += elem;
        }
    }
    public int next() {

       int tempElem;
        if (isFinished()) { 
            return -1;
        }
        if (i == container.length) {
            i = 0;
        }
        while (container[i] == 0) {
            i++;
            if (i == container.length) {
                i = 0;
            }
        }
        if (flagHalving == 0) {
            sum--;
            return container[i++]--;
        } else {
            tempElem = container[i];
            container[i] /= 2;
            sum = sum - container[i] - tempElem % 2;
            i++;
            return tempElem;
        }
    }
    

    public boolean isFinished() {
        return sum == 0;
    }

}
