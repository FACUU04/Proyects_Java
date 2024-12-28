import java.util.ArrayList;
import java.util.List;

public class FSBilletera_virtual {

    private double limite;
    private double saldo;
    private List<Compra_FSB> listaDeCompras;


    //Constructores
    public FSBilletera_virtual(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public boolean lanzarCompra(Compra_FSB compra){
        if (this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.listaDeCompras.add(compra);
            return true;
        }
        return false;
    }

    //Getters
       public double getLimite() {
         return limite;}
       public double getSaldo() {
         return saldo;}
       public List<Compra_FSB> getListaDeCompras() {
         return listaDeCompras;}
}
