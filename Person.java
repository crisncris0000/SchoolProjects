public class Person  implements Comparable<Person>{
	
	protected String name;
	protected int birthYear;
	
	public Person() {
		name = "";
		birthYear = 0;
	}
	
	public Person(String name, int birthYear) {
		this.name = name; 
		this.birthYear = birthYear;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person) obj;
			if(name == person.name && birthYear == person.birthYear) {
				return true;
			}
				
		}
		return false;	
	}
	
	@Override
	public String toString() {
		String s = String.format("Person: Name: %30s | Birth Year: %4d", name, birthYear);
		return s;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
