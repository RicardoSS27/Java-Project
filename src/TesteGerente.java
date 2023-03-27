public class TesteGerente {
    public static void main(String[] args) {
        Gerente arthur = new Gerente();
        arthur.setNome("Arthur Sousa");
        arthur.setSalario(3000);
        arthur.setCpf("231214983211");

        System.out.println(arthur.getNome());
        System.out.println(arthur.getCpf());
        System.out.println(arthur.getSalario());

        arthur.setSenha(2222);
        boolean autenticou = arthur.autentica(2222);
        System.out.println(autenticou);
        System.out.println(arthur.getBonificacao());
    }
}
