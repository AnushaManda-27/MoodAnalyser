import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import customException.MoodAnalayser;
import customException.MoodAnalyserException;

class MoodAnalyserTest {

	@Test
	 public void giveNullMoodShouldThrowException() {
     MoodAnalayser moodAnalyser = new MoodAnalayser();
		try {
       moodAnalyser.analyserMood(null);
     } catch (MoodAnalyserException e) {
		Assert.assertEquals("Enter proper mood", moodAnalyser);
	}
	}
}
