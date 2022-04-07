package t1.e7.html;

/**
 *
 * @author JuliaMJ
 */
public class Html {

    public Html(String abreEtiqueta, String texto) {
        System.out.println("<" + abreEtiqueta + ">" + texto + "<\\" + abreEtiqueta + ">");
    }

    public static void main(String[] args) {
        Html h = new Html("p", "Hola mundo");
    }

}
