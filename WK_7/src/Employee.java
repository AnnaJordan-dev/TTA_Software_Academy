
public class Employee {
	int eid;
	String ename;
	double esalary;
	String eemail;
	String edepartment;
	
	public int geteid() {
		return eid;
	}
	
	public void seteid(int eid) {
		this.eid = eid;
	}
	
	public String getename() {
		return ename;
	}
	
	public void setename(String ename) {
		this.ename = ename;
	}
	
	public String geteemail() {
		return eemail;
	}
	
	public void seteemail(String eemail) {
		this.eemail = eemail;
	}
	
	public double getesalary() {
		return esalary;
	}
	
	public void setesalary(double esalary) {
		this.esalary = esalary;
	}
	
	public String getedepartment() {
		return edepartment;
	}
	
	public void setedepartment(String edepartment) {
		this.edepartment = edepartment;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.seteid(101);
		e1.setename("Anna");
		e1.seteemail("anna@email.com");
		e1.setesalary(20.000);
		e1.setedepartment("HR");
		
		System.out.println(e1.geteid());
		System.out.println(e1.geteemail());
		System.out.println(e1.getename());
		System.out.println(e1.getesalary());
		System.out.println(e1.getedepartment());
		
	}
}
