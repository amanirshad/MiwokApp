package com.example.android.miwok;

import android.content.Context;

/**
 * {@link Word} represents a word having english and miwok translation
 *
 */

public class Word {

    /* Drawable Resource Id*/
    private int mImageResourceId;

    /* Default Translation for the word*/
    private String mDefaultTranslation;

    /* Miwok Translation for the word*/
    private String mMiwokTranslation;


    /**
     *
     * @param defaultTranslation Default Translation for the word
     * @param miwokTranslation Mivok Translation for the word
     */
    public Word(String defaultTranslation , String miwokTranslation){

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     *
     * @param defaultTranslation Default Translation for the word
     * @param miwokTranslation Mivok Translation fot the word
     * @param imageResourceId Image Resource ID for the word
     */
    public Word(String defaultTranslation , String miwokTranslation , int imageResourceId){

        mImageResourceId = imageResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     @return Default Translation of the word
     */
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**
     *
     * @return Miwok Translation of the word
     */
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
