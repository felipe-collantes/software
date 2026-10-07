
public class Dispositivo {
    private String nombre;
    private String tipo;
    private boolean activo;

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
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
    public void setActivo(boolean activo){
        this.activo = activo;
    }
    public boolean isActivo() {
        return activo;
    }
}

