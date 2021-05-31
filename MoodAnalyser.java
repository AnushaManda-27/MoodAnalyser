public class MoodAnalyser {
    String message;
    public MoodAnalyserException(String message) {
        this.message = message;
    }

    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }
    public String analyseMood() {
        try {
            if(message.contains("Sad")) {
                return "SAD";
            }
            else
                return "HAPPY";
        }
        catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
