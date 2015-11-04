package assignment5;

public class Person implements Comparable {
	
	private String firstName;
	private String lastName;
	
	Person(String str1, String str2){
		this.firstName = str1;
		this.lastName = str2;
	}
	
	public Person() {
		
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getLastName() {
		return this.lastName; 
	}

	@Override
	public int compareTo(Object o) {
		Person p = (Person) o;
		String fullName = this.firstName + " " + this.lastName;
		String personFullName = p.firstName + " " + p.lastName;
		if (fullName.compareTo(personFullName)>0) {
			return +1;
		}else if (fullName.compareTo(personFullName)<0) {
			return -1;
		}else{
			return 0;
		}
	
	}
	
	public boolean equals(Object o) {
		Person p = (Person) o;
		if (p.equals(p)) {
			return true;
		}else {
			return false;
		}
	
	}
	
	@Override
	public int hashCode() {
		return lastName.hashCode();	
	}
	
	@Override
	public String toString() {
		String fullName = this.getFirstName() + " " + this.getLastName();
		return fullName;
	}

}
