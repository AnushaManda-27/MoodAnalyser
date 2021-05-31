public class MoodAnalyser {

private String message;

	public String  analyserMood(String message)throws MoodAnalyserException { 
		return this.message = message;
		// TODO Auto-generated method stub
	}
	
	 void analyserMood() {
		this.message = message;
	}
public String MoodAnalyser() throws MoodAnalyserException {
		try {
		if (message.contains("sad"))
			if (message.contains("sad"))
			return "SAD";
		else
			return "Happy";
		}catch (NullPointerException e) {
		
	throw new MoodAnalyserException("Enter your proper mood");
	}
		return "Happy";
	
}
	
	}
