package bootcamp.modulo3.java1.pratica2;

public class Exercicio2 {
    public static void main(String[] args) {
        double empresaX = 1.13;
        double empresaY = 18.4;

        double porcentagemCrescimentoEmpresaX = 1.48;
        double porcentagemCrescimentoEmpresaY = 0.32;

        int ano;
        for (ano = 2021; empresaX < empresaY; ano++) {
            System.out.println("Empresa X - 01/01/"+ ano + " - Valor da empresa: " + String.format("%,.2f", empresaX) + "m");
            System.out.println("Empresa Y - 01/01/"+ ano + " - Valor da empresa: " + String.format("%,.2f", empresaY) + "m");
            System.out.println("");

            empresaX = empresaX + (empresaX * porcentagemCrescimentoEmpresaX);
            empresaY = empresaY + (empresaY * porcentagemCrescimentoEmpresaY);
        }

        System.out.println("Empresa X - 01/01/"+ ano + " - Valor da empresa: " + String.format("%,.2f", empresaX) + "m");
        System.out.println("Empresa Y - 01/01/"+ ano + " - Valor da empresa: " + String.format("%,.2f", empresaY) + "m");
    }
}
