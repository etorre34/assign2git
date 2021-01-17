package src.com.csc205.demos.module3;

import java.util.ArrayList;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		Holiday special = new Christmas();
		Holiday halloween = new Halloween();
		Holiday Thanksgiving = new Thanksgiving();
		
		List<Holiday> holidays = new ArrayList<>();
		
		holidays.add(special);
		holidays.add(halloween);
		holidays.add(Thanksgiving);
		
		for (Holiday holiday : holidays) {
			
			if (holiday instanceof Christmas) {
				((Christmas)holiday).decorateTree(); //Example of casting
			}
			holiday.celebrate();
			
			//if (!(holidays instanceof Halloween)) {
			//holiday.celebrate();
		}
		
		//System.out.println(special.getClass().getName());
		
	

	}

}
//}
