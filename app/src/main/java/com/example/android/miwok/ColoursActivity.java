package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class ColoursActivity extends AppCompatActivity {
    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> colourArray = new ArrayList<Word>();

        colourArray.add(new Word("red", "weṭeṭṭi", R.drawable.color_red, R.raw.color_red));
        colourArray.add(new Word("green", "chokokki", R.drawable.color_green, R.raw.color_green));
        colourArray.add(new Word("brown", "ṭakaakki", R.drawable.color_brown, R.raw.color_brown));
        colourArray.add(new Word("gray", "ṭopoppi", R.drawable.color_gray, R.raw.color_gray));
        colourArray.add(new Word("black", "kululli", R.drawable.color_black, R.raw.color_black));
        colourArray.add(new Word("white", "kelelli", R.drawable.color_white, R.raw.color_white));
        colourArray.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow, R.raw.color_dusty_yellow));
        colourArray.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow, R.raw.color_mustard_yellow));

        WordAdapter wordAdapter = new WordAdapter(this,colourArray,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = colourArray.get(position);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(ColoursActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }

}
