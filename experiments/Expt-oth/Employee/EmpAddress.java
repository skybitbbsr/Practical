package Employee;
import java.util.Scanner;
public class EmpAddress {
	Scanner sc=new Scanner(System.in);
    int i,j;
	Employee[] e = new Employee[]{
			new Employee("horit", 2, new Address("56", "mera street", "berhampur"), new Address("56", "mera", "berhampur")),
			new Employee("sanjay", 3, new Address("dfdf", "dddd", "vhfgv"), new Address("hdava", "chbadchah", "ihcdi")) 
			};
		
	//int empid[]={1,2,3,4,5};
	//int b=empid.length;
	public int check(){
		System.out.println("enter employee id");
		 i=sc.nextInt();
		 for(int j=0;j<e.length;j++){
		  
			 if(e[j].getEmpNo() ==i){
				 System.out.println((e[j]));
			 }
		 }
		return j;
	}
	
	
		 
	
	}	 

