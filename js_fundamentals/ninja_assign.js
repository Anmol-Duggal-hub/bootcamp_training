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

const ninja1 = new Ninja("Hyabusa");
ninja1.sayName();
ninja1.showStats();