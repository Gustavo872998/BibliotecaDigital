package biblioteca;

import java.util.ArrayList; 

public class Biblioteca {


	    private ArrayList<Livro> livros = new ArrayList<>();

	    public void adicionarLivro(Livro livro) {
	        livros.add(livro);
	    }

	    public ArrayList<Livro> getLivros() {
	        return livros;
	    }

	}
	
	
	
	
	

