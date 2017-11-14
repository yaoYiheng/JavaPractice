class Human
{
	protected String name;
	protected int age;
	
	public  Human()
	{		
	}
	
	public  Human(String name, int age)
	{
		this.age = age;
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getInfor() {
		String strInf = name +": "+ age;
		return strInf;
		
	}
}

class Student extends Human{
	public String school;
	
	public Student() 
	{
	}
	
	public Student(String name, int age, String school)
	{
		super(name, age);
		this.school = school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	public String getInfor() {
		//String strInf = name +": "+ age + ":" + school; //error,因为name跟age为私有
		String strInf = super.getInfor()+ ": " + school;
		return strInf;
	}
}
public class TestStudent {
	public static void main(String[] args) {
		Student st1 =  new Student("张三", 22,"航天");
		st1.getInfor();
		 
}
