import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class GuessNumberGameTest {

    private Console console;
    private GuessNumberGame guessNumberGame;
    @Before
    public void setUp(){
       console = mock(Console.class);
       guessNumberGame  = new GuessNumberGame( console );
    }

    @Test
    public void test_number_game_when_win(){

        guessNumberGame.numberGame();
        verify( console ).gameResultPrintOnConsole(true);

    }

    @Test
    public void test_number_game_when_lose(){

        guessNumberGame.numberGame();
        verify( console ).gameResultPrintOnConsole(false);
    }

}
