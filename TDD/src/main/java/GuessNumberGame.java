import java.util.Random;

public class GuessNumberGame {



    public static void numberGame(){
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
            String compareResult = new PlayGame( new GenerateRandom( new Random()) ).playNumberGame( inputNumber );
            win = Result.isWinGame( compareResult );
            if ( win ){
                break;
            }
        }
        Console.gameResultPrintOnConsole( win );
        System.exit(0);
    }

}
