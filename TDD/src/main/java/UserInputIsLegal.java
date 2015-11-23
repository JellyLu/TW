public class UserInputIsLegal {
    public static boolean isInputLegal( String inputString ){
        int len = inputString.length();
        boolean result = true;
        for ( int i = 0; i < len; ++i ){
            if ( inputString.charAt(i) > '9' || inputString.charAt( i ) < '0' ){
                result = false;
                break;
            }
        }

        return result;
    }
}
