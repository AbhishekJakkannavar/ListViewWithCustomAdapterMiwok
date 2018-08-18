package com.example.android.miwok;

public class Word {

    private String defaulttranslation;
    private String miwoktranslation;


    public Word(String defaulttranslation, String miwoktranslation) {
        this.defaulttranslation = defaulttranslation;
        this.miwoktranslation = miwoktranslation;
    }

    public String getDefaulttranslation() {
        return defaulttranslation;
    }



    public String getMiwoktranslation() {
        return miwoktranslation;
    }

}
