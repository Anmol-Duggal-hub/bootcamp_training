// Names: Tam Nguyen, Aaron Gray, Vernon Lewis, Carole Baskin

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

    delete(data){ // data is a single node
    //if data is contained within the current list, remove it.
    //consider edge cases of head node, last node, and middle nodes
        if(this.count() === 0) {
            console.log("No data in list - cannot delete")
            return;
        }

        let runner=this.head;
        while (runner !== null && runner.next !== data){
            runner=runner.next;
        }

        if(runner === null) {
            console.log("Data not found - could not delete")
        } else {
            if(runner === this.head) {
                this.head = this.head.next;
            } else {
                runner.next = runner.next.next;
            }
        }
        return this;
    }

    append(target, data){
        let runner = this.head;

        while(runner !== null && runner.data !== data) {
            runner = runner.next;
        }

        if(runner === null) {
            console.log("Data not found - could not append")
            return;
        } else {
            let newNode = new Node(data);
            newNode.next = runner.next;
            runner.next = newNode;
            return this;
        }
    }
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