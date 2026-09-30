package com.ctcombat.gymcombat.usuario;
import com.ctcombat.gymcombat.*;
public class Usuario {
    private String user;
    private String senha;
    private Perfil perfil;

    public Usuario(String userInit, String senhaInit, Perfil perfilInit){
        this.user = userInit;
        this.senha = senhaInit;
        this.perfil = perfilInit;
    }
    public String getUser(){ return user;}
    public String getSenha(){ return senha;}
    public Perfil getPerfil(){ return perfil;}
    
}
