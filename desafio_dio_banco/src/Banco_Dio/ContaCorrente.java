package Banco_Dio;

import javax.sound.midi.Sequence;
public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.ImprimirInfosComuns();
    }

    protected void ImprimirInfosComuns() {
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Conta: %d", super.numero));
        System.out.println(String.format("Saldo: %2f", super.saldo));
    }
}
