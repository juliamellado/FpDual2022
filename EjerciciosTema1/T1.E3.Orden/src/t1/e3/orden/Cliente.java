
package t1.e3.orden;

/**
 *
 * @author JuliaMJ
 */
public class Cliente{
	private String nombre, apellidos;
	private int edad, productosComprados;
	private long idCliente;

    public Cliente(String nombre, String apellidos, int edad, int productosComprados, long idCliente) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.productosComprados = productosComprados;
        this.idCliente = idCliente;
    }
        
        
	
	public void compra(){
		productosComprados++;
	}
	
	public void devuelve(){
			productosComprados--;
	}
	
	public void setNombre(String nombre){
		nombre = this.nombre;
	}
	
	public void setApellidos(String apellidos){
		apellidos = this.apellidos;
	}
	
	public void setEdad(int edad){
		edad = this.edad;
	}
	
	public void setIdCliente(long idCliente){
		idCliente = this.idCliente;
	}
	
	public void imprimeCliente(){
		System.out.println("El nombre del cliente es " + nombre +
		", el apellido es " + apellidos + 
		" su edad es de " + edad + " años " +
		" ha comprado " + productosComprados + " productos" +
		" y su id de cliente es " + idCliente);
                
        }
        
	
	public static void main(String[] args) {
                Cliente c = new Cliente("pepe","suarez",50,6,6563546);
		
		c.imprimeCliente();
                c.compra();
                c.imprimeCliente();
    }
}