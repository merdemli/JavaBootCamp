function sendMail (personInterface) {

    var to = personInterface.eMail;         //burada metoda interface implemente ettik
    var name = personInterface.name;          //interface yapısı; personInterface alanına Customer monte edilecek

    var send = function(){
        alert("Mail sent to: " + name+ "/" +to);
    }

    send();
}
    
function Customer(name, eMail){
    this.name =name;
    this.eMail=eMail;       //yukarıda var olarak tanımlı fieldları burada tanımlamak zorundayız
//other staff
}

function Employee(name, eMail){
    this.name =name;
    this.eMail=eMail;       

}

var someCustomer = new Customer ("merve", "merveerdemli6@gmail.com");
var someEmployee = new Employee ("evrim", "evrimerdemli@gmail.com")
sendMail(someCustomer);
sendMail(someEmployee);