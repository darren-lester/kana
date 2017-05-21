package com.darrenlester.kana;

import android.os.Bundle;
import android.preference.PreferenceFragment;

public final class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_general);
    }
}