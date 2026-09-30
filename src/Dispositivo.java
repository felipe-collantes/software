
public class Dispositivo {
    public String nombre;
    String tipo;
    public boolean activo;

    public void mostrarinformacion() {

        System.out.println("Nombre:" + nombre);
        System.out.println("Tipo:" + tipo);
        System.out.println("Activo:" + activo);

        //muesttra los demas atributos
    }
    void mostrarEstado() {
        String estado = activo?"activo":"inhabilitado";
        System.out.println("Nombre:" + nombre+ "\nEstado:"+estado);

    }

}

