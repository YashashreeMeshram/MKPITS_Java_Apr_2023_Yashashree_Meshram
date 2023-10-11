function myFun(a,b,callack){
    console.log("sum="+ (a+b));
    setTimeout(callack,1000);
}
function display() {
    console.log("Welcome to MKPITS");
}