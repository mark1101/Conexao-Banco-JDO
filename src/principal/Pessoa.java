/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.jdo.*;
import com.objectdb.Utilities;
/**
 *
 * @author mark_
 */
@Entity
public class Pessoa implements Serializable{
    
    
    String nome; 
    int idade;
    String sexo;
    @Id @GeneratedValue
    private Long ID;
    
    private static final long serialVersionUID = 1L;
    
    
    public Pessoa(String nome, int idade, String sexo)
    {
        this.nome = nome; 
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", ID=" + ID + '}';
    }
    
    
}
