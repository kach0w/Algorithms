#include <iostream>
using namespace std;

int minIndex(int arr[], int low, int high) {
  int index = low;
  if (low == high) {
    return low;
  }
  index = minIndex(arr, low + 1, high);
  if (arr[low] < arr[index]) {
    index = low;
  }
  return index;
}

void selectionsort(int arr[], int len, int index = 0) {
  if (len == index) {
    return;
  }

  int k = minIndex(arr, index, len - 1);
  if (k != index) {
    int temp = arr[k];
    arr[k] = arr[index];
    arr[index] = temp;
  }
  selectionsort(arr, len, index + 1);
}

int main() {
  int arr[] = {5, 13, 2, 1, 15, 0};
  int n = sizeof(arr) / sizeof(int);
  selectionsort(arr, n, 0);

  for (int i = 0; i < n; i++) {
    cout << arr[i] << endl;
  }
}
