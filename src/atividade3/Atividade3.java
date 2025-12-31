
package atividade3;


import java.util.Scanner;

public class Atividade3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        Funcionario[] funcionarios = new Funcionario[10];
        
        System.out.println("--------Informe os dados de até 10 funcionários---------\n");
        
        for (int i = 0; i < funcionarios.length; i++) {
            
        
            System.out.println("--Funcionario " + (i + 1) + "--\n" + 
                "Informe o tipo de funcionário (assalariado/horista):\n");
            String tipo = entrada.next();
        
            System.out.println("Informe o nome do funcionário:\n");
            String nome = entrada.next();
        
            System.out.println("Informe o CPF do funcionário:\n");
            String cpf = entrada.next();
        
            System.out.println("Informe o endereço do funcionário:\n");
            String endereco = entrada.next();
        
            System.out.println("Informe o telefone do funcionário:\n");
            int  telefone = entrada.nextInt();
        
            System.out.println("Informe o setor do funcionário:\n");
            String setor = entrada.next();
        
        
            if (tipo.equals("horista")) {
                
                System.out.println("Informe as horas trabalhadas: \n");
                int horasTrabalhadas = entrada.nextInt();
                
                System.out.println("Informe o valor da hora: \n");
                double valorHora = entrada.nextDouble();
             
                Horista horista = new Horista(horasTrabalhadas, valorHora, nome, cpf, endereco, telefone, setor);
            
                funcionarios[i] = horista;
        
            }
        
            if (tipo.equals("assalariado")) {
            
                System.out.println("Informe o salário mensal: \n");
                double salarioMensal = entrada.nextDouble();
            
                Assalariado assalariado = new Assalariado(salarioMensal, nome, cpf, endereco, telefone, setor);
            
                funcionarios[i] = assalariado;
          
            }
        } 
        
        for (int i = 0; i < funcionarios.length; i++) {
            
              System.out.println("--Funcionario " + (i + 1) + "--\n");
              funcionarios[i].mostraDados();
              System.out.println("pagamento do funcionário: " + funcionarios[i].calculoSalario() + "\n");
             
        }
        
        System.out.println("Informe o aumento geral (%): ");
        double porcentagem = entrada.nextDouble();
        
        for (int i = 0; i < funcionarios.length; i++) {
            
            System.out.println("--Funcionario " + (i + 1) + "--\n" +
                    "pagamento do funcionário: " + funcionarios[i].aplicaAumento(porcentagem)+ "\n");
         
        }
    }  
}
