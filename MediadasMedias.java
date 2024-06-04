public class MediadasMedias {

    public static void main(String[] args) {

        double mediaUm = (8.0+9.0+7.0)/3;
        double mediaDois = (4.0+5.0+6.0)/3;

        System.out.println("A média aritmética do primeiro conjunto de números é: " + mediaUm +
                "\nA média aritmética do segundo conjunto de números é: " + mediaDois);

        double somaMedias = mediaUm + mediaDois;

        System.out.println("A soma das duas médias é: " + somaMedias);

        double mediaFinal = somaMedias / 2;

        System.out.println("A média das médias dos conjuntos é: " + mediaFinal);

    }

}
