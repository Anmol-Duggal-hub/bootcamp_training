class Card{
    constructor(name, cost){
        this.name = name;
        this.cost = cost;
    }
}

class Unit extends Card{
    constructor(name, cost, power, res){
        super(name, cost);
        this.power = power;
        this.res = res;
    }

    summon(){
        console.log(this.name + " is called FORTH!")
    }
    attack(target){
        if(target instanceof Unit) {
        target.res -= this.power;
        console.log(this.name + " attacks " + target.name)
        } else{
            throw new Error("Target must be a unit!");
        }
    }
}

class Effect extends Card{
    constructor(name, cost,text, stat, magnitude){
        super(name, cost);
        this.magnitude = magnitude;
        this.text = text;
        this.stat = stat;
    }

    play(target){
        if(target instanceof Unit) {
            target[this.stat] += this.magnitude;
            console.log(this.text)
            } else{
                throw new Error("Target must be a unit!");
            }
        }
}

const redBeltNinja = new Unit("Red Belt Ninja", 3, 3, 4);
const blackBeltNinja = new Unit("Black Belt Ninja", 4, 5, 4);
const hardAlgo = new Effect("Hard Algorithm", 2, "Increase target's resilience by 3", "resilience", 3);
const uPR = new Effect("Unhandled Promise Rejection", 1, "Reduce target's resilience by 2", "resilience", -2);
const pairPro = new Effect("Pair Programming", 3, "Increase target's power by 2", "power", 2);

redBeltNinja.summon();
hardAlgo.play(redBeltNinja);
blackBeltNinja.summon();
uPR.play(redBeltNinja);
pairPro.play(redBeltNinja);
redBeltNinja.attack(blackBeltNinja);