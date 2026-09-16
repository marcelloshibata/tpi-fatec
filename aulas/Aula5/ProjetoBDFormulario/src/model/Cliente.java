package model;

import control.Conexao;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class Cliente {
    Conexao con = new Conexao();
    
    private int codigo;
    private String nome;
    private String telefone;
    private String email;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void cadastrar() {
        String sql = "INSERT INTO cliente(codigo, nome, telefone, email) VALUES" +
                "(" + getCodigo() + ", '" + getNome() + "', '" + getTelefone() + "', '"
                + getEmail() + "')";
        
        con.executeSQL(sql);
        JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
    }
    
    public ResultSet consultar(){
        ResultSet tabela;
        
        String sql = "SELECT * FROM cliente";
        tabela = con.RetornarResultset(sql);
        return tabela;
    }
}
