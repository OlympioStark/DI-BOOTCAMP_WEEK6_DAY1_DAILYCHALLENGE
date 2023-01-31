package Exercice;

public class Person {
	
	String name;
	int age;
	double salary;

	public Person() {
		this.name = "Gilles";
		this.age = 23;
		this.salary = 120000;
	}

	public Person(String name, int age, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		this.salary = -1;
	}
	
	public void displayInfo () {
		System.out.println("Je suis " + name + " j'ai " + age + ".\nMon salaire est de " + salary);
	}

	public static void main(String[] args) {
		
		Person pers = new Person();
		pers.displayInfo();
		Person person = new Person("Chris", 23, 150000);
		person.displayInfo();

	}

}
