public class Queue {
    public static class NoElementToDequeException extends Exception {

        public NoElementToDequeException() {
            super("There is no member to dequeue");
        }
    }
    private int amountOfMembers = 0;

    private Node firstMember = null;
    private Node lastMember = null;
    public void enqueue(int userNum) {
        Node node = new Node(userNum);

        if (amountOfMembers == 0) {
            firstMember = node;
        } else {
            lastMember.setNext(node);
        }
        lastMember = node;
        amountOfMembers++;
    }

    public int dequeue() throws NoElementToDequeException {
        if (firstMember == null) {
            throw new NoElementToDequeException();
        }
        int value = firstMember.getValue();
        firstMember = firstMember.getNext();

        amountOfMembers--;
        return value;
    }

    public boolean isEmpty() {
        if (firstMember == null) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return amountOfMembers;
    }

    private static void printQueue(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.getValue() + " ");
        printQueue(node.getNext());
    }


    public void printQueue() {
        printQueue(firstMember);
    }

}
