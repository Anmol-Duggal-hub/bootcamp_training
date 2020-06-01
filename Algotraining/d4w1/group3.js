// names: Anmol , Michael Lin, Vidula, Free Joe Exotic 2021

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

    //void delete(data){}
    //if data is contained within the current list, remove it.
    //consider edge cases of head node, last node, and middle nodes

    delete(data){
        if(this.head === null){ // checks if it's empty
            return false;
        }
        if(this.head.data === data){ // checks if the data is the head
            this.head = this.head.next
        }
        if(this.head.next === null){ // checks if there is only one node (the head)
            this.head === null
        }
        var runner = this.head;
        while(runner.next.data != data && runner.next != null){
            runner = runner.next
        }
        if (runner.next.next != null){ // middle nodes
        runner.next = runner.next.next
        }
        else{  // if data is the last node
            runner.next = null
        }
    }

    //void append(target, data){}
    //if target is within the current list, create a new node
    //with the data of data, and append it directly after target

    append(target, data){
        if(this.head === null){ // checks if it's empty
        return false;
    }
    var runner = this.head;
    while(runner.data != target){
        runner = runner.next
    }
    var temp = runner.next;
    var newNode = new Node(data);
    runner.next = newNode;
    newNode.next = temp;

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