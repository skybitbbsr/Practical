package thread;

public class sum extends Thread {
	public int num1,num2;

	public sum() {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int summation(int num1,int num2){
		int summ=0;
		summ+=num1+num2;
		return summ;
	}
	public int multiplication(int num1,int num2){
		int mul=1;
		mul*=num1*num2;
		return mul;
	}
	
		
	
               	

}
