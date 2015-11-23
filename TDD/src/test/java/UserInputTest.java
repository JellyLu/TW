import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserInputTest {

    @Test
    public void test_user_input_1234(){
        String inputString = UserInput.inputFromConsole();

        assertThat( inputString, is("1234") );
    }
}
