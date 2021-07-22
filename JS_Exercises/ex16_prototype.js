//ES ile beraber artık class yapısı da kullanılabilir oldu

class Customer
{         //patern
    constructor(id,customerNumber){
        this.id=id;                       //this : Customer class'ının customer1 instancee'ına karşılık gelir 
        this.customerNumber = customerNumber;   //aslında burada daprototyping yaptık
        
    } 
} 

let customer1 = new Customer(1, "15287");
customer1.name = "Evrim Erdemli" //instance 'a prototyping
console.log(customer1.name);

Customer.x= "X"; //Class'a prototype yapıldı
console.log(Customer.x) 

console.log(customer1.customerNumber)


class IndividualCustomer extends Customer{
    constructor(firstName,id,customerNumber){
    super(id,customerNumber)
    this.firstName =firstName;
    }
}

class CoorparateCustomer extends Customer{
    constructor(companyName,id,customerNumber){
    super(id,customerNumber)
    this.companyName =companyName;
    }
}