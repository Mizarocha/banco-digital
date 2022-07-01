import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente artemiza = new Cliente();
        artemiza.setNome("artemiza");

        Conta cc = new ContaCorrente(artemiza);
        Conta poupanca = new ContaPoupanca(artemiza);

        cc.depositar(500);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }

}