
package atividade3;

public class Assalariado extends  Funcionario {
    
    private double salarioMensal;

    public Assalariado(double salarioMensal, String nome, String cpf, String endereco, int telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calculoSalario() { 
        
         return salarioMensal;
        
    } 
    
    @Override
    public void  mostraDados(){
        
        System.out.println("nome: " + getNome() + "\n" +
                                       "cpf: " + getCPF() + "\n" +
                                       "endereço: " + getEndereco() + "\n" +
                                       "telefone: " + getEndereco() + "\n" + 
                                       "setor: " + getSetor()  + "\n" + 
                                       "salário mensal: " + getSalarioMensal()
        );  
    }
    
    @Override
    public double aplicaAumento(double  porcentagem) {
        
        return (porcentagem * calculoSalario())/ 100 + calculoSalario();
    
    }
}
