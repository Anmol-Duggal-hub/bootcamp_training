// Names: Aaron Gray, Jon


// using only one additional stack or queue as storage (or a temp), check true or false if a stack
// is a sorted smallest to greatest collection of numbers.

class Node() {
    constructor(data){
        this.val = data;
        this.next = null;
    }
}

class stack(){
    constructor(){
        this.top = null;
        this.length = 0;
    }

    isSorted(){
        if (stack.length < 2) {
            return true;
        } else {
            let sort = [this.top.val];
            let runner = this.top.next;
            while (runner.next !== null) {
                if (sort[length(sort) - 1] > runner.val) {
                    return false;
                }
                sort.push(runner.val);
                runner = runner.next;
            }
            return true;
        }
    }
}




// must return the stack back to it's original order when we are done.

// you may not linearly iterate through the stacks and queues

// if you want to see all the values, you need to run pop() or dequeue() until you can't.

function sortedOrNot(stack) {
    if (stack.isEmpty()) {
        return true;
    }
    let temp = stack.pop();
    let val = temp.data;
    let stackTwo = new Stack();
    let final = true;
    newStack.push(temp);

    while (!stack.isEmpty()) {
        temp = stackOne.pop();
        if (temp.data >= val) {
            val = temp.data;
            stackTwo.push(temp);
        } else {
            stackOne.push(temp)
            final = false;
            break;
        }
    }
    while (!stackTwo.isEmpty()) {
        stackOne.push(stackTwo.pop());
    }
    return final;

}




// other data structures to note:

// circQueue
// circular queue is a linear data structure using first in first out.
// the last position is connected to the front, making a circle.
// this position is sometimes called the ring buffer.
// circular queues have a .length property, which fixes the size of our queue

// circular queues hae the following methods
// peekFront, peekBack, enqueue(node), dequeue, isempty, isfull

// and the following attributes
// front, back, length


// priority queue
// a queue that has both a value and a priority.
// a priority queue implements: getHighestPriority, dequeueHighestPriority