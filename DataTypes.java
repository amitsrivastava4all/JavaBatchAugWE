strictfp class DataTypes{
public static void main(String args[]){
byte x = (byte)130;  // Explicit TypeCasting
long t = 100L;
byte bb = 100;
long t2 = bb;  // Implicit TypeCasting
System.out.println("Byte is "+x);
byte a = 10;
byte b = 20;
byte c = (byte)(a + b);
a+=b;  // a = a + b
System.out.println("C is "+c+" A is "+a);
float p = 10.20f;
double t1 = 10.257643678446780;
boolean att = true;
char x1 = 'न';
System.out.println(x1);

String name = new String("Amit");
String name2 = new String("Amit");
String name3 = name;
if(name==name3){
System.out.println("Same Ref ");
}
else
{
System.out.println("Not Same Ref ");
}
}
}