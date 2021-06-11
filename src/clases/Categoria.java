
package clases;


public abstract class Categoria {
    
    private int precio;
    private int codigo;
    private String descripcion;

    public Categoria(int precio, int codigo, String descripcion) {
        this.precio = precio;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoria{" + "precio=" + precio + ", codigo=" + codigo + ", descripcion=" + descripcion + '}';
    }

   

   public abstract void ValidarPrecio(int precio);
   public abstract void ValidarCodigo(int codigo);
    
    
}
