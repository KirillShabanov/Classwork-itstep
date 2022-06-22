let i = 4
document.forms.cat_list.success_btn.onclick = function(event){
    let tr = document.createElement("tr");
   
    let td1 = document.createElement("td");
    let td2 = document.createElement("td");
    let td3 = document.createElement("td");
    let td4 = document.createElement("td");
    let td5 = document.createElement("td");
    
    td1.classList.add("catName")
    td1.innerHTML = document.forms.cat_list.cat_name.value;
    tr.appendChild(td1)
    td2.classList.add("catColor")
    td2.innerHTML = document.forms.cat_list.cat_color.value;
    tr.appendChild(td2)
    td3.classList.add("catBreed")
    td3.innerHTML = document.forms.cat_list.select_breed.value;
    tr.appendChild(td3)
    td4.classList.add("catSex")
    td4.innerHTML = document.forms.cat_list.cat_sex.value;
    tr.appendChild(td4);
    td5.innerHTML = '<span class="close">×</span><span class = "arrow">&#9998;</span>';
    tr.appendChild(td5);
    document.querySelector("tbody").append(tr);

    document.forms.cat_list.cat_name.value = ""
    document.forms.cat_list.cat_color.value = "#000000"
    document.forms.cat_list.select_breed.value = "Персидская кошка"
    document.forms.cat_list.cat_sex.value = "Муж."
    return false

}
document.querySelector("tbody").onclick = function(event){
    let tr = event.target;
    
    console.log(tr)
    if (tr.classList.contains("close")) { 
        tr.parentNode.parentNode.remove()
      
      }
      if (tr.classList.contains("close")) { 
        tr.parentNode.parentNode.remove()
      
      }
      if (tr.classList.contains("arrow")) { 
        let list = document.querySelectorAll("tr");
        for(let i = 0; i < list.length; i++){
            list[i].classList.remove("add")}

        document.forms.cat_list.success_btn.style.display = "none"
        document.forms.cat_list.edit_btn.style.display = "inline-block"
        tr.parentNode.parentNode.classList.add("add")
        document.forms.cat_list.cat_name.value = document.querySelector(".add > .catName").innerHTML
        document.forms.cat_list.cat_color.value = document.querySelector(".add > .catColor").innerHTML
        document.forms.cat_list.select_breed.value = document.querySelector(".add > .catBreed").innerHTML
        document.forms.cat_list.cat_sex.value = document.querySelector(".add > .catSex").innerHTML
      }
}

document.forms.cat_list.edit_btn.onclick = function(){
    document.querySelector(".add > .catName").innerHTML = document.forms.cat_list.cat_name.value
    document.querySelector(".add > .catColor").innerHTML = document.forms.cat_list.cat_color.value
    document.querySelector(".add > .catBreed").innerHTML = document.forms.cat_list.select_breed.value 
    document.querySelector(".add > .catSex").innerHTML = document.forms.cat_list.cat_sex.value
    document.querySelector(".add").classList.remove("add")
    document.forms.cat_list.edit_btn.style.display = "none"
    document.forms.cat_list.success_btn.style.display = "inline-block"
    document.forms.cat_list.cat_name.value = ""
    document.forms.cat_list.cat_color.value = "#000000"
    document.forms.cat_list.select_breed.value = "Персидская кошка"
    document.forms.cat_list.cat_sex.value = "Муж."
}
