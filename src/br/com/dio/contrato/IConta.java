package br.com.dio.contrato;

import br.com.dio.dto.Conta;

public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta conta);

    void imprimirExtrato();

}