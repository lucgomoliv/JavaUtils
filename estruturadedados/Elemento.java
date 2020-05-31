public class Elemento {

    public IDado dado;
    public Elemento proximo;
    public Elemento anterior;
    public Elemento esquerda;
    public Elemento direita;

    public Elemento(IDado dado){
        this.dado = dado;
        this.proximo = null;
        this.anterior = null;
        this.esquerda = null;
        this.direita = null;
    }
}