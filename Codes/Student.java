
public class Student extends Object {
	String name;
	int rollno;
	int marks[] ;
	String course;
	public int hashCode(){
		return 1;
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
		for(int mark: marks){
			System.out.println(mark);
		}
		System.out.println("Course "+course);
	}
}
