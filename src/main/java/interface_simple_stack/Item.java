package interface_simple_stack;

/**
 * Created by Administrator on 2016/11/3.
 */
public class Item {
    private int numero;
    private char nom;

    public Item(int numero, char nom) {
        this.numero = numero;
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getNom() {
        return nom;
    }

    public void setNom(char nom) {
        this.nom = nom;
    }
}
