//Function Signature 

function functionName(parameter1, parameter2){

    return parameter1 * parameter2;
}

alert(functionName(2,3));


//Function without "return"

function functionWithoutReturn(param1, param2){
    alert("This is a function without return statement")
}

functionWithoutReturn(2,3,4)

//parameter Defaults
function functionName2(x,y){
    if (y===undefined){y=0; }
}

functionName2(3,4)

//The arguments Object
x=findMax(1, 123, 500, 115, 44, 88); //argument nesnesi bir obje array'idir

alert(x)

function findMax(){
    var i, max = 0;
    for(i=0; i < arguments.length; i++){
        if(arguments[i]>max){
            max = arguments[i];
        }
    }
    return max;

}

