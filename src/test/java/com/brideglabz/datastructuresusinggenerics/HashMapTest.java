package com.brideglabz.datastructuresusinggenerics;

import com.bridgelabz.datastructuresusinggenerics.HashMap;
import com.bridgelabz.datastructuresusinggenerics.LinkedListForHashOperation;
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

    @Test
    public void givenLargeSentence_whenWordsAddedToList_shouldReturnWordFrequencyOfAParticularWord() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        LinkedListForHashOperation<String, Integer> linkedListForHashOperation = new LinkedListForHashOperation<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value = linkedListForHashOperation.get(word);
            if (value == null)
                value = 1;
            else
                value += 1;
            linkedListForHashOperation.add(word, value);
        }
        int frequency = linkedListForHashOperation.get("paranoid");
        Assert.assertEquals(3, frequency);
    }

    @Test
    public void givenSentence_whenWordIsRemovedFromLinkedList_shouldReturnFrequencyOfDeletedWord() {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        LinkedListForHashOperation<String, Integer> linkedListForHashOperation = new LinkedListForHashOperation<>();
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            Integer value =  linkedListForHashOperation.get(word);
            if (value == null)
                value = 1;
            else
                value += 1;
            linkedListForHashOperation.add(word, value);
        }
        int frequency =  linkedListForHashOperation.remove("avoidable");
        Assert.assertEquals(1, frequency);
    }

}
