
package com.mycompany.exemplooo;

public class Principal {

    public static void main(String[] args) {
        // Instanciar objeto
        Usuario usu = new Usuario();
        
        // Passar os dados para classe usuário
//        usu.setNome("Marcello");
//        usu.setIdade(18);
//        usu.setEmail("marcello@gmail.com");
//        usu.setTelefone("(13) 1234-5678");

        // Chamar o método cadastrarDados()
        usu.cadastrarDados();
        
        // Chamar método mostrarDados() da classe Usuario
        usu.mostrarDados();
    }
}
