package arioverload;

public class Arithmatic_Overload {


		static double addNum(double[] numbers) {
			double sum = 0;

			for (double d : numbers) {
				sum += d;
			}

			return sum;
		}
		static double mulNum(double[] numbers) {
			double mul = 1;

			for (double d : numbers) {
				mul *= d;
			}

			return mul;
		}
	static int addNum(int[] numbers) {
			int sum = 0;

			for (int i : numbers) {
				sum += i;
			}

			return sum;
		}
	static int mulNum(int[] numbers) {
			int num = 1;

			for (int i : numbers) {
				num *= i;
			}

			return num;
		}
	static int subNum(int var1,int var2) {
			return var1-var2;
		}
		
		static double subNum(double var1,double var2) {
			return var1-var2;
		}

		static int divNum(int var1,int var2) {
			
			if(var2 != 0) {
				return var1/var2;
			}else
				return 0;
				
		}
		static double divNum(double var1,double var2)  {
			
			if(var2 != 0) {
				return var1/var2;
			}else
				return 0;
			}
	}







