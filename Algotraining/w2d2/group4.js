// FIFO
// first in, first out

//Jon, Lucie, Jon, Aaron, Jon

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
        this.length = 0;
    }

    // it is possible to implement all of these methods
    // without linearly iterating through the queue. like
    // the stack, we want these methods to have the same runtime
    // no matter how large we make the queue

    //add a node to the back
    enqueue(data){
        var new_node = new Node(data);
        if(this.front ==null){
            this.front = new_node;
            this.back = new_node;
        }
        else {
            this.back.next = new_node;
            this.back = new_node;
        }
        this.length++;
        return this;
    }

//worked

    // remove and return a node from the front
    dequeue(){
        if(this.front == null){
            return null;
        }
        var temp = this.front;
        if(this.length == 1){
            this.front = null;
            this.back = null
        }else{
            this.front=this.front.next;
            temp.next=null
            }
        return temp;
    }
//worked
    front(){
        return this.front;
    }
    // return the front node, not removing it

    isEmpty(){
        return this.length === 0;
    }
    // is the queue empty, true or false?

    size(){
        return this.length;
    }
    // how many nodes are in our queue?
}