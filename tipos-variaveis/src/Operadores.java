public class Operadores {
    public static void main(String[] args){
        String nomeCompleto = "LINGUAGEM " + "JAVA";

        System.out.println(nomeCompleto);

        int numero = 5;

        numero = numero * -1;

        System.out.println(numero);

        numero += -2;

        System.out.println(numero);

        int a = 6;
        
        int b = 6;

        boolean resultado = a == b ? true : false;

        System.out.println(resultado);

        boolean resultado2 = true;

        if (resultado && resultado2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
