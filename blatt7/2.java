/**
* Lösungen von einem Studenten
*/
class Angestellter {
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	public Angestellter(String vorname, String nachname, int alter, int gehalt) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
	public String getVorname() {
		return this.vorname;
	}
	public String getNachname() {
		return this.nachname;
	}
	public int getAlter() {
		return this.alter;
	}
	public int getGehalt() {
		return this.gehalt;
	}
	public void altern() {
		this.alter++;
	}
	public void gehaltPlus(int g) {
		this.gehalt = this.gehalt+g;
	}
	public void print() {
		System.out.println(getVorname() + " " + getNachname() + ", Alter: " + getAlter() + ", Gehalt: " + getGehalt());
	}
}

class Praktikant extends Angestellter {
	public Praktikant(String vorname, String nachname, int alter) {
		super(vorname, nachname, alter, 400);
	}
	public void gehaltPlus(int g) {
		return;
	}
}
