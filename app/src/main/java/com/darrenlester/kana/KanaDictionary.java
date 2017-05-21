package com.darrenlester.kana;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Arrays;

public final class KanaDictionary {
    public enum KANA_TYPE {
        HIRAGANA,
        KATAKANA
    }

    private static final HashMap<String, DictionaryEntry> dictionary = new HashMap<>();

    public static class DictionaryEntry implements Serializable{
        public final KANA_TYPE type;
        public final String hiragana;
        public final String katakana;
        public final String transliteration;
        public final DictionaryExample[] examples;
        public final int soundFile;
        public final int[] strokeDiagram;

        public DictionaryEntry(KANA_TYPE type, String hiragana, String katakana,
                               String transliteration, DictionaryExample[] examples, int soundFile, int[] strokeDiagram) {
            this.type = type;
            this.hiragana = hiragana;
            this.katakana = katakana;
            this.transliteration = transliteration;
            this.examples = examples;
            this.soundFile = soundFile;
            this.strokeDiagram = strokeDiagram;
        }
    }

    public DictionaryEntry getKanaInfo(String kana) {
        return dictionary.get(kana);
    }

    public KanaDictionary() {
        dictionary.put("あ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "あ", "ア", "a",
				new DictionaryExample[]{new DictionaryExample("あおい", "blue", "aoi"), new DictionaryExample("あたま", "head", "atama"), new DictionaryExample("ありがとう", "thank you", "arigatou")},
                R.raw.a, new int[]{R.drawable.a_hiragana}));

        dictionary.put("い", new DictionaryEntry(KANA_TYPE.HIRAGANA, "い", "イ", "i",
				new DictionaryExample[]{new DictionaryExample("いい", "good", "ii"), new DictionaryExample("いしゃ", "doctor", "isha"), new DictionaryExample("いみ", "meaning", "imi")},
                R.raw.i, new int[]{R.drawable.i_hiragana}));

        dictionary.put("う", new DictionaryEntry(KANA_TYPE.HIRAGANA, "う", "ウ", "u",
				new DictionaryExample[]{new DictionaryExample("うえ", "above", "ue"), new DictionaryExample("うま", "horse", "uma"), new DictionaryExample("うる", "to sell", "uru")},
                R.raw.u, new int[]{R.drawable.u_hiragana}));

        dictionary.put("え", new DictionaryEntry(KANA_TYPE.HIRAGANA, "え", "エ", "e",
				new DictionaryExample[]{new DictionaryExample("え", "picture", "e"), new DictionaryExample("えいご", "English language", "eigo"), new DictionaryExample("えん", "yen", "en")},
                R.raw.e, new int[]{R.drawable.e_hiragana}));

        dictionary.put("お", new DictionaryEntry(KANA_TYPE.HIRAGANA, "お", "オ", "o",
				new DictionaryExample[]{new DictionaryExample("おとこ", "man, male", "otoko"), new DictionaryExample("おんがく", "music", "ongaku"), new DictionaryExample("おんな", "woman, female", "onna")},
                R.raw.o, new int[]{R.drawable.o_hiragana}));

        dictionary.put("か", new DictionaryEntry(KANA_TYPE.HIRAGANA, "か", "カ", "ka",
				new DictionaryExample[]{new DictionaryExample("かう", "to buy", "kau"), new DictionaryExample("かね", "money", "kane"), new DictionaryExample("かわ", "river", "kawa")},
                R.raw.ka, new int[]{R.drawable.ka_hiragana}));

        dictionary.put("き", new DictionaryEntry(KANA_TYPE.HIRAGANA, "き", "キ", "ki",
				new DictionaryExample[]{new DictionaryExample("き", "tree", "ki"), new DictionaryExample("きた", "north", "kita"), new DictionaryExample("きれい", "pretty", "kirei")},
                R.raw.ki, new int[]{R.drawable.ki_hiragana}));

        dictionary.put("く", new DictionaryEntry(KANA_TYPE.HIRAGANA, "く", "ク", "ku",
				new DictionaryExample[]{new DictionaryExample("くつ", "shoes", "kutsu"), new DictionaryExample("ください", "please give me", "kudasai"), new DictionaryExample("くるま", "car", "kuruma")},
                R.raw.ku, new int[]{R.drawable.ku_hiragana}));

        dictionary.put("け", new DictionaryEntry(KANA_TYPE.HIRAGANA, "け", "ケ", "ke",
				new DictionaryExample[]{new DictionaryExample("けいさつかん", "police officer", "keisatsukan"), new DictionaryExample("けいたい", "mobile phone", "keitai"), new DictionaryExample("けっこん", "marriage", "kekkon")},
                R.raw.ke, new int[]{R.drawable.ke_hiragana}));

        dictionary.put("こ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "こ", "コ", "ko",
				new DictionaryExample[]{new DictionaryExample("こうえん", "park", "kouen"), new DictionaryExample("こころ", "heart", "kokoro"), new DictionaryExample("こども", "child", "kodomo")},
                R.raw.ko, new int[]{R.drawable.ko_hiragana}));

        dictionary.put("さ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "さ", "サ", "sa",
				new DictionaryExample[]{new DictionaryExample("さかな", "fish", "sakana"), new DictionaryExample("さけ", "alcohol", "sake"), new DictionaryExample("さくら", "cherry blossom", "sakura")},
                R.raw.sa, new int[]{R.drawable.sa_hiragana}));

        dictionary.put("し", new DictionaryEntry(KANA_TYPE.HIRAGANA, "し", "シ", "shi",
				new DictionaryExample[]{new DictionaryExample("し", "four", "shi"), new DictionaryExample("しごと", "work", "shigoto"), new DictionaryExample("した", "below", "shita")},
                R.raw.shi, new int[]{R.drawable.shi_hiragana}));

        dictionary.put("す", new DictionaryEntry(KANA_TYPE.HIRAGANA, "す", "ス", "su",
				new DictionaryExample[]{new DictionaryExample("す", "vinegar", "su"), new DictionaryExample("すし", "sushi", "sushi"), new DictionaryExample("する", "to do", "suru")},
                R.raw.su, new int[]{R.drawable.su_hiragana}));

        dictionary.put("せ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "せ", "セ", "se",
				new DictionaryExample[]{new DictionaryExample("せ", "back", "se"), new DictionaryExample("せいと", "pupil", "seito"), new DictionaryExample("せんせい", "teacher", "sensei")},
                R.raw.se, new int[]{R.drawable.se_hiragana}));

        dictionary.put("そ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "そ", "ソ", "so",
				new DictionaryExample[]{new DictionaryExample("そふ", "grandfather", "sofu"), new DictionaryExample("そぼ", "grandmother", "sobo"), new DictionaryExample("そら", "sky", "sora")},
                R.raw.so, new int[]{R.drawable.so_hiragana}));

        dictionary.put("た", new DictionaryEntry(KANA_TYPE.HIRAGANA, "た", "タ", "ta",
				new DictionaryExample[]{new DictionaryExample("た", "rice field", "ta"), new DictionaryExample("たてもの", "building", "tatemono"), new DictionaryExample("たべもの", "food", "tabemono")},
                R.raw.ta, new int[]{R.drawable.ta_hiragana}));

        dictionary.put("ち", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ち", "チ", "chi",
				new DictionaryExample[]{new DictionaryExample("ち", "earth, ground, land", "chi"), new DictionaryExample("ち", "blood", "chi"), new DictionaryExample("ちきゅう", "the Earth", "chikyuu")},
                R.raw.chi, new int[]{R.drawable.chi_hiragana}));

        dictionary.put("つ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "つ", "ツ", "tsu",
				new DictionaryExample[]{new DictionaryExample("つき", "moon", "tsuki"), new DictionaryExample("つづく", "to continue", "tsuzuku"), new DictionaryExample("つり", "fishing", "tsuri")},
                R.raw.tsu, new int[]{R.drawable.tsu_hiragana}));

        dictionary.put("て", new DictionaryEntry(KANA_TYPE.HIRAGANA, "て", "テ", "te",
				new DictionaryExample[]{new DictionaryExample("て", "hand", "te"), new DictionaryExample("てがみ", "letter", "tegami"), new DictionaryExample("てんき", "weather", "tenki")},
                R.raw.te, new int[]{R.drawable.te_hiragana}));

        dictionary.put("と", new DictionaryEntry(KANA_TYPE.HIRAGANA, "と", "ト", "to",
				new DictionaryExample[]{new DictionaryExample("とし", "year", "toshi"), new DictionaryExample("ともだち", "friend", "tomodachi"), new DictionaryExample("とり", "bird", "tori")},
                R.raw.to, new int[]{R.drawable.to_hiragana}));

        dictionary.put("な", new DictionaryEntry(KANA_TYPE.HIRAGANA, "な", "ナ", "na",
				new DictionaryExample[]{new DictionaryExample("ながい", "long", "nagai"), new DictionaryExample("なつ", "summer", "natsu"), new DictionaryExample("なまえ", "name", "namae")},
                R.raw.na, new int[]{R.drawable.na_hiragana}));

        dictionary.put("に", new DictionaryEntry(KANA_TYPE.HIRAGANA, "に", "ニ", "ni",
				new DictionaryExample[]{new DictionaryExample("にく", "meat", "niku"), new DictionaryExample("にほん", "Japan", "nihon"), new DictionaryExample("にんげん", "human", "ningen")},
                R.raw.ni, new int[]{R.drawable.ni_hiragana}));

        dictionary.put("ぬ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぬ", "ヌ", "nu",
				new DictionaryExample[]{new DictionaryExample("ぬすむ", "to steal", "nusumu"), new DictionaryExample("ぬの", "cloth", "nuno"), new DictionaryExample("ぬる", "to paint", "nuru")},
                R.raw.nu, new int[]{R.drawable.nu_hiragana}));

        dictionary.put("ね", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ね", "ネ", "ne",
				new DictionaryExample[]{new DictionaryExample("ねこ", "cat", "neko"), new DictionaryExample("ねだん", "price", "nedan"), new DictionaryExample("ねつ", "fever", "netsu")},
                R.raw.ne, new int[]{R.drawable.ne_hiragana}));

        dictionary.put("の", new DictionaryEntry(KANA_TYPE.HIRAGANA, "の", "ノ", "no",
				new DictionaryExample[]{new DictionaryExample("の", "field", "no"), new DictionaryExample("のみもの", "a drink", "nomimono"), new DictionaryExample("のむ", "to drink", "nomu")},
                R.raw.no, new int[]{R.drawable.no_hiragana}));

        dictionary.put("は", new DictionaryEntry(KANA_TYPE.HIRAGANA, "は", "ハ", "ha",
				new DictionaryExample[]{new DictionaryExample("は", "teeth", "ha"), new DictionaryExample("はな", "flower", "hana"), new DictionaryExample("はなす", "to speak", "hanasu")},
                R.raw.ha, new int[]{R.drawable.ha_hiragana}));

        dictionary.put("ひ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ひ", "ヒ", "hi",
				new DictionaryExample[]{new DictionaryExample("ひ", "day", "hi"), new DictionaryExample("ひこうき", "aeroplane", "hikouki"), new DictionaryExample("ひと", "person", "hito")},
                R.raw.hi, new int[]{R.drawable.hi_hiragana}));

        dictionary.put("ふ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ふ", "フ", "fu",
				new DictionaryExample[]{new DictionaryExample("ふたり", "two people", "futari"), new DictionaryExample("ふね", "boat", "fune"), new DictionaryExample("ふゆ", "winter", "fuyu")},
                R.raw.fu, new int[]{R.drawable.fu_hiragana}));

        dictionary.put("へ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "へ", "ヘ", "he",
				new DictionaryExample[]{new DictionaryExample("へいわ", "peace", "heiwa"), new DictionaryExample("へや", "room", "heya"), new DictionaryExample("へんか", "change", "henka")},
                R.raw.he, new int[]{R.drawable.he_hiragana}));

        dictionary.put("ほ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ほ", "ホ", "ho",
				new DictionaryExample[]{new DictionaryExample("ほし", "star", "hoshi"), new DictionaryExample("ほしい", "wanted", "hoshii"), new DictionaryExample("ほん", "book", "hon")},
                R.raw.ho, new int[]{R.drawable.ho_hiragana}));

        dictionary.put("ま", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ま", "マ", "ma",
				new DictionaryExample[]{new DictionaryExample("まいにち", "every day", "mainichi"), new DictionaryExample("まど", "window", "mado"), new DictionaryExample("まんが", "comic", "manga")},
                R.raw.ma, new int[]{R.drawable.ma_hiragana}));

        dictionary.put("み", new DictionaryEntry(KANA_TYPE.HIRAGANA, "み", "ミ", "mi",
				new DictionaryExample[]{new DictionaryExample("みず", "water", "mizu"), new DictionaryExample("みせ", "shop", "mise"), new DictionaryExample("みどり", "green", "midori")},
                R.raw.mi, new int[]{R.drawable.mi_hiragana}));

        dictionary.put("む", new DictionaryEntry(KANA_TYPE.HIRAGANA, "む", "ム", "mu",
				new DictionaryExample[]{new DictionaryExample("むし", "bug", "mushi"), new DictionaryExample("むらさき", "purple", "murasaki"), new DictionaryExample("むりょう", "free", "muryou")},
                R.raw.mu, new int[]{R.drawable.mu_hiragana}));

        dictionary.put("め", new DictionaryEntry(KANA_TYPE.HIRAGANA, "め", "メ", "me",
				new DictionaryExample[]{new DictionaryExample("め", "eye", "me"), new DictionaryExample("めいし", "noun", "meishi"), new DictionaryExample("めがね", "glasses", "megane")},
                R.raw.me, new int[]{R.drawable.me_hiragana}));

        dictionary.put("も", new DictionaryEntry(KANA_TYPE.HIRAGANA, "も", "モ", "mo",
				new DictionaryExample[]{new DictionaryExample("もっとも", "most", "mottomo"), new DictionaryExample("ものがたり", "tale, story, legend", "monogatari"), new DictionaryExample("もも", "peach", "momo")},
                R.raw.mo, new int[]{R.drawable.mo_hiragana}));

        dictionary.put("や", new DictionaryEntry(KANA_TYPE.HIRAGANA, "や", "ヤ", "ya",
				new DictionaryExample[]{new DictionaryExample("やさい", "vegetable", "yasai"), new DictionaryExample("やきゅう", "baseball", "yakyuu"), new DictionaryExample("やま", "mountain", "yama")},
                R.raw.ya, new int[]{R.drawable.ya_hiragana}));

        dictionary.put("ゆ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ゆ", "ユ", "yu",
				new DictionaryExample[]{new DictionaryExample("ゆうめい", "famous", "yuumei"), new DictionaryExample("ゆび", "finger", "yubi"), new DictionaryExample("ゆめ", "dream", "yume")},
                R.raw.yu, new int[]{R.drawable.yu_hiragana}));

        dictionary.put("よ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "よ", "ヨ", "yo",
				new DictionaryExample[]{new DictionaryExample("よてい", "plans, arrangement, schedule", "yotei"), new DictionaryExample("よむ", "to read", "yomu"), new DictionaryExample("よる", "night", "yoru")},
                R.raw.yo, new int[]{R.drawable.yo_hiragana}));

        dictionary.put("ら", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ら", "ラ", "ra",
				new DictionaryExample[]{new DictionaryExample("らいげつ", "next month", "raigetsu"), new DictionaryExample("らいにち", "arrival in Japan", "rainichi"), new DictionaryExample("らいねん", "next year", "rainen")},
                R.raw.ra, new int[]{R.drawable.ra_hiragana}));

        dictionary.put("り", new DictionaryEntry(KANA_TYPE.HIRAGANA, "り", "リ", "ri",
				new DictionaryExample[]{new DictionaryExample("り", "reason, principle, logic", "ri"), new DictionaryExample("りゆう", "reason", "riyuu"), new DictionaryExample("りんご", "apple", "ringo")},
                R.raw.ri, new int[]{R.drawable.ri_hiragana}));

        dictionary.put("る", new DictionaryEntry(KANA_TYPE.HIRAGANA, "る", "ル", "ru",
				new DictionaryExample[]{new DictionaryExample("るい", "kind, sort, class", "rui"), new DictionaryExample("るいすい", "analogy", "ruisui"), new DictionaryExample("るす", "absence, being away from home", "rusu")},
                R.raw.ru, new int[]{R.drawable.ru_hiragana}));

        dictionary.put("れ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "れ", "レ", "re",
				new DictionaryExample[]{new DictionaryExample("れきし", "history", "rekishi"), new DictionaryExample("れんしゅう", "practice", "renshuu"), new DictionaryExample("れんらく", "to contact", "renraku")},
                R.raw.re, new int[]{R.drawable.re_hiragana}));

        dictionary.put("ろ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ろ", "ロ", "ro",
				new DictionaryExample[]{new DictionaryExample("ろうじん", "old person", "roujin"), new DictionaryExample("ろうどう", "manual labour", "roudou"), new DictionaryExample("ろく", "six", "roku")},
                R.raw.ro, new int[]{R.drawable.ro_hiragana}));

        dictionary.put("わ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "わ", "ワ", "wa",
				new DictionaryExample[]{new DictionaryExample("わかい", "young", "wakai"), new DictionaryExample("わさび", "wasabi", "wasabi"), new DictionaryExample("わたし", "I", "watashi")},
                R.raw.wa, new int[]{R.drawable.wa_hiragana}));

        dictionary.put("を", new DictionaryEntry(KANA_TYPE.HIRAGANA, "を", "ヲ", "(w)o",
				new DictionaryExample[]{new DictionaryExample("たべものをたべる", "to eat food", "tabemono o taberu"), new DictionaryExample("ほんをよむ", "to read a book", "hon o yomu"), new DictionaryExample("みずをのむ", "to drink water", "mizu o nomu")},
                R.raw.wo, new int[]{R.drawable.wo_hiragana}));

        dictionary.put("ん", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ん", "ン", "n",
				new DictionaryExample[]{new DictionaryExample("ん", "yes, yeah, uh huh", "n")},
                R.raw.n, new int[]{R.drawable.n_hiragana}));

        dictionary.put("が", new DictionaryEntry(KANA_TYPE.HIRAGANA, "が", "ガ", "ga",
				new DictionaryExample[]{new DictionaryExample("がいこくじん", "foreigner", "gaikokujin"), new DictionaryExample("がくせい", "student", "gakusei"), new DictionaryExample("がっこう", "school", "gakkou")},
                R.raw.ga, new int[]{R.drawable.ga_hiragana}));

        dictionary.put("ぎ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぎ", "ギ", "gi",
				new DictionaryExample[]{new DictionaryExample("ぎじゅつ", "art, craft, technique, technology", "gijutsu"), new DictionaryExample("ぎん", "silver", "gin"), new DictionaryExample("ぎんこう", "bank", "ginkou")},
                R.raw.gi, new int[]{R.drawable.gi_hiragana}));

        dictionary.put("ぐ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぐ", "グ", "gu",
				new DictionaryExample[]{new DictionaryExample("ぐ", "tool", "gu"), new DictionaryExample("ぐたい", "concrete, tangible, material", "gutai"), new DictionaryExample("ぐん", "army", "gun")},
                R.raw.gu, new int[]{R.drawable.gu_hiragana}));

        dictionary.put("げ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "げ", "ゲ", "ge",
				new DictionaryExample[]{new DictionaryExample("げつようび", "Monday", "getsuyoubi"), new DictionaryExample("げんいん", "cause", "genin"), new DictionaryExample("げんき", "healthy, energy", "genki")},
                R.raw.ge, new int[]{R.drawable.ge_hiragana}));

        dictionary.put("ご", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ご", "ゴ", "go",
				new DictionaryExample[]{new DictionaryExample("ご", "five", "go"), new DictionaryExample("ごご", "afternoon, p.m.", "gogo"), new DictionaryExample("ごぜん", "morning, a.m.", "gozen")},
                R.raw.go, new int[]{R.drawable.go_hiragana}));

        dictionary.put("ざ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ざ", "ザ", "za",
				new DictionaryExample[]{new DictionaryExample("ざいりょう", "ingredients, material", "zairyou"), new DictionaryExample("ざっし", "magazine", "zasshi"), new DictionaryExample("ざんぎょう", "overtime", "zangyou")},
                R.raw.za, new int[]{R.drawable.za_hiragana}));

        dictionary.put("じ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "じ", "ジ", "ji",
				new DictionaryExample[]{new DictionaryExample("じ", "hour, o'clock", "ji"), new DictionaryExample("じしょ", "dictionary", "jisho"), new DictionaryExample("じぶん", "myself, oneself", "jibun")},
                R.raw.ji, new int[]{R.drawable.ji_hiragana}));

        dictionary.put("ず", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ず", "ズ", "zu",
				new DictionaryExample[]{new DictionaryExample("ず", "drawing, picture, diagram", "zu"), new DictionaryExample("ずつう", "headache", "zutsuu"), new DictionaryExample("ずのう", "head, brains intellect", "zunou")},
                R.raw.zu, new int[]{R.drawable.zu_hiragana}));

        dictionary.put("ぜ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぜ", "ゼ", "ze",
				new DictionaryExample[]{new DictionaryExample("ぜんかい", "last time", "zenkai"), new DictionaryExample("ぜんたい", "whole", "zentai"), new DictionaryExample("ぜんぶ", "all", "zenbu")},
                R.raw.ze, new int[]{R.drawable.ze_hiragana}));

        dictionary.put("ぞ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぞ", "ゾ", "zo",
				new DictionaryExample[]{new DictionaryExample("ぞう", "statue, image", "zou"), new DictionaryExample("ぞうか", "increase", "zouka"), new DictionaryExample("ぞくぞく", "successively, one after another", "zokuzoku")},
                R.raw.zo, new int[]{R.drawable.zo_hiragana}));

        dictionary.put("だ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "だ", "ダ", "da",
				new DictionaryExample[]{new DictionaryExample("だいがく", "university", "daigaku"), new DictionaryExample("だいとうりょう", "president", "daitouryou"), new DictionaryExample("だいひょう", "representative", "daihyou")},
                R.raw.da, new int[]{R.drawable.da_hiragana}));

        dictionary.put("ぢ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぢ", "ジ", "ji",
				new DictionaryExample[]{new DictionaryExample("ちぢむ", "to shrink; to contract", "chijimu")},
                R.raw.ji, new int[]{R.drawable.di_hiragana}));

        dictionary.put("づ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "づ", "ヅ", "zu",
				new DictionaryExample[]{new DictionaryExample("つづく", "to continue", "tsuzuku"), new DictionaryExample("づらい", "difficult to (do something)", "zurai"), new DictionaryExample("てづくり", "handmade", "tezukuri")},
                R.raw.zu, new int[]{R.drawable.du_hiragana}));

        dictionary.put("で", new DictionaryEntry(KANA_TYPE.HIRAGANA, "で", "デ", "de",
				new DictionaryExample[]{new DictionaryExample("でんき", "electricity", "denki"), new DictionaryExample("でんしゃ", "train", "densha"), new DictionaryExample("でんわ", "telephone", "denwa")},
                R.raw.de, new int[]{R.drawable.de_hiragana}));

        dictionary.put("ど", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ど", "ド", "do",
				new DictionaryExample[]{new DictionaryExample("どうし", "verb", "doushi"), new DictionaryExample("どうぶつ", "animal", "doubutsu"), new DictionaryExample("どこ", "where", "doko")},
                R.raw.do_, new int[]{R.drawable.do_hiragana}));

        dictionary.put("ば", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ば", "バ", "ba",
				new DictionaryExample[]{new DictionaryExample("ばしょ", "place", "basho"), new DictionaryExample("ばんぐみ", "program", "bangumi"), new DictionaryExample("ばんごう", "number, series of digits", "bangou")},
                R.raw.ba, new int[]{R.drawable.ba_hiragana}));

        dictionary.put("び", new DictionaryEntry(KANA_TYPE.HIRAGANA, "び", "ビ", "bi",
				new DictionaryExample[]{new DictionaryExample("びじゅつ", "art", "bijutsu"), new DictionaryExample("びじゅつかん", "art museum", "bijutsukan"), new DictionaryExample("びじん", "beautiful person (woman)", "bijin")},
                R.raw.bi, new int[]{R.drawable.bi_hiragana}));

        dictionary.put("ぶ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぶ", "ブ", "bu",
				new DictionaryExample[]{new DictionaryExample("ぶ", "department, division", "bu"), new DictionaryExample("ぶた", "pig", "buta"), new DictionaryExample("ぶぶん", "portion, section, part", "bubun")},
                R.raw.bu, new int[]{R.drawable.bu_hiragana}));

        dictionary.put("べ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "べ", "ベ", "be",
				new DictionaryExample[]{new DictionaryExample("べんきょう", "study", "benkyou"), new DictionaryExample("べんごし", "lawyer", "bengoshi"), new DictionaryExample("べんとう", "Japanese box lunch", "bentou")},
                R.raw.be, new int[]{R.drawable.be_hiragana}));

        dictionary.put("ぼ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぼ", "ボ", "bo",
				new DictionaryExample[]{new DictionaryExample("ぼうし", "hat", "boushi"), new DictionaryExample("ぼしゅう", "recruiting", "boshuu"), new DictionaryExample("ぼうりょく", "violence", "bouryoku")},
                R.raw.bo, new int[]{R.drawable.bo_hiragana}));

        dictionary.put("ぱ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぱ", "パ", "pa",
				new DictionaryExample[]{new DictionaryExample("ぱっと", "suddenly", "patto"), new DictionaryExample("ぱちっ", "snapping (e.g. fingers, with a pop", "pachi"), new DictionaryExample("ぱくぱく", "flapping open and closed (e.g. mouth); heartily (eating)", "pakupaku")},
                R.raw.pa, new int[]{R.drawable.pa_hiragana}));

        dictionary.put("ぴ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぴ", "ピ", "pi",
				new DictionaryExample[]{new DictionaryExample("ぴったり", "tightly, closely; exactly, precisely", "pittari"), new DictionaryExample("ぴかぴか", "glitter; sparkle", "pikapika"), new DictionaryExample("ぴんぴん", "lively", "pinpin")},
                R.raw.pi, new int[]{R.drawable.pi_hiragana}));

        dictionary.put("ぷ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぷ", "プ", "pu",
				new DictionaryExample[]{new DictionaryExample("ぷりぷり", "angrily; in a huff", "puripuri"), new DictionaryExample("ぷにぷに", "squishy", "punipuni"), new DictionaryExample("ぷつん", "snap (sound of something being suddenly and irreversibly broken)", "putsun")},
                R.raw.pu, new int[]{R.drawable.pu_hiragana}));

        dictionary.put("ぺ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぺ", "ペ", "pe",
				new DictionaryExample[]{new DictionaryExample("ぺこぺこ", "very hungry", "pekopeko"), new DictionaryExample("ぺちゃくちゃ", "chattering", "pechakucha"), new DictionaryExample("ぺらぺら", "fluent; fluency", "perapera")},
                R.raw.pe, new int[]{R.drawable.pe_hiragana}));

        dictionary.put("ぽ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぽ", "ポ", "po",
				new DictionaryExample[]{new DictionaryExample("ぽかぽか", "warmth throughout your body", "pokapoka"), new DictionaryExample("ぽかん", "vacantly;  blankly;  absentmindedly", "pokan"), new DictionaryExample("ぽたぽた", "dripping water", "potapota")},
                R.raw.po, new int[]{R.drawable.po_hiragana}));

        dictionary.put("きゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "きゃ", "キャ", "kya",
				new DictionaryExample[]{new DictionaryExample("きゃく", "guest, visitor; customer", "kyaku"), new DictionaryExample("きゃくしつ", "guest room", "kyakushitsu"), new DictionaryExample("きゃっかんてき", "objective", "kyakkanteki")},
                R.raw.kya, new int[]{R.drawable.ki_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("きゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "きゅ", "キュ", "kyu",
				new DictionaryExample[]{new DictionaryExample("きゅうりょう", "salary, wages", "kyuuryou"), new DictionaryExample("きゅう", "urgent, sudden, abrupt", "kyuu"), new DictionaryExample("きゅうきゅうしゃ", "ambulance", "kyuukyuusha")},
                R.raw.kyu, new int[]{R.drawable.ki_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("きょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "きょ", "キョ", "kyo",
				new DictionaryExample[]{new DictionaryExample("きょう", "today", "kyou"), new DictionaryExample("きょうかい", "association, society, organisation", "kyoukai"), new DictionaryExample("きょういく", "education", "kyouiku")},
                R.raw.kyo, new int[]{R.drawable.ki_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("しゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "しゃ", "シャ", "sha",
				new DictionaryExample[]{new DictionaryExample("しゃしん", "photograph", "shashin"), new DictionaryExample("しゃいん", "employee", "shain"), new DictionaryExample("しゃかい", "society", "shakai")},
                R.raw.sha, new int[]{R.drawable.shi_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("しゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "しゅ", "シュ", "shu",
				new DictionaryExample[]{new DictionaryExample("しゅ", "kind, variety", "shu"), new DictionaryExample("しゅみ", "hobby", "shumi"), new DictionaryExample("しゅう", "state, county", "shuu")},
                R.raw.shu, new int[]{R.drawable.shi_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("しょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "しょ", "ショ", "sho",
				new DictionaryExample[]{new DictionaryExample("しょうひん", "goods, merchandise", "shouhin"), new DictionaryExample("しょうらい", "future", "shourai"), new DictionaryExample("しょうねん", "boy", "shounen")},
                R.raw.sho, new int[]{R.drawable.shi_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("ちゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ちゃ", "チャ", "cha",
				new DictionaryExample[]{new DictionaryExample("ちゃ", "tea", "cha"), new DictionaryExample("ちゃいろ", "light brown", "chairo"), new DictionaryExample("ちゃわん", "rice bowl", "chawan")},
                R.raw.cha, new int[]{R.drawable.chi_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("ちゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ちゅ", "チュ", "chu",
				new DictionaryExample[]{new DictionaryExample("ちゅうい", "caution", "chuui"), new DictionaryExample("ちゅうおう", "centre, middle", "chuuou"), new DictionaryExample("ちゅうごく", "China", "chuugoku")},
                R.raw.chu, new int[]{R.drawable.chi_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("ちょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ちょ", "チョ", "cho",
				new DictionaryExample[]{new DictionaryExample("ちょくせつ", "direct, immediate", "chokusetsu"), new DictionaryExample("ちょくご", "immediately following", "chokugo"), new DictionaryExample("ちょうせん", "challenge", "chousen")},
                R.raw.cho, new int[]{R.drawable.chi_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("にゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "にゃ", "ニャ", "nya",
				new DictionaryExample[]{new DictionaryExample("にゃん", "meow", "nyan"), new DictionaryExample("にゃんこ", "kitty cat", "nyanko"), new DictionaryExample("にゃくどう", "homosexuality", "nyakudou")},
                R.raw.nya, new int[]{R.drawable.ni_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("にゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "にゅ", "ニュ", "nyu",
				new DictionaryExample[]{new DictionaryExample("にゅういん", "hospitalisation", "nyuuin"), new DictionaryExample("にゅうがく", "entry to school or university", "nyuugaku"), new DictionaryExample("にゅうしゃ", "entry to a company", "nyuusha")},
                R.raw.nyu, new int[]{R.drawable.ni_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("にょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "にょ", "ニョ", "nyo",
				new DictionaryExample[]{new DictionaryExample("にょう", "urine", "nyou"), new DictionaryExample("にょうぼう", "wife", "nyoubou"), new DictionaryExample("にょじつ", "reality", "nyoujitsu")},
                R.raw.nyo, new int[]{R.drawable.ni_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("ひゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ひゃ", "ヒャ", "hya",
				new DictionaryExample[]{new DictionaryExample("ひゃく", "hundred", "hyaku"), new DictionaryExample("ひゃくとおばん", "police emergency telephone number (110)", "hyakutooban"), new DictionaryExample("ひゃくてん", "perfect mark", "hyakuten")},
                R.raw.hya, new int[]{R.drawable.hi_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("ひゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ひゅ", "ヒュ", "hyu",
				new DictionaryExample[]{new DictionaryExample("ひゅー", "(with a) whizzing sound;  sound of something whizzing by", "hyuu"), new DictionaryExample("ひゅうひゅう", "whistling sound;  wheezing sound;  sound of the wind", "hyuuhyuu")},
                R.raw.hyu, new int[]{R.drawable.hi_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("ひょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ひょ", "ヒョ", "hyo",
				new DictionaryExample[]{new DictionaryExample("ひょうか", "valuation", "hyouka"), new DictionaryExample("ひょうげん", "expression", "hyougen"), new DictionaryExample("ひょうばん", "reputation", "hyouban")},
                R.raw.hyo, new int[]{R.drawable.hi_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("みゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "みゃ", "ミャ", "mya",
				new DictionaryExample[]{new DictionaryExample("みゃく", "pulse", "myaku"), new DictionaryExample("みゃくどう", "pulsation;  pulsatory motion", "myakudou"), new DictionaryExample("みゃくらく", "chain of reasoning;  logical connection;  coherence;  context", "myakuraku")},
                R.raw.mya, new int[]{R.drawable.mi_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("みゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "みゅ", "ミュ", "myu",
				new DictionaryExample[]{},
                R.raw.myu, new int[]{R.drawable.mi_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("みょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "みょ", "ミョ", "myo",
				new DictionaryExample[]{new DictionaryExample("みょうじ", "surname", "myoushi"), new DictionaryExample("みょう", "strange, unusual", "myou"), new DictionaryExample("みょうあん", "ingenious idea", "myouan")},
                R.raw.myo, new int[]{R.drawable.mi_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("りゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "りゃ", "リャ", "rya",
				new DictionaryExample[]{new DictionaryExample("りゃくご", "abbreviation; acronym", "ryakugo"), new DictionaryExample("りゃくしょう", "abbreviation", "ryakushou"), new DictionaryExample("りゃくじ", "simplified character", "ryakuji")},
                R.raw.rya, new int[]{R.drawable.ri_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("りゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "りゅ", "リュ", "ryu",
				new DictionaryExample[]{new DictionaryExample("りゅうがく", "studying abroad", "ryuugaku"), new DictionaryExample("りゅうがくせい", "overseas student", "ryuugakusei"), new DictionaryExample("りゅう", "dragon", "riyuu")},
                R.raw.ryu, new int[]{R.drawable.ri_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("りょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "りょ", "リョ", "ryo",
				new DictionaryExample[]{new DictionaryExample("りょこう", "travel; trip", "ryokou"), new DictionaryExample("りょうしん", "parents", "ryoushin"), new DictionaryExample("りょうり", "cooking", "ryouri")},
                R.raw.ryo, new int[]{R.drawable.ri_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("ぎゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぎゃ", "ギャ", "gya",
				new DictionaryExample[]{new DictionaryExample("ぎゃく", "reverse; opposite", "gyaku"), new DictionaryExample("ぎゃくてん", "(sudden) change", "gyakuten"), new DictionaryExample("ぎゃくたい", "abuse", "gyakutai")},
                R.raw.gya, new int[]{R.drawable.gi_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("ぎゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぎゅ", "ギュ", "gyu",
				new DictionaryExample[]{new DictionaryExample("ぎゅうにゅう", "milk", "gyuunyuu"), new DictionaryExample("ぎゅうにく", "beef", "gyuuniku"), new DictionaryExample("ぎゅうどん", "rice covered with beef and vegetables", "gyuudon")},
                R.raw.gyu, new int[]{R.drawable.gi_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("ぎょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぎょ", "ギョ", "gyo",
				new DictionaryExample[]{new DictionaryExample("ぎょうれつ", "line; queue", "gyouretsu"), new DictionaryExample("ぎょぎょう", "fishing industry", "gyogyou"), new DictionaryExample("ぎょうぎ", "manners", "gyougi")},
                R.raw.gyo, new int[]{R.drawable.gi_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("じゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "じゃ", "ジャ", "ja",
				new DictionaryExample[]{new DictionaryExample("じゃがいも", "potato", "jagaimo"), new DictionaryExample("じゃま", "hindrance; obstacle; nuisance", "jama"), new DictionaryExample("じゃくてん", "weakness", "jakuten")},
                R.raw.jya, new int[]{R.drawable.ji_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("じゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "じゅ", "ジュ", "ju",
				new DictionaryExample[]{new DictionaryExample("じゅぎょう", "lesson", "jugyou"), new DictionaryExample("じゅうしょ", "address", "juusho"), new DictionaryExample("じゅうどう", "judo", "juudou")},
                R.raw.jyu, new int[]{R.drawable.ji_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("じょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "じょ", "ジョ", "jo",
				new DictionaryExample[]{new DictionaryExample("じょせい", "woman; female", "josei"), new DictionaryExample("じょうほう", "information; news", "jouhou"), new DictionaryExample("じょうしき", "common sense", "joushiki")},
                R.raw.jyo, new int[]{R.drawable.ji_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("びゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "びゃ", "ビャ", "bya",
				new DictionaryExample[]{new DictionaryExample("びゃくい", "white robe;  (doctor's) white gown", "byakui"), new DictionaryExample("びゃくや", "white night (i.e. at the North or South Pole);  short night;  night under the midnight sun", "byakuya"), new DictionaryExample("びゃくれん", "white lotus", "byakuren")},
                R.raw.bya, new int[]{R.drawable.bi_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("びゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "びゅ", "ビュ", "byu",
				new DictionaryExample[]{new DictionaryExample("びゅうでん", "false report (rumor, rumour)", "byuuden"), new DictionaryExample("びゅうろん", "mistaken opinion", "byuuron"), new DictionaryExample("びゅうせつ", "fallacious argument", "byuusetsu")},
                R.raw.byu, new int[]{R.drawable.bi_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("びょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "びょ", "ビョ", "byo",
				new DictionaryExample[]{new DictionaryExample("びょういん", "hospital", "byouin"), new DictionaryExample("びょうき", "illness", "byouki"), new DictionaryExample("びょう", "second", "byou")},
                R.raw.byo, new int[]{R.drawable.bi_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("ぴゃ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぴゃ", "ピャ", "pya",
				new DictionaryExample[]{},
                R.raw.pya, new int[]{R.drawable.pi_hiragana, R.drawable.ya_hiragana}));

        dictionary.put("ぴゅ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぴゅ", "ピュ", "pyu",
				new DictionaryExample[]{new DictionaryExample("ぴゅぴゅ", "whistling sound;  wheezing sound;  sound of the wind", "pyupyu"), new DictionaryExample("ぴゅう", "swoosh;  whoosh", "pyuu")},
                R.raw.pyu, new int[]{R.drawable.pi_hiragana, R.drawable.yu_hiragana}));

        dictionary.put("ぴょ", new DictionaryEntry(KANA_TYPE.HIRAGANA, "ぴょ", "ピョ", "pyo",
				new DictionaryExample[]{new DictionaryExample("ぴょんぴょん", "hopping;  skipping;  lightly and repeatedly jumping", "pyonpyon"), new DictionaryExample("ぴょこんと", "quickly, in a bouncing way (e.g. for a bow);  action of quickly bowing or lowering one's head", "pyokonto"), new DictionaryExample("ぴょこぴょこ", "up and down;  lightly;  nimbly;  moving in small leaps as a frog or rabbit", "pyokopyoko")},
                R.raw.pyo, new int[]{R.drawable.pi_hiragana, R.drawable.yo_hiragana}));

        dictionary.put("ア", new DictionaryEntry(KANA_TYPE.KATAKANA, "あ", "ア", "a",
				new DictionaryExample[]{new DictionaryExample("アイスクリーム", "ice cream", "aisukuriimu"), new DictionaryExample("アニメ", "animation", "anime"), new DictionaryExample("アルバイト", "part-time job", "arubaito")},
                R.raw.a, new int[]{ R.drawable.a_katakana}));

        dictionary.put("イ", new DictionaryEntry(KANA_TYPE.KATAKANA, "い", "イ", "i",
				new DictionaryExample[]{new DictionaryExample("インチ", "inch", "inchi"), new DictionaryExample("インスタント", "instant", "insutanto"), new DictionaryExample("インターネット", "internet", "intaanetto")},
                R.raw.i, new int[]{ R.drawable.i_katakana}));

        dictionary.put("ウ", new DictionaryEntry(KANA_TYPE.KATAKANA, "う", "ウ", "u",
				new DictionaryExample[]{new DictionaryExample("ウイスキー", "whisky", "uisukii"), new DictionaryExample("ウール", "wool", "uuru"), new DictionaryExample("ウイルス", "virus", "uirusu")},
                R.raw.u, new int[]{ R.drawable.u_katakana}));

        dictionary.put("エ", new DictionaryEntry(KANA_TYPE.KATAKANA, "え", "エ", "e",
				new DictionaryExample[]{new DictionaryExample("エンジニア", "engineer", "enjinia"), new DictionaryExample("エレベーター", "elevator", "erebeetaa"), new DictionaryExample("エスカレーター", "escalator", "esukareetaa")},
                R.raw.e, new int[]{ R.drawable.e_katakana}));

        dictionary.put("オ", new DictionaryEntry(KANA_TYPE.KATAKANA, "お", "オ", "o",
				new DictionaryExample[]{new DictionaryExample("オレンジ", "orange", "orenji"), new DictionaryExample("オートバイ", "motorcycle", "ootobai"), new DictionaryExample("オフィス", "office", "ofisu")},
                R.raw.o, new int[]{ R.drawable.o_katakana}));

        dictionary.put("カ", new DictionaryEntry(KANA_TYPE.KATAKANA, "か", "カ", "ka",
				new DictionaryExample[]{new DictionaryExample("カフェ", "cafe", "kafe"), new DictionaryExample("カメラ", "camera", "kamera"), new DictionaryExample("カラオケ", "karaoke", "karaoke")},
                R.raw.ka, new int[]{ R.drawable.ka_katakana}));

        dictionary.put("キ", new DictionaryEntry(KANA_TYPE.KATAKANA, "き", "キ", "ki",
				new DictionaryExample[]{new DictionaryExample("キロ", "kilo", "kiro"), new DictionaryExample("キッチン", "kitchen", "kicchin"), new DictionaryExample("キラキラ", "glitter;  sparkle;  glisten;  twinkle", "kirakira")},
                R.raw.ki, new int[]{ R.drawable.ki_katakana}));

        dictionary.put("ク", new DictionaryEntry(KANA_TYPE.KATAKANA, "く", "ク", "ku",
				new DictionaryExample[]{new DictionaryExample("クッキー", "cookie", "kukii"), new DictionaryExample("クラス", "class", "kurasu"), new DictionaryExample("クリスマス", "Christmas", "kurisumasu")},
                R.raw.ku, new int[]{ R.drawable.ku_katakana}));

        dictionary.put("ケ", new DictionaryEntry(KANA_TYPE.KATAKANA, "け", "ケ", "ke",
				new DictionaryExample[]{new DictionaryExample("ケーキ", "cake", "keeki"), new DictionaryExample("ケーブル", "cable", "keeburu"), new DictionaryExample("ケース", "case (condition, event, legal action etc.)", "keesu")},
                R.raw.ke, new int[]{ R.drawable.ke_katakana}));

        dictionary.put("コ", new DictionaryEntry(KANA_TYPE.KATAKANA, "こ", "コ", "ko",
				new DictionaryExample[]{new DictionaryExample("コーヒー", "coffee", "koohii"), new DictionaryExample("コンビニ", "convenience store", "konbini"), new DictionaryExample("コート", "coat", "kooto")},
                R.raw.ko, new int[]{ R.drawable.ko_katakana}));

        dictionary.put("サ", new DictionaryEntry(KANA_TYPE.KATAKANA, "さ", "サ", "sa",
				new DictionaryExample[]{new DictionaryExample("サラダ", "salad", "sarada"), new DictionaryExample("サンドイッチ", "sandwich", "sandoicchi"), new DictionaryExample("サッカー", "soccer", "sakkaa")},
                R.raw.sa, new int[]{ R.drawable.sa_katakana}));

        dictionary.put("シ", new DictionaryEntry(KANA_TYPE.KATAKANA, "し", "シ", "shi",
				new DictionaryExample[]{new DictionaryExample("シリーズ", "series", "shiriizu"), new DictionaryExample("シーツ", "sheet", "shiitsu"), new DictionaryExample("シール", "sticker", "shiiru")},
                R.raw.shi, new int[]{ R.drawable.shi_katakana}));

        dictionary.put("ス", new DictionaryEntry(KANA_TYPE.KATAKANA, "す", "ス", "su",
				new DictionaryExample[]{new DictionaryExample("スポーツ", "sports", "supootsu"), new DictionaryExample("スーパーマーケット", "supermarket", "suupaamaaketto"), new DictionaryExample("スープ", "soup", "suupu")},
                R.raw.su, new int[]{ R.drawable.su_katakana}));

        dictionary.put("セ", new DictionaryEntry(KANA_TYPE.KATAKANA, "せ", "セ", "se",
				new DictionaryExample[]{new DictionaryExample("セーター", "sweater", "seetaa"), new DictionaryExample("セール", "sale", "seeru"), new DictionaryExample("センチ", "centimetre", "senchi")},
                R.raw.se, new int[]{ R.drawable.se_katakana}));

        dictionary.put("ソ", new DictionaryEntry(KANA_TYPE.KATAKANA, "そ", "ソ", "so",
				new DictionaryExample[]{new DictionaryExample("ソファ", "sofa", "sofa"), new DictionaryExample("ソース", "sauce", "soosu"), new DictionaryExample("ソフト", "soft", "sofuto")},
                R.raw.so, new int[]{ R.drawable.so_katakana}));

        dictionary.put("タ", new DictionaryEntry(KANA_TYPE.KATAKANA, "た", "タ", "ta",
				new DictionaryExample[]{new DictionaryExample("タクシー", "taxi", "takushii"), new DictionaryExample("タオル", "towel", "taoru"), new DictionaryExample("タイマー", "timer", "taimaa")},
                R.raw.ta, new int[]{ R.drawable.ta_katakana}));

        dictionary.put("チ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ち", "チ", "chi",
				new DictionaryExample[]{new DictionaryExample("チーム", "team", "chiimu"), new DictionaryExample("チーズ", "cheese", "chiizu"), new DictionaryExample("チップ", "gratuity, tip", "chippu")},
                R.raw.chi, new int[]{ R.drawable.chi_katakana}));

        dictionary.put("ツ", new DictionaryEntry(KANA_TYPE.KATAKANA, "つ", "ツ", "tsu",
				new DictionaryExample[]{new DictionaryExample("ツアー", "tour", "tsuaa"), new DictionaryExample("ツール", "tool (esp. software)", "tsuuru"), new DictionaryExample("ツイン", "twin", "tsuin")},
                R.raw.tsu, new int[]{ R.drawable.tsu_katakana}));

        dictionary.put("テ", new DictionaryEntry(KANA_TYPE.KATAKANA, "て", "テ", "te",
				new DictionaryExample[]{new DictionaryExample("テニス", "tennis", "tenisu"), new DictionaryExample("テレビ", "television", "terebi"), new DictionaryExample("テーブル", "table", "teeburu")},
                R.raw.te, new int[]{ R.drawable.te_katakana}));

        dictionary.put("ト", new DictionaryEntry(KANA_TYPE.KATAKANA, "と", "ト", "to",
				new DictionaryExample[]{new DictionaryExample("トイレ", "toilet", "toire"), new DictionaryExample("トマト", "tomato", "tomato"), new DictionaryExample("トランプ", "playing cards", "toranpu")},
                R.raw.to, new int[]{ R.drawable.to_katakana}));

        dictionary.put("ナ", new DictionaryEntry(KANA_TYPE.KATAKANA, "な", "ナ", "na",
				new DictionaryExample[]{new DictionaryExample("ナイフ", "knife", "naifu"), new DictionaryExample("ナンバー", "number", "nanbaa"), new DictionaryExample("ナイロン", "nylon", "nairon")},
                R.raw.na, new int[]{ R.drawable.na_katakana}));

        dictionary.put("ニ", new DictionaryEntry(KANA_TYPE.KATAKANA, "に", "ニ", "ni",
				new DictionaryExample[]{new DictionaryExample("ニコニコ", "smilingly", "nikoniko"), new DictionaryExample("ニックネーム", "nickname", "nikkuneemu"), new DictionaryExample("ニッケル", "nickel", "nikkeru")},
                R.raw.ni, new int[]{ R.drawable.ni_katakana}));

        dictionary.put("ヌ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぬ", "ヌ", "nu",
				new DictionaryExample[]{new DictionaryExample("ヌルヌル", "slimy; slippery", "nurunuru"), new DictionaryExample("ヌード", "nude", "nuudo"), new DictionaryExample("ヌーベル", "nouvelle", "nuuberu")},
                R.raw.nu, new int[]{ R.drawable.nu_katakana}));

        dictionary.put("ネ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ね", "ネ", "ne",
				new DictionaryExample[]{new DictionaryExample("ネクタイ", "tie", "nekutai"), new DictionaryExample("ネックレス", "necklace", "nekkuresu"), new DictionaryExample("ネットワーク", "network", "nettowaaku")},
                R.raw.ne, new int[]{ R.drawable.ne_katakana}));

        dictionary.put("ノ", new DictionaryEntry(KANA_TYPE.KATAKANA, "の", "ノ", "no",
				new DictionaryExample[]{new DictionaryExample("ノート", "notebook", "nooto"), new DictionaryExample("ノック", "knock", "nokku"), new DictionaryExample("ノンフィクション", "non-fiction", "nonfikushon")},
                R.raw.no, new int[]{ R.drawable.no_katakana}));

        dictionary.put("ハ", new DictionaryEntry(KANA_TYPE.KATAKANA, "は", "ハ", "ha",
				new DictionaryExample[]{new DictionaryExample("ハンバーガー", "hamburger", "hanbaagaa"), new DictionaryExample("ハンカチ", "handkerchief", "hankachi"), new DictionaryExample("ハイキング", "hiking", "haikingu")},
                R.raw.ha, new int[]{ R.drawable.ha_katakana}));

        dictionary.put("ヒ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ひ", "ヒ", "hi",
				new DictionaryExample[]{new DictionaryExample("ヒント", "hint", "hinto"), new DictionaryExample("ヒーロー", "hero", "heeroo"), new DictionaryExample("ヒット", "hit", "hitto")},
                R.raw.hi, new int[]{ R.drawable.hi_katakana}));

        dictionary.put("フ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ふ", "フ", "fu",
				new DictionaryExample[]{new DictionaryExample("フライドポテト", "french fries", "furaipoteto"), new DictionaryExample("フライパン", "frying pan", "furaipan"), new DictionaryExample("フロント", "front", "furonto")},
                R.raw.fu, new int[]{ R.drawable.fu_katakana}));

        dictionary.put("ヘ", new DictionaryEntry(KANA_TYPE.KATAKANA, "へ", "ヘ", "he",
				new DictionaryExample[]{new DictionaryExample("ヘリコプター", "helicopter", "herikoputaa"), new DictionaryExample("ヘルメット", "helmet", "herumetto"), new DictionaryExample("ヘッドホン", "headphone", "heddohon")},
                R.raw.he, new int[]{ R.drawable.he_katakana}));

        dictionary.put("ホ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ほ", "ホ", "ho",
				new DictionaryExample[]{new DictionaryExample("ホテル", "hotel", "hoteru"), new DictionaryExample("ホーム", "platform", "hoomu"), new DictionaryExample("ホッチキス", "stapler", "hocchikisu")},
                R.raw.ho, new int[]{ R.drawable.ho_katakana}));

        dictionary.put("マ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ま", "マ", "ma",
				new DictionaryExample[]{new DictionaryExample("マンション", "apartment", "manshon"), new DictionaryExample("マラソン", "marathon", "marason"), new DictionaryExample("マスター", "to master; to learn", "masutaa")},
                R.raw.ma, new int[]{ R.drawable.ma_katakana}));

        dictionary.put("ミ", new DictionaryEntry(KANA_TYPE.KATAKANA, "み", "ミ", "mi",
				new DictionaryExample[]{new DictionaryExample("ミルク", "milk", "miruku"), new DictionaryExample("ミス", "mistake; error; failure", "misu"), new DictionaryExample("ミニスカート", "mini-skirt", "minisukaato")},
                R.raw.mi, new int[]{ R.drawable.mi_katakana}));

        dictionary.put("ム", new DictionaryEntry(KANA_TYPE.KATAKANA, "む", "ム", "mu",
				new DictionaryExample[]{new DictionaryExample("ムービー", "movie", "muubii"), new DictionaryExample("ムード", "mood", "muudo"), new DictionaryExample("ムスリム", "Muslim", "musurimu")},
                R.raw.mu, new int[]{ R.drawable.mu_katakana}));

        dictionary.put("メ", new DictionaryEntry(KANA_TYPE.KATAKANA, "め", "メ", "me",
				new DictionaryExample[]{new DictionaryExample("メモ", "memo", "memo"), new DictionaryExample("メートル", "metre", "meetoru"), new DictionaryExample("メーカー", "manufacturer", "meekaa")},
                R.raw.me, new int[]{ R.drawable.me_katakana}));

        dictionary.put("モ", new DictionaryEntry(KANA_TYPE.KATAKANA, "も", "モ", "mo",
				new DictionaryExample[]{new DictionaryExample("モデル", "model", "moderu"), new DictionaryExample("モニター", "(computer) monitor", "monitaa"), new DictionaryExample("モダン", "modern", "modan")},
                R.raw.mo, new int[]{ R.drawable.mo_katakana}));

        dictionary.put("ヤ", new DictionaryEntry(KANA_TYPE.KATAKANA, "や", "ヤ", "ya",
				new DictionaryExample[]{new DictionaryExample("ヤング", "young", "yangu"), new DictionaryExample("ヤフオク", "Yahoo auctions", "yahuoke"), new DictionaryExample("ヤード", "yard (unit of distance)", "yaado")},
                R.raw.ya, new int[]{ R.drawable.ya_katakana}));

        dictionary.put("ユ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ゆ", "ユ", "yu",
				new DictionaryExample[]{new DictionaryExample("ユーモア", "humour", "yuumoa"), new DictionaryExample("ユニーク", "unique", "yuniiku"), new DictionaryExample("ユニフォーム", "uniform", "yunifoomu")},
                R.raw.yu, new int[]{ R.drawable.yu_katakana}));

        dictionary.put("ヨ", new DictionaryEntry(KANA_TYPE.KATAKANA, "よ", "ヨ", "yo",
				new DictionaryExample[]{new DictionaryExample("ヨーグルト", "yoghurt", "yooguruto"), new DictionaryExample("ヨーロッパ", "Europe", "yooroppa"), new DictionaryExample("ヨーロッパ人", "European", "yooropajin")},
                R.raw.yo, new int[]{ R.drawable.yo_katakana}));

        dictionary.put("ラ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ら", "ラ", "ra",
				new DictionaryExample[]{new DictionaryExample("ラジオ", "radio", "rajio"), new DictionaryExample("ライター", "lighter", "raitaa"), new DictionaryExample("ランニング", "running", "ranningu")},
                R.raw.ra, new int[]{ R.drawable.ra_katakana}));

        dictionary.put("リ", new DictionaryEntry(KANA_TYPE.KATAKANA, "り", "リ", "ri",
				new DictionaryExample[]{new DictionaryExample("リットル", "litre", "rittoru"), new DictionaryExample("リズム", "rhythm", "rizumu"), new DictionaryExample("リスト", "list", "risuto")},
                R.raw.ri, new int[]{ R.drawable.ri_katakana}));

        dictionary.put("ル", new DictionaryEntry(KANA_TYPE.KATAKANA, "る", "ル", "ru",
				new DictionaryExample[]{new DictionaryExample("ルール", "rule", "ruuru"), new DictionaryExample("ルックス", "looks", "rukkusu"), new DictionaryExample("ルビー", "Ruby", "rubii")},
                R.raw.ru, new int[]{ R.drawable.ru_katakana}));

        dictionary.put("レ", new DictionaryEntry(KANA_TYPE.KATAKANA, "れ", "レ", "re",
				new DictionaryExample[]{new DictionaryExample("レストラン", "restaurant", "resutoran"), new DictionaryExample("レンズ", "lens", "renzu"), new DictionaryExample("レース", "race", "reesu")},
                R.raw.re, new int[]{ R.drawable.re_katakana}));

        dictionary.put("ロ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ろ", "ロ", "ro",
				new DictionaryExample[]{new DictionaryExample("ローマじ", "roman characters", "roomaji"), new DictionaryExample("ロシア", "Russia", "roshia"), new DictionaryExample("ロケット", "rocket", "rokketo")},
                R.raw.ro, new int[]{ R.drawable.ro_katakana}));

        dictionary.put("ワ", new DictionaryEntry(KANA_TYPE.KATAKANA, "わ", "ワ", "wa",
				new DictionaryExample[]{new DictionaryExample("ワイン", "wine", "wain"), new DictionaryExample("ワープロ", "word processor", "waapuro"), new DictionaryExample("ワット", "watt", "watto")},
                R.raw.wa, new int[]{ R.drawable.wa_katakana}));

        dictionary.put("ヲ", new DictionaryEntry(KANA_TYPE.KATAKANA, "を", "ヲ", "(w)o",
				new DictionaryExample[]{},
                R.raw.wo, new int[]{ R.drawable.wo_katakana}));

        dictionary.put("ン", new DictionaryEntry(KANA_TYPE.KATAKANA, "ん", "ン", "n",
				new DictionaryExample[]{},
                R.raw.n, new int[]{ R.drawable.n_katakana}));

        dictionary.put("ガ", new DictionaryEntry(KANA_TYPE.KATAKANA, "が", "ガ", "ga",
				new DictionaryExample[]{new DictionaryExample("ガソリン", "gasoline", "gasorin"), new DictionaryExample("ガソリンスタンド", "gas station", "gasorinsutando"), new DictionaryExample("ガム", "chewing gum", "gamu")},
                R.raw.ga, new int[]{ R.drawable.ga_katakana}));

        dictionary.put("ギ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぎ", "ギ", "gi",
				new DictionaryExample[]{new DictionaryExample("ギター", "guitar", "gitaa"), new DictionaryExample("ギタリスト", "guitarist", "gitarisuto"), new DictionaryExample("ギア", "gear", "gia")},
                R.raw.gi, new int[]{ R.drawable.gi_katakana}));

        dictionary.put("グ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぐ", "グ", "gu",
				new DictionaryExample[]{new DictionaryExample("グラム", "gram", "guramu"), new DictionaryExample("グループ", "group", "guruupu"), new DictionaryExample("グランド", "grand", "gurando")},
                R.raw.gu, new int[]{ R.drawable.gu_katakana}));

        dictionary.put("ゲ", new DictionaryEntry(KANA_TYPE.KATAKANA, "げ", "ゲ", "ge",
				new DictionaryExample[]{new DictionaryExample("ゲーム", "(video) game", "geemu"), new DictionaryExample("ゲスト", "guest", "gesuto"), new DictionaryExample("ゲート", "gate", "geeto")},
                R.raw.ge, new int[]{ R.drawable.ge_katakana}));

        dictionary.put("ゴ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ご", "ゴ", "go",
				new DictionaryExample[]{new DictionaryExample("ゴルフ", "golf", "gorufu"), new DictionaryExample("ゴール", "goal", "gooru"), new DictionaryExample("ゴーグル", "goggles", "googuru")},
                R.raw.go, new int[]{ R.drawable.go_katakana}));

        dictionary.put("ザ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ざ", "ザ", "za",
				new DictionaryExample[]{new DictionaryExample("ザンビア", "Zambia", "zanbia"), new DictionaryExample("ザーザー", "heavy rainfall", "zaazaa"), new DictionaryExample("ザッツオーケー", "that's OK", "zattsuookee")},
                R.raw.za, new int[]{ R.drawable.za_katakana}));

        dictionary.put("ジ", new DictionaryEntry(KANA_TYPE.KATAKANA, "じ", "ジ", "ji",
				new DictionaryExample[]{new DictionaryExample("ジーンズ", "jeans", "jiinzu"), new DictionaryExample("ジム", "gym", "jimu")},
                R.raw.ji, new int[]{ R.drawable.ji_katakana}));

        dictionary.put("ズ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ず", "ズ", "zu",
				new DictionaryExample[]{new DictionaryExample("ズボン", "trousers", "zubon"), new DictionaryExample("ズーム", "zoom", "zuumu"), },
                R.raw.zu, new int[]{ R.drawable.zu_katakana}));

        dictionary.put("ゼ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぜ", "ゼ", "ze",
				new DictionaryExample[]{new DictionaryExample("ゼミ", "seminar", "zemi"), new DictionaryExample("ゼロックス", "Xerox", "zerokkusu"), },
                R.raw.ze, new int[]{ R.drawable.ze_katakana}));

        dictionary.put("ゾ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぞ", "ゾ", "zo",
				new DictionaryExample[]{new DictionaryExample("ゾンビ", "zombie", "zonbi"), new DictionaryExample("ゾーン", "zone", "zoon"), },
                R.raw.zo, new int[]{ R.drawable.zo_katakana}));

        dictionary.put("ダ", new DictionaryEntry(KANA_TYPE.KATAKANA, "だ", "ダ", "da",
				new DictionaryExample[]{new DictionaryExample("ダンス", "dance", "dansu"), new DictionaryExample("ダイヤモンド", "diamond", "daiyamondo"), new DictionaryExample("ダウンロード", "download", "daunroodo")},
                R.raw.da, new int[]{ R.drawable.da_katakana}));

        dictionary.put("ヂ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぢ", "ヂ", "ji",
				new DictionaryExample[]{},
                R.raw.ji, new int[]{ R.drawable.di_katakana}));

        dictionary.put("ヅ", new DictionaryEntry(KANA_TYPE.KATAKANA, "づ", "ヅ", "zu",
				new DictionaryExample[]{new DictionaryExample("ヅラ", "wig", "zura"), new DictionaryExample("ヅアルうんてん", "dual drive", "zuaruunten")},
                R.raw.zu, new int[]{ R.drawable.du_katakana}));

        dictionary.put("デ", new DictionaryEntry(KANA_TYPE.KATAKANA, "で", "デ", "de",
				new DictionaryExample[]{new DictionaryExample("デパート", "department store", "depaato"), new DictionaryExample("デート", "date", "deeto"), new DictionaryExample("デザート", "dessert", "dezaato")},
                R.raw.de, new int[]{ R.drawable.de_katakana}));

        dictionary.put("ド", new DictionaryEntry(KANA_TYPE.KATAKANA, "ど", "ド", "do",
				new DictionaryExample[]{new DictionaryExample("ドア", "door", "doa"), new DictionaryExample("ドーナツ", "doughnut", "doonatsu"), new DictionaryExample("ドレス", "dress", "doresu")},
                R.raw.do_, new int[]{ R.drawable.do_katakana}));

        dictionary.put("バ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ば", "バ", "ba",
				new DictionaryExample[]{new DictionaryExample("バス", "bus", "basu"), new DictionaryExample("バナナ", "banana", "banana"), new DictionaryExample("バスケットボール", "basketball", "basukettobooru")},
                R.raw.ba, new int[]{ R.drawable.ba_katakana}));

        dictionary.put("ビ", new DictionaryEntry(KANA_TYPE.KATAKANA, "び", "ビ", "bi",
				new DictionaryExample[]{new DictionaryExample("ビール", "beer", "biiru"), new DictionaryExample("ビル", "multi-floor building", "biru"), new DictionaryExample("ビタミン", "vitamin", "bitamin")},
                R.raw.bi, new int[]{ R.drawable.bi_katakana}));

        dictionary.put("ブ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぶ", "ブ", "bu",
				new DictionaryExample[]{new DictionaryExample("ブーム", "boom", "buumu"), new DictionaryExample("ブレーキ", "brake", "bureeki"), new DictionaryExample("ブラシ", "brush", "burashi")},
                R.raw.bu, new int[]{ R.drawable.bu_katakana}));

        dictionary.put("ベ", new DictionaryEntry(KANA_TYPE.KATAKANA, "べ", "ベ", "be",
				new DictionaryExample[]{new DictionaryExample("ベッド", "bed", "beddo"), new DictionaryExample("ベーカリー", "bakery", "beekarii"), new DictionaryExample("ベスト", "best", "besuto")},
                R.raw.be, new int[]{ R.drawable.be_katakana}));

        dictionary.put("ボ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぼ", "ボ", "bo",
				new DictionaryExample[]{new DictionaryExample("ボール", "ball", "booru"), new DictionaryExample("ボーイ", "boy", "booi"), new DictionaryExample("ボート", "boat", "booto")},
                R.raw.bo, new int[]{ R.drawable.bo_katakana}));

        dictionary.put("パ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぱ", "パ", "pa",
				new DictionaryExample[]{new DictionaryExample("パン", "bread", "pan"), new DictionaryExample("パーティー", "party", "paatii"), new DictionaryExample("パソコン", "personal computer", "pasokon")},
                R.raw.pa, new int[]{ R.drawable.pa_katakana}));

        dictionary.put("ピ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぴ", "ピ", "pi",
				new DictionaryExample[]{new DictionaryExample("ピンク", "pink", "pinku"), new DictionaryExample("ピザ", "pizza", "piza"), new DictionaryExample("ピアノ", "piano", "piano")},
                R.raw.pi, new int[]{ R.drawable.pi_katakana}));

        dictionary.put("プ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぷ", "プ", "pu",
				new DictionaryExample[]{new DictionaryExample("プール", "pool", "puuru"), new DictionaryExample("プレゼント", "present", "purezento"), new DictionaryExample("プロ", "professional", "puro")},
                R.raw.pu, new int[]{ R.drawable.pu_katakana}));

        dictionary.put("ペ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぺ", "ペ", "pe",
				new DictionaryExample[]{new DictionaryExample("ペン", "pen", "pen"), new DictionaryExample("ペット", "pet", "petto"), new DictionaryExample("ペンキ", "paint", "penki")},
                R.raw.pe, new int[]{ R.drawable.pe_katakana}));

        dictionary.put("ポ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぽ", "ポ", "po",
				new DictionaryExample[]{new DictionaryExample("ポスト", "post", "posuto"), new DictionaryExample("ポケット", "pocket", "pokketo"), new DictionaryExample("ポスター", "poster", "posutaa")},
                R.raw.po, new int[]{ R.drawable.po_katakana}));

        dictionary.put("キャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "きゃ", "キャ", "kya",
				new DictionaryExample[]{new DictionaryExample("キャンプ", "camp", "kyanpu"), new DictionaryExample("キャプテン", "captain", "kyaputen"), new DictionaryExample("キャリア", "career", "kyaria")},
                R.raw.kya, new int[]{ R.drawable.ki_katakana, R.drawable.ya_katakana}));

        dictionary.put("キュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "きゅ", "キュ", "kyu",
				new DictionaryExample[]{new DictionaryExample("キュート", "cute", "kyuuto"), new DictionaryExample("キューピッド", "Cupid", "kyuupiddo"), new DictionaryExample("キュー", "queue; cue", "kyuu")},
                R.raw.kyu, new int[]{ R.drawable.ki_katakana, R.drawable.yu_katakana}));

        dictionary.put("キョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "きょ", "キョ", "kyo",
				new DictionaryExample[]{},
                R.raw.kyo, new int[]{ R.drawable.ki_katakana, R.drawable.yo_katakana}));

        dictionary.put("シャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "しゃ", "シャ", "sha",
				new DictionaryExample[]{new DictionaryExample("シャワー", "shower", "shawaa"), new DictionaryExample("シャツ", "shirt", "shatsu"), new DictionaryExample("シャンプー", "shampoo", "shanpuu")},
                R.raw.sha, new int[]{ R.drawable.shi_katakana, R.drawable.ya_katakana}));

        dictionary.put("シュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "しゅ", "シュ", "shu",
				new DictionaryExample[]{new DictionaryExample("シュークリーム", "cream puff", "shuukuriimu"), new DictionaryExample("シュート", "shoot", "shuuto"), new DictionaryExample("シューズ", "shoes", "shuuzu")},
                R.raw.shu, new int[]{ R.drawable.shi_katakana, R.drawable.yu_katakana}));

        dictionary.put("ショ", new DictionaryEntry(KANA_TYPE.KATAKANA, "しょ", "ショ", "sho",
				new DictionaryExample[]{new DictionaryExample("ショップ", "shop", "shoppu"), new DictionaryExample("ショー", "show", "shoo"), new DictionaryExample("ショック", "shock", "shokku")},
                R.raw.sho, new int[]{ R.drawable.shi_katakana, R.drawable.yo_katakana}));

        dictionary.put("チャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ちゃ", "チャ", "cha",
				new DictionaryExample[]{new DictionaryExample("チャンス", "chance; opportunity", "chansu"), new DictionaryExample("チャイム", "chime", "chaimu"), new DictionaryExample("チャネル", "channel", "chaneru")},
                R.raw.cha, new int[]{ R.drawable.chi_katakana, R.drawable.ya_katakana}));

        dictionary.put("チュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ちゅ", "チュ", "chu",
				new DictionaryExample[]{new DictionaryExample("チューリップ", "tulip", "chuurippu"), new DictionaryExample("チューブ", "tube", "chuubu"), new DictionaryExample("チュートリアル", "tutorial", "chuutoriaru")},
                R.raw.chu, new int[]{ R.drawable.chi_katakana, R.drawable.yu_katakana}));

        dictionary.put("チョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ちょ", "チョ", "cho",
				new DictionaryExample[]{new DictionaryExample("チョコレート", "chocolate", "chokoreeto"), new DictionaryExample("チョコレートケーキ", "chocolate cake", "chokoreetokeeki"), new DictionaryExample("チョーク", "chalk", "chooku")},
                R.raw.cho, new int[]{ R.drawable.chi_katakana, R.drawable.yo_katakana}));

        dictionary.put("ニャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "にゃ", "ニャ", "nya",
				new DictionaryExample[]{},
                R.raw.nya, new int[]{ R.drawable.ni_katakana, R.drawable.ya_katakana}));

        dictionary.put("ニュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "にゅ", "ニュ", "nyu",
				new DictionaryExample[]{new DictionaryExample("ニュー", "new", "nyuu"), new DictionaryExample("ニュース", "news", "nyuusu"), new DictionaryExample("ニュアンス", "nuance", "nyuuansu")},
                R.raw.nyu, new int[]{ R.drawable.ni_katakana, R.drawable.yu_katakana}));

        dictionary.put("ニョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "にょ", "ニョ", "nyo",
				new DictionaryExample[]{new DictionaryExample("ニョッキ", "gnocchi", "nyokki")},
                R.raw.nyo, new int[]{ R.drawable.ni_katakana, R.drawable.yo_katakana}));

        dictionary.put("ヒャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ひゃ", "ヒャ", "hya",
				new DictionaryExample[]{},
                R.raw.hya, new int[]{ R.drawable.hi_katakana, R.drawable.ya_katakana}));

        dictionary.put("ヒュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ひゅ", "ヒュ", "hyu",
				new DictionaryExample[]{new DictionaryExample("ヒューズ", "fuse", "fyuuzu"), new DictionaryExample("ヒューストン", "Houston", "hyuusuton"), new DictionaryExample("ヒューマン", "human", "hyuuman")},
                R.raw.hyu, new int[]{ R.drawable.hi_katakana, R.drawable.yu_katakana}));

        dictionary.put("ヒョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ひょ", "ヒョ", "hyo",
				new DictionaryExample[]{new DictionaryExample("ヒョウがら", "leopard print (design)", "hyougara")},
                R.raw.hyo, new int[]{ R.drawable.hi_katakana, R.drawable.yo_katakana}));

        dictionary.put("ミャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "みゃ", "ミャ", "mya",
				new DictionaryExample[]{new DictionaryExample("ミャンマー", "Myanmar", "myanmaa")},
                R.raw.mya, new int[]{ R.drawable.mi_katakana, R.drawable.ya_katakana}));

        dictionary.put("ミュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "みゅ", "ミュ", "myu",
				new DictionaryExample[]{new DictionaryExample("ミュージック", "music", "myuujikku"), new DictionaryExample("ミュージカル", "musical", "myuujikaru"), new DictionaryExample("ミュージシャン", "musician", "myuujishan")},
                R.raw.myu, new int[]{ R.drawable.mi_katakana, R.drawable.yu_katakana}));

        dictionary.put("ミョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "みょ", "ミョ", "myo",
				new DictionaryExample[]{},
                R.raw.myo, new int[]{ R.drawable.mi_katakana, R.drawable.yo_katakana}));

        dictionary.put("リャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "りゃ", "リャ", "rya",
				new DictionaryExample[]{},
                R.raw.rya, new int[]{ R.drawable.ri_katakana, R.drawable.ya_katakana}));

        dictionary.put("リュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "りゅ", "リュ", "ryu",
				new DictionaryExample[]{new DictionaryExample("リュックサック", "rucksack", "ryukkusakku"), new DictionaryExample("リュック", "rucksack", "ryukku"), new DictionaryExample("リュート", "lute", "ryuuto")},
                R.raw.ryu, new int[]{ R.drawable.ri_katakana, R.drawable.yu_katakana}));

        dictionary.put("リョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "りょ", "リョ", "ryo",
				new DictionaryExample[]{},
                R.raw.ryo, new int[]{ R.drawable.ri_katakana, R.drawable.yo_katakana}));

        dictionary.put("ギャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぎゃ", "ギャ", "gya",
				new DictionaryExample[]{new DictionaryExample("ギャラリー", "gallery", "gyararii"), new DictionaryExample("ギャンブル", "gambling", "gyanburu"), new DictionaryExample("ギャング", "gang", "gyangu")},
                R.raw.gya, new int[]{ R.drawable.gi_katakana, R.drawable.ya_katakana}));

        dictionary.put("ギュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぎゅ", "ギュ", "gyu",
				new DictionaryExample[]{},
                R.raw.gyu, new int[]{ R.drawable.gi_katakana, R.drawable.yu_katakana}));

        dictionary.put("ギョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぎょ", "ギョ", "gyo",
				new DictionaryExample[]{},
                R.raw.gyo, new int[]{ R.drawable.gi_katakana, R.drawable.yo_katakana}));

        dictionary.put("ジャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "じゃ", "ジャ", "ja",
				new DictionaryExample[]{new DictionaryExample("ジャム", "jam", "jamu"), new DictionaryExample("ジャーナリスト", "journalist", "jaanarisuto"), new DictionaryExample("ジャズ", "jazz", "jazu")},
                R.raw.jya, new int[]{ R.drawable.ji_katakana, R.drawable.ya_katakana}));

        dictionary.put("ジュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "じゅ", "ジュ", "ju",
				new DictionaryExample[]{new DictionaryExample("ジュース", "juice", "juusu"), new DictionaryExample("ジュール", "joule", "juuru"), new DictionaryExample("ジュピター", "Jupiter", "jupitaa")},
                R.raw.jyu, new int[]{ R.drawable.ji_katakana, R.drawable.yu_katakana}));

        dictionary.put("ジョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "じょ", "ジョ", "jo",
				new DictionaryExample[]{new DictionaryExample("ジョギング", "jogging", "jogingu"), new DictionaryExample("ジョーク", "joke", "jooku"), new DictionaryExample("ジョイ", "joy", "joi")},
                R.raw.jyo, new int[]{ R.drawable.ji_katakana, R.drawable.yo_katakana}));

        dictionary.put("ビャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "びゃ", "ビャ", "bya",
				new DictionaryExample[]{},
                R.raw.bya, new int[]{ R.drawable.bi_katakana, R.drawable.ya_katakana}));

        dictionary.put("ビュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "びゅ", "ビュ", "byu",
				new DictionaryExample[]{new DictionaryExample("ビュッフェ", "buffet", "byuffe"), new DictionaryExample("ビューロー", "bureau", "byuuroo"), new DictionaryExample("ビュー", "view", "byuu")},
                R.raw.byu, new int[]{ R.drawable.bi_katakana, R.drawable.yu_katakana}));

        dictionary.put("ビョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "びょ", "ビョ", "byo",
				new DictionaryExample[]{},
                R.raw.byo, new int[]{ R.drawable.bi_katakana, R.drawable.yo_katakana}));

        dictionary.put("ピャ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぴゃ", "ピャ", "pya",
				new DictionaryExample[]{},
                R.raw.pya, new int[]{ R.drawable.pi_katakana, R.drawable.ya_katakana}));

        dictionary.put("ピュ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぴゅ", "ピュ", "pyu",
				new DictionaryExample[]{new DictionaryExample("ピュア", "pure", "pyua"), new DictionaryExample("ピューター", "pewter", "pyuutaa"), new DictionaryExample("ピューレ", "puree", "pyuure")},
                R.raw.pyu, new int[]{ R.drawable.pi_katakana, R.drawable.yu_katakana}));

        dictionary.put("ピョ", new DictionaryEntry(KANA_TYPE.KATAKANA, "ぴょ", "ピョ", "pyo",
				new DictionaryExample[]{},
                R.raw.pyo, new int[]{ R.drawable.pi_katakana, R.drawable.yo_katakana}));

        for (DictionaryEntry entry: dictionary.values()) {
            Arrays.sort(entry.examples);
        }
    }
}
