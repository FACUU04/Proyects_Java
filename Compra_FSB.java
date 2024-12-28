import java.util.Comparator;

public class Compra_FSB implements Comparable<Compra_FSB> {

    private double valor;
    private String descripcion;

//Constructores
    public Compra_FSB(double valor, String descripcion) {
        this.valor = valor;
        this.descripcion = descripcion;}
//Getter
       public double getValor() {
        return valor;}
       public String getDescripcion() {
        return descripcion;}


    @Override
    public String toString() {
        return "Compra: valor=" + valor +
                ", descripcion='" + descripcion;
    }

    @Override
    public int compareTo(Compra_FSB otraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(otraCompra.valor));
    }
}
