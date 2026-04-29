// Sub Classe

public class EmpregadoComissionado extends Empregado{
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
        super(matricula, nome);
        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public double calcularSalario(){
        return (totalDeVendas * comissao) / 100;
    }

    // Sobreposição de um método do Java
    @Override
    public String toString() {
        return "EmpregadoComissionado{" +
                "totalDeVendas=" + totalDeVendas +
                ", comissao=" + comissao +
                ", matricula=" + matricula +
                ", nome='" + nome + '\'' +
                '}';
    }
}
