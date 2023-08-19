public class HorarioFaculdade {
    String horarioAula;
    String horarioFimDaAula;

    public HorarioFaculdade(String horarioAula, String horarioFimDaAula) {
        this.horarioAula = horarioAula;
        this.horarioFimDaAula = horarioFimDaAula;
    }

    public void exibirInfo() {
        System.out.println("Horário Inicio de Aula: " + horarioAula + " hrs");
        System.out.println("Horário Final de Aula: " + horarioFimDaAula + " hrs");

    }
}

