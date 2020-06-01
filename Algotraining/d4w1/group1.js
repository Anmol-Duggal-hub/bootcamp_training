//names: Bobbie, Andy, Lucie, Billy the Kid
class Node {
    constructor(data) {
      this.data = data;
      this.next = null;
    }
}

class SList {
    constructor() {
        this.head = null;
    }

    //SList
    //complete the following methods for the SList class



    //if data is contained within the current list, remove it.
    //consider edge cases of head node, last node, and middle nodes

    voidDelete(data){
//condition for empty list
    if(this.head === null){
        // console.log("Nothing to be deleted");
    }
//head node
    if(this.head.data === data){
        this.head = this.head.next;
        // console.log("Head node deleted");
    }
    var runner = this.head;

    while(runner.next){
        if(runner.next.data === data){
//last node
            if(runner.next.next === null){
                runner.next = null;
                // console.log("Last node deleted");
            }
//middle nodes
            else {
                runner.next = runner.next.next;
                // console.log("Middle node(s) deleted");
            }
        }
        runner = runner.next;
    }

    return this;
    }


    //void append(target, data){}
    //if target is within the current list, create a new node
    //with the data of data, and append it directly after target

    append(target, data){
        var runner = this.head
        while(runner!== null && runner != target){
            runner = runner.next
        }
        //runner is now target
        if(runner === target){
        var newNode = new Node(data)
        //newNode now points to Node after target
        newNode.next = runner.next;
        //runner now points to new Node
        runner.next = newNode;
        }
    }


    contains(data){
        if(this.head === null){
            return false;
        }
        var runner = this.head;
        while(runner){
            if(runner.data === data){
                return true
            }
            runner = runner.next;
        }
        return false;
    }

    count(){
        var count = 0;
        if(this.head === null){
            return count;
        }
        var runner = this.head;
        while(runner){
            count++;
            runner = runner.next;
        }
        return count;
    }

    middle(){
        var slowRunner = this.head;
        var speedyRunner = this.head;
        if(this.head === null){
            return this.head;
        }
        while(speedyRunner !== null && speedyRunner.next !== null){
            speedyRunner = speedyRunner.next.next;
            slowRunner = slowRunner.next;
        }
        return slowRunner;
    }

    isEmpty(){
        if(this.head === null){
            return false;
        }
        return true;
    }

    removeFront(){
        if(!this.isEmpty()){
            this.head = this.head.next;
            this.length--;
        }
        return this;
    }

    display(){
        var runner = this.head;
        while(runner !== null){
            console.log(runner.data);
            runner = runner.next;
        }

        return this;
    }
}