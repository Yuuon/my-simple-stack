package interface_simple_stack;

/** kkk
 * Created by Administrator on 2016/11/3.
 */
class Item {
    private int numero;
    private String nom;

    Item(int numero, String nom) {
        this.numero = numero;
        this.nom = nom;
    }

    int getNumero() {
        return numero;
    }

    void setNumero(int numero) {
        this.numero = numero;
    }

    String getNom() {
        return nom;
    }

    void setNom(String nom) {
        this.nom = nom;
    }
}
