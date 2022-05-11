package MemberManipulation;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Library lib = new Library();
		int choice;
		do {
			System.out.println("1.Add Member");
			System.out.println("2.View All Members");
			System.out.println("3.Search Member by address");
			System.out.println("4.Exit");
			System.out.println("Enter your choice:");
		    choice = sc.nextInt();
			sc.nextLine();
			switch(choice) 
			{
			case 1: 
				    System.out.println("Enter the id:");
			        int id = sc.nextInt();
			        sc.nextLine();
			        System.out.println("Enter the name:");
			        String name = sc.nextLine();
			        System.out.println("Enter the address:");
			        String address = sc.nextLine();
			        lib.addMember(new Member(id,name,address));
			        break;
			        
			case 2: 
				   for(Member m: lib.viewAllMembers()) 
			        {
						System.out.println("id:"+m.getMemberId());
						System.out.println("Name:"+m.getMemberName());
						System.out.println("Address:"+m.getAddress());
			       }
				   if(lib.viewAllMembers().isEmpty()) {
					   System.out.println("The list is empty");
				   }
				   break;
			case 3:
				  System.out.println("Enter the address:");
				  String addr = sc.nextLine();
				  int x=0;
				  for(Member m: lib.viewMembersByAddress(addr)) {
					  if(m.getAddress().equals(addr)) {
						  System.out.println("id:"+m.getMemberId());
							System.out.println("Name:"+m.getMemberName());
							System.out.println("Address:"+m.getAddress());
						    x=1;
					  }
				  }
				  if(x==0) System.out.println("None of the member is from "+addr);
				  break;
			}
			
		}while(choice!=4);
		sc.close();
		

	}

}
