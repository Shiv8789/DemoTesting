package app;

public class CalculatorNew {
	
	public int add(int...num) {
		int sum=0;
		for(int i=0;i<num.length;i++) {
			sum+=num[i];
		}
		return sum;
	}

}
