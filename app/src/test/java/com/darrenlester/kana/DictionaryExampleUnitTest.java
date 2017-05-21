package com.darrenlester.kana;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import java.util.Arrays;

public class DictionaryExampleUnitTest {
    @Test
    public void comparison_isCorrect() throws Exception {
        DictionaryExample[] unsorted = new DictionaryExample[]{new DictionaryExample("ありがとう", "thank you"), new DictionaryExample("あたま", "head"), new DictionaryExample("あおい", "blue")};
        Arrays.sort(unsorted);

        assertEquals("あおい", unsorted[0].example);
        assertEquals("あたま", unsorted[1].example);
        assertEquals("ありがとう", unsorted[2].example);
    }
}