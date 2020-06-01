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
        this.length = 0
    }

    // it is possible to implement all of these methods
    // without linearly iterating through the queue. like
    // the stack, we want these methods to have the same runtime
    // no matter how large we make the queue

    enqueue(data){
        var newNode = new Node(data);
        if(this.back === null){
            this.back = newNode;
            this.front = newNode
        }else{
            this.back.next = newNode;
            this.back = newNode;
        }
        length++;
    }
    // add a node to the back

    dequeue(){
        if(this.front === null){
            return null;
        };
        if(this.front === this.back){
            this.back = null;
        };
        let returnNode = this.front;
        this.front = returnNode.next;
        returnNode.next = null;
        length--;
        return returnNode;
    }
    // remove and return a node from the front

    peek(){
        return this.front;
    }
    // return the front node, not removing it

    isEmpty(){
        if(this.front && this.back) return false;
        return true;
    }
    // is the queue empty, true or false?

    size(){
        return this.length;
    }
    // how many nodes are in our queue?
}