import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class PlayGameTest {

    private  PlayGame playGame;
    private  GenerateRandom generateRandom;
    private  Random userInputNumber;

    @Before
    public void setUp() throws Exception{
        userInputNumber  = mock( Random.class );
        generateRandom   = new GenerateRandom( userInputNumber );
        playGame         = new PlayGame( generateRandom );
    }


    @Test
    public  void  test_play_game_when_success(){

        when( userInputNumber.nextInt(10) ).thenReturn(1,2,3,4);

        String result = playGame.playNumberGame( "1234" );

        assertThat( result, is("4A0B") );

    }

    @Test
    public  void  test_play_game_when_fail(){

        when( userInputNumber.nextInt(10) ).thenReturn(1,2,3,4);

        String result = playGame.playNumberGame( "1254" );

        assertThat( result, is("3A0B") );

    }


}
