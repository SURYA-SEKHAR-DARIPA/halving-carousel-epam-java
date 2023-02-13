package com.epam.rd.autotasks;

public class HalvingCarousel extends DecrementingCarousel {

    public HalvingCarousel(final int capacity) {
        super(capacity);
    }
    public CarouselRun run(){
        if (getFlagRun() == 1) {
            return null;
        }
        setFlagRun((byte) 1);
        return new CarouselRun(getContainer(), getI(), 1);
    }

}
