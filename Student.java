package first;

public class Student extends Person {
	private int GreadYear;
	private String Course;
	private int Fees;
	private int Marks;

	public Student(String fname, String lname, int GreadYear, String Course, int Fees, int Marks) {
		super(fname, lname);
		this.GreadYear = GreadYear;
		this.Course = Course;
		this.Fees = Fees;
		this.Marks = Marks;
	}

	public int getGreadYear() {
		return GreadYear;
	}

	public void setGreadYear(int greadYear) {
		GreadYear = greadYear;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}

	public int getFees() {
		return Fees;
	}

	public void setFees(int fees) {
		Fees = fees;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	@Override
	public String toString() {
		return "Student [GreadYear=" + GreadYear + ", Course=" + Course + ", Fees=" + Fees + ", Marks=" + Marks
				+ ", toString()=" + super.toString() + "]";
	}

}
