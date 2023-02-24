package week5.day1;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("the id is "+id);
	}
	public void getStudentInfo(int id,String name) {
		System.out.println("the id is "+id+" and name is "+name);
	}
	public void getStudentInfo(long phoneNo,String emailId) {
		System.out.println("the id is "+phoneNo+" and name is "+emailId);
	}
	public static void main(String[] args) {
		Students txt=new Students();
		txt.getStudentInfo(2154);
		txt.getStudentInfo(2154,"maddy");
		txt.getStudentInfo(63787477642l,"maddy234@gmail.com");
		
		
		
	}
	
	

}