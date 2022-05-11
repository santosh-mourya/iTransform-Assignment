import java.util.*;
public class Employee   {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<EmpDetails> al = new ArrayList<>();
		System.out.print("Enter number of employees: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String name = sc.nextLine();
			int id = sc.nextInt();
			sc.nextLine();
			String role = sc.nextLine();
			al.add(new EmpDetails(name,id,role));
		}
		al.sort((n1,n2)->n1.getName().compareTo(n2.getName()));
		
		Iterator itr = al.iterator();
		for(EmpDetails e : al)
			System.out.println(e.getName()+" "+e.getId()+" "+e.getRole());
		

	}

}
