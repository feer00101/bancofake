package listas;

import classes.Cliente;
import classes.ContaCorrente;

import java.util.ArrayList;

public class Usuario {
ContaCorrente contaCorrente =new ContaCorrente();

    ArrayList<ContaCorrente> list = new ArrayList<>();



    public void adicionarCliente(ContaCorrente contaCorrente) {

        list.add(contaCorrente);

    }

    @Override
    public String toString() {
        return "Usuario{" + "list=" + list + '}';
    }
}
