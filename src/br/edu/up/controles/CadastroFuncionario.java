package br.edu.up.controles;

import br.edu.up.modelos.Funcionario;

public class CadastroFuncionario {

    private Funcionario[] funcionarios;

    public CadastroFuncionario(){
        this.funcionarios = new Funcionario[5];

        Funcionario f1 = new Funcionario();
        f1.setNome("Paulo");
        this.funcionarios[0] = f1;

        Funcionario f2 = new Funcionario();
        f2.setNome("Carlos");
        this.funcionarios[1] = f2;
    }
}
