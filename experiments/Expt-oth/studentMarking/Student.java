
	package studentMarking;

	public class Student {

		private Semester mySem = null;
		private String name = null;
		private String regNo = null;
		private int semester = 0;

		public Student(String stuName, String regNo, int sem,String[] subjArray,double subjMarks[]) {

			this.semester = sem;
			this.name = new String(stuName);
			this.regNo = new String(regNo);
			this.mySem = new Semester(sem, subjArray,subjMarks);

		}

		public int getSemester() {
			return semester;
		}

		public void setSemester(int semester) {
			this.semester = semester;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getRegNo() {
			return regNo;
		}

		public void setRegNo(String regNo) {
			this.regNo = regNo;
		}

		public double getTotal() {
			return mySem.getTotal();
		}

		public double getPercentage() {
			return mySem.getPercentage();
		}
		@Override
		public String toString() {
	return "Student [getName()=" + getName() + ", getTotal()=" + getTotal() + ", getPercentage()=" + getPercentage()
					+ "]";
		}
	}

