package InsuranceBazaar;
import java.util.*;
import java.util.Map.Entry;
public class Main {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of names you want to store:");
		int n=sc.nextInt();
		Bazaar b=new Bazaar();
		for(int i=0;i<n;i++) {
			System.out.println("Enter the PoliceID:");
			int pid=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the policy Name:");
			String name=sc.nextLine();
			b.addPolicyDetails(pid,name);
		}
		Set<Entry<Integer,String>> eset=b.getPolicyMap().entrySet();
		for(Entry<Integer,String> e:eset) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("Enter the policy type to search");
		String key=sc.next();
		List<Integer>policies =b.searchBasedOnPolicyType(key);
		for(Integer p:policies) {
			System.out.println(p);
		}

	}

}
