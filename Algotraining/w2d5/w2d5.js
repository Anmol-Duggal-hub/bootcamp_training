// Stack: is Sorted

// isSorted(){}

// using only one additional stack or queue as storage (or a temp), check true or false if a stack
// is a sorted smallest to greatest collection of numbers.

// must return the stack back to it's original order when we are done.

// you may not linearly iterate through the stacks and queues

// if you want to see all the values, you need to run pop() or dequeue() until you can't.


class Node {
    constructor(data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    constructor() {
        this.top = null;
        this.length = 0;
    }


    push(node) {
        node.next = this.top;
        this.top = node;
        this.length++;
        return this;
    }

    pop() {
        if (!this.isEmpty()) {
            this.length--;
            let returned_node = this.top;
            this.top = this.top.next;
            returned_node.next = null; //need to cut off this node
            return returned_node;
        } else {
            return null;
        }
    }

    isEmpty() {
        return this.top === null;
        // or this.size() === 0;
    }
    //check .top

    peek() {
        return this.isEmpty() ? null : this.top;
    }
    // return top node

    size() {
        return this.length;
        // or run through the whole stack and count each node
    }

    isSorted() {
        var stack2 = new Stack();
        var sorted = true;

        while (!this.isEmpty()) {
            var temp = this.pop();
            if (stack2.isEmpty() || stack2.peek.data <= temp.data) {
                stack2.push(temp);
            } else {
                sorted = false;
                stack2.push(temp);
                break;
            }
        }
        while (!stack2.isEmpty()) {
            this.push(stack2.pop());
        }
        return sorted;
    }
}





// other data structures to note:

// circQueue
// circular queue is a linear data structure using first in first out.
// the last position is connected to the front, making a circle.
// this position is sometimes called the ring buffer.
// circular queues have a .length property, which fixes the size of our queue

// circular queues hae the following methods
// peekFront, peekBack, enqueue(node), dequeue, isempty, isfull, grow

// and the following attributes
// front, back, length


// priority queue
// a queue that has both a value and a priority.
// a priority queue implements: getHighestPriority, dequeueHighestPriority
// these methods run at O(n)

// heaps - binary heaps

// deque 'deck'
// double ended queue
// pushFront, pushBack, popFront, popBack, front, back, contains, isEmpty and size