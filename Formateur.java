public class Formateur{
	
	private String nom;
	
	private String prenom;
	
	private String email;
	
	private int anneExperience;
	
	public Formateur(){
		
	}
	//Accecceurs des proprietes
	public String getNom(){
		
		return this.nom;
	}
	
	public String getPrenom(){
		
		return this.prenom;
	}
	public String getEmail(){
		
		return this.email;
	}
	public int getAnneExperience(){
		
		return this.anneExperience;
	}
	
	//Modificateurs des propriétes
	
	public void setPrenom( String prenom){
		this.prenom= prenom;
		
	}
	
	public void setEmail( String email){
		this.email= email;
		
	}
	
	
	public void setAnneeExperience(int a){
		
		this.anneExperience=a;
	}
	
	
}
	
	
}