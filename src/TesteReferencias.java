public class TesteReferencias {
    public static void main(String[] args) {
        Funcionario arthur = new Gerente();
        arthur.setNome("Arthur");
        arthur.setSalario(5000);

        Funcionario yohana = new EditorDeVideo();
        yohana.setSalario(2500);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registraBonificacao(arthur);
        controle.registraBonificacao(yohana);

        System.out.println(controle.getValor());
    }
}
