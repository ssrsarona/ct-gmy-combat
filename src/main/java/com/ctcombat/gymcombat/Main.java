package com.ctcombat.gymcombat;
import java.util.*;

import com.ctcombat.gymcombat.menu.MenuSupervisor;
import com.ctcombat.gymcombat.usuario.Gerente;
import com.ctcombat.gymcombat.usuario.Perfil;
import com.ctcombat.gymcombat.usuario.Supervisor;
import com.ctcombat.gymcombat.usuario.Usuario;
public class Main {

    public static Scanner sc = new Scanner(System.in);
    private static Map<String, Usuario> mapUsuario = new HashMap<>();
    public static void main(String[] args) {
        
        mapUsuario.put("000", new Usuario("000", "senha123", Perfil.SUPERVISOR));
        boolean rodando = true;
        while(rodando)
        {
            System.out.println("bem-vindo ao sistema de gerenciamento");
            System.out.println("Escolha a opcao:");
            System.out.println("1 - login");
            System.out.println("2 - sair");
            System.out.print("opcao: ");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) 
            {
                case 1: 
                {
                    System.out.println("-------LOGIN-------");

                    System.out.print("CPF: ");
                    String cpfLogin = sc.nextLine();
                    
                    System.out.print("SENHA: ");
                    String senhaLogin = sc.nextLine();

                    Usuario userEncontrado = mapUsuario.get(cpfLogin);

                    if(userEncontrado !=null && userEncontrado.getSenha().equals(senhaLogin))
                    {

                        System.out.println("LOGIN realizado com sucesso!");
                        System.out.println("Bem-Vindo " + userEncontrado.getPerfil());

                        switch (userEncontrado.getPerfil()) 
                        
                        {
                            case SUPERVISOR:
                            { 
                                Supervisor supervisor = new Supervisor();
                                supervisor.iniciar(sc, mapUsuario);
                                break; 
                            }
                            case GERENTE: 
                            { new Gerente().menu(sc, mapUsuario); break; }
                            default: { System.out.println("ERRO!: Perfil NAO CADASTRADO"); }
                        }
                    }else { System.out.println("ERRO!: CPF ou Senha incorreta!");}

                    break;
                }

                case 2:
                { 
                    System.out.println("Saindo...");
                    rodando = false;
                    break;
                }
                default:{ System.out.println("ERRO!: OPCAO INVALIDA!");}
                
            }

        }
    } 
}



