

//Question 1

console.log(hello);
var hello = 'world';

//hoisted
//var hello;
//console.log(hello); -> returns undefined
//hello = 'world';

//ES6 --> syntax error
// console.log(hello);
// const hello = 'world';

//---------------------------------------------------------------------//

//Question 2

var needle = 'haystack';
test();
function test(){
    var needle = 'magnet';
    console.log(needle);
}
//output: 'magnet'
//hoisted
//var needle;
//needle = 'haystack';
//function test(){
//     var needle;
//     needle = 'magnet';
//     console.log(needle);
// }


//---------------------------------------------------------------------//

//Question 3

var brendan = 'super cool';
function print(){
    brendan = 'only okay';
    console.log(brendan);
}
console.log(brendan);

//output: 'super cool'
//hoisted
//var brendan;
//function print(){
//     var brendan; 
//     brendan = 'only okay';
//     console.log(brendan);
// }
// //brendan  = 'super cool';
// console.log(brendan);

//---------------------------------------------------------------------//

//Question 4

var food = 'chicken';
console.log(food);
eat();
function eat(){
    food = 'half-chicken';
    console.log(food);
    var food = 'gone';
}

//output:'chicken', 'half-chicken'
//hoisted
//var food;
//function eat(){
//     var food;
//     food = 'half-chicken';
//     console.log(food);
//     food = 'gone';
// }
// food = 'chicken'
// console.log(food)
// eat();

//---------------------------------------------------------------------//

//Question 5

// mean();
// console.log(food);
// var mean = function() {
//     food = "chicken";
//     console.log(food);
//     var food = "fish";
//     console.log(food);
// }
// console.log(food);


//output: error, need to define variable mean before calling it
//hoisted
//var mean;
//mean();
//console.log(food)
//mean = function(){
//     var food;
//     food = "chicken";
//     console.log(food);
//     food = "fish";
//     console.log(food);
// }
// console.log(food);

//---------------------------------------------------------------------//

//Question 6

console.log(genre);
var genre = "disco";
rewind();
function rewind() {
    genre = "rock";
    console.log(genre);
    var genre = "r&b";
    console.log(genre);
}
console.log(genre);

//output: undefined, rock, r&b, disco
//hoisted
//var genre;
//function rewind(){
//     var genre;
//     genre = 'rock';
//     console.log(genre);
//     genre = 'r&b';
//     console.log(genre);
// }
// console.log(genre);
// genre = 'disco';
// rewind();
// console.log(genre);

//---------------------------------------------------------------------//

//Question 7

dojo = "san jose";
console.log(dojo);
learn();
function learn() {
    dojo = "seattle";
    console.log(dojo);
    var dojo = "burbank";
    console.log(dojo);
}
console.log(dojo);

//output: san jose, seattle, burbank, san jose;
//hoisted
// var dojo;
// function learn(){
//     var dojo;
//     dojo = 'seattle';
//     console.log(dojo);
//     dojo = 'burbank';
//     console.log(dojo);
// }
// dojo = "san jose";
// console.log(dojo);
// learn();
// console.log(dojo);


//---------------------------------------------------------------------//

//Question 8

console.log(makeDojo("Chicago", 65));
console.log(makeDojo("Berkeley", 0));
function makeDojo(name, students){
    const dojo = {};
    dojo.name = name;
    dojo.students = students;
    if(dojo.students > 50){
        dojo.hiring = true;
    }
    else if(dojo.students <= 0){
        dojo = "closed for now";
    }
    return dojo;
}

//output: error
//hoisted
// function makeDojo(name, students){
//     const dojo = {};
//     dojo.name = name;
//     dojo.students = students;
//     if(dojo.students > 50){
//         dojo.hiring = true;
//     }
//     else if(dojo.students <= 0){
//         dojo = "closed for now";
//     }
//     return dojo;
// }
// console.log(makeDojo("Chicago", 65));
// console.log(makeDojo("Berkeley", 0));
