package br.com.contas;

public abstract class  conta extends cliente implements methodsconta{

    private static int SEQUENCIAL = 1;
    private static final int AGENCIAPADRAO = 1;

    public conta(){
        this.agencia = conta.AGENCIAPADRAO;
        this.numero = conta.SEQUENCIAL++;
    }

    protected  cliente cliente;
    protected int agencia;
    protected int numero;
    private double saldo;

    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void deposita(double valor){
        saldo += valor;
    }

    @Override
    public void transferir(double valor, methodsconta contadestino){
        this.sacar(valor);
        contadestino.deposita(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void infobancario() {
        System.out.println(String.format("Agencia : %d", this.agencia));
        System.out.println(String.format("Numero : %d", this.numero));
        System.out.println(String.format("saldo : %.2f", this.saldo));
        //System.out.println(String.format("Titular : %s", this.cliente.nome));
    }
}
