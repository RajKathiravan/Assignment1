package Week1.day1;

import cucumber.api.cli.Main;

public class Assignment1 {
	
	public void factorialResult() {
		int fact=1;
		int inputNumber=10;
		System.out.println("Below is the factorial for 10");
		for(int i=1;i<=inputNumber;i++) {
			fact=fact*i;		
		}	
		System.out.println(fact);
	}
	
	public void oddNumber() {
		int inputNum=10;
		System.out.println("Below are the odd Numbers");
		for(int i=1;i<=inputNum;i++) {
			if(i%2==1){				
				System.out.println(i);
			}		
		}
	}
	
	public void fibonacci() {
		
		int inputVar = 10;
		int firstVar=0;
		int secVar=1;
			System.out.println("Below are the fibonacci numbers for range 10");
			System.out.println(firstVar);
			System.out.println(secVar);
		for(int i=1;i<=inputVar;i++) {
			int fiboVar=firstVar+secVar;
			firstVar=secVar;
			secVar=fiboVar;
			System.out.println(fiboVar);
		}
				
	}
	public static void main(String[] args) {
		Assignment1 agnName=new Assignment1();
		agnName.factorialResult();
		agnName.oddNumber();
		agnName.fibonacci();
	}

}
