import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ResultTest {

    @Test
    public  void  test_game_result_when_compare_result_equal_to_4A0B(){
        boolean result = Result.isWinGame( "4A0B" );

        assertThat( result, is(true));
    }

    @Test
    public  void  test_game_result_when_compare_result_not_equal_to_4A0B(){
        boolean result = Result.isWinGame( "1A2B" );

        assertThat( result, is(false));
    }

}
