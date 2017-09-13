package com.example.chow.synthesizer;

/**
 * Created by per6 on 9/11/17.
 */

public class Note {
    private int interval, beat, resourceID;

    public Note(int interval, int beat, int resourceID) {
        this.interval = interval;
        this.beat = beat;
        this.resourceID = resourceID;
    }

    public int getInterval() {
        return interval;
    }

    public int getBeat() {
        return beat;
    }

    public int getResourceID()
    {
        return resourceID;
    }
}
