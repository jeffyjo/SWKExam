/**
 * Created by jeffjorgensen on 23/12/2016.
 */

//import jQuery/$.(document.ready)

$(document).ready(function () {

    var apiKey = "79b79466ce5da727349781fe319ffab0";
    var apiLink = "http://api.openweathermap.org/data/2.5/weather";
    var iconLink = "http://openweathermap.org/img/w/" + "" + ".png";

    $('#btn').click(function() {

        var city = $('#selectBox').val();

        $('.weather').empty();

        $.ajax({

            'url' : apiLink,
            'type': 'GET',

            'data' : {
                'q': city,
                'appid': apiKey

            },

            'success': function(data){
                console.log(data);

                //FIX THIS
                //var response = JSON.parse(data);

                //console.log(response);

                var city = data.name;
                var temp = data.main.temp;

                var tempCelcius = Math.round((parseInt(temp) - 273.15) * 100) / 100;

                var weather = data.weather[0].main;
                var weatherDescription = data.weather[0].description;
                var img = data.weather[0].icon;

                console.log(city + " " + tempCelcius + " " + weather + " "
                + weatherDescription + " " + img);

                $('#town').append(city);
                $('#temp').append(tempCelcius);
                $('#weather').append(weather);
                $('#weather_description').append(weatherDescription);

                $('#container');

                var icon = "http://openweathermap.org/img/w/" + img + ".png"
                $('#icon').src = icon;

                console.log(icon);

            }


        });

    });

    /*
    $('#btn').click(function() {
        var city = $('#selectBox').val();
        console.log(city);
    });
    */

});

