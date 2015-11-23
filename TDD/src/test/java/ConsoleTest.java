import org.junit.Test;

public class ConsoleTest {

    @Test
    public void test_begin_Game_should_print_welecom_on_the_console(){
        Console.beginGamePrintOnConsole();
    }

    @Test
    public void test_first_time_play_game_should_print_6_on_the_console(){
        Console.indexOfGamePrintOnConsole( 6 );
    }

    @Test
    public void test_third_time_play_game_should_print_4_on_the_console(){
        Console.indexOfGamePrintOnConsole( 4 );
    }

    @Test
    public void test_last_time_play_game_should_print_1_on_the_console(){
        Console.indexOfGamePrintOnConsole( 1 );
    }

    @Test
    public void test_when_input_error_should_print_info_on_the_console(){
        Console.inputErrorPrintOnConsole();
    }


    @Test
    public void test_when_win_the_game_should_print_info_on_the_console(){
        Console.gameResultPrintOnConsole( true );
    }

    @Test
    public void test_when_lose_the_game_should_print_info_on_the_console(){
        Console.gameResultPrintOnConsole( false );
    }



}
