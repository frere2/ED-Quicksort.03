package view;

import br.edu.fateczl.thiago.bubblesort.BubbleSort;
import br.edu.fateczl.thiago.mergesort.MergeSort;
import br.edu.fateczl.thiago.quicksort.QuickSort;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] vetor = new int[1500];
        int len = vetor.length;
        for (int i = 0; i < len; i++) {
            vetor[i] = i;
        }

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();
        MergeSort mergeSort = new MergeSort();

        long startBubbleSort = System.nanoTime();
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(vetor)));
        long endBubbleSort = System.nanoTime();
        double bubbleSortTime = (endBubbleSort - startBubbleSort) / 1_000_000_000.0;
        System.out.println("BubbleSort: " + bubbleSortTime + " s");

        long startMergeSort = System.nanoTime();
        System.out.println(Arrays.toString(mergeSort.sort(vetor, 0, vetor.length - 1)));
        long endMergeSort = System.nanoTime();
        double mergeSortTime = (endMergeSort - startMergeSort) / 1_000_000_000.0;
        System.out.println("MergeSort: " + mergeSortTime + " s");

        long startQuickSort = System.nanoTime();
        System.out.println(Arrays.toString(quickSort.sort(vetor, 0, vetor.length - 1)));
        long endQuickSort = System.nanoTime();
        double quickSortTime = (endQuickSort - startQuickSort) / 1_000_000_000.0;
        System.out.println("QuickSort: " + quickSortTime + " s");
    }
}
