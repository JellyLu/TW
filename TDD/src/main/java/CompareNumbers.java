public class CompareNumbers {
    public static String compareNumbers(String inputNumber, String randomNumber) {
        String inputStr =  inputNumber;
        String randomStr = randomNumber;
        int countA = 0, countB = 0;

        for ( int i = 0, inputStrLen = inputStr.length(); i < inputStrLen; ++i ){
            int index = randomStr.indexOf( inputStr.charAt( i ) );
            if ( index == -1 ){
                continue;
            }else if( index == i ) {
                countA ++;
            }else {
                countB ++;
            }
        }

        return countA + "A" + countB + "B";
    }
}
