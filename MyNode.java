package linkedlist;

public class MyNode<K> implements INode<K> {
    private K key;
    private INode next;

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public K getkey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = (MyNode<K>) next;
    }
}
