package br.com.contas;

public class contacorrente extends conta{


    @Override
    public void ImprimirExtrato() {
        System.out.println("======= Extrato da conta corrente =======");
        super.infobancario();
    }
}
