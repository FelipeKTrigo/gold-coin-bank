package br.com.main;

import br.com.contas.*;
import java.util.Scanner;

public class mainclass {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("seja bem vindo ao banco moeda dourada");

        System.out.println("voce deseja acessar uma conta corrente digite 1," +
                " se você deseja acessar uma conta poupança digite 2");
        int ccp = sc.nextInt();
        if(ccp == 1) {

            conta cc = new contacorrente();
            cliente c1 = new cliente();
            System.out.println("informe seu nome");
            cc.setNome(sc.next());

            System.out.println(String.format("==== informe a opção desejada ==== "));
            System.out.println(String.format("  ==== 1 sacar , 2 depositar ====   "));
            System.out.println(String.format("    ==== 3 transferencia ====      "));
            int opc = sc.nextInt();
            if(opc == 1){
                System.out.println("informe o valor desejado(ex.: 100):");
                double v = sc.nextDouble();
                cc.sacar(v);
            }else if (opc == 2){
                System.out.println("informe o valor desejado(ex.: 100):");
                double v = sc.nextDouble();
                cc.deposita(v);
            }else if (opc == 3){
                System.out.println("informe o valor desejado(ex.: 100):");
                double v = sc.nextDouble();
                System.out.println("informe a conta de destino da transferencia(ex.: cp):");
                String c = sc.next();
                cc.transferir(v , cc);
            }else if(opc <= 4){
                System.out.println("opção invalida, tente novamente !");
                System.exit(0);
            }

            System.out.println("para obter o extrato digite 1," +
                    " para obter a agencia digite 2," +
                    " para obter o saldo digite 3," +
                    " para obter o nome do titular digite 4. ");
            int s = sc.nextInt();
            if (s == 1) {
                cc.ImprimirExtrato();
            } else if (s == 2) {
                System.out.println("esta é sua agencia : " + cc.getAgencia());
            }else if (s == 3){
                System.out.println("este é seu saldo atual: " + cc.getSaldo());
            }else if (s == 4){
                System.out.println("este é o titular da conta: " + cc.getNome());
            }else if(s <= 5){
                System.out.println("opção invalida, tente novamente !");
                System.exit(0);
            }


        }else if (ccp == 2){
            conta cp = new contapoupanca();
            cliente c2 = new cliente();
            System.out.println("informe seu nome");
            cp.setNome(sc.next());

            System.out.println(String.format("==== informe a opção desejada ==== %s"));
            System.out.println(String.format("==== 1 sacar , 2 depositar ==== %s"));
            System.out.println(String.format("==== 3 transferencia ==== %s"));
            int opc = sc.nextInt();
                if(opc == 1){
                    System.out.println("informe o valor desejado(ex.: 100):");
                    double v = sc.nextDouble();
                    cp.sacar(v);
                }else if (opc == 2){
                    System.out.println("informe o valor desejado(ex.: 100):");
                    double v = sc.nextDouble();
                    cp.deposita(v);
                }else if (opc == 3){
                    System.out.println("informe o valor desejado(ex.: 100):");
                    double v = sc.nextDouble();
                    System.out.println("informe a conta de destino da transferencia(ex.: cp):");
                    String c = sc.next();
                    cp.transferir(v , cp);
                }else if(opc <= 4){
                    System.out.println("opção invalida, tente novamente !");
                    System.exit(0);
                }

                System.out.println("para obter o extrato digite 1," +
                    " para obter a agencia digite 2," +
                    " para obter o saldo digite 3," +
                    " para obter o nome do titular digite 4. ");
                int s = sc.nextInt();
                if (s == 1) {
                    cp.ImprimirExtrato();
                } else if (s == 2) {
                    System.out.println("esta é sua agencia : " + cp.getAgencia());
                }else if (s == 3){
                    System.out.println("este é seu saldo atual: " + cp.getSaldo());
                }else if (s == 4){
                    System.out.println("este é o titular da conta: " + cp.getNome());
                }
        }else if(ccp>=3) {
            System.out.println("opção invalida, tente novamente !");
            System.exit(0);
        }
    }
}
