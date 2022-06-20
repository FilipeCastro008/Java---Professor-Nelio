package Entidade;



public class NotaAluno {
    private String nome;
    private double nota;

    public NotaAluno(String nome, double nota){
        this.setNome(nome);
        this.setNota(nota);
    }
    public NotaAluno(){
        
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota += nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void resultado(){
        if (nota < 60.0){
            System.out.println("FINAL GRADE: = " + nota + "\n" + "FAILED" + "\n" + 
            "MISSING: " + (60 - nota) + " POINTS");
        }
        else{
            System.out.println("FINAL GRADE = " + nota + "\n" + "PASS");
        }
    }

}
