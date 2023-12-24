package oops_concepts;

public class encapsulation {
	
	private String name;
	private String company;
	private String department;
	private String food;	
	public String getFood() {
	   return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
	this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	
	public static void main(String[] args) {
		encapsulation myObj=new encapsulation();
		encapsulation myObj1=new encapsulation();
		encapsulation myObj2=new encapsulation();
		
		encapsulation myObj3=new encapsulation();
		
		
		myObj3.setFood("pani puri");
		System.out.println(myObj3.getFood());
		
		myObj2.setDepartment("mechanical");
		System.out.println(myObj.getDepartment());

	
		myObj.setName("monesh");
		System.out.println(myObj.getName());
		
		myObj1.setCompany("massil technologies");
		System.out.println(myObj1.getCompany());
				

	}

}
