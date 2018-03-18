package labs;

public class StudentDatabaseSystem {

	public static void main(String[] args) {
		
		student stu1 = new student ("Jude", "123234443");
		student stu2 = new student ("Paul", "223234443");
		student stu3 = new student ("Tomude", "323234443");	
		
		stu1.enroll("History303\n");
		stu1.enroll("English");
		
		stu1.showCourses();
		stu1.checkbalance();
		
		stu1.payCost(200);
		
		System.out.println(stu1.toString());
		
		
		
	}

}

class student {
	
	private static int ID=1000;
	private String name;
	private String ssn;
	private String email;
	private String phone;
	private String city;
	private String state;
	private String userId;
	private String course;
	private static final int costofcourse = 800;
	

	private int balance = 0;
	
	public student(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
		setEmail();
		setUserid();
		
			
	}
	
	private void setEmail() {
		email = name.toLowerCase() + "university.edu";
		System.out.println("Your email: " + email);
		
	}
	
	public void setUserid() {
		int max = 9000;
		int min = 1000;
		int random = (int) (Math.random() * (max - min));
		random = random + min;
		userId =  ID + random + ssn.substring(5);
		}
	
	public void enroll(String course) {
		this.course = this.course + course;
		System.out.println("New class is enrolled:" + course);
		balance = balance + costofcourse;
		
		
	}
	
	public void payCost(int amount) {
		balance = balance - amount;
		System.out.println("Balance="+ balance);
		
		
	}
	
	public void checkbalance() {
		System.out.println("Balance: " + balance);
	}
	
	
	public void showCourses() {
	System.out.println("All courses registered : " + course);	
		
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	public String toString() {
		return "[Name: " + name + "]\n[Courses: " + course + "]\n[Balance: " + balance + "]";
	}
	
	
}


