package biblioteca;

import java.util.ArrayList;

import javax.swing.*;

public class TelaPrincipal {

	public static void main(String[] args) {
		
		ArrayList<String> Livros = new ArrayList<>();	
	
		
JFrame tela = new JFrame ();

tela.setTitle("Biblioteca Digital");

tela.setSize(600,500);

tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel titulo = new JLabel ("Sistema de Biblioteca");
titulo.setBounds (180,20,200,30);
tela.add(titulo);	
tela.setLayout(null);

JLabel lblLivro = new JLabel ("Nome do Livro:");
lblLivro.setBounds(20,80,120,25);
tela.add(lblLivro);


JTextField txtLivro = new JTextField();
txtLivro.setBounds(140,80,250,25);
tela.add(txtLivro);


JButton btnCadastrar = new JButton ("Cadastrar");
btnCadastrar.setBounds(410,80,120,25);


ArrayList<Livro> livros = new ArrayList<>();

DefaultListModel<Livro> modeloLista =
        new DefaultListModel<>();

JList<Livro> listaLivros =
        new JList<>(modeloLista);

JScrollPane painelLista =
new JScrollPane(listaLivros);

painelLista.setBounds(20,130,510,180);

tela.add(painelLista);

tela.add(btnCadastrar);

   btnCadastrar.addActionListener(e -> {

    String nomeLivro = txtLivro.getText();
    
    Livro livro = new Livro(nomeLivro);

    livros.add(livro);

    modeloLista.addElement(livro);
    
    txtLivro.setText("");
    });
   
   JButton btnExcluir = new JButton("Excluir");

   btnExcluir.setBounds(20,330,120,30);

   tela.add(btnExcluir);
   
   btnExcluir.addActionListener(e -> {

	    Livro livroSelecionado =
	            listaLivros.getSelectedValue();

	    if(livroSelecionado == null) {
	    	

	        JOptionPane.showMessageDialog(
	            null,
	            "Selecione um livro!"
	        );

	        return;}

	        livros.remove(livroSelecionado);

	        modeloLista.removeElement(
	                livroSelecionado);
   });

	        JButton btnEditar = new JButton("Editar");

	        btnEditar.setBounds(160,330,120,30);

	        tela.add(btnEditar);
	        
	        btnEditar.addActionListener(e -> {

	            Livro LivroSelecionado =
	                    listaLivros.getSelectedValue();

	            if(LivroSelecionado == null) {

	                JOptionPane.showMessageDialog(
	                        null,
	                        "Selecione um livro!"
	                );

	                return;
	            }

	            String novoTitulo =
	                    JOptionPane.showInputDialog(
	                            null,
	                            "Novo título:",
	                            	LivroSelecionado.getTitulo()
	                    );

	            if(novoTitulo != null &&
	               !novoTitulo.trim().isEmpty()) {

	                LivroSelecionado.setTitulo(novoTitulo);

	                listaLivros.repaint();
	            }

	        });

	tela.setVisible(true);}}
