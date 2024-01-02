public class bubbleSort {

    static void BubbleSort(int arr[]){
        int temp;
        boolean swapped;
      for (int i =0; i< arr.length; i++){
          swapped = false;
            for (int j = 0; j< arr.length-1; j++){
                if(arr[j]> arr[j+1]) {
                    temp = arr[i];
                    arr[i] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped= true;
                }

            }
          if (swapped == false)
              break;
      }

    }

    static void printArray(int arr[]){
        int i;
        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        int arr[] = {6,5,4,3,2};
        BubbleSort(arr);
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}
