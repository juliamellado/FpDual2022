
package t1.e3.orden;

/**
 *
 * @author JuliaMJ
 */
public class Orden {
    private Cliente cliente;
    private Empleado empleado;
    private int numOrdenes,nivelOrden;
    private boolean ordenDada, ordenCompletada;
    
    public void daOrden(){
        numOrdenes++;
        ordenDada = true;
    }
    
    public void completaOrden(){
        ordenCompletada = true;
    }
    
    
}
