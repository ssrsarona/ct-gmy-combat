package com.ctcombat.gymcombat.menu;
import java.util.*;

public class MenuUnidade {
    Scanner scM = new Scanner(System.in);
    public int exibirMenuUni()
    {
        
            System.out.println("------------------------------");
            System.out.println("|        UNIDADES           |");
            System.out.println("------------------------------");
            System.out.println("| 1 - Cadastrar             |");
            System.out.println("| 2 - Listar                |");
            System.out.println("| 3 - Consultar             |");
            System.out.println("| 4 - ALterar               |");
            System.out.println("| 5 - Desativar             |");
            System.out.println("| 6 - Reativar              |");
            System.out.println("| 0 - Sair                  |");
            System.out.println("------------------------------");
            System.out.print("| opcao: ");
            return scM.nextInt();
     }
}
