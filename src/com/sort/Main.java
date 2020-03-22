package com.sort;

public class Main {

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90,30,44,4234,24234,24234,324,342213,1,23,5};
        InsertionSOrt insertionSOrt = new InsertionSOrt();
        SelectionSort selectionSort = new SelectionSort();
        BubbleSort bubbleSort = new BubbleSort();

        insertionSOrt.insertionSort(arr);
        System.out.println("Sorted array with insertion");
        insertionSOrt.printArray(arr);

//        bubbleSort.bubbleSort(arr);
//        System.out.println("Sorted array with bubble");
//        bubbleSort.printArray(arr);
//
//        selectionSort.selectionSort(arr);
//        System.out.println("Sorted array with selection");
//        selectionSort.printArray(arr);
    }
}
