package com.example.pedrex.desafiopedro;

/**
 * Created by Pedrex on 29/09/2016.
 */

public class Vendas {
    private String nmCliente;
    private String nmVendedor;
    private String valor;
    private String dataVenda;
    private String horaVenda;
    private int imagem;


    Vendas(String dataVenda, String horaVenda, String nmVendedor, String nmCliente, int imagem, String valor){
        this.nmCliente = nmCliente;
        this.nmVendedor = nmVendedor;
        this.valor = valor;
        this.dataVenda = dataVenda;
        this.horaVenda = horaVenda;
        this.imagem = imagem;

    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getNmVendedor() {
        return nmVendedor;
    }

    public void setNmVendedor(String nmVendedor) {
        this.nmVendedor = nmVendedor;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getHoraVenda() {
        return horaVenda;
    }

    public void setHoraVenda(String horaVenda) {
        this.horaVenda = horaVenda;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }


}
