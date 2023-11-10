package operators;

public class MainPerson {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		Person raj=new Person();
		raj.age=20;
		System.out.println("Raj Age"+raj.age);
		
		System.out.println("its raj B'day,increase her age by 1");
		raj.increaseTheAgeBy1();
		System.out.println("raj age:"+raj.age);
		
	}

}
