import java.util.NoSuchElementException;

public class OrderedList implements OrderedStructure {

    // Implementation of the doubly linked nodes (nested-class)

    private static class Node {

      	private Comparable value;
      	private Node previous;
      	private Node next;

      	private Node ( Comparable value, Node previous, Node next ) {
      	    this.value = value;
      	    this.previous = previous;
      	    this.next = next;
      	}
    }

    // Instance variables

    private Node head;

    // Representation of the empty list.

    public OrderedList() {
        // Your code here.
        // initilialiser le noeud factice head

    }

    // Calculates the size of the list

    public int size() {
      	// Remove line below and add your implementation.
        utiliser un compteur 
        head ---> dernier noeud 
        head --->head.next--> head.next.next........
        head=!null mais head.value==null 
    }


    public Object get( int pos ) {
        // Remove line below and add your implementation.

        if  pos est invalid ---> lancer IndexOutOfBoundsException

        utiliser un compteur 
        head ---> pos
        head --->head.next--> head.next.next ........ n

        return n.value;
    }

    // Adding an element while preserving the order

    public boolean add( Comparable o ) {
        // Remove line below and add your implementation.

      si (o est null )---> lancer IllegalArgumentException

      head---> ....... ----->head.next.next.next....
      si head.next.value.compareTo(o) > 0 --> head.next.next.next= new Node(o,head.next,head.next.next)
    }

    //Removes one item from the position pos.

    public void remove( int pos ) {
      // Remove line below and add your implementation.
      if  pos est invalid ---> lancer IndexOutOfBoundsException

      utiliser un compteur 
      head.next ---> pos
      head --->head.next--> head.next.next ........ n


    }

    // Knowing that both lists store their elements in increasing
    // order, both lists can be traversed simultaneously.

    public void merge( OrderedList other ) {
      // Remove line below and add your implementation.
     other.head --> ...... other.head.next.next......
     head----> .... head.next.next....
     head.next.value.compareTo(other.head.next.value) ?




    }
}