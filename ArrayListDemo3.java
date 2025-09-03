// Arraylist program 
import java.util.ArrayList;
public class ArrayListDemo3 {
	public static void main(String[] args){
		ArrayList<String> names = new ArrayList<>();
				names.add("shannu");
				names.add("azzu");
				names.add("tanu");
				String searchName = "Bob";
				if (names.contains(searchName)){
						System.out.println(searchName + " is in  the list.");
				}else{
						System.out.println(searchName + " is not in the list.");
				}
		}
}
