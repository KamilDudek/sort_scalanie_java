public class Mergesort {
    private static final int N = 30;
    private static int array[] = {30,29,28,27,26,25,1,2,3,4,5,6,7,24,23,22,21,20,19,18,8,9,10,11,17,16,15,13,14,12};
    private static int extraArray[] = new int[N]; //tablica do przechowywania zmiennych

    private static void mergeSort(int leftIndex,int rightIndex) {
        if (leftIndex < rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;
            mergeSort(leftIndex, middle);
            mergeSort(middle + 1, rightIndex);
            merge(leftIndex, middle, rightIndex);
        }
    }
     private static void merge(int leftIndex, int middleIndex, int rightIndex){
         int finger1 = leftIndex,current = leftIndex,finger2 = middleIndex+1;
        for(int i = leftIndex; i<=rightIndex; i++){
            extraArray [i] = array[i];
        }




        while( finger1 <= middleIndex && finger2<= rightIndex) {
            if (extraArray[finger1] <= extraArray[finger2]) {
                array[current] = extraArray[finger1];
                finger1++;
            } else {
                array[current] = extraArray[finger2];
                finger2++;
            }
            current++;
        }
            while(finger1 <= middleIndex) {

                    array[current] = extraArray[finger1];
                    finger1++; current++;

            }



    }
    public static void main(String[] args) {
        int i;

        System.out.println("Zbior przed sortowaniem:");
        for (i=0; i<N; i++)
            System.out.print(array[i] + " ");

        mergeSort(0,N-1);

        System.out.println("\nZbior po sortowaniu:");
        for (i=0; i<N; i++)
            System.out.print(array[i] + " ");

    }

}


