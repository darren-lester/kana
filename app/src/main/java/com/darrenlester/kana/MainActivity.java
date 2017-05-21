package com.darrenlester.kana;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public final class MainActivity extends AppCompatActivity {

    private static final KanaDictionary dictionary = new KanaDictionary();

    public static final String DICTIONARY_ENTRY = "com.darrenlester.kanatable.DICTIONARY_ENTRY";

    private static final String KEY_PREF_ROMAJI = "romaji_switch";

    private static final int[] HIRAGANA_IDS = {
            R.id.hiragana_romaji_row_a,
            R.id.hiragana_romaji_row_ka,
            R.id.hiragana_romaji_row_sa,
            R.id.hiragana_romaji_row_ta,
            R.id.hiragana_romaji_row_na,
            R.id.hiragana_romaji_row_ha,
            R.id.hiragana_romaji_row_ma,
            R.id.hiragana_romaji_row_ya,
            R.id.hiragana_romaji_row_ra,
            R.id.hiragana_romaji_row_wa,
            R.id.hiragana_romaji_row_n,
            R.id.hiragana_romaji_row_ga,
            R.id.hiragana_romaji_row_za,
            R.id.hiragana_romaji_row_da,
            R.id.hiragana_romaji_row_ba,
            R.id.hiragana_romaji_row_pa,
            R.id.hiragana_romaji_row_kya,
            R.id.hiragana_romaji_row_sha,
            R.id.hiragana_romaji_row_cha,
            R.id.hiragana_romaji_row_nya,
            R.id.hiragana_romaji_row_hya,
            R.id.hiragana_romaji_row_mya,
            R.id.hiragana_romaji_row_rya,
            R.id.hiragana_romaji_row_gya,
            R.id.hiragana_romaji_row_ja,
            R.id.hiragana_romaji_row_bya,
            R.id.hiragana_romaji_row_pya
    };

    private static final int[] KATAKANA_IDS = {
            R.id.katakana_romaji_row_a,
            R.id.katakana_romaji_row_ka,
            R.id.katakana_romaji_row_sa,
            R.id.katakana_romaji_row_ta,
            R.id.katakana_romaji_row_na,
            R.id.katakana_romaji_row_ha,
            R.id.katakana_romaji_row_ma,
            R.id.katakana_romaji_row_ya,
            R.id.katakana_romaji_row_ra,
            R.id.katakana_romaji_row_wa,
            R.id.katakana_romaji_row_n,
            R.id.katakana_romaji_row_ga,
            R.id.katakana_romaji_row_za,
            R.id.katakana_romaji_row_da,
            R.id.katakana_romaji_row_ba,
            R.id.katakana_romaji_row_pa,
            R.id.katakana_romaji_row_kya,
            R.id.katakana_romaji_row_sha,
            R.id.katakana_romaji_row_cha,
            R.id.katakana_romaji_row_nya,
            R.id.katakana_romaji_row_hya,
            R.id.katakana_romaji_row_mya,
            R.id.katakana_romaji_row_rya,
            R.id.katakana_romaji_row_gya,
            R.id.katakana_romaji_row_ja,
            R.id.katakana_romaji_row_bya,
            R.id.katakana_romaji_row_pya
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(sectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.action_settings:
                Intent settingsIntent = new Intent(this, SettingsActivity.class);
                startActivity(settingsIntent);
                return true;
            case R.id.action_contact:
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{getString(R.string.contact_email)});
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.contact_subject));
                if (emailIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(emailIntent);
                }
                return true;
            case R.id.action_about:
                Intent aboutIntent = new Intent(this, AboutActivity.class);
                startActivity(aboutIntent);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            SharedPreferences sharedPref;
            boolean visible;
            switch(getArguments().getInt(ARG_SECTION_NUMBER))
            {
                case 1:
                    View hiraganaView = inflater.inflate(R.layout.fragment_hiragana, container, false);
                    sharedPref = PreferenceManager.getDefaultSharedPreferences(getContext());
                    visible = sharedPref.getBoolean(KEY_PREF_ROMAJI, true);
                    setRomajiVisibility(visible, (ViewGroup)hiraganaView, MainActivity.HIRAGANA_IDS);
                    return hiraganaView;
                case 2:
                    View katakanaView = inflater.inflate(R.layout.fragment_katakana, container, false);
                    sharedPref = PreferenceManager.getDefaultSharedPreferences(getContext());
                    visible = sharedPref.getBoolean(KEY_PREF_ROMAJI, true);
                    setRomajiVisibility(visible, (ViewGroup)katakanaView, MainActivity.KATAKANA_IDS);
                    return katakanaView;
                default:
                   return inflater.inflate(R.layout.fragment_main, container, false);
            }
        }
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "HIRAGANA";
                case 1:
                    return "KATAKANA";
                default:
                    return null;
            }
        }
    }

    public void showKanaInfo(View view) {
        TextView kanaViewClicked = (TextView)view;
        String kana = kanaViewClicked.getText().toString();

        KanaDictionary.DictionaryEntry kanaInfo = dictionary.getKanaInfo(kana);

        if (kanaInfo != null) {
            Intent intent = new Intent(this, KanaInfoActivity.class);
            intent.putExtra(DICTIONARY_ENTRY, kanaInfo);

            startActivity(intent);
        }
    }

    private static void setRomajiVisibility(boolean visible, ViewGroup viewgroup, int[] IDs) {
        if (viewgroup != null) {
            for (int id : IDs) {
                View view = viewgroup.findViewById(id);

                if (view != null) {
                    if (visible) {
                        view.setVisibility(View.VISIBLE);
                    } else {
                        view.setVisibility(View.GONE);
                    }
                }
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        boolean visible = sharedPref.getBoolean(KEY_PREF_ROMAJI, true);
        setRomajiVisibility(visible, (ViewGroup)findViewById(R.id.container).findViewById(R.id.hiragana_tab), MainActivity.HIRAGANA_IDS);
        setRomajiVisibility(visible, (ViewGroup)findViewById(R.id.container).findViewById(R.id.katakana_tab), MainActivity.KATAKANA_IDS);
    }
}
