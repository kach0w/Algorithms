#include <iostream>
using namespace std;

void bubbleSort(int arr[], int len) {
  if (len == 1) {
    return;
  }
  for (int i = 0; i < len - 1; i++) {
    if (arr[i] > arr[i + 1]) {
      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
  }
  bubbleSort(arr, len - 1);
}

int main() {
  int arr[] = {5, 13, 2, 1, 15, 0};
  int n = sizeof(arr) / sizeof(int);
  bubbleSort(arr, n);

  for (int i = 0; i < n; i++) {
    cout << arr[i] << endl;
  }
}
