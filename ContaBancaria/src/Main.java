void main() {
    ContaBancaria conta = new ContaBancaria("Vitor", 10.0);
    int opcao;

    do {
        System.out.println("\n--- Conta da " + conta.getTitular() + " ---");
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Ver Saldo");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opcao: ");

        opcao = Integer.parseInt(IO.readln());

        switch (opcao) {
            case 1:
                System.out.print("Digite o valor para depositar: ");
                double valorDeposito = Double.parseDouble(IO.readln());
                if (conta.depositar(valorDeposito)) {
                    System.out.println("Depósito realizado com sucesso");
                } else {
                    System.out.println("Valor de depósito deve ser maior que zero.");
                }
                break;

            case 2:
                System.out.print("Digite o valor para sacar: ");
                double valorSaque = Double.parseDouble(IO.readln());
                if (conta.sacar(valorSaque)) {
                    System.out.println("Saque realizado com sucesso");
                } else {
                    System.out.println("Saldo/limite insuficiente.");
                }
                break;

            case 3:
                System.out.println("Seu saldo atual é: R$ " + conta.getSaldo());
                break;

            case 4:
                System.out.println("Encerrando sistema..........");
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }

    } while (opcao != 4);
}

