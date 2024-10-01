package classes;

public class Cliente{

    //atributos privados da classe
    private int codCliente;
    private String nome;

    //construtor para controle de acesso
    public Cliente() {
        super();
        this.codCliente = codCliente;
        this.nome = nome;

    }


    //getters e setters para acesso aos atributos
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    //toString para formataçao das informações
    @Override
    public String toString() {
        return "Cliente{" +

                ", codCliente=" + codCliente +
                ", nome='" + nome + '\'' +
                '}';
    }
}
