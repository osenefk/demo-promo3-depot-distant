public class Etudiant{
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	// Constructeurs
	public Etudiant(){
		
	}
	
	public Etudiant(String nom){
		this.nom=nom;
	}
	
	public Etudiant(String nom, String prenom, String email){
		this.nom=nom;
		this.prenom=prenom;
		this.email=email;
	}
	
	// Getters
	public String getNom(){
		return this.nom;
		
	}
	
	public String getPrenom(){
		return this.prenom;
		
	}
	public String getEmail(){
		return this.email;
		
	}
	
	//Modificateurs
	public void setNom(String nom){
		this.nom=nom;
		
	}
	
	public void setPrenom(String prenom){
		this.prenom=prenom;
		
	}
	
	public void setEmail(String email){
		this.email=email;
		
	}
}