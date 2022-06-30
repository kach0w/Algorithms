import java.util.Arrays;

class mergesort {

    public static void merge(int arr[], int low, int mid, int high){
        int array1Size = mid - low + 1;
        int array2Size = high - mid;

        int arr1[] = new int[array1Size];
        int arr2[] = new int[array2Size];

        for (int i = 0; i < array1Size; ++i)
            arr1[i] = arr[low + i];
        for (int j = 0; j < array2Size; ++j)
            arr2[j] = arr[mid + 1 + j];
        
        int i=0, j=0;
        int k = low;

        while(i < array1Size && j < array2Size) {
            if(arr1[i] <= arr2[j]){
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while(i < array1Size){
            arr[k++] = arr1[i++];
        }
        while(j < array2Size){
            arr[k++] = arr2[j++];
        }
    }

    public static void mergeSort(int arr[], int low, int high){
        if(low < high){
            int mid = (low+high)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String args[]) {
        int arr[] = {12, 13, 24, 10, 3, 6, 90, 70};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}