
package com.epam.rd.autotasks;
import java.util.*;

public class DecrementingCarousel {

    private final int[] container;
    private byte flagRun = 0;
    private int i = 0;
    private final int capacity;

    public DecrementingCarousel(int capacity) {
        if (capacity <= 0 ) {
            throw new IllegalArgumentException();
        }
        this.capacity = capacity;
        container = new int[capacity];
    }
    public byte getFlagRun() {
        return flagRun;
    }

    public void setFlagRun(byte flagRun) {
        this.flagRun = flagRun;
    }

    public int[] getContainer() {
        return container;
    }

    public int getI() {
        return i;
    }


    public boolean addElement(int element){
    
        if (flagRun == 1) {         
            return false;
        }
        if (element <= 0) {        
            return false;
        }
        if (i >= capacity) {       
            return false;
        }
        container[i] = element;     
        i++;
        return true;
    }

    public CarouselRun run(){
      
       if (flagRun == 1) {
        return null;
    }
    flagRun = 1;
    return new CarouselRun(container, i);

    }
}
