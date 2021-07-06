
//fonksiyon tanımlar gibi class tanımlıyoruz.
function Customer (fN, lN){                //constructor
    this.fn=fN;  //public
    this.ln =lN;

    var someField = "some value";   //private??
    this.sendProduct() = function(){             //operation 
        alert("Product sent!");
    }
}

var merve = new Customer("Merve", "Erdemli");

merve.sendProduct();
alert(merve.someField+ " " +merve.firstName);

