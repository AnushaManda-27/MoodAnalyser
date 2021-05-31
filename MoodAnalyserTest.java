package com.moodanalyzer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MoodAnalyzerTest {
    @Test
    public void givenMessage_whenSad_returnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("This is a sad message");
       Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whennotsad_returnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();

        String mood = moodAnalyser.analyseMood("This is a Happy message");
        Assertions.assertEquals("Happy", mood);
    }

}
