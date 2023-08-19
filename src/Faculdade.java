
public class Faculdade {
    String nomeFaculdade;
    String Aula01 = "Programação Orientada a Objetos";

    public Faculdade(String nomeFaculdade) {
        this.nomeFaculdade = nomeFaculdade;
    }

    public void exibirInfo() {
        System.out.println("Faculdade: " + nomeFaculdade);
    }

    public void exibirAula(){
        System.out.println("Nome da Aula: " + Aula01);
    }
}
