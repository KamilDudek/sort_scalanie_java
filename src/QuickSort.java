import java.util.Arrays;
import java.util.Random;

public class QuickSort {

   private static final int N = 30;
   private static int array[] = {30,29,28,27,26,25,1,2,3,4,5,6,7,24,23,22,21,20,19,18,8,9,10,11,17,16,15,13,14,12};


    private static void quickSort(int leftIndex, int rightIndex){

        int i =  leftIndex;
        int j = rightIndex;
        int pivot_value =  array[leftIndex+(rightIndex-leftIndex)/2];

        while(i <= j){
            while (array[i] < pivot_value) {
                i++;
            }
            while (array[j] > pivot_value) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (leftIndex < j)
            quickSort(leftIndex, j);
        if (i < rightIndex)
            quickSort(i, rightIndex);
    }

    private static void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int i;

        System.out.println("Zbior przed sortowaniem:");
        for (i=0; i<N; i++)
            System.out.print(array[i] + " ");

        quickSort(0,N-1);

        System.out.println("\nZbior po sortowaniu:");
        for (i=0; i<N; i++)
            System.out.print(array[i] + " ");

    }
    }


