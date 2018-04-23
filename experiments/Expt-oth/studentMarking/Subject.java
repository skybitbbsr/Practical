package studentMarking;



	public class Subject {

		private String subject = null;
		private double mark = 0.0;

		public Subject(String subJect) {
			subject = subJect.toString();
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public boolean isBack() {
			return mark < 40;
		}

		public double getMark() {
			return this.mark;
		}

		public void setMark(double d) {
			// TODO Auto-generated method stub
			this.mark = d;
		}

	}



