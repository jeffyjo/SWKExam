/**
 * Created by jeffjorgensen on 04/01/2017.
 */

var a = "Hej";

//document.write(a);

var number = 3;

//document.write(number);

var object = {Vehicle:"Fiat", Model: "500", HP:5, wheels:[1, 2, 3, 4]};

document.write("I have a " + object.Vehicle + " " + object.Model + "it has " + object.HP + " HP" + "and " +
    object.wheels.length + " wheels");

//class defined with function
var Car = function(vehicle, model, hp, wheels){
    this.vehicle = vehicle;
    this.model = model;
    this.hp = hp;
    this.wheels = wheels;
};

//function to class with prototype-keyword
Car.prototype.carInfo = function(){
    return this.vehicle + " " + this.model + " " + this.hp + " " + this.wheels
};

$(document).ready(function () {

    $.('#btn').onclick(function(){
        //something

    });

});
