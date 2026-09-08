package sistemaDeNotas;

public class Aluno {

    private String nome;
    private String ra;
    private int[] nota;


    public void setNome(String nome){ // set nome
        this.nome = nome;
    }

    public void setRa(String ra){ // set RA
       this.ra = ra;
    }

    public void setNota(int[] nota){
        this.nota = nota;
    }


    public String getNome(){ //Get nome Aluno
        return nome;
    }

    public String getRa(){ // Get RA Aluno
        return ra;
    }

    public int[] getNota(){
        return nota;
    }




}
