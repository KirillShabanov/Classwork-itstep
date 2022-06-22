/*document.write("<table border='1' width='200' height='200'>");
for(var i=1; i<=8; i++)
{
document.write("<tr>");
for(var j=1; j<=8; j++) {

if((i+j)%2!=0){

document.write("<td bgcolor='white'></td>");
}

else

{
    
document.write("<td bgcolor='black'></td>");
}
}
document.write("</tr>");
}
document.write("</table>");*/
out = "<table>";

for(let i = 1; i <= 8; i++){
    out += '<tr>'
    if (i % 2 == 0) {
        for(let j = 1; j <= 8; j++)
        if (j % 2 == 0) {
            out += "<td class = 'black'></td>"
        } else {
            out += "<td class = 'white'></td>"
        }
    } else {
        for(let j = 1; j <= 8; j++)
        if (j % 2 == 0) {
            out += "<td class = 'white'></td>"
        } else {
            out += "<td class = 'black'></td>"
        }
    }


out +="</tr>"
}

out += "</table>";

document.write(out);

var fruits = ["apple", "orange", "lime","watermelon"];

out = "<ul>";
for (let i = 0; i < 4; i++){
    out = out + `<li>${fruits[i]}</li>`;
}
out += "</ul>"; 
document.write(out);