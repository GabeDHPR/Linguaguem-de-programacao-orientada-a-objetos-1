class Cliente {
    private String nome;
    private String cpf;

    Cliente(String nome, String cpf) {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome invalido. O nome nao pode ser vazio.");
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf != null && !cpf.trim().isEmpty()) {
            this.cpf = cpf;
        } else {
            throw new IllegalArgumentException("CPF invalido. O CPF nao pode ser vazio.");
        }
    }
}

class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;

    Conta(int numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("Saldo invalido. O saldo nao pode ser negativo.");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Valor de deposito invalido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado na conta " + numeroConta);
        } else {
            System.out.println("Saque invalido na conta " + numeroConta + ". Saldo insuficiente ou valor invalido.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n--- Informacoes da Conta ---");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("CPF: " + getCliente().getCpf());
        System.out.println("Numero da conta: " + getNumeroConta());
        System.out.printf("Saldo: R$ %.2f%n", getSaldo());
    }
}

public class AtividadeBanco {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Ana Silva", "111.222.333-44");
        Cliente cliente2 = new Cliente("Bruno Santos", "555.666.777-88");

        Conta conta1 = new Conta(1001, cliente1);
        Conta conta2 = new Conta(1002, cliente2);

        conta1.depositar(1000.00);
        conta1.sacar(250.00);
        conta1.depositar(-50.00);

        conta2.depositar(500.00);
        conta2.sacar(100.00);
        conta2.sacar(-20.00);
        conta2.setSaldo(-300.00);

        conta1.exibirInformacoes();
        conta2.exibirInformacoes();
    }
}
