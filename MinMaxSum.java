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

class Sum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {

        List<Long> arr1 = new ArrayList<Long>();

        for(int i = 0; i< arr.size(); i++){
            long sum =0;
            for (int j =0; j< arr.size();j++){
                sum += arr.get(j);
            }
            sum = sum - arr.get(i);
            arr1.add(sum);
        }

        long max = arr1.get(0);
        long min = arr1.get(0);

        for (int i = 0; i< arr1.size();i++){

            if(max<arr1.get(i)){
                 max = arr1.get(i);
            } else if (min> arr1.get(i)) {
                min = arr1.get(i);
            }
        }

        System.out.print(min);
        System.out.print(" ");
        System.out.println(max);
    }

}

public class MinMaxSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Sum.miniMaxSum(arr);

        bufferedReader.close();
    }
}
