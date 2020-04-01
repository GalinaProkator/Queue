public class Tester {

    public static void main(String[] args) throws Queue.NoElementToDequeException {
        Queue queue = new Queue();

        //creating new not linked nodes
        int userNum1 = 15;
        int userNum2 = 16;


        //creating a queue with earlier created nodes
        queue.enqueue(userNum1);
        queue.enqueue(userNum2);

        //dequeue the queue
        System.out.println("The next in line is " + queue.dequeue());

//        check the size or if the queue is empty
        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue has " + queue.size() + " members");
        }

        queue.printQueue();


    }
}
