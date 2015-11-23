import java.util.Random;

public class GuessNumberGame {

    private static String playNumberGame( String inputNumber ) {

        String randomNumber = new GenerateRandom( new Random() ).generateRandomNumber();
        return CompareNumbers.compareNumbers(inputNumber, randomNumber);
    }

    public  void numberGame(){
        int times = 6;
        Console.beginGamePrintOnConsole();
        boolean win = false;
        while( times > 0  ){
            Console.indexOfGamePrintOnConsole( times );
            String inputNumber = UserInput.inputFromConsole();

            if ( !UserInputIsLegal.isInputLegal( inputNumber ) ){
                Console.inputErrorPrintOnConsole();
                continue;
            }

            String compareResult = playNumberGame( inputNumber );
            win = Result.isWinGame( compareResult );
            if ( win ){
                break;
            }
        }
        Console.gameResultPrintOnConsole( win );
        System.exit(0);
    }

}
