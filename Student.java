
public class Student {//extends Object {
	
	private String name;  // Lazy
	private int rollno;
	private int marks[] ;
	/**
	 * this is course contains e.g. MCA, BCA
	 */
	private String course;
	/**
	 * 
	 */
	private String collegeName;
	private String phone;
	private String email;
	
	static String branch;  // Eager
	
	
	
	public int getRollno() {
		return rollno;
	}
	
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public static String getBranch() {
		return branch;
	}
	public static void setBranch(String branch) {
		Student.branch = branch;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	/*
	public int hashCode(){
		return 1;
	}*/
	static {
		branch = "Noida";
		System.out.println("Static Loaded...");
	}
	private Student(){
		
		System.out.println("this is Default Cons Call");
		//this(1001,"Ram",new int[]{100,90,89},"BCA");
		collegeName = "KMC";
		/*name = "Ram";
		marks = new int[]{100,90,89};
		course = "MCA";
		rollno = 1001;*/
		//System.out.println("Default Call");
	}
//	public void Student(int ...x){
//		System.out.println("I am a Function ....");
//	}
	{
		System.out.println("Pre Cons 1 ");
	}
	{
		// Init Block
	//	Student e = new Student();
		System.out.println("this is Pre Cons 2 Call "+this.rollno + " "+this.name);
	}
	public Student(int rollno, String  name){
		this();
		if(rollno>0 && name!=null){
		this.rollno = rollno;
		this.name = name;
		System.out.println("This is 2 Param Cons Call");
		}
		else
		{
			System.out.println("Invalid Data...");
			
		}
	}
	public Student(int rollno, String  name, int marks[], String course){
		
		this(rollno , name);
		System.out.println("this is 3 params cons call");
		
		//this.rollno = rollno + this.collegeName.length() * 2;
		//this.name = name;
		this.marks = marks;
		this.course = course;
		//System.out.println("Param Call");
	}
	
	public void takeInput(int rollno , String name , int marks[], String course){
		this.rollno = rollno;  // Instance Variable = Local Variable
		this.name = name;
		
		this.marks =marks;
		this.course = course;
	}
	
	public void print(){
		
		System.out.println("Rollno "+this.rollno);
		System.out.println("NAme "+name);
		//System.out.println("Marks "+marks);
		System.out.println("Marks are :: ");
		if(marks!=null){
		for(int mark: marks){
			System.out.println(mark);
		}
		}
		System.out.println("Course "+course);
		System.out.println("College Name "+collegeName);
	}
}
