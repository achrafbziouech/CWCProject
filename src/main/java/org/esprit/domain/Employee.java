package org.esprit.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Employee
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Employee implements Serializable {

	   
	@Id
	private int employee_id;
	private float Salary;
	private String first_name;
	private String last_name;
	private String home_address;
	private String email_address;
	private long telephone_number;
	private String login;
	private String password;
	private long cin_number;
	private Date birth_day;

	
	private static final long serialVersionUID = 1L;
	//@ManyToOne
	//@JoinColumn(name = "Admin_id_fk")
	//private Administrator Admin;
	
  
	 
		
	public Employee() {
		super();
	}   
	
		

	



		@GeneratedValue(strategy=GenerationType.AUTO)
	public int getEmployee_id() {
		return this.employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public float getSalary() {
		return Salary;
	}
	public void setSalary(float salary) {
		Salary = salary;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getHome_address() {
		return home_address;
	}
	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public long getTelephone_number() {
		return telephone_number;
	}
	public void setTelephone_number(long telephone_number) {
		this.telephone_number = telephone_number;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getCin_number() {
		return cin_number;
	}
	public void setCin_number(long cin_number) {
		this.cin_number = cin_number;
	}
	public Date getBirth_day() {
		return birth_day;
	}
	public void setBirth_day(Date birth_day) {
		this.birth_day = birth_day;
	}







	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", Salary=" + Salary
				+ ", first_name=" + first_name + ", last_name=" + last_name
				+ ", home_address=" + home_address + ", email_address="
				+ email_address + ", telephone_number=" + telephone_number
				+ ", login=" + login + ", password=" + password
				+ ", cin_number=" + cin_number + ", birth_day=" + birth_day
				+ "]";
	}

	
   
}
