package nodepkg;

/**
 * Created by Mikron.Licud on 16/06/2016.
 */
public interface IRWNode {

    String getName();

    void setName (String name);

    IRWNode getNext();

    void setNext (IRWNode node);

}
