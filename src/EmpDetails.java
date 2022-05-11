
public class EmpDetails  {
    String name;
    int id;
    String role;
    EmpDetails(){}
    EmpDetails(String name, int id, String role){
    	this.name = name;
    	this.id = id;
    	this.role = role;
    }
    public String getName() {
    	return this.name;
    }
    public int getId() {
    	return this.id;
    }
    public String getRole() {
    	return this.role;
    }
}
