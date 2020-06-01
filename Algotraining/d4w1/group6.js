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

    //void append(target, data){}
    //if target is within the current list, create a new node
    //with the data of data, and append it directly after target

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