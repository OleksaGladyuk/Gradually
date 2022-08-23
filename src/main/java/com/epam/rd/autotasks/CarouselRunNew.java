package com.epam.rd.autotasks;

public class CarouselRunNew extends CarouselRun {
    int decrement = 1;

    @Override
    public int next() {
        int bfDc;
        if (isFinished())
            return -1;
        else {
            bfDc = array[position];
            array[position] -= decrement;
            do {
                position++;
                if (position == array.length) {
                    decrement++;
                    position = 0;
                }
            } while ((array[position] <= 0) && !isFinished());
        }
        return bfDc;
    }
}
