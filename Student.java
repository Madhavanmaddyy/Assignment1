package week5.day1;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("maddy");
	}
	public void studentDept() {
		System.out.println("eee");
	}
	public void studentId() {
		System.out.println("151674256");
	}
	public static void main(String[] args) {
		Student dts=new Student();
		dts.collegeName();
		dts.collegeCode();
		dts.collegeRank();
		dts.deptName();
		dts.studentName();
		dts.studentDept();
		dts.studentId();
	}

}
