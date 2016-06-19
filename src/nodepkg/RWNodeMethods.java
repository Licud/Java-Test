package nodepkg;

/**
 * Created by Mikron.Licud on 19/06/2016.
 */
public class RWNodeMethods implements IRWNodeMethods{

    public void printList(IRWNode node){
        boolean lastNode = false;

        do{
            System.out.println(node.getName());

            if(node.getNext() == null){
                lastNode = true;
            }else{
                node = node.getNext();
            }

        }while (lastNode == false);
    }

    public void printListReverse(IRWNode node) {
        if (node.getNext() == null) {
            System.out.println(node.getName());
            return;
        } else {
            printListReverse(node.getNext());
            System.out.println(node.getName());
        }
    }


}
