import java.util.ArrayList;
import java.util.Random;

public class GenerateRandom {
    private Random random;

    public GenerateRandom(Random random) {
        this.random = random;
    }

    public  String generateRandomNumber() {
        ArrayList<Integer> list = new ArrayList<Integer>();

        int count = 4;
        String result = "";
        while ( count > 0 ) {
            int num = random.nextInt(10);
            if (!list.contains(num)) {
                list.add(num);
                result += num;
                count --;
            }
        }

        return  result;
    }
}
