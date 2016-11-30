package SixthExercise;

/**
 * Created by Admin on 24.11.2016.
 */
class Node<E> {
    E element;
    Node<E> nextNode;
    Node<E> prevNode;

    Node(Node<E> prevNode, E element, Node<E> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

}
