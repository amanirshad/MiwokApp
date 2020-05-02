package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    /**
     * Resource Id for background color
     */
    private int mColorResourceId;

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects , int backgroundColor) {
        super(context, 0 , objects);
        mColorResourceId = backgroundColor;
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.english_text_view);
        defaultTranslation.setText(currentWord.getDefaultTranslation());

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(currentWord.getMiwokTranslation());

        ImageView wordIcon = (ImageView) listItemView.findViewById(R.id.image);
        if(wordIcon.getVisibility() == View.VISIBLE) {
            wordIcon.setImageResource(currentWord.getImageResourceId());
        }
        else {
            wordIcon.setVisibility(View.INVISIBLE);
        }

        View textContainer = (View) listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }

}
