package bootcamp.modulo3.java1.pratica2;

import java.math.BigDecimal;

public class Produto {

    private int id;
    private String nome;
    private double valor;
    private int quantidade;

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto " + (getId()+1) + " - "
                + getNome() + " - R$" + getValor()
                + " - Quantidade: " + getQuantidade();
    }
}
