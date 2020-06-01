//name: Anmol, Yusuf, Christine, Bilal

// Stack (push, pop, isEmpty, peek, size)
// LIFO (Last In First Out)

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
        var x = new Node(data);
        x.next = this.top;
        this.top = x;
        this.length++;
    }

    pop(){ //what if it's empty?
    if (this.top.data == null){
        return null;
    }

        var temp = this.top;
        this.top.next = this.top;
        this.length--;
        return temp;
    }

    isEmpty(){
        if (this.top.data == null){
            return true;
        }
        return false;
    }
    //check .top

    peek(stack){
        return this.top;
    }
    // return top node

    size(stack){
        return this.length;
    //     runner = this.top;
    //     count=1;
    //     while (runner.data != null){
    //         runner = runner.next;
    //         count++;
    //     }
    //     return count;
    // }
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