package by.bsuir.ArabeyDiana.task1.runner;

import by.bsuir.ArabeyDiana.scanner.InputData;
import by.bsuir.ArabeyDiana.task1.util.SolveTheEquation;;

public class StartTask {

	public static void main(String[] args) {
		
		
		System.out.print("¬ведите x: ");
		double x =InputData.inputDouble();
		
		System.out.print("¬ведите y: ");
		double y = InputData.inputDouble();
		
		try {
			double  res = SolveTheEquation.equation(x,y);
			System.out.println("–езультат: "+ res);
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic error: " + e.getMessage());
		}
		
	}

}
