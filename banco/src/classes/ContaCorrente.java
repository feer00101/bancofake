package classes;

import java.util.Scanner;

public class ContaCorrente {
    //biblioteca scanner para leitura dos dados atraves do teclado
    Scanner sc = new Scanner(System.in);

    //inicializando a classe cliente
    public Cliente cliente = new Cliente();

    //variaveis da classe conta corrente
    private String telefone;
    private String email;
    private double saldo;

    //construtor com argumentos da classe conta corrente
    public ContaCorrente(Cliente cliente, double saldo, String telefone, String email ) {
        super();

        this.saldo = saldo;
        this.telefone = telefone;
        this.email = email;
        this.cliente = cliente;
        this.cliente.getNome();

    }
//construtor vazio da classe conta corrente
    public ContaCorrente() {
    }
//metodo que implemente a açao deposito
    public void deposito() {

        System.out.println("Adicionar saldo: ");
      double  valor=sc.nextDouble();
        saldo += valor;
            System.out.println("Deposito realizado com sucesso: " + saldo);
    }

    public boolean saque() {
        System.out.println("Qual o valor deseja sacar?");;
       double valor = sc.nextDouble();
        if (valor < saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso " + saldo);
            return true;
        } else {


            System.out.println("Sem grana: " + saldo);

            return false;

        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }
public Cliente getCliente() {
        return cliente;
}
public void setCliente(Cliente cliente) {

    this.cliente = cliente;
}

    @Override
    public String toString() {
        return "ContaCorrente:" + System.lineSeparator() +
                "Cliente: "+ cliente.getNome() +System.lineSeparator()+
                "Telefone: " + telefone + '\'' + System.lineSeparator()+
                "Email: " + email + '\'' + System.lineSeparator()+
                "Saldo: " + saldo + System.lineSeparator()+
                '|';
    }


}








