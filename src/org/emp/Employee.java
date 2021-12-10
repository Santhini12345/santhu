package org.emp;

public class Employee {
private void empId(String name) {
	System.out.println("Employee name:"+name);

}
private void empId(String address,int id) {
	System.out.println("Employee address:"+address+"\nEmployee id:"+id);

}
private void empId(int pincode,long phno,String panno) {
	System.out.println("Employee pincode:"+pincode+"\nEmployee phone no:"+phno+"\nEmployee pan no:"+panno);

}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId("santhini");
	e.empId("karur", 2580);
	e.empId(624620, 9786229942L, "GHTRT2345A");
	
	
	
	
	e.empId("sasikumar");
	e.empId("karur", 4561);
	e.empId(639001, 9894619822L, "ABCDE1235Q");
}
}