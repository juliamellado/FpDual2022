
package t1.e3.orden;

/**
 *
 * @author JuliaMJ
 */
public class Empleado {

    private String nombre, puesto;
    private int edad, aniosEnEmpresa;
    private boolean activo;

    public Empleado() {
    }
    
    

    public String asciende(String puesto) {
        this.puesto = puesto;
        return puesto;
    }

    public void cumpleAnioEnEmpresa() {
        aniosEnEmpresa++;
    }

    public void esDespedido() {
        activo = false;
    }

    public void esContratado() {
        activo = true;
    }

    public void imprimeEmpleado() {
        System.out.println("El empleado tiene el puesto " + puesto +
		", lleva " + aniosEnEmpresa + " años en la empresa, " +
		" y su estado actual en la empresa es " + activo);
	}
	
	
	public static void main(String[] args) {
        Empleado e = new Empleado();

        e.esContratado();
        e.esDespedido();
        e.esContratado();
        e.cumpleAnioEnEmpresa();
        e.cumpleAnioEnEmpresa();
        e.asciende("jefe de seccion");
        e.imprimeEmpleado();
    }

}
