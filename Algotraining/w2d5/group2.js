//Names: Ashley, Bobby, Yusuf

// Stack: is Sorted

isSorted(stack){
    if (stack.isEmpty() == true) {
        return null;
    }
    let new_stack = new Stack();
    let temp = stack.pop();
    new_stack.push(temp);
    while (stack.isEmpty() != true) {
        let temp2 = stack.pop();
        if (temp.data > temp2.data) {
            temp = temp2;
        }
        else {
            return false;
        }
    }
    while (new_stack.isEmpty() != true) {
        stack.push(new_stack.pop());
    }
    return true;

}

// [1,2,3,4,5 ];

//1
// temp = 4
// temp2 = 4
// stack = [1, 2, 3, 4]
// new_stack = [5]

//whenever we pop the value, we take that data and store it in the temp. and also push into new stack
//With the next node that we pop, we compare the data of that node to see if it is greater.
//If it continues to be greater than the previous then return true (that the nodes are in smallest to greatest order)

// using only one additional stack or queue as storage (or a temp), check true or false if a stack
// is a sorted smallest to greatest collection of numbers.

// must return the stack back to it's original order when we are done.

// you may not linearly iterate through the stacks and queues

// if you want to see all the values, you need to run pop() or dequeue() until you can't.






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
// these methods run at O(n)