import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import algorithms.basic.Factorial;
import algorithms.basic.FuzzBuzz;
import algorithms.basic.StringAndChar;
import algorithms.codility.Fibonacci;
import algorithms.sort.BubbleSort;
import algorithms.sort.InsertionSort;
import algorithms.sort.MergeSort;
import algorithms.sort.QuickSort;
import algorithms.sort.SelectionSort;
import algorithms.sort.ShellSort;
import algorithms.sort.Sort;
import algorithms.sort.SortTester;
import dataStructures.DynamicArray;

public class Start {

	public static void main(String[] args) {
		// Basic
		FuzzBuzz fuzz = new FuzzBuzz();
		System.out.println("----------FuzzBuzz Algorithm----------");
		fuzz.algorithm();
		System.out.println("----------Count chars in String Algorithm----------");
		StringAndChar sac = new StringAndChar();
		System.out.println(sac.checkString("ANakondA", 'A'));
		Factorial fac = new Factorial();
		System.out.println("----------Factorial Algorithm----------");
		System.out.println("Iteration: " + fac.factorialIteration(3));
		System.out.println("Recursion: " + fac.factorialRecursion(3));
		Fibonacci f = new Fibonacci();
		System.out.println("----------Fibonacci Algorithm----------");
		System.out.println("Iteration: " + f.fibonacciIteration(5));
		System.out.println("Recursion: " + f.fibonacciRecursion(4));
		f.createFibonacciList(5);

		// Sorting
		System.out.println("----------Sorting----------");
		Sort bubbleSort = new BubbleSort();
		Sort insertionSort = new InsertionSort();
		Sort selectionSort = new SelectionSort();
		Sort shellSort = new ShellSort();
		Sort mergeSort = new MergeSort();
		Sort quickSort = new QuickSort();
		List<Sort> list = new ArrayList<Sort>();
		list.addAll(Arrays.asList(bubbleSort, insertionSort, selectionSort, shellSort, mergeSort,quickSort));
		SortTester sortTester = new SortTester();
		sortTester.executeSortAndPrint(list, 100);
		
		//Data Structure
		DynamicArray da = new DynamicArray();
		da.add(1);
		System.out.println(da.size());
		da.add(2);
		System.out.println(da.size());
		da.add(3);
		System.out.println(da.size());
		da.add(4);
		System.out.println(da.size());
		da.add(5);
		System.out.println(da.size());
		da.printArray();
		System.out.println();
		da.printRealArray();
		
		
		
	}

}
