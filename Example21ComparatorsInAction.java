package slideDeckChallenges;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Example21ComparatorsInAction {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(30, "Niamh");
		Employee e2 = new Employee(40, "Claire");
		Employee e3 = new Employee(90, "Una");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		Collections.addAll(list, e1, e2, e3);
		
		//System.out.println(list);
		
		System.out.println("Original List");
		viewAll(list);
		
		System.out.println("Sort by Name");
		Collections.sort(list, new CompareEmployeeName());;
		viewAll(list);
		
		System.out.println("Sort by Age");
		Collections.sort(list, new CompareEmployeeAge());;
		viewAll(list);
		
		System.out.println("Sort by Reverse Order");
		Collections.sort(list, new CompareEmployeeByNameReverseOrder());;
		viewAll(list);
		
		
	}

	/**
	 * @param list
	 */
	public static void viewAll(ArrayList<Employee> list) {
		for (Employee e : list) {
			System.out.print(e.getName() + "\t");
			System.out.println(e.getAge());
		}
		System.out.println();
	}

}
