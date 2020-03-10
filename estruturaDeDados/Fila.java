package estruturaDeDados;

/**
 * Fila
 */
public class Fila {

    private Elemento ultimo, primeiro;

    public Fila(){
        this.ultimo = this.primeiro = new Elemento(null);
    }

    public boolean add(IDado dado){
        this.ultimo.proximo = ultimo = new Elemento(dado);
        return true;
    }

    public IDado retirar(){
        if(this.primeiro == this.ultimo) return null;
        Elemento aux = this.primeiro.proximo;
        this.primeiro.proximo = aux.proximo;
        if(aux == this.ultimo) this.primeiro = this.ultimo;
        return aux.dado;
    }
}