public class Main {
    public static void main(String[] args) {
        String textoOriginal = "Exemplo de Texto com MAIUSCULAS e minusculas";
        
        System.out.println("Texto Original: " + textoOriginal);
        
        ProcessadorTexto maiuscula = new TudoMaiuscula();
        String textoMaiusculo = maiuscula.processar(textoOriginal);
        System.out.println("Tudo Maiuscula: " + textoMaiusculo);
        
        ProcessadorTexto minuscula = new TudoMinuscula();
        String textoMinusculo = minuscula.processar(textoOriginal);
        System.out.println("Tudo Minuscula: " + textoMinusculo);
    }
}
