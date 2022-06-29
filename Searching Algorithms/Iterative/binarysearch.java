import java.util.Arrays;

class binarysearch {

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 8, 15};
        int key = 15;
        int length = array.length;
        int keyIndex = BinarySearch(array, length, key);
        System.out.println(Arrays.toString(array));
        System.out.println("Index of "+ key + " is " + keyIndex);
    }

    public static int BinarySearch(int arr[], int n, int key){
        int low, high, mid;
        low = 0; high=n-1;
        while(low <= high){
            mid = (low + high) / 2;            
            if(key == arr[mid]){
                return mid;
            }
            if(key < arr[mid]){
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }
}


