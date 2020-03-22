package com.sort;

public class SelectionSort {

    public int [] selectionSort (int arr[]){
    int i, j, minValue, minIndex, temp = 0;
    	for (i = 0; i < arr.length; i++) {
        minValue = arr[i];
        minIndex = i;
        for (j = i; j < arr.length; j++) {
            if (arr[j] < minValue) {
                minValue = arr[j];
                minIndex = j;
            }
        }
        if (minValue < arr[i]) {
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
	return arr;
}


    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}