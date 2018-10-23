package by.bsuir.ArabeyDiana.task3.runner;

import by.bsuir.ArabeyDiana.task3.util.CheckValues;
import by.bsuir.ArabeyDiana.task3.util.FindFunction;
import by.bsuir.ArabeyDiana.task3.util.PrintTableForDouble;
import by.bsuir.ArabeyDiana.scanner.InputData; 

public class StartFunction {

	public static void main(String[] args) {
		
		System.out.print("Enter a: ");
		double a =InputData.inputDouble();
		
		System.out.print("Enter b: ");
		double b =InputData.inputDouble();
		
		System.out.print("Enter h: ");
		double h =InputData.inputDouble();
		
		try {
		CheckValues.checkParam(a, b, h);
		double[][] arr = FindFunction.findAnswer(a,b,h);		
		PrintTableForDouble.printArrayDouble(arr);
		}catch (IllegalArgumentException e) {
	            System.out.println("Ошибка: " + e.getMessage());
	        }
		}
		

	

}
