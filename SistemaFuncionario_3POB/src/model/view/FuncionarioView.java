package view;

import model.Funcionario;
import controller.FuncionarioController;

public class FuncionarioView {
    public void exibirDetalhes(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        funcionario.mostrarDetalhes();
    }
}
