/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionarioheranca;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Matheus Santana
 */
public class FuncionarioHeranca {
    /**
     * @param args the command line arguments
     */
    public String Nome;
    public int dia;
    public int mes;
    public int ano;
    public double Salario;
    public String Nasc;
        public FuncionarioHeranca(
                String Nome, int dia, int mes, int ano, double Salario, String Nasc
            ) 
        {
           this.Nome = Nome;
           this.dia = dia;
           this.mes = mes;
           this.ano = ano;
           this.Salario = Salario;
           this.Nasc = Nasc;
        }
        public void InformarSalario() {
            JOptionPane.showMessageDialog(null, "O salário de " +Nome +" é de R$" +Salario);
        }
        public void CalcularIdade() {
            LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
            LocalDate dataAtual = LocalDate.now();
            Period periodo = Period.between(dataNascimento, dataAtual);
            int idade = periodo.getYears();
            JOptionPane.showMessageDialog(null, Nome + " nasceu em " + Nasc + "\nA idade de " + Nome + " é de " + idade + " anos.");
        }
        public static void main(String[] args) {
            FuncionarioHeranca funcionario_Helena = new FuncionarioHeranca("Helena Reis", 28, 1, 1965, 4000.00, "28/01/1965");
            FuncionarioHeranca funcionario_Mario = new FuncionarioHeranca("Mario Sá", 16, 2, 1970, 3000.00, "16/02/1970");
            funcionario_Helena.InformarSalario();
            funcionario_Helena.CalcularIdade();
            funcionario_Mario.InformarSalario();
            funcionario_Mario.CalcularIdade();
        }
}
