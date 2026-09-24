package atividadediversao4;

public class CursoPresencial extends Curso implements Matricula {
    private String sala;
    private String turno;

    public CursoPresencial(int codigo, String nome, int cargaHoraria, double valor, String sala, String turno) {
        super(codigo, nome, cargaHoraria, valor);
        this.sala = sala;
        this.turno = turno;
    }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public String getTurno() { return turno; }
    public void setTurno(String turno) { this.turno = turno; }

    @Override
    public double realizarMatricula() {
        return getValor();
    }

    @Override
    public double realizarMatricula(double desconto) {
        return getValor() - desconto;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Sala: " + sala);
        System.out.println("Turno: " + turno);
    }
}