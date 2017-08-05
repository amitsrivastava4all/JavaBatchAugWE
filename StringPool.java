class StringPool
{
public static void main(String args[]){
String t = "hello";
String a = "amit".intern(); // String Literal // 1 Object or 0 Object
String b = "amit".intern();
if(a==b){
System.out.println("same ref for amit");
}
else{
System.out.println("not same ref for amit");
}
t = null;
b = "shyam";
System.out.println("After Shyam ");
if(a==b){
System.out.println("same ref for amit");
}
else{
System.out.println("not same ref for amit");
}
String c = new String("ram").intern();  //2 or 1
String d = new String("ram").intern();
if(c==d){
System.out.println("Same Ref for ram ");
}
else
{
System.out.println("not same ref for ram");
}
}
}