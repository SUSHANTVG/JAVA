package collection_utils;

import java.util.ArrayList;
import java.util.List;
import static java.time.LocalDate.parse;
import com.app.core.Emp;

public class CollectionUtils {
	public static List<Emp> populateList() {
		List<Emp> l1 = new ArrayList<Emp>();
		
		l1.add(new Emp("Sushant", 24, 99990, "Pune", parse("2018-06-02"), "RnD"));
		l1.add(new Emp("Prathamesh", 22, 75000, "Pune", parse("2018-07-14"), "RnD"));
		l1.add(new Emp("Rohit", 26, 56200, "Pune", parse("2018-09-18"), "Prod"));
		l1.add(new Emp("Nihar", 23, 10000, "Pune", parse("2018-12-21"), "Prod"));
		l1.add(new Emp("Kirtish", 24, 25800, "Pune", parse("2018-08-21"), "Prod"));
		l1.add(new Emp("Amey", 25, 25800, "Pune", parse("2018-07-31"), "Sales"));
		
		return l1;
	}
}
