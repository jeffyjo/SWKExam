/**
 * Created by jeffjorgensen on 23/12/2016.
 */

//Try something fancy with JS, that effects the HTML document

var seriesOfNames = ["Jeff"];

function clicked(){

    //console.log("button is clicked")
    //alert("button is clicked")


}

$(document).ready(function () {

    $('#btn').click(function() {

    var name = $('#inputField').val();
    //var number = document.getElementById('numbers')[0].value;

    seriesOfNumber.push(name);

        var temp = "";

        for (i = 0; i < seriesOfNames.length; i++){
            temp.concat(" , " + seriesOfNames[i]);

        }

        console.log(temp);

        $('#numbers').text = temp;

    });

});



//var a = ["5", 5];

/*function secClick(){

    var number;

    for (i = 0; i < a.length; i++){
        if (a[i] === 5) {

            console.log(a[i] + " at index " + i);

            number += a[i]

        }

        console.log("the number is now: " + number)

    }
};
*/

