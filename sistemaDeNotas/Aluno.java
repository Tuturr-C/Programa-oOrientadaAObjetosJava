package sistemaDeNotas;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private String nome;
    private String ra;
    private ArrayList<Double> notas = new ArrayList<>();
    private double mediaAluno;

    public Aluno (){}


    public void setNome(String nome){ // set nome
        this.nome = nome;
    }

    public void setRa(String ra){ // set RA
       this.ra = ra;
    }

    public void adicionarNota(double nota){
        this.notas.add(nota);
    }

    public void modificarNota(int numeroDaNota, double nota){
        this.notas.set(numeroDaNota - 1, nota);
    }

    public String getNome(){ //Get nome Aluno
        return nome;
    }

    public String getRa(){ // Get RA Aluno
        return ra;
    }

    public List<Double> getNotas(){
        return notas;
    }
    public double mediaAluno(){
        return mediaAluno;
    }

    public double calcularMedia(){
        if (this.notas.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }

        this.mediaAluno = soma / this.notas.size();
        return this.mediaAluno;
        
    }

    public double maiorNota(){
        double maiorNota = this.notas.get(0);

        for (double nota : this.notas) {
            if (nota > maiorNota) {
                maiorNota = nota;
            }
        }

        return maiorNota;
    }

    public double menorNota(){
        double menorNota = this.notas.get(0);

        for (double nota : this.notas) {
            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        return menorNota;
    }
    


}
