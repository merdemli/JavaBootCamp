// var counter = 0;                // bu counter'a diğer fonksiyonlar ve projelerden de ulaşılabilir.
// function add() {                //bunu closure olarrak tanımlamamız gerekir
//     counter +=1;
//     return counter;
// }               

// function someOrtherFunction(){
//     counter +=10;               //bu fonksiyon kullanımı da, counter'ın değerini arttırır.
// }

var add = (function (){
    var counter =0;
    return function()
    {
        return counter +=1;
    }
}) ();