
package atividade3;

public class Horista extends Funcionario{
    
    private int horasTrabalhadas;
    private double  valorHora;


    public Horista(int horasTrabalhadas, double valorHora, String nome, String cpf, String endereco, int telefone, String setor) {
        super(nome, cpf, endereco, telefone, setor);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    
    
   
    @Override
    public double calculoSalario() {
        
        return horasTrabalhadas * valorHora;
      
    }
    
    @Override
    public void  mostraDados(){
        
        System.out.println("nome: " + getNome() + "\n" +
                                       "cpf: " + getCPF() + "\n" +
                                       "endereço: " + getEndereco() + "\n" +
                                       "telefone: " + getEndereco() + "\n" + 
                                       "setor: " + getSetor()  + "\n" + 
                                       "horas trabalhadas: " + getHorasTrabalhadas() + "\n" +
                                       "valor da hora: " + getValorHora()
        ); 
    }       

    @Override
    public double aplicaAumento(double  porcentagem) {
        
        return (porcentagem * calculoSalario())/ 100 + calculoSalario();
    
    } 
}

