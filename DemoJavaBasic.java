package Day1Problems;

public class DemoJavaBasic {
int age;
DemoJavaBasic(int age){
	this.age=age;
}
	void displayIfAdult(){
		String isAdult=this.age> 18 ?"Adult":"Not Adult";
		System.out.println("person is" +isAdult);
	}
	public static void main(String[] args) {
		DemoJavaBasic ram= new DemoJavaBasic(10);
		DemoJavaBasic kapil=new DemoJavaBasic(20);
		System.out.println(ram instanceof DemoJavaBasic);
		ram.displayIfAdult();
		kapil.displayIfAdult();
	}
}

