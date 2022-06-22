
var table = $('<table>');
table.attr('id','table');

var tbody = $('<tbody>');
table.append(tbody);
for(var i=0; i<9; i++) {
    var tr = $('<tr>');
    tbody.append(tr);
        for (var j=0; j<9; j++){
            var icon = $('<i>');
                icon.addClass("fas fa-2x");
                icon.addClass("fa-"+icons[i*10+j]);
                icon.css("color","gray");
                icon.hover(function(){
                console.log('123');
                });

            var td =$("<td>").append(icon);
            tr.append(td);
            if (i%2==0) td.addClass('w3-light-grey');
            else td.addClass('w3-sand');
    }
}
table.addClass('w3-table w3-bordered w3-small');
$('#container').append(table);
