package biblioteca;

public class Livro {

	private String titulo;
	
	public Livro (String titulo) {
		this.titulo = titulo; 
		
	}
	
	public String getTitulo () {
		return titulo;
	}
	
	@Override
	public String toString() {
	    return titulo;
	}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}
	
	
	
	

	
	
	
	

}
