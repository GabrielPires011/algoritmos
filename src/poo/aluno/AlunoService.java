package poo.aluno;

public class AlunoService {
    public static void main(String[] args) {
        var alunoGabriel = new Aluno();
        alunoGabriel.setCurso("Direito");
        alunoGabriel.setMatricula(1L);
        alunoGabriel.setPeriodo(2);

        var alunoPedro = new Aluno();
        alunoPedro.setCurso("Medicina");
        alunoPedro.setMatricula(2L);
        alunoPedro.setPeriodo(6);

        System.out.println("Aluno Gabriel, matricula: " + alunoGabriel.getMatricula()
                + "\ncurso: " + alunoGabriel.getCurso()
                + "\nperiodo: " + alunoGabriel.getPeriodo()
                + "\nAluno Pedro, matricula: " + alunoPedro.getMatricula()
                + "\ncurso: " + alunoPedro.getCurso()
                + "\nperiodo: " + alunoPedro.getPeriodo());

    }
}
