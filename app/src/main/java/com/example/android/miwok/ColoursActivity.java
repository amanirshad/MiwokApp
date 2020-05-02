package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColoursActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colours);

        ArrayList<Word> colourArray = new ArrayList<Word>();

        colourArray.add(new Word("red","weṭeṭṭi",R.drawable.color_red));
        colourArray.add(new Word("green","chokokki",R.drawable.color_green));
        colourArray.add(new Word("brown","ṭakaakki",R.drawable.color_brown));
        colourArray.add(new Word("gray","ṭopoppi",R.drawable.color_gray));
        colourArray.add(new Word("black","kululli",R.drawable.color_black));
        colourArray.add(new Word("white","kelelli",R.drawable.color_white));
        colourArray.add(new Word("dusty yellow","ṭopiisә",R.drawable.color_dusty_yellow));
        colourArray.add(new Word("mustard yellow","chiwiiṭә",R.drawable.color_mustard_yellow));

        WordAdapter wordAdapter = new WordAdapter(this,colourArray,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.colourslist);

        listView.setAdapter(wordAdapter);
    }
}
