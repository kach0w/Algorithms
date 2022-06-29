import java.util.Arrays;

class rbinarysearch {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 8, 15};
        int key = 15;
        int length = array.length;
        int low = 0; int high=length-1;
        int keyIndex = rBinarySearch(array, low, high, key);
        System.out.println(Arrays.toString(array));
        System.out.println("Index of "+ key + " is " + keyIndex);
    }

    public static int rBinarySearch(int arr[], int low, int high, int key){
        int mid;
        if(low == high){
            if(arr[low] == key){
                return low;
            }
            else{
                return -1;
            }
        }   
        else{
            mid = (low + high) / 2;            
            if(key == arr[mid]){
                return mid;
            }
            if(key < arr[mid]){
                return rBinarySearch(arr, low, mid-1, key);
            }
            else {
                return rBinarySearch(arr, mid+1, high, key);
            }
        } 
    }
}


