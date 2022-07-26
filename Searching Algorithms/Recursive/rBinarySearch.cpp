#include <iostream>
using namespace std;

int rBinarySearch(int arr[], int low, int high, int key) {
  int mid;
  if (low == high) {
    if (arr[low] == key) {
      return low;
    } else {
      return -1;
    }
  } else {
    mid = (low + high) / 2;
    if (key == arr[mid]) {
      return mid;
    }
    if (key < arr[mid]) {
      return rBinarySearch(arr, low, mid - 1, key);
    } else {
      return rBinarySearch(arr, mid + 1, high, key);
    }
  }
}

int main() {
  int array[] = {1, 2, 3, 4, 5, 8, 15};
  int key = 25;
  int length = sizeof(array)/sizeof(int);
  int low = 0;
  int high = length - 1;
  int keyIndex = rBinarySearch(array, low, high, key);
  cout << "Index of " << key << " is " << keyIndex;
}
