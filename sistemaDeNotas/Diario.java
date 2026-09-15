package sistemaDeNotas;

public class Diario {

    private String histogramaNotas;
    private String nomeDaMateria;
    private int [] listadeAlunos; //  Array da lista de alunos 
    private int numeroDeNotas;
    private String adicionarAluno;
    private int numeroDaAtividade;
    private String modificaAluno;


    public Diario(int[] numerosAluno){
        this.listadeAlunos = numerosAluno;
    }

    public void numeroDaAtividade (int Atividade){
        numeroDaAtividade = Atividade;
    }


    public void adicionarAluno (String aluno){ // Set adicionar Aluno
        adicionarAluno = aluno;
    }

    public void modificaAluno (String Aluno ){
        modificaAluno = Aluno; 
    }


    

    
}
