# Conta Bancaria

Este projeto foi desenvolvido com o objetivo de simular o funcionamento de uma conta bancária digital. Ele abrange conceitos fundamentais de programação, incluindo **Programação Orientada a Objetos (POO)**, validação de regras de negócio e manipulação de transações financeiras.

Regras de negócios:

Os atributos titular, saldo e limite devem ser private.
O saldo não pode ser alterado diretamente.
O saldo inicial deve ser 0.
O método depositar(double valor) deve aceitar apenas valores maiores que 0.
O método sacar(double valor) deve verificar se existe saldo suficiente e não pode permitir que o saldo fique negativo.
O limite deve representar um valor adicional que pode ser utilizado caso o saldo não seja suficiente.
Não deve existir setSaldo().
O saldo deve ser consultado através de getSaldo().
