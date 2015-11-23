import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserInputIsLegalTest {

    @Test
    public void test_user_input_is_legal_when_input_is_1342(){

        boolean isLegal = UserInputIsLegal.isInputLegal( "1342" );

        assertThat( isLegal, is(true) );

    }

    @Test
    public void test_user_input_is_illegal_when_input_is_13a2(){

        boolean isLegal = UserInputIsLegal.isInputLegal( "13a2" );

        assertThat( isLegal, is(false) );

    }

}
