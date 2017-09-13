package com.example.chow.synthesizer;

import android.media.MediaPlayer;

import java.util.ArrayList;

/**
 * Created by per6 on 9/11/17.
 */

public abstract class Song {
    //obtained from constructor
    private int topTimeSignature, bottomTimeSignature, tempo, beatsPerInterval;
    //calculated
    private long MILLIS_PER_BEAT;
    //constants
    public static final long MILLIS_PER_MIN = 60000;
    private final int MAX_VOLUME = 101; //from 0 to 100
    //variables
    private MediaPlayer player;
    protected ArrayList<Note> melody, accompaniment;
    private int interval = 1, beat = 1;
    private int melodyVolume, accompanimentVolume;

    public Song(int topTimeSignature, int bottomTimeSignature, int tempo, int beatsPerInterval)
    {
        this.bottomTimeSignature = bottomTimeSignature;
        this.topTimeSignature = topTimeSignature;
        this.tempo = tempo;
        this.beatsPerInterval = beatsPerInterval;
        MILLIS_PER_BEAT = MILLIS_PER_MIN / tempo * topTimeSignature / beatsPerInterval;
        melody = new ArrayList<Note>();
        accompaniment = new ArrayList<Note>();
        //notes
        setMelody();
        setAccompaniment();
    }

    public void setVolume(int newMelodyVolume, int newAccompanimentVolume)
    {
        melodyVolume = newMelodyVolume;
        accompanimentVolume = newAccompanimentVolume;
    }

    public ArrayList<Note> getAccompaniment()
    {
        return new ArrayList<Note>(accompaniment);
    }

    public ArrayList<Note> getMelody()
    {
        return new ArrayList<Note>(melody);
    }

    public int getAccompanimentVolume() {
        return accompanimentVolume;
    }

    public int getMelodyVolume() {
        return melodyVolume;
    }

    public int getBeatsPerInterval() {
        return beatsPerInterval;
    }

    public long getMILLIS_PER_BEAT() {
        return MILLIS_PER_BEAT;
    }

    public abstract void setMelody();

    public abstract void setAccompaniment();
}