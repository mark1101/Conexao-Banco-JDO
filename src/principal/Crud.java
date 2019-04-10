/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author mark_
 */
import javax.jdo.*;
import com.objectdb.Utilities;
import javax.persistence.EntityManager;

public class Crud {
    
    PersistenceManager pm = Utilities.getPersistenceManager("banco/Pessoa_jdo.odb");
    
    public void cadastraPessoa()
    {
        Pessoa p[] = new Pessoa[12];
        pm.currentTransaction().begin();
        
        p[0] = new Pessoa("Joao", 56, "masc");
        p[1] = new Pessoa("Thiago", 32, "masc");
        p[2] = new Pessoa("Carlos", 67, "masc");
        p[3] = new Pessoa("Mariana", 55, "fem");
        p[4] = new Pessoa("Joana", 43, "fem");
        p[5] = new Pessoa("Fabricio", 60, "masc");
        p[6] = new Pessoa("Silva", 35, "masc");
        p[7] = new Pessoa("Mark", 54, "masc");
        p[8] = new Pessoa("Willian", 32, "masc");
        p[9] = new Pessoa("Carla",68,"fem");
        p[10] = new Pessoa("Sther", 43, "fem");
        p[11] = new Pessoa("Kayke",47,"masc");
        for (int i = 0; i < 12; i++) {
            pm.makePersistent(p[i]);
        }
        pm.currentTransaction().commit();
      
    }
    public void acessaTodasPessoas()
    {
        Extent<Pessoa> extent = pm.getExtent(Pessoa.class, false);
        
        for (Pessoa p : extent)
        {
            System.out.println(p);
        }
        
        
        
    }
    public void acessaPessoasMaior()
    {
        Extent<Pessoa> extent = pm.getExtent(Pessoa.class, false);
        for (Pessoa p : extent)
        {
            if (p.getIdade() > 50)
            {
                System.out.println(p);
            }
        }
        
    }
    public void deleta()
    {
        Extent<Pessoa> extent = pm.getExtent(Pessoa.class, false);
        pm.currentTransaction().begin();
        
        for (Pessoa p : extent)
        {
            if (p.getNome().equals("Joao") || p.getNome().equals("Silva"))
            {
                pm.deletePersistent(p);
            }   
        }
        pm.currentTransaction().commit();
    }
    public void addSobreNome()
    {
        Extent<Pessoa> extent = pm.getExtent(Pessoa.class, false);
        pm.currentTransaction().begin();   
        
        for (Pessoa p : extent)
        {
            if (p.getIdade() > 65)
            {
                p.setNome(p.getNome() + " SOBRENOME");
            }
        }
        pm.currentTransaction().commit();
    }
   
}
