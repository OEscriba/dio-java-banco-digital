package operacoes;
import java.time.LocalDate;

import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Movimentacoes {
    public static void main(String[] args) {
        Cliente fernando = new Cliente("Fernando Thibes", "123.456.999-99", LocalDate.of(2000, 3, 25));

        Conta cc = new ContaCorrente(fernando);
        Conta poupanca = new ContaPoupanca(fernando);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
