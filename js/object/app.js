let user = {};

user.name = "John";
user.surname = "Smith";
user.name = "Pete";
delete user.name;

let salaries = {
    John: 100,
    Ann: 160,
    Pete: 130,
  }
let sum = 0;
  for(let key in salaries){
    sum = sum + salaries[key];
  }
  console.log(sum);

  userCopy ={};
  user = {
    name: "Иван",
    age: 30
  };

  for(let key in user){
      userCopy[key] = user[key];
      console.log(key, userCopy[key])
  }
  userCopy ={};
  user = {
    name: "Иван",
    sizes: {
      height: 182,
      width: 50
    }
  };

  for (let key in user){
      console.log(userCopy[key])
      if (typeof user[key] == "object") {
        userCopy[key] = {};
        for (let keyIn in user[key]){
            userCopy[key][keyIn] = user[key][keyIn];
        }
      } else userCopy[key] = user[key];
  }
  userCopy ={};
  console.log(userCopy)
let k = 0;
  function emptyObj (a){
    for (let key in a) {
        if (typeof a[key] == "undefined"){
            k++
        }
    }
    if (k == 0){
        return console.log("Объект пустой");
    } else 
    return console.log("Объект не пустой");
  }


emptyObj(user);


  let menu = {
    width: 200,
    height: 300,
    title: "My menu"
  };


  function multiplyNumeric (a){
  for (let key in a) {
      if (typeof a[key] == "number") {
          a[key] = a[key]*2;
      }
  }
}
multiplyNumeric(menu)
console.log(menu)