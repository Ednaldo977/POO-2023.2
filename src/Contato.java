public class Contato {
    String telefone;
    String email;

    public Contato(String telefone, String email) {
        this.telefone = telefone;
        this.email = email;
    }

    public void exibirInfo() {
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}
