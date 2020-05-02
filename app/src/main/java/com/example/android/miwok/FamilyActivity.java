package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> familyArray = new ArrayList<Word>();

        familyArray.add(new Word("father","әpә",R.drawable.family_father));
        familyArray.add(new Word("mother","әṭa",R.drawable.family_mother));
        familyArray.add(new Word("son","angsi",R.drawable.family_son));
        familyArray.add(new Word("daughter","tune",R.drawable.family_daughter));
        familyArray.add(new Word("older brother","taachi",R.drawable.family_older_brother));
        familyArray.add(new Word("younger brother","chalitti",R.drawable.family_younger_brother));
        familyArray.add(new Word("older sister","teṭe",R.drawable.family_older_sister));
        familyArray.add(new Word("younger sister","kolliti",R.drawable.family_younger_sister));
        familyArray.add(new Word("grandmother","ama",R.drawable.family_grandmother));
        familyArray.add(new Word("grandfather","paapa",R.drawable.family_grandfather));

        WordAdapter wordAdapter = new WordAdapter(this,familyArray,R.color.category_family);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);
    }
}
