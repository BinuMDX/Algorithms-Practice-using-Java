public class swapTwoNumbers {

    //swap two numbers without using a third variable
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        b = b+a; //b=30
        a = b-a; //a =20
        b = b-a; //b =10

        System.out.println(a);
        System.out.println(b);
    }
}
