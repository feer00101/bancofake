package classes;
import java.util.Scanner;

public class Logica {

    Cliente cliente = new Cliente();
    ContaCorrente cc = new ContaCorrente();
    Scanner sc = new Scanner(System.in);
    public Logica() {
        super();
    }

    //metodo para validar o looping do sistema
    public void yesorno(){

        //variaveis para comparaçao da resposta
        String y = "sim";
        String n = "nao";

        //variavel irá receber os dados do usuário
        String input;
        System.out.println("Deseja Continuar?");

        //recebendo os dados do usuario na variavel input
        input = sc.next();

        //testando a resposta do usuario
        if(input.equals("sim")){

            //inicializando o metodo que mostra o menu do sistema
            menu1();

        }
        //finaliza o sistema caso a resposta seja diferente de sim
        else{
            System.out.println("FIM :D");
        }
    }

    //metodo para mostrar menu do sistema
    public void menu1(){

        String nome;
        String telefone;
        String email;

        System.out.println("Bem vindo ao Banco! " + System.lineSeparator() + "1 -> Nova Conta | " + System.lineSeparator() +
                "2 -> Consulta Saldo" + System.lineSeparator() + "3 -> Saque Saldo" + System.lineSeparator() + "4 -> Depositar" +
                System.lineSeparator() + "5 -> Sair");

        //variavel que recebe os dados do usuario
        int opc = sc.nextInt();

        //comparando a resposta do usuario para a continuidade do sistema
        if (opc == 1) {

            System.out.println("Digite o nome do cliente");

            //capturando o input do usuario
            nome = sc.next();

            //adicionando o input na classe cliente
            cc.cliente.setNome(nome);

            System.out.println("Digite o telefone do cliente");

            //capturando o telefone
            telefone = sc.next();

            //adicionando telefone na classe conta corrente
            cc.setTelefone(telefone);

            System.out.println("Digite o email do cliente");

            //capturando email
            email = sc.next()
            ;
            //adicionando email na classe  conta corrente
            cc.setEmail(email);

            //exibindo os dados da classe conta corrente
            System.out.println(cc);

            //metodo que solicita se o usuário deseja continuar ou não
            yesorno();


        } else if (opc == 2) {

            //mostrando saldo
            System.out.println("Seu saldo: " + cc.getSaldo());

            //metodo que solicita se o usuário deseja continuar ou não
            yesorno();
        } else if (opc == 3) {

            //inicializando metodo de saque
            cc.saque();

            //metodo que solicita se o usuário deseja continuar ou não
            yesorno();
        } else if (opc == 4) {

            //inicializando metodo deposito
            cc.deposito();

            //metodo que solicita se o usuário deseja continuar ou não
            yesorno();
        }else if (opc == 5) {

            //menssagem de encerramento do sistema
            System.out.println("Obrigado por utilizar o software");
        }

    }

}
