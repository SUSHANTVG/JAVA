package workers;

public class Worker extends Emp {

	private int hrsWorked;
	private double hrlyRate;
	
	public Worker(String name, String email, double basic, int deptId, int hrsWorked, double hrlyRate) {
		super(name, email, basic, deptId);
		this.hrsWorked = hrsWorked;
		this.hrlyRate = hrlyRate;
		
	}

	@Override
	public double calNetSalary() {
		return getBasic() + (hrsWorked * hrlyRate);
	}

	@Override
	public String toString() {
		return "Worker "+super.toString()+"\n[hrsWorked=" + hrsWorked + ", hrlyRate=" + hrlyRate + "]";
	}

}
