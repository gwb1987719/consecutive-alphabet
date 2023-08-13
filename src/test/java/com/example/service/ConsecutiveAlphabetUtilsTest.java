package com.example.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static com.example.service.ConsecutiveAlphabetUtils.removeConsecutiveAlphabet;
import static com.example.service.ConsecutiveAlphabetUtils.replaceWithALessAlphabet;


/**
 * @Author: WenBin Guo
 * 13-08-2023
 * @Version: 1.0
 */
public class ConsecutiveAlphabetUtilsTest {
    @Test
    public void testRemove(){
        assertEquals("",removeConsecutiveAlphabet(""));
        assertEquals("aa",removeConsecutiveAlphabet("abccccbba"));
        assertEquals("a",removeConsecutiveAlphabet("a"));
        assertEquals("ababababa",removeConsecutiveAlphabet("ababababa"));
        assertEquals("d",removeConsecutiveAlphabet("aabcccbbad"));
        assertEquals("",removeConsecutiveAlphabet("aaaaaaaaaaaaaaa"));
        assertEquals("abbad",removeConsecutiveAlphabet("abcccbad"));
        assertEquals("ab",removeConsecutiveAlphabet("abccc"));
        assertEquals("aa",removeConsecutiveAlphabet("aaccc"));
        assertEquals("aa",removeConsecutiveAlphabet("cccaa"));
    }

    @Test
    public void testReplace(){
        assertEquals("",replaceWithALessAlphabet(""));
        assertEquals("",replaceWithALessAlphabet("abccccbba"));
        assertEquals("a",replaceWithALessAlphabet("a"));
        assertEquals("ababababa",replaceWithALessAlphabet("ababababa"));
        assertEquals("d",replaceWithALessAlphabet("aabcccbbad"));
        assertEquals("",replaceWithALessAlphabet("aaaaaaaaaaaa"));
        assertEquals("d",replaceWithALessAlphabet("abcccbad"));
        assertEquals("a",replaceWithALessAlphabet("bbb"));
        assertEquals("abb",replaceWithALessAlphabet("abccc"));
        assertEquals("aab",replaceWithALessAlphabet("aaccc"));
    }
}
