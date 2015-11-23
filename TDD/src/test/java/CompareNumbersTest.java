import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CompareNumbersTest {

    @Test
    public void test_compare_input_number_1234_and_random_number_5678_return_0A0B() throws Exception {
        String  inputNumber = "1234";
        String  randomNumber = "5678";

        String compareResult =  new CompareNumbers().compareNumbers( inputNumber , randomNumber );

        assertThat( compareResult, equalTo( "0A0B"  ));
    }


    @Test
    public void test_compare_input_number_and_random_number_return_2A1B() throws Exception {
        String inputNumber = "1234";
        String randomNumber = "1394";

        String compareResult =  new CompareNumbers().compareNumbers( inputNumber , randomNumber );

        assertThat( compareResult, equalTo( "2A1B"  ));

    }

    @Test
    public void test_compare_input_number_1234_and_random_number_1234_return_4A0B() throws Exception {
        String inputNumber = "1234";
        String randomNumber = "1234";

        String compareResult =  new CompareNumbers().compareNumbers( inputNumber , randomNumber );

        assertThat( compareResult, equalTo( "4A0B"  ));

    }

    @Test
    public void test_compare_input_number_1234_and_random_number_4123_return_0A4B() throws Exception {
        String inputNumber = "1234";
        String randomNumber = "4123";

        String compareResult =  new CompareNumbers().compareNumbers( inputNumber , randomNumber );

        assertThat( compareResult, equalTo( "0A4B"  ));

    }

    @Test
    public void test_compare_input_number_1234_and_random_number_1235_return_3A0B() throws Exception {
        String inputNumber = "1234";
        String randomNumber = "1235";

        String compareResult =  new CompareNumbers().compareNumbers( inputNumber , randomNumber );

        assertThat( compareResult, equalTo( "3A0B"  ));

    }

    @Test
    public void test_compare_input_number_1234_and_random_number_1243_return_2A2B() throws Exception {
        String inputNumber = "1234";
        String randomNumber = "1243";

        String compareResult =  new CompareNumbers().compareNumbers( inputNumber , randomNumber );

        assertThat( compareResult, equalTo( "2A2B"  ));

    }
}
