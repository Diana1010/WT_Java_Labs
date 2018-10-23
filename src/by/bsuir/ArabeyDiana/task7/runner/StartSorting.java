package by.bsuir.ArabeyDiana.task7.runner;

import by.bsuir.ArabeyDiana.printer.PrintData;
import by.bsuir.ArabeyDiana.scanner.InputData;
import by.bsuir.ArabeyDiana.task7.util.ShellSort;

public class StartSorting {

	public static void main(String[] args) {
		
		System.out.println("Please, enter array size: ");
		int n = InputData.inputInt();
				
		System.out.println("Please, enter array");
		double[] array = InputData.inputDoubleArray(n);
		
		try {
			double[] arr = ShellSort.sort(array); 
			PrintData.printDoubleArray(arr);
			
		}catch( IllegalArgumentException e) {
			System.out.println( e.getMessage() );
		}

	}

}
