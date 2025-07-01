package day5.multiinheritance.employee;
import java.util.Date;

public class Person {
	private String name;
	private long contactNo;
	private Date dateOfBirth;

	public Person(String name, long conatctNo, Date dateOfBirth) {
		super();
		this.name = name;
		this.contactNo = conatctNo;
		this.dateOfBirth = dateOfBirth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getConatctNo() {
		return contactNo;
	}

	public void setConatctNo(long conatctNo) {
		this.contactNo = conatctNo;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Person() {
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", contactNo=" + contactNo + ", dateOfBirth=" + dateOfBirth + "]";
	}

}
