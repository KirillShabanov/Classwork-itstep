class Driver extends User {
    car;
    reviews;
    constructor(name, login, pass){
        super(name, login, pass);
        this.reviews = [];
    }
    addReviews(reviews){
        this.reviews.push(reviews);
    }

}
export{Driver}