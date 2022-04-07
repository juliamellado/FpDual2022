package t1.e6.parametros;

/**
 *
 * @author JuliaMJ
 */
public class Parametros {

    public Parametros(String[] textos) {
        String textosUnidos = "";
        for (String texto : textos) {
            textosUnidos += texto;
        }
        System.out.println(textosUnidos);
    }

    public static void main(String[] args) {
        Parametros p = new Parametros(new String[]{"patata", "frita", "tengo", "sueño"});
    }
}
