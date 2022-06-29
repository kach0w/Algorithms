import java.util.Arrays;

class quicksort {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{12, 13, 24, 10, 3, 6, 90, 70};
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

//    https://www.youtube.com/watch?v=7h1s2SojIRw&ab_channel=AbdulBari
//    from prashanth02
    
    public static void quickSort(Integer[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }

        if (low >= high) {
            return;
        }

        //Get the pivot element from the middle of the list
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        if (low < j) {
            quickSort(arr, low, j);
        }
        if (high > i) {
            quickSort(arr, i, high);
        }
    }

    public static void swap(Integer array[], int x, int y) {
        int temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }
}

