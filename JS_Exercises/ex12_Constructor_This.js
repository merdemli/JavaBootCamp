//this key word'ü
//fonksiyonun içindeki this
//object tipi tanımlaması
var student = {firstName : "Merve",lastName :"Erdemli", 
               fullName : function (){
        return this.firstName + " " +this.lastName;  
    }
}//nesne ve içinde fonksiyon ile değişkener var,this key word'ü o objeyi gösterir. yani student'ı

alert(student.fullName());

//object constructor
//js'de her şey nesnedir ,fonksiyon tanımlayarak obje oluşturacaksak, costructor görevi görecekse, PascalCase yazılır.

function Customer(first, last, city, country,age){
    this.firstName =first;
    this.lastName=last;
    this.city=city;
    this.age=age;
    this.country=country;
}

var someCustomer = new Customer("merve","erdemli","istanbul","turkey","18")

alert(someCustomer.country);

