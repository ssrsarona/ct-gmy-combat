package com.ctcombat.gymcombat.menu;
import java.util.*;
import com.ctcombat.gymcombat.usuario.Usuario;

public class MenuSupervisor 
{
    Scanner sc = new Scanner(System.in);
    public int exibirMenu()
    {
        
            System.out.println("------------------------------");
            System.out.println("|   CENTRAL ADMISTRATIVA   |");
            System.out.println("------------------------------");
            System.out.println("| 1 - Unidades             |");
            System.out.println("| 2 - Logística            |");
            System.out.println("| 3 - Equipamentos         |");
            System.out.println("| 4 - Insumos              |");
            System.out.println("| 5 - Profissionais        |");
            System.out.println("| 6 - Campeonatos          |");
            System.out.println("| 0 - Sair                 |");
            System.out.println("------------------------------");
            System.out.print("| opcao: ");
            return sc.nextInt();
     }
    
}


           
                     
            
    



