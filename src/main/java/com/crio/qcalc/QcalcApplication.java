package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		
		//  System.out.println("Starting QCalc..");
		 
		//  StandardCalculator calc = new StandardCalculator();

		 
		//  calc.add(1,2);
		//  calc.subtract(5,3);
		//  calc.multiply(5,5);
		//  calc.divide(10,10);
		//  calc.add(1.5, 2.5);

		//  calc.add(Double.MAX_VALUE, 1.0);
		//  calc.printResult();

		//  calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
        //  calc.printResult();
		 
		 
		//  System.out.println(calc.getResult());
 
        
      
    LogicCalculator calc = new LogicCalculator();

     calc.AND(5,7);

     calc.printResult();



		 

	}

}
