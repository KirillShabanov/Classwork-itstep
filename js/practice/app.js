class Matrix {
    mass = [];
    c = [];
    columns = 4;
    strings = 4;


    constructor(columns,strings){
        this.columns = columns;
        this.strings = strings;
        for ( let i = 0; i < this.columns; i++){
                this.mass[i] = [];
                for (let j = 0; j < this.strings; j++){
                    this.mass[i][j] = Math.floor(Math.random() * (100 - 1 + 1)) + 1;
            }
        }
            
    }
    getFoldMatrix(a,b) {
        for (let i = 0; i < this.columns; i++){
            c[i] = [];
            for (let j = 0; j < this.strings; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

}


let a = new Matrix(5 , 7);
let b = new Matrix(5 , 7);

let c = []
console.table(a.mass);