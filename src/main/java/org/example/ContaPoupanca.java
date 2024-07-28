package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContaPoupanca extends Conta {

    private double taxaRendimento = 0.625;

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    public void aplicarRendimentos(double taxaRendimento) {
        double rendimento = saldo * taxaRendimento;
        saldo += rendimento;
        System.out.println(String.format("Rendimento de %.2f aplicado. Novo saldo: %.2f", rendimento, saldo));
    }
}
