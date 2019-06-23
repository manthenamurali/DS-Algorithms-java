package com.mkr.sample.ds;

/**
 * High level implementation of linked list. Not all corner cases are covered.
 * @param <T>
 */
public class MyLinkedList<T> {

    //very first node in the list. Assigned only once
    private Node firstNodeInList = null;

    //latest inserted node. This will be first used as previous node for current node and will be
    //updated with the new node( so that next node can use as previous)
    private Node previousNode = null;

    private int size = 0;

    public MyLinkedList() {

    }

    public void insert(T value) {

        Node newNode = new Node(value);
        size ++;

        if (previousNode == null) {

            firstNodeInList = newNode;

            //for now this is the first and last node
            previousNode = newNode;
            previousNode.setNextNode(null);
            previousNode.setPreviousNode(null);

            return;
        }

        newNode.setPreviousNode(previousNode);
        previousNode.setNextNode(newNode);

        //for next node set the previous node as current node
        previousNode = newNode;
    }

    /**
     * Ex
     *
     * Node 0 ---> Node 1 ---> Node 2 ---> Node 3
     * say we want to insert at 2nd index ie.. in between 1 and 2, So we need to
     *
     * 1. Update the next of node 1
     * 2. Node 2 becomes node 3 ( with previous pointing to new node)
     * 3. New node becomes node 2. update next as node 3, which we updated in step 2 and update
     *    previous as node 1 (node 1 reference you can get from old node 2 (or converted node 3 in step 2))
     *
     * @param index
     * @param value
     */
    public void insert(int index, T value) {

        Node newNode = new Node(value);

        Node currentNodeAtIndex = getNodeAtIndex(index);

        //step 1
        //set next for Node 1 as new node
        currentNodeAtIndex.getPreviousNode().setNextNode(newNode);

        //for the new node (step 3)
        //next = currentNodeAtIndex
        //previous = previous node of currentNodeAtIndex
        newNode.setNextNode(currentNodeAtIndex);
        newNode.setPreviousNode(currentNodeAtIndex.getPreviousNode());

        //for currentNodeAtIndex only update the previous (step 2)
        currentNodeAtIndex.setPreviousNode(newNode);

        size ++;
    }

    /**
     * Node 0 ---> Node 1 ---> Node 2 ---> Node 3
     *
     * If we are removing Node 2
     * 1. Set next for node 1 as node 3
     * 2. Set previous for node 3 as node 1
     *
     * The next and previous can be retrieved from node 2's previous and next.
     *
     * @param index
     */
    public void remove(int index) {

        Node currentNodeAtIndex = getNodeAtIndex(index);

        Node previousNode = currentNodeAtIndex.getPreviousNode();
        Node nextNode = currentNodeAtIndex.getNextNode();

        previousNode.setNextNode(nextNode);
        nextNode.setPreviousNode(previousNode);

        size--;
    }

    private Node getNodeAtIndex(int index) {

        if(index > size) {
            throw new RuntimeException("Index greater than size of list!!!");
        }

        Node n = firstNodeInList;
        int i = 0;
        while(true) {

            if(i == index) {
                break;
            }

            i ++;
            n = n.getNextNode();

            if(n == null) {
                break;
            }
        }

        return n;
    }

    public void print() {

        if(firstNodeInList == null) {
            System.out.println("Empty linked list!!!");
            return;
        }

        Node n = firstNodeInList;
        while(true) {
            System.out.println(n.getValue());
            n = n.getNextNode();

            if(n == null) {
                break;
            }
        }
    }
}
