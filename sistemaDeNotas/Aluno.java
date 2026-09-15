package sistemaDeNotas;

public class Aluno {

    private String nome;
    private String ra;
    private double[] notas = new double[2];
    private double mediaAluno;

    public Aluno (){}


    public void setNome(String nome){ // set nome
        this.nome = nome;
    }

    public void setRa(String ra){ // set RA
       this.ra = ra;
    }

    public void setPrimeiraNota(double nota){
        this.notas[0] = nota;
    }

    public void setSegundaNota(double nota){
        this.notas[1] = nota;
    }

    public String getNome(){ //Get nome Aluno
        return nome;
    }

    public String getRa(){ // Get RA Aluno
        return ra;
    }

    public double[] getNotas(){
        return notas;
    }
    public double mediaAluno(){
        return mediaAluno;
    }

    public Aluno( String nome, double primeiraNota, double segundaNota){ // Salva as duas notas para fazer a média
        this.nome = nome;
        this.notas[0] = primeiraNota;
        this.notas[1] = segundaNota;
    }

    public double calcularMedia(){

        this.mediaAluno = (this.notas[0]+this.notas[1])/2.0;
        return this.mediaAluno;
        
    }

    


}
