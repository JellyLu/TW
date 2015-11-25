import static java.lang.Integer.parseInt;

public class PlayGame {

    final GenerateRandom generateRandom;

    public PlayGame( GenerateRandom randomNumber ){
        this.generateRandom = randomNumber;
    }

    public String playNumberGame( String inputNumber ) {

        if ( inputNumber.length() == 4 && isNumber(inputNumber) ) {
            return CompareNumbers.compareNumbers(inputNumber, generateRandom.generateRandomNumber());
        }
        return null;
    }

    private static boolean isNumber(String string){
        try{
            parseInt(string);
            return true;
        }catch ( NumberFormatException exception){
            return false;
        }
    }



}
