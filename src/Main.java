
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------01");

        Pessoa exemploPessoa01 = new Pessoa("Exemplo Pessoa", 23);
        exemploPessoa01.exibirInfo();

        System.out.println("--------------------------------02");

        Contato contatoPessoa01 = new Contato("(81) 99999-7777", "pessoa01@pessoa.com");
        contatoPessoa01.exibirInfo();

        System.out.println("--------------------------------03");

        Faculdade nomeFaculdade = new Faculdade("UNICAP");
        nomeFaculdade.exibirInfo();
        nomeFaculdade.exibirAula();

        System.out.println("--------------------------------04");

        HorarioFaculdade horarioFaculdade = new HorarioFaculdade("20:20", "22:20");
        horarioFaculdade.exibirInfo();

        System.out.println("--------------------------------05");

        Estagio exemploEstagio = new Estagio("Desenvolvedor Java");
        exemploEstagio.exibirInfo();
        exemploEstagio.exibirLocal();

    }
}
