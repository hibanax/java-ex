package com.krystek;

public class Main {

    public static void main(String[] args) {
	SimpleCalculator calculator = new SimpleCalculator();
	calculator.setFirstNumber(1.0);
	calculator.setSecondNumber(15);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
    calculator.setFirstNumber(5);
    calculator.setSecondNumber(2);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());

    }
}
