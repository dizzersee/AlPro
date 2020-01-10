import java.util.ArrayList;

/**
* Lösungen von einem Studenten
*/
public class Main {
	public static void main(String[] args) {
		//schleife();
		Angestellter a = new Angestellter("A", "B", 40, 10);
		a.print();
		a.altern();
		a.gehaltPlus(10);
		a.print();
		Praktikant p = new Praktikant("A", "B", 18);
		p.print();
		p.gehaltPlus(10);
		p.print();
	}
	
	public static void schleife() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		Personlist list = new Personlist();
		Person p = new Person("", "");
		int i = 0;
		String sur = "";
		String first = "";
		while(i != 1) {
			System.out.println("next command:");
			String s = sc.nextLine();
			if(s.contentEquals("add")) {
				System.out.println("first name:");
				first = sc.nextLine();
				System.out.println("sur name:");
				sur = sc.nextLine();
				p = new Person(first, sur);
				list.add(p);
			}
			else if(s.contentEquals("print")) {
				list.print();		
			}
			else if(s.contentEquals("delete")) {
				System.out.println("name:");
				sur = sc.nextLine();
				list.delete(sur);
				list.print();
			}
			else if(s.contentEquals("exit")) {
				i = 1;
			}
			else {
				System.out.println("Kein gültiger Command");
			}
		}
		return;
	}
}

class Person {
	private String firstname;
	private String surname;
	
	public Person(String f, String s) {
		firstname = f;
		surname = s;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String s) {
		firstname = s;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String s) {
		surname = s;
	}
}

class Personlist extends ArrayList<Person>{
	
	public void print() {
		if(this.size() == 0) {
			return;
		}
		for(int i = 0; i < this.size()-1; i++) {
			System.out.print(this.get(i).getFirstname() + " " + this.get(i).getSurname() + ", ");
		}
		System.out.println(this.get(this.size()-1).getFirstname() + " " + this.get(this.size()-1).getSurname());
	}
	public void delete(String s) {
		for(int i = this.size()-1; i > -1; i--) {
			if(this.get(i).getSurname().contentEquals(s)) {
				this.remove(i);
			}
		}
	}
}


