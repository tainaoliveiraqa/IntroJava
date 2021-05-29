// 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classes
public class Medidas {
    // 3.1 Atributos - Características

    // 3.2 Métodos e funções
    public static void main (String [] args){
        System.out.println("Cálculo de Àreas");
    }

    public void calcularAreaModoExtenso(){
        // Cálculo de área extenso - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 5;
        comprimento =6;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e comprimento de "
                + comprimento + "m a àrea é de " + resultado + " m²");

    }

    public void calcularAreaModoCompacto(){
        // cálculo de área reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.print("Para a largura de " + largura + "m e comprimento de "
                + comprimento + "m a àrea é de " + largura * comprimento + " m²");
    }

}
