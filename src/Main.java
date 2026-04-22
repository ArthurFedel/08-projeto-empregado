public class Main {
    public static void main(String[] args) {
        Empregado[] empregado = new Empregado[4];

        empregado[0] = new EmpregadoComissionado(11, "Arthur", 35000, 15);
        empregado[1] = new EmpregadoHorista(22, "Mateus", 160, 250);
        empregado[2] = new EmpregadoComissionado(33, "Victor", 10000, 20);
        empregado[3] = new EmpregadoHorista(22, "Erick", 160, 300);

        // For tradicional
        // for (int i = 0; i < empregado.length; i++) {
        //    System.out.println(empregado[i].matricula);
        //    System.out.println(empregado[i].nome);
        //    System.out.println();
        // }

        // For genérico
        for (Empregado e : empregado){
            System.out.println(e.matricula);
            System.out.println(e.nome);
            System.out.println(e.calcularSalario());
            System.out.println();
        }
    }
}
