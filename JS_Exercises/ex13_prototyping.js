function Customer(first, last, city, country,age){
    this.firstName =first;
    this.lastName=last;
    this.city=city;
    this.age=age;
    this.country=country;
}

var customer1  = new Customer("merve","erdemli","istanbul","turkey","18")

Customer.prototype.eMail = "merveerdemli6@gmail.com";
Customer.prototype.fullName = function(){          //heryerde kullanmak istemediğimiz özellikler için prototype deseninden
    return this.firstName+ " " +this.lastName      //faydalanabiliriz  
}

alert(someCustomer.city);
alert(someCustomer.eMail);
alert(someCustomer.fullName);
