package by.bsuir.ArabeyDiana.task2.runner;
import by.bsuir.ArabeyDiana.task2.util.Point;
import by.bsuir.ArabeyDiana.scanner.InputData;


public class FindPoint {

	public static void main(String[] args) {
	
		System.out.print("Введите x: ");
		double x = InputData.inputDouble();
		
		System.out.print("Введите y: ");
		double y = InputData.inputDouble();
		
		
		Point pt = new Point(x,y);
		System.out.println("Точка с координатами: " +pt.toString()+ (pt.сheck()? "входит ":"не входит ")+ "в закрашенную область");

	}

}
