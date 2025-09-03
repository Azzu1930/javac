// ArrayList program
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo4 {
	public static void main(String[] args){
			ArrayList<String> cities = new ArrayList<>();
			cities.add("kaikuluru");
			cities.add("Bhimavaram");
			cities.add("akividu");
			cities.add("chennai");
			System.out.println("before sorting:" + cities);
			Collections.sort(cities);
			System.out.println("After sorting (ASC):" + cities);
			Collections.sort(cities,Collections.reverseOrder());
			System.out.println("After sorting (DESC):" + cities);
			}
	}
						
