package com.brideglabz.datastructuresusinggenerics;

import com.bridgelabz.datastructuresusinggenerics.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class HashMapTest {
    @Test
    public void givenSentence_whenWordsAddedToList_shouldReturnWordFrequencyOfAParticularWord() {
        String sentence = "To be or not to be";
        HashMap<String, Integer> myHashMap = new HashMap<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = myHashMap.get(word);
            if (value == null)
                value = 1;
            else
                value += 1;
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        Assert.assertEquals(2, frequency);
    }
}
