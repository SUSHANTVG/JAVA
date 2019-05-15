package thread_utils;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;

import com.app.core.Emp;

public class SortHireDare implements Runnable {
	private List<Emp> l1;
	private String deptName;
	
	public SortHireDare(List<Emp> l1, String deptName) {
		this.l1 = l1;
		this.deptName = deptName;
	}
	
	@Override
	public void run() {
		Comparator<Emp> comp = ((e1, e2) -> ((LocalDate)e1.getHireDate()).compareTo(e2.getHireDate()));
		
		l1.stream().filter(e1 -> e1.getDeptName().equals(deptName)).sorted(comp).forEach(e1 -> System.out.println(e1));
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("datesort.dat"))) {
			oos.writeObject(l1);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
