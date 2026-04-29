import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        ArrayList<Empregado> lista = new ArrayList<>();
        lista.add(new EmpregadoComissionado(1, "A", 10, 10));
        lista.add(new EmpregadoHorista(2, "B", 10,10));
        lista.add(0, new EmpregadoHorista(3, "C", 10,10));

        // For tradicional
        //for (int i = 0; i < lista.size(); i++) {
        //    System.out.println(lista.get(i).nome);
        //}
        //System.out.println();

        // For generico
        for (Empregado e: lista){
            System.out.println(e);
            System.out.println(e.calcularSalario());
            System.out.println();
        }
    }
}
