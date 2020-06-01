// Names: Tam Nguyen, Vernon Lewis Andy, Murph
// FIFO
// first in, first out

// a queue is like the line to get into costco
// if you're at the back, it's a bummer
// if you're at the front, you got there first

// a queue only implements the following methods:
// enqueue, dequeue, front, isEmpty, size

// queues are not indexed and you can't jump
// to values in the middle or center of queues

// the only way to see all the values
// is to dequeue in a loop

// pulling back to the main room at 9:50 -brendan

class Node {
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

class Queue {
    constructor(){
        this.back = null;
        this.front = null;
        this.length = 0;
    }

    // it is possible to implement all of these methods
    // without linearly iterating through the queue. like
    // the stack, we want these methods to have the same runtime
    // no matter how large we make the queue

    enqueue(data){
        let newNode = new Node(data);

        if(this.isEmpty()) {
            this.front = newNode;
            this.back = newNode;
        } else {
            this.back.next = newNode;
            this.back = newNode;
        }

        this.length++;
        return this;
    }
    // add a node to the back

    dequeue(){
        if(this.isEmpty()) {
            return null;
        }

        let temp = this.front;
        this.front = this.front.next;
        temp.next = null;

        if(this.isEmpty()) {
            this.back = null;
        }

        this.length--;
        return temp;
    }
    // remove and return a node from the front

    front(){
        return this.front;
    }
    // return the front node, not removing it

    isEmpty(){
        return this.front === null;
    }
    // is the queue empty, true or false?

    size(){
        return this.length;
    }
    // how many nodes are in our queue?
}