public class Student {
	String name;
	int age,number;
	public Student()
	{
	}
	public Student(String name,int age,int number)
	{
		this.name=name;
		this.age=age;
		this.number=number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void printf()
	{
		System.out.println("프린트는"+this.name);
	}

	
	
	
}
