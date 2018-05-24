public class Formateur{
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private int anneExperience;
	
	public Formateur(){
		
	}

	//Contructeur a deux parametres
	public Formateur(String nom, String prenom){
		this.nom=nom;
		this.prenom=prenom;
		
	}

	//Accecceurs des proprietes
	public String getNom(){
		
		return this.nom;
	}
	
	public String getPrenom(){
		
		return this.prenim;
	}
	public String getEmail(){
		
		return this.email;
	}
	public int getAnneExperience(){
		
		return this.anneExperience;
	}
	// Je viens apporté des modification à la classe étudiant
	
	public double moyenFormateur(double noteFormateur)
	{
		system.out.println("Juste un test");
	}
	
	
}