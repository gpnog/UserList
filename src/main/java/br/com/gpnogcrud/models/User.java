package br.com.gpnogcrud.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@SequenceGenerator(name = "seq_usuario", sequenceName = "seq_usuario", allocationSize = 1, initialValue = 1)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY, generator = "seq_usuario")
	private Integer id;
	
	@Column(nullable = false, unique = true, length = 45)
	private String email;
	
	@Column(nullable = false, length = 15)
	private String password;
	
	@Column(nullable = false, length = 45, name = "first_name")
	private String firstName;
	
	@Column(nullable = false, length = 45, name = "last_name")
	private String lastName;
	
	private boolean enabled;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	
	@Override
	public String toString() {
	return	"User{" +
		"id=" + id +
		", email='" + email + '\'' +
		", password='" + password + '\'' +
		", firstName='" + firstName + '\'' +
		", lastName='" + lastName + '\'' +
		'}';
				
	}
}
