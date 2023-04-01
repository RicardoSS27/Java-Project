public class ControleBonificacao {
    private double valor;

    public void registraBonificacao(Funcionario f){
        double bonific = f.getBonificacao();
        this.valor = this.valor + bonific;
    }

    public double getValor() {
        return valor;
    }
}
