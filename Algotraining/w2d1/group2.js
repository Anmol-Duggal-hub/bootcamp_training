// Names Jon, Crème fraîche, Ashley, Greg, Vernon


// Stack (push, pop, isEmpty, peek, size)
// LIFO (Last In First Out)

class Node {
    constructor(data){
        this.data = data;
        this.next = null;
    }
}

const reverse = stack => {
    let newStack = new Stack();
    while (stack.isEmpty() == false){
        let popped = stack.pop();
        newStack.push(popped.data);
    }
    return newStack;
}

//write a standalone reverse method
//reverse(stack){}
//only have one new stack for additional storage

class Stack {
    constructor(){
        this.top = null;
        this.length = 0;
    }

    push(data){
        let newNode = new Node(data);
        newNode.next = this.top;
        this.top = newNode;
        this.length += 1;
    }

    pop(){
        if(this.top == null) {
            return null;
        }
        let temp = this.top;
        this.top = this.top.next;
        this.length -= 1;
        return temp;
    }

    isEmpty(){
        if(this.top == null) {
            return true;
        }
        return false;
    }

    peek(){
        return this.top
    }

    size(){
        return this.length;
    }

}

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