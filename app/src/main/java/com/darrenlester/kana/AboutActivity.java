package com.darrenlester.kana;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;

public final class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void openInPlayStore(@SuppressWarnings("UnusedParameters") View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("market://details?id=com.darrenlester.kana"));
        startActivity(intent);
    }

    public void showAcknowledgements(@SuppressWarnings("UnusedParameters") View view) {
        Intent intent = new Intent(this, AcknowledgementsActivity.class);
        startActivity(intent);
    }

    public void showChangelog(@SuppressWarnings("UnusedParameters") View view) {
        Intent intent = new Intent(this, ChangelogActivity.class);
        startActivity(intent);
    }
}
