package construtores_e_metodos;

public class Cliente {
    public int id;
    public String nome;
    public int idade;
    public String email;
    public ContaBancaria conta;

    public Cliente() {

    }

    public Cliente(int id, String nome, int idade, String email, ContaBancaria conta) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.conta = conta;
    }

    public void atualizarEmail(String novoEmail) {
        this.email = novoEmail;
    }

    public String exibirNomeIdade() {
        return "Nome: " + this.nome + " - Idade: " + this.idade;
    }

    public String exibirDadosConta() {
        return ("Conta\nAgência: " + this.conta.agencia + " - Número: " + this.conta.numero + " - Saldo: R$"
                + this.conta.saldo);
    }
}
