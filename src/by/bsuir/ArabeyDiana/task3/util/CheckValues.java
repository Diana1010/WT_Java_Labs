package by.bsuir.ArabeyDiana.task3.util;

public class CheckValues {
	
	public static  void  checkParam(double a, double b, double h) {
		if (!Double.isFinite(a) || !Double.isFinite(b) || !Double.isFinite(h)) {
	        throw new IllegalArgumentException("Парамметры не верны");
	    }
	    if (b < a) {
	        throw new IllegalArgumentException("Интервал введён неверно");
	    }
	    if (h <= 0) {
	        throw new IllegalArgumentException("Шаг должен быть положительным");
	    }
	}
}
