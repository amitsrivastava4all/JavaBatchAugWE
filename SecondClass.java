class FirstClass{
/*
Java is a package centric language
public - now it is access outside the package , our code is in different package 
(folder)
and java command is in different package
static - It is get loaded in the Memory when ur class is loaded
void - no return 
main - method name
String - It is a predefine class in Java, and it represent collection of chars
arr[] - it is a string arguments
String arr[] - it is a command line arguments

... variable arity or variable arguments ( Java 1.5)

System - It is a predefine class
out - it is a predefine object inside the System Class
out is a object of PrintStream class
and println is a member method of PrintStream class
int e = Integer.parseInt(String)
*/

static public  void main(String ...arr){
	if(arr.length==0){
		System.out.println("Sum is 0 ");
	}
	else{
		int sum = 0;
		for(String w:arr){
		System.out.println("W is "+w);
		sum+=Integer.parseInt(w);
		}
		System.out.println("Sum is "+sum);
	}

	/*int a = Integer.parseInt(arr[0]);  //4 Byte
	int b =Integer.parseInt(arr[1]);
	int c = a + b;
	System.out.println("Sum is "+c);*/
}
}