
/**
 * 
 * This class models a Node object which contains any type of object passed as a
 * parameter. Each node has its internal data (of a certain type) and pointers
 * to the next node in the list.
 * 
 * @param <T> The type of object this class is holding.
 * 
 * @Author Marti Lonnemann
 */
public class GenericNode<T> {

    private T data; // data that the object stores
    private GenericNode<T> nextNode; // pointer to the nextNode that will be in LinkedList

    /**
     * 
     * Constructor build Node object. Initializes nextNode and data
     * to null.
     */
    public GenericNode() {
        setNextNode(null);
        data = null;
    }

    /**
     * 
     * This method sets the data of the object.
     * 
     * @param data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * 
     * This method returns the data of the object.
     * 
     * @return T (data)
     */
    public T getData() {
        return this.data;
    }

    /**
     * 
     * This method returns itself to the caller.
     * 
     * @return
     */
    public GenericNode<T> getNode() {
        return this;
    }

    /**
     * 
     * This method updates the pointer for the next node.
     * 
     * @param nextNode
     */
    public void setNextNode(GenericNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * 
     * This method returns the node stored in the next node pointer.
     * 
     * @return GenericNode object
     */
    public GenericNode<T> getNextNode() {
        return nextNode;
    }// end getNextNode
}