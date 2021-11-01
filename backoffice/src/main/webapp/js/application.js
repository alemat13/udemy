/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $('#show-catalog').on("click", function () {
        $.ajax({
            url: 'rest/catalogue/liste',
            success: function (data) {
                $('#catalog').empty();
                data.forEach(function(w) {
                    $('#catalog').append("<li><b>" + w.mainArtist.name + "</b> - " + w.title + " (" + w.release + ")</li>");
                });
            }
        });
    });
});
