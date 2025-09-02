package org.example;

public class Pedidos {

    private String cliente;
    private String data_pedido;
    private double total;


    // METODO CONSTRUTOR
    public Pedidos(String cliente, String data_pedido, double total) {
        this.cliente = cliente;
        this.data_pedido = data_pedido;
        this.total = total;
    }


    public String getCliente(){
        return this.cliente;
    }

    public String setCliente(String cliente){
        return this.cliente;
    }

    public String getData_pedido(){
        return this.data_pedido;
    }

    public String setData_pedido(String data_pedido){
        return this.data_pedido;
    }

    public double getTotal(){
        return this.total;
    }

    public double setTotal(double total){
        return this.total;
    }
}
