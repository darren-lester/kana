package com.darrenlester.kana;

import android.support.annotation.NonNull;

import java.io.Serializable;

public class DictionaryExample implements Serializable, Comparable<DictionaryExample>{
    public final String example;
    public final String definition;
    public final String romaji;

    public DictionaryExample(String example, String definition, String romaji) {
        this.example = example;
        this.definition = definition;
        this.romaji = romaji;
    }


    public int compareTo(@NonNull DictionaryExample rhs) {
        return this.example.compareTo(rhs.example);
    }
}
