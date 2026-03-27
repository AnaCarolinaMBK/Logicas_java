/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

/**
 *
 * @author ana.ccsantos86
 */

 /*CLASSE PAI\*/
public class Funcionarios {
    private String nome;
    private double salario;
    
    public Funcionarios (String nome, double salario) {
     this.nome = nome;
     this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    } 

}

 /*CLASSE FILHA\*/
class Gerente extends Funcionarios {
    private double bonus;
    
    public Gerente(double bonus, String nome, double salario) {
        super(nome, salario);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    
}

 /*CLASSE FILHA\*/
class Estagiario extends Funcionarios {
    private int horasTrabalhadas;

    public Estagiario(int horasTrabalhadas, String nome, double salario) {
        super(nome, salario);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

}