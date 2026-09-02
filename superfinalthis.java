class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void show() {
		System.out.println("Name: " + name + "\nAge: " + age);
	}
}
class Student extends Person {
	String course;
	final String college = "ANITS";
	
	Student(String name, int age, String course) {
		super(name, age);
		this.course = course;
	}
	
	void show() {
		super.show();
		System.out.println("Course: " + course + "\nCollege: " + college);
	}
}

class superfinalthis {
	public static void main(String[] args) {
		Student s = new Student("Kaushal", 18, "CSE-AI&ML");
		
		s.show();
	}
}