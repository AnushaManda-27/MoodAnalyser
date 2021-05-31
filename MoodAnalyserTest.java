import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class MoodAnalyserExceptionTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
            MoodAnalyserException moodAnalyser = new MoodAnalyserException("SAD");
            String mood = moodAnalyser.analyseMood("This is a Sad Message");
            Assertions.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyserException moodAnalyser = new MoodAnalyserException("HAPPY");
        String mood = moodAnalyser.analyseMood("This is a HAPPY Message");
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy1() {
        MoodAnalyserException moodAnalyser = new MoodAnalyserException(null);
        String mood = moodAnalyser.analyseMood("This is a null Message");
        Assertions.assertEquals("HAPPY", mood);
    }
}
