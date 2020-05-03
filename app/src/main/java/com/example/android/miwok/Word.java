package com.example.android.miwok;

/**
 * {@link Word} represents a word having english and miwok translation
 *
 */

public class Word {


    /*Raw Resource Id*/
    private int mAudioResourceId;

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
     * @param audioResourceId Audio Resource ID for the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     *
     * @param defaultTranslation Default Translation for the word
     * @param miwokTranslation Mivok Translation fot the word
     * @param imageResourceId Image Resource ID for the word
     * @param audioResourceId Audio Resource ID for the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {

        mImageResourceId = imageResourceId;
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
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

    /**
     * @return Image Resource ID of the word
     */
    public int getImageResourceId(){
        return mImageResourceId;
    }

    /**
     *
     * @return Audio Resource ID of the word
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
