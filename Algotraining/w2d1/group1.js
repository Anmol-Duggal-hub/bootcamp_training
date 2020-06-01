// Stack (push, pop, isEmpty, peek, size)
// LIFO (Last In First Out)
// Names: Tam Nguyen, Lucie Wang, Bigfoot

//write a standalone reverse method
//reverse(stack){}
//only have one new stack for additional storage

class Node {
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

class Stack {
    constructor(){
        this.top = null;
        this.length = 0;
    }

    push(data){
        let new_node = new Node(data);
        new_node.next = this.top;
        this.top = new_node;
        this.length++;
        return this;
    }

    pop(){
        if(!this.isEmpty()) {
            this.length--;
            let returned_node = this.top;
            this.top = this.top.next;
            returned_node.next = null; //need to cut off this node
            return returned_node;
        } else {
            return null;
        }
    }

    isEmpty(){
        return this.top === null;
        // or this.size() === 0;
    }
    //check .top

    peek(){
        return this.isEmpty() ? null : this.top;
    }
    // return top node

    size(){
        return this.length;
        // or run through the whole stack and count each node
    }

    reverse() {
        let new_stack = new Stack();
        while(!this.isEmpty()) {
            new_stack.push(this.pop().data);
        }
        this.top = new_stack.top;
        return this;
    }
}

// s.reverse()
// s.isEmpty() should return false


// simple node with no pointers
class SimpleNode {
    constructor(data){
        this.data = data;
    }
}

// stack class implemented with an array
class arrStack {
    constructor() {
        this.stack = [];
    }

    // push a node to the top of the stack;
    push(data){
        this.stack.push(new SimpleNode(data));
    }

    // remove and return a node from the top of the stack
    pop(){
        return this.stack.pop();
    }

    // check if stack is empty
    isEmpty(){
        if(this.stack.length < 1){
            return true;
        };
        return false;
    }

    // return the top node if it exists,
    // not removing it from the stack
    peek(){
        if(this.isEmpty()){
            return null;
        }
        return this.stack[this.stack.length-1];
    }

    // check stack size
    size(){
        return this.stack.length;
    }
}