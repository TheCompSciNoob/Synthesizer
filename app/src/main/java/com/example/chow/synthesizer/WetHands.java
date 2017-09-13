package com.example.chow.synthesizer;

import java.util.ArrayList;

/**
 * Created by per6 on 9/11/17.
 */

public class WetHands extends Song {

    public WetHands()
    {
        super(4, 4, 74, 8);
        super.setVolume(75, 100);
    }

    @Override
    public void setMelody() {
        melody = new ArrayList<Note>();
    }

    @Override
    public void setAccompaniment() {
        accompaniment = new ArrayList<Note>();
        accompaniment.add(new Note(1, 1, R.raw.note25));
        accompaniment.add(new Note(1, 2, R.raw.note32));
        accompaniment.add(new Note(1, 3, R.raw.note37));
        accompaniment.add(new Note(1, 4, R.raw.note39));
        accompaniment.add(new Note(1, 5, R.raw.note41));
        accompaniment.add(new Note(1, 6, R.raw.note39));
        accompaniment.add(new Note(1, 7, R.raw.note37));
        accompaniment.add(new Note(1, 8, R.raw.note32));
    }
}
