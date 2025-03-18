import java.util.ArrayList;
import java.util.List;

public class Disciplina{
    private String nomeDisciplina;
    private int CargaHoraria;
    private List<Aluno> alunos;
    private List<Professor> professores;

    public Disciplina(){
        this("", 0, new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String nomeDisciplina, int cargaHoraria){
        this(nomeDisciplina, cargaHoraria, new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String nomeDisciplina,int cargaHoraria, List<Aluno> alunos, List<Professor>
    professores){
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
        this.professores = professores;
        this.CargaHoraria = cargaHoraria;
    }

    public void setNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getNomeDisciplina(){
        return this.nomeDisciplina;
    }

    public void setCargaHoraria(int CargaHoraria){
        this.CargaHoraria = CargaHoraria;
    }

    public int getCargaHoraria(){
        return this.CargaHoraria;
    }


    public void setAlunos(List<Aluno> alunos){
        this.alunos = alunos;
    }

    public List<Aluno> getAlunos(){
        return this.alunos;
    }

    public void setProfessores(List<Professor> professores){
        this.professores = professores;
    }

    public List<Professor> getProfessores(){
        return this.professores;
    }

    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    public void addProfessor(Professor professor){
        this.professores.add(professor);
    }

    @Override
    public String toString(){
        return "Disciplina{" + 
                getNomeDisciplina() +
                ", carga horária=" + getCargaHoraria() +
                "\n*** Alunos ***" + getAlunos() +
                "\n*** professores ***" + getProfessores() +
                "}";
    }
}