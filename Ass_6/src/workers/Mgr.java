package workers;

public class Mgr extends Emp {
	private double perfBonus;
	
	public Mgr(String name, String email, double basic, String deptId, double perfBonus) {
		super(name, email, basic, deptId);
		this.perfBonus = perfBonus;
		
	}

	@Override
	public double calNetSalary() {
		return getBasic() + perfBonus;
	}

	@Override
	public String toString() {
		return "Manager "+super.toString()+"\n[perfBonus=" + perfBonus + "]";
	}

}
