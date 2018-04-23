package studentMarking;

	public class Semester {

		private int semester = 0;
		private Subject[] semSubjects = null;

		public Semester(int sem, String[] subjArray,double[] subjMarks) {
			semSubjects = new Subject[subjArray.length];
			semester = sem;
			for (int i = 0; i < semSubjects.length; i++) {
				semSubjects[i] = new Subject(subjArray[i]);
				semSubjects[i].setMark(subjMarks[i]);
			}

		}

		public double getTotal() {
			double total = 0;

			for (Subject subItr : semSubjects)
				total += subItr.getMark();

			return total;
		}

		public double getPercentage() {
			double total = getTotal();
			return total / (semSubjects.length * 100) * 100;
		}

		public boolean isEven() {
			return (semester % 2 == 0);
		}
	}

	

	




