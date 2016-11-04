package interface_simple_stack;

import org.junit.Test;

import static org.junit.Assert.*;

/** kkk
 * Created by Administrator on 2016/11/4.
 */
public class ItemTest {
    private int num = 1;
    private String nom = "xxx";
    private Item item = new Item(num,nom);
    @Test
    public void getNumero() throws Exception {
        int numTest = 1;
        assertEquals(num,numTest);
    }

    @Test
    public void setNumero() throws Exception {
        int numTest = 1;
        item.setNumero(numTest);
        assertEquals(num,item.getNumero());
    }

    @Test
    public void getNom() throws Exception {
        String nomTest = "xxx";
        assertEquals(nom,nomTest);
    }

    @Test
    public void setNom() throws Exception {
        String nomTest = "xxx";
        item.setNom(nomTest);
        assertEquals(nom,item.getNom());
    }

}