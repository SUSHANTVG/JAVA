package workers;

public abstract class Emp {
	private int id;
	private static int count;
	private String name;
	private String email;
	private double basic;
	private int deptId;
	
	static {
		count = 100;
	}
	
	public Emp(String name, String email, double basic, int deptId) {
		id = count++;
		this.name = name;
		this.email = email;
		this.basic = basic;
		this.deptId = deptId;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", email=" + email + ", basic=" + basic + ", deptId=" + deptId
				+ "]";
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getBasic() {
		return basic;
	}

	public abstract double calNetSalary();
}
