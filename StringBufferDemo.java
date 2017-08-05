class StringBufferDemo{
public static void main(String args[]){
StringBuilder sb = new StringBuilder(100);
System.out.println(sb.capacity());
System.out.println(sb.length());
sb.append("How are You I am Fine....khlfgkhjflkjhfljkhfjlkhklfjhljfkhjlfgjkhhlj");
System.out.println(sb.capacity());
System.out.println(sb.length());
sb.ensureCapacity(2000);
sb.append("Ok");
System.out.println(sb.capacity());
System.out.println(sb.length());
}
}