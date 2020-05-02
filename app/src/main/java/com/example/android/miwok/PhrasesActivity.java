package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> phrasesArray = new ArrayList<Word>();

        phrasesArray.add(new Word("Where are you going?","minto wuksus"));
        phrasesArray.add(new Word("What is your name?","tinnә oyaase'nә"));
        phrasesArray.add(new Word("My name is...","oyaaset..."));
        phrasesArray.add(new Word("How are you feeling?","michәksәs?"));
        phrasesArray.add(new Word("I’m feeling good.","kuchi achit"));
        phrasesArray.add(new Word("Are you coming?","әәnәs'aa?"));
        phrasesArray.add(new Word("Yes, I’m coming.","hәә’ әәnәm"));
        phrasesArray.add(new Word("I'm coming.","әәnәm"));
        phrasesArray.add(new Word("Let's go.","yoowutis"));
        phrasesArray.add(new Word("Come here","әnni'nem"));

        WordAdapter wordAdapter = new WordAdapter(this,phrasesArray,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}
