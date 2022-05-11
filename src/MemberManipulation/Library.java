package MemberManipulation;
import java.util.*;
public class Library {

	List<Member> memberList = new ArrayList<>();
	
	public void addMember(Member memberObj) {
		memberList.add(memberObj);
	}
	
	public List<Member> viewAllMembers(){
		
		return memberList;
	}
	
	public List<Member> viewMembersByAddress(String address){
		return memberList;
	}
	
	

}
