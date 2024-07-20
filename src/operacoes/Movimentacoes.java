package operacoes;
import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Movimentacoes {
    public static void main(String[] args) {
        Cliente fernando = new Cliente();
        fernando.setNome("Fernando");

        Conta cc = new ContaCorrente(fernando);
        Conta poupanca = new ContaPoupanca(fernando);

        cc.depositar(100);
        cc.transferir(100, poupanca);
        
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
