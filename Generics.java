import java.util.Random;

public class Generics<A,S> {
	private A age;
	private S sex;
	
	public Generics(A ageOfPat, S gender) {
		age = ageOfPat;
	    sex = gender;
	}
	public A getAge() {
		return age;
	}
	public S getSex() {
		return sex;
	}
	public static Generics<Integer, String> results(int age, String sex) {	
		double price = 0;
		int dAge = age;
		String gend = sex;
		Random qoute = new Random();
	
	
		if(age >= 16 && age <=23) {
			price = qoute.nextInt(500) + 1000;
		}
		else if (age >= 24 ) {
			price = qoute.nextInt(500) + 1000;
			price = price/2;
		}
		else if(age >= 16 && age <=23 && sex.equals("F")) {
			price = qoute.nextInt(500) + 1000;
		}
		else if (age >= 24 &&  sex.equals("F")) {
		
			price = qoute.nextInt(500) + 1000;
			price = (price/2) *.1;
		
		}
		int subTotal = (int) price;
	
		return new Generics<Integer , String>(subTotal,sex);
			
	}
	public static void getResults(int age, String sex) {
		Generics<Integer, String> results = results(age, sex);
		System.out.println("");
		System.out.println("TOTAL MONTHLY TERM: $" + results.getAge()/12);
		System.out.println("TOTAL 6 MONTH TERM: $" + results.getAge()/2);
		System.out.println("TOTAL ANNUALLY TERM: $" + results.getAge());
	}
}
	 
	
