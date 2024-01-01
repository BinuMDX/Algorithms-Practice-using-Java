import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float countNegative = 0;
        float countZero = 0;
        float countPositive = 0;

        int n = arr.size();


        for(int i=0; i< n; i++ ){
            if( arr.get(i) <0){
                countNegative++;
            }

             else if( arr.get(i) == 0){
                countZero++;
            }

            else if( arr.get(i)>0){
                countPositive++;
            }
        }

        float positive = countPositive/n;
        float negative = countNegative/n;
        float zero = countZero/n;

        System.out.printf("%1.4f ",positive);
        System.out.println();
        System.out.printf("%1.4f ",negative);
        System.out.println();
        System.out.printf("%1.4f ",zero);

    }

}

public class PlusMinus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
