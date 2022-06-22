var table=$('<table>');
var tbody = $('<tbody>');
table.append(tbody);
for(var i=1; i<11; i++){
    var tr = $('<tr>');
    tbody.append(tr);
    for (var j=1; j<11; j++){
        var td = $('<td>').html('' + i+'&middot;'+j+'='+i*j);
        tr.append(td);
        if (i%2==0) td.addClass('w3-light-grey');
        else td.addClass('w3-sand');
    }
}
table.addClass('w3-table w3-bordered w3-small');
$('#container').append(table);