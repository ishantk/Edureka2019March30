package co.edureka.model;

public class Manager {
	
	Integer mid;
	String name;
	String department;
	
	Project project; // HAS-A Relationship | 1 to 1
	
	public Manager() {
	
	}

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Manager [mid=" + mid + ", name=" + name + ", department=" + department+"]";
	}

}
