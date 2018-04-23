package studentmarkprocessing;

public class student {
	public String name;
	public String branch;
	public String regdno;
	public String year;
	public marks[] semester; 
	public student(){
		this.name=name;
		this.branch=branch;
		this.regdno=regdno;
		this.year=year;
		this.semester=semester;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getRegdno() {
		return regdno;
	}
	public void setRegdno(String regdno) {
		this.regdno = regdno;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public marks[] getSemester() {
		return semester;
	}
	public void setSemester(marks[] semester) {
		this.semester = semester;
	}


public double totalmark(marks[] semester){
    double sum=0;
	for(int i:semester){
		sum+=semester[i].getSubjectmark();

}

}
	
}
