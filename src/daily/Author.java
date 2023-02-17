/**
 * @author N'ZO LAGOU
 * Créer une classe appelée Authorest conçu comme indiqué dans le diagramme de classes. Il contient:

Trois variables de membre privées : name(String), email(String) et gender(char de 'm' ou 'f' - vous pouvez également utiliser une
 variable booléenne appelée isMale ayant la valeur true ou false).
Un constructeur pour initialiser le name, emailet genderavec les valeurs données. (Il n'y a pas de constructeur par défaut, car il 
n'y a pas de valeur par défaut pour le nom, l'e-mail et le sexe.)
Getters/setters publics : getName(), getEmail(), setEmail()et getGender(). (Il n'y a pas de setters pour le nom et le sexe, car ces
 propriétés ne sont pas conçues pour être modifiées.)
Une toString()méthode qui renvoie "name (gender) at email", par exemple, "Tan Ah Teck (m) at ahTeck@somewhere.com".

Créer un Bookqui est écrit par un Author- Utiliser une Objectvariable membre " "
Supposons qu'un livre est écrit par un (et exactement un) auteur.
La Bookclasse (comme indiqué dans le diagramme de classes) contient les membres suivants :

Quatre variables membres privées : name(String), author(une instance de la classe Author que nous venons de créer, en supposant que 
chaque livre a exactement un auteur), price(double) et qty(int).
Les getters et setters publics : getName(), getAuthor(), getPrice(), setPrice(), getQty(), setQty().
A toString()qui renvoie « 'nom-du-livre' par nom-auteur (sexe) dans l'e-mail ». Vous pouvez réutiliser la méthode toString() de l'auteur, 
qui renvoie « nom-auteur (sexe) à l'adresse e-mail ».
Remarques : Dans cet exemple, utilisez « name » pour la classe Book au lieu de « title » pour illustrer un nom de variable dans les classes 
Author et Book, mais elles sont distinctes.
 */




package daily;

public class Author {
	//attribut
	private String name;
	private String email;
	private char gender;
	private boolean isMale ;
	
	// constructor with parameter
	public Author(String name, String email, char gender, boolean isMale) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.isMale = isMale;
	}
	
	

	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}



	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public boolean isMale() {
		return isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	//Une toString()méthode qui renvoie name,gender....
	
	@Override
	public String toString() {
		return "Author [name= " + name + ", email= " + email + ", gender= " + gender + ", isMale= " + isMale + "] ";
	}

	
	
	
}
