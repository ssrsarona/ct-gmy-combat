package com.ctcombat.gymcombat.usuario;
import java.util.*;

import com.ctcombat.gymcombat.menu.MenuSupervisor;
import com.ctcombat.gymcombat.menu.MenuUnidade;
import com.ctcombat.gymcombat.unidadeservice.Cadastro;

public class Supervisor   {
    MenuSupervisor menuSup = new MenuSupervisor();

    public void iniciar(Scanner sc, Map<String, Usuario> mapUsuario ){
        MenuSupervisor menuSup = new MenuSupervisor();
        menuSup.exibirMenu();

        int opcao; 
        do{
            opcao = menuSup.exibirMenu();

            switch(opcao)
            {
                case 1:
                {
                    MenuUnidade menuUni = new MenuUnidade();
                    menuUni.exibirMenuUni();
                    int opUn = menuUni.exibirMenuUni();
                    switch(opUn)
                    {
                        case 1:
                        {
                            Cadastro cad = new Cadastro();
                            cad.cadastro(sc);
                        }
                    }
                    break;
                }
                default:
                {

                }

            }

        }while(opcao != 0);
    }

}

