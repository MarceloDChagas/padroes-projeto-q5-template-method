public abstract class ProcessadorTexto {

    // Template Method
    public final String processar(String entrada) {
        char[] caracteres = extrairCaracteres(entrada);
        char[] caracteresProcessados = converterCaracteres(caracteres);
        String resultado = juntarCaracteres(caracteresProcessados);
        return resultado;
    }

    protected char[] extrairCaracteres(String texto) {
        if (texto == null) return new char[0];
        return texto.toCharArray();
    }

    protected abstract char[] converterCaracteres(char[] chars);

    protected String juntarCaracteres(char[] chars) {
        if (chars == null) return "";
        return new String(chars);
    }
}
