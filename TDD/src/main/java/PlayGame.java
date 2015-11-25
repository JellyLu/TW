public class PlayGame {

    final GenerateRandom generateRandom;

    public PlayGame( GenerateRandom randomNumber ){

        this.generateRandom = randomNumber;
    }

    public String playNumberGame( String inputNumber ) {

        return CompareNumbers.compareNumbers(inputNumber, generateRandom.generateRandomNumber());
    }



}
