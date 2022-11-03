package HashTable;

import java.util.LinkedList;

public class MyMapNode<k, v> {
    k key;
    v value;
    LinkedList<MyMapNode> next;

    public MyMapNode(k key, v value) {
        this.key = key;
        this.value = value;
    }

    public MyMapNode() {

    }

    public k getKey() {
        return key;
    }

    public void setKey(k key) {
        this.key = key;
    }

    public v getValue() {
        return value;
    }

    public void setValue(v value) {
        this.value = value;
    }

    public LinkedList<MyMapNode> getNext() {
        return next;
    }

//    public void setNext(LinkedList<MyMapNode> next) {
//        this.next = next;
//    }


}
