#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;
int partition(vector<int>& arr, int low, int high){
    // selecting the last element as pivot
    int pivot = arr[high];
    // index of smaller element
    int left_element = low - 1;
    
    // traverse the array and put the elements smaller than pivot to the left.
    for(int j=low; j<high-1; j++){
        //check if the current element is smaller than pivot
        if(arr[j]<pivot){
            left_element++;
            //swap the elements
            swap(arr[left_element], arr[j]);
        }

    }
    //put the pivot element in the correct position after the smaller elements
    swap(arr[left_element+1], arr[high]);
    //returns the index of the pivot element
    return left_element+1;
}
void quickSort(vector<int>& arr, int low, int high){
   //check if the array has more than one element
    if(low<high){
         //find the partitioning index by calling the partition function
         int pi = partition(arr, low, high);
         //sort the left subarray by calling the quicksort function recursively until the subarray has only one element
         quickSort(arr, low, pi-1);
         //sort the right subarray by calling the quicksort function recursively until the subarray has only one element
         quickSort(arr, pi+1, high);
    }
}
void printArray(vector<int>& arr){
    for(int i=0; i<arr.size(); i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
}
int main(){
    vector<int> arr = {10, 7, 8, 9, 1, 5};
    int n = arr.size();
    quickSort(arr, 0, n-1);
    cout<<"Sorted array: \n";
    printArray(arr);
    return 0;
}
// To compile: g++ QuickSort.cpp -o QuickSort
//g++ sort.cpp -o sort
//g++ QuickSort.cpp -o QuickSort

