abstract class Vehical{
	 abstract void drive();
	static void sex(){
	System.out.print("Male");
	}
}
abstract class Bike extends Vehical{
	//void drive(){
	//System.out.print("i'm driving bike");
	//}
}
class AbstractMain{
public static void main(String[] args){
	//Bike b=new Bike();
	//Bike.drive();
	Bike.sex();	
}
}