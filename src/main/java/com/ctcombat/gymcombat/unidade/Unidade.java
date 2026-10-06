package com.ctcombat.gymcombat.unidade;
import com.ctcombat.gymcombat.usuario.*;;

public class Unidade {
    private String nome;
    private String endereco;
    private String telefone;
    private TipoUnidade tipo;
    private boolean ativa;
    private Usuario gerente;
    

    public Unidade(String nome, String endereco, String telefone, TipoUnidade tipo, Usuario gerente){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipo = tipo;
        this.ativa = true;
        this.gerente = gerente;

    }
    public String getNome() {return nome;}
    public String getEndereco() {return endereco;}
    public String getTelefone() {return telefone;}
    public TipoUnidade getTipo() {return tipo;}
    public boolean isAtiva() {return ativa;}
    public Usuario getGerente() {return gerente;}
    
    
}
