package com.example.chow.synthesizer;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button aButton, asButton, bButton, cButton, csButton, dButton, dsButton, eButton, fButton, fsButton, gButton, gsbutton, aButtonHigh, asButtonHigh, bButtonHigh, cButtonHigh, csButtonHigh, dButtonHigh, dsButtonHigh, eButtonHigh, fButtonHigh, fsButtonHigh, gButtonHigh, gsbuttonHigh;
    private MediaPlayer aNote, asNote, bNote, cNote, csNote, dNote, dsNote, eNote, fNote, fsNote, gNote, gsNote, aNoteHigh, asNoteHigh, bNoteHigh, cNoteHigh, csNoteHigh, dNoteHigh, dsNoteHigh, eNoteHigh, fNoteHigh, fsNoteHigh, gNoteHigh, gsNoteHigh;
    private MediaPlayer player;
    //metronome
    private int noteLoc;
    //tempo of music
    public static final long tempo = 178, MILLIS_PER_MINUTE = 60000, BEATS_PER_INTERVAL = 4, SIXTEENTH_NOTE_PER_INTERVAL = 16, MILLIS_PER_SIXTEENTH_NOTE = MILLIS_PER_MINUTE / tempo * BEATS_PER_INTERVAL / SIXTEENTH_NOTE_PER_INTERVAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wireWidgets();
        setListeners();
        createMediaPlayers();
    }

    private void createMediaPlayers() {
        //1st octave
        aNote = MediaPlayer.create(this, R.raw.scalea);
        asNote = MediaPlayer.create(this, R.raw.scalebb);
        bNote = MediaPlayer.create(this, R.raw.scaleb);
        cNote = MediaPlayer.create(this, R.raw.scalec);
        csNote = MediaPlayer.create(this, R.raw.scalecs);
        dNote = MediaPlayer.create(this, R.raw.scaled);
        dsNote = MediaPlayer.create(this, R.raw.scaleds);
        eNote = MediaPlayer.create(this, R.raw.scalee);
        fNote = MediaPlayer.create(this, R.raw.scalef);
        fsNote = MediaPlayer.create(this, R.raw.scalefs);
        gNote = MediaPlayer.create(this, R.raw.scaleg);
        gsNote = MediaPlayer.create(this, R.raw.scalegs);
        //2nd octave
        aNoteHigh = MediaPlayer.create(this, R.raw.scalehigha);
        asNoteHigh = MediaPlayer.create(this, R.raw.scalehighbb);
        bNoteHigh = MediaPlayer.create(this, R.raw.scalehighb);
        cNoteHigh = MediaPlayer.create(this, R.raw.scalehighc);
        csNoteHigh = MediaPlayer.create(this, R.raw.scalehighcs);
        dNoteHigh = MediaPlayer.create(this, R.raw.scalehighd);
        dsNoteHigh = MediaPlayer.create(this, R.raw.scalehighds);
        eNoteHigh = MediaPlayer.create(this, R.raw.scalehighe);
        fNoteHigh = MediaPlayer.create(this, R.raw.scalehighf);
        fsNoteHigh = MediaPlayer.create(this, R.raw.scalehighfs);
        gNoteHigh = MediaPlayer.create(this, R.raw.scalehighg);
        gsNoteHigh = MediaPlayer.create(this, R.raw.scalehighgs);
    }

    private void setListeners() {
        aButton.setOnClickListener(this);
        asButton.setOnClickListener(this);
        bButton.setOnClickListener(this);
        cButton.setOnClickListener(this);
        csButton.setOnClickListener(this);
        dButton.setOnClickListener(this);
        dsButton.setOnClickListener(this);
        eButton.setOnClickListener(this);
        fButton.setOnClickListener(this);
        fsButton.setOnClickListener(this);
        gButton.setOnClickListener(this);
        gsbutton.setOnClickListener(this);
        //2nd octave
        aButtonHigh.setOnClickListener(this);
        asButtonHigh.setOnClickListener(this);
        bButtonHigh.setOnClickListener(this);
        cButtonHigh.setOnClickListener(this);
        csButtonHigh.setOnClickListener(this);
        dButtonHigh.setOnClickListener(this);
        dsButtonHigh.setOnClickListener(this);
        eButtonHigh.setOnClickListener(this);
        fButtonHigh.setOnClickListener(this);
        fsButtonHigh.setOnClickListener(this);
        gButtonHigh.setOnClickListener(this);
        gsbuttonHigh.setOnClickListener(this);
    }

    private void wireWidgets() {
        //1st octave
        aButton = (Button) findViewById(R.id.button_a);
        asButton = (Button) findViewById(R.id.button_as);
        bButton = (Button) findViewById(R.id.button_b);
        cButton = (Button) findViewById(R.id.button_c);
        csButton = (Button) findViewById(R.id.button_cs);
        dButton = (Button) findViewById(R.id.button_d);
        dsButton = (Button) findViewById(R.id.button_ds);
        eButton = (Button) findViewById(R.id.button_e);
        fButton = (Button) findViewById(R.id.button_f);
        fsButton = (Button) findViewById(R.id.button_fs);
        gButton = (Button) findViewById(R.id.button_g);
        gsbutton = (Button) findViewById(R.id.button_gs);
        //2nd octave
        aButtonHigh = (Button) findViewById(R.id.button_a_high);
        asButtonHigh = (Button) findViewById(R.id.button_as_high);
        bButtonHigh = (Button) findViewById(R.id.button_b_high);
        cButtonHigh = (Button) findViewById(R.id.button_c_high);
        csButtonHigh = (Button) findViewById(R.id.button_cs_high);
        dButtonHigh = (Button) findViewById(R.id.button_d_high);
        dsButtonHigh = (Button) findViewById(R.id.button_ds_high);
        eButtonHigh = (Button) findViewById(R.id.button_e_high);
        fButtonHigh = (Button) findViewById(R.id.button_f_high);
        fsButtonHigh = (Button) findViewById(R.id.button_fs_high);
        gButtonHigh = (Button) findViewById(R.id.button_g_high);
        gsbuttonHigh = (Button) findViewById(R.id.button_gs_high);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //1st octave
            case R.id.button_a:
                aNote.seekTo(0);
                aNote.start();
                break;
            case R.id.button_as:
                asNote.seekTo(0);
                asNote.start();
                break;
            case R.id.button_b:
                bNote.seekTo(0);
                bNote.start();
                break;
            case R.id.button_c:
                cNote.seekTo(0);
                cNote.start();
                break;
            case R.id.button_cs:
                csNote.seekTo(0);
                csNote.start();
                break;
            case R.id.button_d:
                dNote.seekTo(0);
                dNote.start();
                break;
            case R.id.button_ds:
                dsNote.seekTo(0);
                dsNote.start();
                break;
            case R.id.button_e:
                eNote.seekTo(0);
                eNote.start();
                break;
            case R.id.button_f:
                fNote.seekTo(0);
                fNote.start();
                break;
            case R.id.button_fs:
                fsNote.seekTo(0);
                fsNote.start();
                break;
            case R.id.button_g:
                gNote.seekTo(0);
                gNote.start();
                break;
            case R.id.button_gs:
                gsNote.seekTo(0);
                gsNote.start();
                break;
            case R.id.button_a_high:
                aNoteHigh.seekTo(0);
                aNoteHigh.start();
                break;
            case R.id.button_as_high:
                asNoteHigh.seekTo(0);
                asNoteHigh.start();
                break;
            case R.id.button_b_high:
                bNoteHigh.seekTo(0);
                bNoteHigh.start();
                break;
            case R.id.button_c_high:
                cNoteHigh.seekTo(0);
                cNoteHigh.start();
                break;
            case R.id.button_cs_high:
                csNoteHigh.seekTo(0);
                csNoteHigh.start();
                break;
            case R.id.button_d_high:
                dNoteHigh.seekTo(0);
                dNoteHigh.start();
                break;
            case R.id.button_ds_high:
                dsNoteHigh.seekTo(0);
                dsNoteHigh.start();
                break;
            case R.id.button_e_high:
                eNoteHigh.seekTo(0);
                eNoteHigh.start();
                break;
            case R.id.button_f_high:
                fNoteHigh.seekTo(0);
                fNoteHigh.start();
                break;
            case R.id.button_fs_high:
                fsNoteHigh.seekTo(0);
                fsNoteHigh.start();
                break;
            case R.id.button_g_high:
                gNoteHigh.seekTo(0);
                gNoteHigh.start();
                break;
            case R.id.button_gs_high:
                gsNoteHigh.seekTo(0);
                gsNoteHigh.start();
            default:
        }
    }

    public void playScaleE(View view) {
        noteLoc = 1;
        CountDownTimer timer = new CountDownTimer(4500, 500) {
            @Override
            public void onTick(long l) {
                switch (noteLoc) {
                    case 1:
                        eNote.seekTo(0);
                        eNote.start();
                        noteLoc++;
                        break;
                    case 2:
                        fsNote.seekTo(0);
                        fsNote.start();
                        noteLoc++;
                        break;
                    case 3:
                        gNote.seekTo(0);
                        gNote.start();
                        noteLoc++;
                        break;
                    case 4:
                        aNoteHigh.seekTo(0);
                        aNoteHigh.start();
                        noteLoc++;
                        break;
                    case 5:
                        bNoteHigh.seekTo(0);
                        bNoteHigh.start();
                        noteLoc++;
                        break;
                    case 6:
                        csNoteHigh.seekTo(0);
                        csNoteHigh.start();
                        noteLoc++;
                        break;
                    case 7:
                        dNoteHigh.seekTo(0);
                        dNoteHigh.start();
                        noteLoc++;
                        break;
                    case 8:
                        eNoteHigh.seekTo(0);
                        eNoteHigh.start();
                        noteLoc++;
                        break;
                }
            }

            @Override
            public void onFinish() {

            }
        };
        timer.start();
    }

    public void playScaleE2(View view) {
        MediaPlayer[] notes = new MediaPlayer[]{eNote, fsNote, gNote, aNoteHigh, bNoteHigh, csNoteHigh, dNoteHigh, eNoteHigh};
        for (MediaPlayer note : notes) {
            note.seekTo(0);
            note.start();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void playDespacito(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                play(fsNote, aNoteHigh, dNoteHigh);
                wait(6);
                play(fsNote);
                wait(2);
                play(csNoteHigh);
                wait(6);
                play(fsNote);
                wait(2);
                play(bNoteHigh);
                wait(4);
                wait(2);
                wait(4);
                wait(2);
                wait(4);
                wait(2);
                play(dNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(bNoteHigh);
                wait(2);
                play(aNoteHigh);
                wait(2);
                play(gNote);
                wait(16);
                wait(8);
                play(dNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(bNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(dNoteHigh);
                wait(16);
                wait(8);
                play(dNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(dNoteHigh);
                wait(2);
                play(eNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(16);
                play(fsNote, aNoteHigh, dNoteHigh);
                wait(6);
                play(fsNote);
                wait(2);
                play(csNoteHigh);
                wait(6);
                play(fsNote);
                wait(2);
                play(bNoteHigh);
                wait(10);
                play(fsNote);
                wait(2);
                play(bNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(dNoteHigh);
                wait(2);
                wait(1);
                play(eNoteHigh);
                wait(1);
                wait(2);
                play(dNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                wait(1);
                play(bNoteHigh);
                wait(1);
                wait(2);
                play(aNoteHigh);
                wait(2);
                play(gNote);
                wait(6);
                play(dNoteHigh);
                wait(6);
                play(dNoteHigh);
                wait(4);
                wait(8);
                play(dNoteHigh);
                wait(4);
                play(aNoteHigh);
                wait(4);
                play(dNoteHigh);
                wait(4);
                play(aNoteHigh);
                wait(4);
                play(dNoteHigh);
                wait(4);
                play(aNoteHigh);
                wait(4);
                play(dNoteHigh);
                wait(4);
                play(eNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                wait(8);
                wait(8);
                wait(16);
                play(bNoteHigh);
                wait(10);
                play(fsNote);
                wait(2);
                play(bNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(dNoteHigh);
                wait(2);
                wait(1);
                play(eNoteHigh);
                wait(1);
                wait(2);
                play(dNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                wait(1);
                play(bNoteHigh);
                wait(1);
                wait(2);
                play(aNoteHigh);
                wait(2);
                play(gNote);
                wait(6);
                play(dNoteHigh);
                wait(6);
                play(eNoteHigh);
                wait(4);
                wait(8);
                play(dNoteHigh);
                wait(4);
                play(aNoteHigh);
                wait(4);
                play(dNoteHigh);
                wait(4);
                play(aNoteHigh);
                wait(4);
                play(dNoteHigh);
                wait(4);
                play(aNoteHigh);
                wait(4);
                play(dNoteHigh);
                wait(4);
                play(eNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                wait(8);
                wait(8);
                wait(16);
                play(fsNote, aNoteHigh, dNoteHigh);
                wait(6);
                play(fsNote);
                wait(2);
                play(csNoteHigh);
                wait(6);
                play(fsNote);
                wait(2);
                play(bNoteHigh);
                wait(8);
                play(bNoteHigh);
                wait(2);
                play(bNoteHigh);
                wait(2);
                play(bNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(dNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(dNoteHigh);
                wait(2);
                wait(1);
                play(csNoteHigh);
                wait(1);
                wait(2);
                play(dNoteHigh);
                wait(2);
                wait(1);
                play(csNoteHigh);
                wait(1);
                wait(2);
                play(bNoteHigh);
                wait(8);
                play(bNoteHigh);
                wait(2);
                play(bNoteHigh);
                wait(2);
                play(bNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(dNoteHigh);
                wait(2);
                play(csNoteHigh);
                wait(2);
                play(dNoteHigh);
            }

            private void wait(int num16thNote) {
                long waitTime = MILLIS_PER_SIXTEENTH_NOTE * num16thNote;
                try {
                    Thread.sleep(waitTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            public void play(MediaPlayer... notes) {
                for (MediaPlayer note : notes) {
                    note.seekTo(0);
                    note.start();
                }
            }
        }).start();

    }

    public void playWetHands(View view) {
        play(new WetHands());
    }

    private void play(Song s)
    {
        Toast.makeText(this, "hey1", Toast.LENGTH_SHORT).show();
        int beat = 1, interval = 1;
        ArrayList<Note> accompaniment = s.getAccompaniment(), melody = s.getMelody();
        while (accompaniment.size() > 0 || accompaniment.size() > 0) {
            for (Note note : s.getAccompaniment()) {
                if (note.getInterval() == interval && note.getBeat() == beat) {
                    accompaniment.remove(note);
                    player = MediaPlayer.create(this, note.getResourceID());
                    //player.setVolume((float)(Math.log(MAX_VOLUME - s.getAccompanimentVolume())/Math.log(MAX_VOLUME)), (float)(Math.log(MAX_VOLUME - s.getAccompanimentVolume())/Math.log(MAX_VOLUME)));
                    player.seekTo(0);
                    player.start();
                }
            }
            for (Note note : s.getMelody()) {
                if (note.getInterval() == interval && note.getBeat() == beat) {
                    accompaniment.remove(note);
                    player = MediaPlayer.create(this, note.getResourceID());
                    //player.setVolume((float)(Math.log(MAX_VOLUME - s.getMelodyVolume())/Math.log(MAX_VOLUME)), (float)(Math.log(MAX_VOLUME - s.getMelodyVolume())/Math.log(MAX_VOLUME)));
                    player.seekTo(0);
                    player.start();
                }
            }
            if (beat == s.getBeatsPerInterval()) {
                beat = 1;
                interval++;
            } else {
                beat++;
            }
            try {
                Thread.sleep(s.getMILLIS_PER_BEAT());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
