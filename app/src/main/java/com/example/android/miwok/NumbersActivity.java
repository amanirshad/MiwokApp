package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> numbersArray = new ArrayList<Word>();

        Word w = new Word("one","lutti",R.drawable.number_one);
        numbersArray.add(w);


        numbersArray.add(new Word("two","otiiko",R.drawable.number_two));
        numbersArray.add(new Word("three","tolookosu",R.drawable.number_three));
        numbersArray.add(new Word("four","oyyisa",R.drawable.number_four));
        numbersArray.add(new Word("five","massokka",R.drawable.number_five));
        numbersArray.add(new Word("six","temmokke",R.drawable.number_six));
        numbersArray.add(new Word("seven","kenekaku",R.drawable.number_seven));
        numbersArray.add(new Word("eight","kawinta",R.drawable.number_eight));
        numbersArray.add(new Word("nine","wo'e",R.drawable.number_nine));
        numbersArray.add(new Word("ten","na'aacha",R.drawable.number_ten));

        //ArrayAdapter<Word> itemsAdapter = new ArrayAdapter<Word>(this, R.layout.list_item, numbersArray);
        WordAdapter wordAdapter = new WordAdapter(this,numbersArray,R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

    }
}
