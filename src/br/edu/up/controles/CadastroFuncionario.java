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

    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }

    public String getFuncionariosString() {
        String funcString = "";
        for(int i = 0; i < funcionarios.length; i++){
            Funcionario f = funcionarios[i];
            if (f != null){
                funcString += "Nome: " + f.getNome() + "\n";
            } else {
                break;
            }
        }
        return funcString;
    }

    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }

}
