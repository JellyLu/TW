public class Console {

    public static void beginGamePrintOnConsole(){

        System.out.println( "Welcome!" );
    }

    public static void indexOfGamePrintOnConsole(int times){
        System.out.println( String.format("Please input your number: (%d)", times) );
    }

    public static void inputErrorPrintOnConsole(){

        System.out.println( "Cannot input duplicate numbers!" );
    }

    public static void gameResultPrintOnConsole( boolean win ){
        System.out.println( win ?  "Congratulations!" : "Game Over" );
    }

}
