package nodepkg;

/**
 * Created by Mikron.Licud on 16/06/2016.
 */


public class RWNode implements IRWNode {

    private String name = "";
    private IRWNode next = null;

    public String getName()
    {
        return this.name;
    }

    public void setName(String _name)
    {
        this.name = _name;
    }

    public IRWNode getNext()
    {
        return next;
    }

    public void setNext(IRWNode _node)
    {
        this.next = _node;
    }

}
