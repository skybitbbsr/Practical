package Employee;
public class Employee {
	public String EmpName;
	int EmpNo;
	Address permanentAddress=null;
	Address correspondanceAddress=null;
	public Employee( String EmpName,int EmpNo, Address permanentAddress,Address correspondanceAddress ){
		this.EmpName=EmpName;
		this.EmpNo=EmpNo;
		this.permanentAddress=permanentAddress;
		this.correspondanceAddress=correspondanceAddress;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public Address getCorrespondanceAddress() {
		return correspondanceAddress;
	}
	public void setCorrespondanceAddress(Address correspondanceAddress) {
		this.correspondanceAddress = correspondanceAddress;
	}
	public String toString(){
		return String.format("%s %s %s",EmpName,permanentAddress,correspondanceAddress);
	}
	

	/*public int[] getEmpNo()
	{
		return EmpNo;
	}*/
	/*public void EmpAddress(){
		System.out.println("Enter Employee Name");
		EmpName=sc.nextLine();
		System.out.println("employee name:" +EmpName);
		}*/
	}

