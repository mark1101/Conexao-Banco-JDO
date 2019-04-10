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

public class Main {
    
    public static void main(String[] args)
    {
        Crud c = new Crud();
        
        c.cadastraPessoa();
        System.out.println("TODAS PESSOAS CADASTRADAS");
        c.acessaTodasPessoas();
        System.out.println("");
        System.out.println("PESSOAS COM MAIS DE 50 ANOS ");
        c.acessaPessoasMaior();
        System.out.println("");
        System.out.println("DELETA PESSOAS COM NOME 'JOAO' OU 'SILVA'");
        c.deleta();
        c.acessaTodasPessoas();
        System.out.println("");
        System.out.println("ADICIONA SOBRENOME PARA PESSOAS COM MAIS DE 65 ANOS");
        c.addSobreNome();
        c.acessaTodasPessoas();
        
        
    }
}
