/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionarioheranca;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Matheus Santana
 */
public class Funcionario_Mario extends FuncionarioHeranca{
    public Funcionario_Mario(String Nome, int dia, int mes, int ano, double Salario, String Nasc) {
        super(Nome, dia, mes, ano, Salario, Nasc);
    }
}
