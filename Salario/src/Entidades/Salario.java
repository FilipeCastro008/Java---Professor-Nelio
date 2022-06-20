package Entidades;

public class Salario{
    private String nome;
    private double grossSalary;
    private double tax;
    
    public Salario() {
    }

    public Salario(String nome, double grossSalary, double tax) {
        this.setNome(nome);
        this.setGrossSalary(grossSalary);
        this.setTax(tax);
    }
    
    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }    
    public void increaseSalary(double increase){
        this.grossSalary = (grossSalary + tax) * increase - tax;
    }
    public double netSalary(){
        return grossSalary;
    }
    public String getEmpregado(){
        return "Name: " + this.nome + "\n" + "Groo Salary: " + String.format("%.2f",this.grossSalary)  + "\n" + "Tax: " + this.tax;
    }
    public void setSalario(double grossSalary, double tax) {
        this.grossSalary = grossSalary - tax;
    }
}