package br.com.contas;

public class contapoupanca extends conta{


    @Override
    public void ImprimirExtrato() {
        System.out.println("======= Extrato da conta poupança =======");
        super.infobancario();
    }


}
