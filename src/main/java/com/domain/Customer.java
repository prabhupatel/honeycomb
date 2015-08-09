package com.domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    @Column(name ="first_Name")
    private String firstName;
    
    @Column(name ="last_Name")
    private String lastName;
    
    private String fullAddress;
    
    private String fullAddress1;
    
    public String getFullAddress() {
		return fullAddress;
	}
    
    

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	
	
	private Integer age;
    

    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	protected Customer() {}

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}



	public String getFullAddress1() {
		return fullAddress1;
	}



	public void setFullAddress1(String fullAddress1) {
		this.fullAddress1 = fullAddress1;
	}

	
}
