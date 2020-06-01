class Node:
    def __init__(self, val):
        self.val = val
        self.next = None

class SLL:
    def __init__(self):
        self.head = None

   def printAll(self):
        runner = self.head
        while runner != None:
            print(runner.val)
            runner = runner.next
        return self

    def removeStart(self):
        self.head = self.head.next
        return self

    def removeEnd(self):
        if self.head == None:
            return self
        if self.head.next == None:
            self.head = None
        runner = self.head
        while runner.next.next != None:
            runner = runner.next
        runner.next = None
        return self

    def addToStart(self, val):
        node = Node(val)
        if self.head == None:
            self.head = node
            return self
        node.next = self.head
        self.head = node
        return self

    def addToEnd(self, val):
        node = Node(val)
        if self.head == None:
            self.head = node
            return self
        runner = self.head
        while runner.next != None:
            runner = runner.next
        runner.next = node
        return self



def insert(index, val):
    node = Node(val)
    temp = self.head
    counter = 0
    while temp != None:
        if counter == index:
            node.next = runner.next
            temp.next = node
        temp = temp.next
        counter += 1

def remove(index):
    temp = self.head
    counter = 0
    while temp != None:
        if counter == index - 1:
            temp.next = temp.next.next
        runner = runner.next
        counter += 1

def midpoint():
    temp = self.head
    fast_temp = self.head
    while fast_temp != None:
        if fast_temp.next == None:
            fast_temp = fast_runner.next.next
        else:
            break
        temp = runner.next
    return temp

def find_length():
    temp = self.head
    counter = 0
    while temp != None:
        temp = temp.next
        counter += 1
    return counter

def addTwoList(s1, s2):
    r1 = s1.head
    r2 = s2.head
    total = 0
    while r1 != None:
        total += r1.val + r2.val
        if r1.next == None:
            total *= 10
        r1 = r1.next
        r2 = r2.next
    return self

def detectLoop(s1):
    r1 = s1.head
    r2 = s1.head
    while r2 != None:
        if r2.next == None:
            break
        if r1 == r2:
            return True
        r2 = r2.next.next
        r1 = r1.next
    return False

def detectLoopWithSpace(s1):
    r1 = s1.head
    cache = {}
    while r1 != None:
        if r1 in cache:
            return True
        else:
            cache[r1] = 1
        r1 = r1.next
    return False



#*********CONSIDERATIONS***********
# use for loops when ---> start and end is known
# use while loops when ---> kinda know the ending
# recursion ---> dont really know when to stop but there is a break case.

# f _____
# 1. loop
# 2. if
# 3. extra --> storing information, counters, indicies ... etc.
# 4. print / return

# 1. practicality -> does it work or not?
# 2. readability / refactoring -> can other people tell what it does?
# 3. elegance -> clean code, doing minimal things + optimization
# 4. abstraction -> can i use this code for many cases, any time?


