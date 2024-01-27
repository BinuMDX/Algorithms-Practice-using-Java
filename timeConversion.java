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

class conversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        String med = s.substring(s.length()-2);
        int hr = Integer.parseInt(s.substring(0,2));
        String hrs = s.substring(0,2);
        if(med.equals("PM") && hr < 12){
            hr += 12;
            hrs = Integer.toString(hr);
        }else if(med.equals("PM") && hr == 12){
            hrs = Integer.toString(12);
        }
        if(med.equals("AM") && hr == 12){
            hrs = "00";
        }

        return(hrs + ":" + (s.substring(3,8)));

    }

}

public class timeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = conversion.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
