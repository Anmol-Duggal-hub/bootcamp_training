class Ninja{
    constructor(name, health, speed=3, strength=3){
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.strength = strength;
    }

    sayName(){
        console.log(this.name);
    }

    showStats(){
        console.log("The ninja's name is: " + this.name);
        console.log("The ninja's strength is: " + this.strength);
        console.log("The ninja's speed is: " + this.speed);
        console.log("The ninja's health is: " + this.health);
    }

    drinkSake(){
        this.health = this.health + 10;
    }
}

class Sensei extends Ninja{
    constructor(name, health=300, speed=10, strength=10, wisdom=10){
        super(name, health, speed, strength);
        this.wisdom= wisdom;
    }

    speakWisdom(){
        super.drinkSake();
        console.log("What is Java.. without Script.")
    }
}


const superSensei = new Sensei("Master Splinter");
superSensei.speakWisdom();
superSensei.showStats();