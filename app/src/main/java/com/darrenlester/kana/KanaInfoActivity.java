package com.darrenlester.kana;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public final class KanaInfoActivity extends AppCompatActivity {

    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kana_info);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();

        KanaDictionary.DictionaryEntry entry = (KanaDictionary.DictionaryEntry) intent.getSerializableExtra(MainActivity.DICTIONARY_ENTRY);

        String kana = "";
        switch (entry.type.toString())
        {
            case "HIRAGANA":
                kana = entry.hiragana;
                break;
            case "KATAKANA":
                kana = entry.katakana;
                break;
            default:
        }

        TextView kanaView = (TextView)findViewById(R.id.kana);
        kanaView.setText(kana);

        TextView hiraganaView = (TextView)findViewById(R.id.hiragana);
        hiraganaView.setText(entry.hiragana);

        TextView katakanaView = (TextView)findViewById(R.id.katakana);
        katakanaView.setText(entry.katakana);

        TextView transliterationView = (TextView)findViewById(R.id.transliteration);
        transliterationView.setText(entry.transliteration);

        // create example word views
        if (entry.examples.length > 0) {

            TableLayout layout = (TableLayout) findViewById(R.id.examples);

            for (int i = 0; i < entry.examples.length; ++i) {
                if (!entry.examples[i].example.equals("") && !entry.examples[i].definition.equals("")) {
                    // add the example word to the layout
                    TextView word = new TextView(this);
                    word.setText(entry.examples[i].example);
                    word.setPadding(0, 0, Math.round(24 * getResources().getDisplayMetrics().density), 0);

                    TextView romaji = new TextView(this);
                    romaji.setText(entry.examples[i].romaji);
                    romaji.setPadding(0, 0, Math.round(24 * getResources().getDisplayMetrics().density), 0);

                    TextView definition = new TextView(this);
                    definition.setText(entry.examples[i].definition);

                    TableRow row = new TableRow(this);

                    row.addView(word);
                    row.addView(romaji);
                    row.addView(definition);
                    layout.addView(row);
                }
            }
        } else {
            findViewById(R.id.example_header).setVisibility(View.GONE);
        }

        ImageView strokeDiagramView = (ImageView)findViewById(R.id.stroke_1);
        strokeDiagramView.setAdjustViewBounds(true);
        strokeDiagramView.setMaxHeight(Math.round((48 * getResources().getDisplayMetrics().density)));
        strokeDiagramView.setImageResource(entry.strokeDiagram[0]);

        if (entry.strokeDiagram.length == 2) { // add second diagram if it exists
            strokeDiagramView = (ImageView)findViewById(R.id.stroke_2);
            strokeDiagramView.setAdjustViewBounds(true);
            strokeDiagramView.setMaxHeight(Math.round((48 * getResources().getDisplayMetrics().density)));
            strokeDiagramView.setImageResource(entry.strokeDiagram[1]);
        }

        setTitle(kana);
    }

    public void onPause() {
        super.onPause();
        this.mPlayer.release();
    }

    public void onResume() {
        super.onResume();

        Intent intent = getIntent();
        KanaDictionary.DictionaryEntry entry = (KanaDictionary.DictionaryEntry) intent.getSerializableExtra(MainActivity.DICTIONARY_ENTRY);

        View playSound = findViewById(R.id.play_sound);

        this.mPlayer = MediaPlayer.create(this, entry.soundFile);
        this.mPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
            @Override
            public boolean onError(MediaPlayer mediaPlayer, int i, int i1) {
                mediaPlayer.reset();
                Toast.makeText(KanaInfoActivity.this, "A MediaPlayer error occurred (Err. No. " + i + "(" + i1 + "))", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        final MediaPlayer mPlayer = this.mPlayer;
        mPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);

        playSound.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mPlayer.start();
            }
        });
    }
}
