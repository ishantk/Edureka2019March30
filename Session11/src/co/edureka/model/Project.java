package co.edureka.model;

public class Project {

	Integer pid;
	String name;
	String technology;
	
	Manager manager; // HAS-A Relation | 1 to 1
	
	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTechnology() {
		return technology;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}

	@Override
	public String toString() {
		return "Project [pid=" + pid + ", name=" + name + ", technology=" + technology+"]";
	}
	
}
