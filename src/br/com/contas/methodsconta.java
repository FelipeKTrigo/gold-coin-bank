package br.com.contas;

public interface methodsconta {
    void sacar(double valor);
    void deposita(double valor);
    void ImprimirExtrato();
    void transferir(double valor, methodsconta contadestino);
}
