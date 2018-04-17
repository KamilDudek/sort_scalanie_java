import java.util.Arrays;

public class QuickSort {

    private static final int N = 30;
    private static int array[] = {30,29,28,27,26,25,1,2,3,4,5,6,7,24,23,22,21,20,19,18,8,9,10,11,17,16,15,13,14,12};

    private static void quickSort(int tablica[],int leftIndex, int rightIndex){
        if(leftIndex >= rightIndex) {
            return;
        }
        int pivot_value =  array[rightIndex];
        int border = leftIndex-1;
        int i = leftIndex;

        while(i < rightIndex){
            if(array[i] < pivot_value){
                border++;
                if(border != i) {

                }
            }
            i++;
            }
            border++;
            if(border != rightIndex){

            }
        quickSort(array,leftIndex,border-1);
        quickSort(array,border+1,rightIndex);
        }

    public static void main(String[] args) {
        int i;

        System.out.println("Zbior przed sortowaniem:");
        for (i=0; i<N; i++)
            System.out.print(array[i] + " ");

        quickSort(array, 0,N-1);

        System.out.println("\nZbior po sortowaniu:");
        for (i=0; i<N; i++)
            System.out.print(array[i] + " ");

    }
    }


