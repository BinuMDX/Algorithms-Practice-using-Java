import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ReverseString {

    static void reverse(String sr){
        char arr[] = sr.toCharArray();
        for (int i = arr.length-1; i>=0;i--) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        String sr = "Apple";
        reverse(sr);
    }
}
