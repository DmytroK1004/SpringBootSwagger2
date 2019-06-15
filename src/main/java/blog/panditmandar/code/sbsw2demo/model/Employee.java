package blog.panditmandar.code.sbsw2demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Employee Model Object to Persist Employee Data
 * 
 * @author Mandar Pandit
 */
@Entity
@Table(name = "employees")
@ApiModel(description = "All Details about the Employee Model")
public class Employee {

	@ApiModelProperty(notes = "The Database Generated Employee ID Value")
	private Long id;

	@ApiModelProperty(notes = "The First Name of an Employee")
	private String firstName;

	@ApiModelProperty(notes = "The Last Name of an Employee")
	private String lastName;

	@ApiModelProperty(notes = "The Email Address of an Employee")
	private String emailID;

	public Employee() {

	}

	public Employee(String first_name, String last_name, String email_id) {
		this.firstName = first_name;
		this.lastName = last_name;
		this.emailID = email_id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email_address", nullable = false)
	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailID=" + emailID
				+ "]";
	}
}
