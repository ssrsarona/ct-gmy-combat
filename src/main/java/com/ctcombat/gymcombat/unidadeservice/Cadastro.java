package com.ctcombat.gymcombat.unidadeservice;
import java.util.*;

import com.ctcombat.gymcombat.unidade.Unidade;
import com.ctcombat.gymcombat.usuario.Perfil;
import com.ctcombat.gymcombat.usuario.TipoUnidade;
import com.ctcombat.gymcombat.usuario.Usuario;

public class Cadastro {
    public static List<Unidade> listaUnidades = new ArrayList<>();
    public void cadastro(Scanner sc){
        int rod;
        do{

            System.out.println("Nome da unidade:");
            String nomeDigitado = sc.nextLine();

            System.out.println("Endereco da Unidade:");
            String enderecoDigitado = sc.nextLine();

            System.out.println("Telefone da Unidade: ");
            String telefoneDigitado = sc.nextLine();

            System.out.println("--- Dados do Gerente da Unidade ---");

            System.out.print("Defina o User do Gerente: ");
            String userGerente = sc.nextLine();

            System.out.print("Defina a Senha do Gerente: ");
            String senhaGerente = sc.nextLine();

            Usuario novoGerente = new Usuario(userGerente, senhaGerente, Perfil.GERENTE);

            Unidade novaUnidade = new Unidade(nomeDigitado, enderecoDigitado, telefoneDigitado, TipoUnidade.SECUNDARIA, novoGerente);
            listaUnidades.add(novaUnidade);

            System.out.println("Cadastro concluido com sucesso!");
            System.out.println(" digite 1 - para novo cadastro ou digite 0 - para sair");
            rod = sc.nextInt();
            sc.nextLine();

        }while(rod != 0);
        
    }
}
