public class Estagio {
    String nomeEstagio;
    String local = "NASA";

    public Estagio(String nomeEstagio) {
        this.nomeEstagio = nomeEstagio;
    }

    public void exibirInfo() {
        System.out.println("Estágio Atual: " + nomeEstagio);
    }

    public void exibirLocal(){
        System.out.println("Local: " + local);
    }
}

