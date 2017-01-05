/**
 * Created by jeffjorgensen on 04/01/2017.
 */



$(document).ready(function () {

    //http://api.openweathermap.org/data/2.5/weather?q=london&appid=79b79466ce5da727349781fe319ffab0

    var apiKey = "79b79466ce5da727349781fe319ffab0";
    var apiLink = "http://api.openweathermap.org/data/2.5/weather";

    $('#btn').click(function() {

        var city = $('#selectBox').val();

        $('.weather').empty();

        //ajax-call url, type, data{}, success:function()


        //var tempCelcius = Math.round((parseInt(temp) - 273.15) * 100) / 100;

    });
});

