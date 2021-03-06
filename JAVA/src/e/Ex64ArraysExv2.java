package e;

public class Ex64ArraysExv2 {
    public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--){
            for (int i = 0; i < n-1; i++){
                k = i + 1;
                if (array[i] > array[k]){
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
    public static void swapNumbers(int i, int j, int[] array){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void printNumbers(int [] input){
        for (int i = 0; i < input.length; i++ ){
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int [] input ={4, 55, 15, 24, 11, 5, 2};
        bubble_srt(input);
    }
}
