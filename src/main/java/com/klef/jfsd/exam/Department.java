package com.klef.jfsd.exam;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "department_table")
public class Department 
{
	@Id
	@GeneratedValue(strategy =  GenerationType.AUTO)
	private int DepartmentId;
	private String Name;
	private String location;
	private String HoDName;
	
	
	public int getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHoDName() {
		return HoDName;
	}
	public void setHoDName(String hoDName) {
		HoDName = hoDName;
	}
	@Override
	public String toString()
	{
		return "Department [DepartmentId=" + DepartmentId + ", Name=" + Name + ", location=" + location + ", HoDName="
				+ HoDName + "]";
	}
	
}
