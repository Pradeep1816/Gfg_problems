class Employee{
	String name;
	int age;
	long ph_no;
	double salary;
Employee(String n,int a,long p,double s){
	name=n;
	age=a;
	ph_no=p;
	salary=s;
}
void printSalary(){
	System.out.println("Salary="+salary);
	}
}
class Officer extends Employee{
	public String specialization;
	Officer(String n,int a,long p,double s,String sp){
	super(n,a,p,s);
	specialization=sp;
	}
}
class Manager extends Employee{
	public String department;
	Manager(String n,int a,long p,double s,String dp){
	super(n,a,p,s);
	department=dp;
	}
}
class EmpDet extends Manager{
	EmpDet(String n,int a,long p,double s,String dp){
	super(n,a,p,s,dp);
	}
void Details(){
	System.out.println("MANAGER DETAILS:");
	System.out.println("NAME="+name);
	System.out.println("AGE="+age);
	System.out.println("PHONE NUMBER="+ph_no);
	System.out.println("SALARY="+salary);
	System.out.println("DEPARTMENT="+department);
	}
}
	 
class Empp{
	public static void main(String[] args){
	Officer obj1=new Officer("Alan",21,54321,1000.00,"Web Developer");
	Manager obj2=new Manager("Balu",22,12345,1100.00,"Software Dev");
	EmpDet obj3=new EmpDet("Balu",22,12345,1100.00,"Software Dev");
	obj1.printSalary();
	obj2.printSalary();
	obj3.Details();
	}
}
	