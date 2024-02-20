function ask(question, yes, no){
    let answer= window.prompt(question);
    if (answer) yes()
    else no();
}

function showOk(){
    alert('동의 ✔️');
}
function showCancel() {
    alert('취소 ❌');
}

ask("동의", showOk, showCancel);

// 함수 표현식 = function literal
let sayHi = ()=> {
    console.log("say Hi ~");
};

console.log(sayHi);
sayHi;

function display(param) {
    console.log('param: ' + param.user);
    console.log(param);
}

display({
    url : 'http://127.0.0.1',
    user : 'hong',
    pw : '111'
});
// 객체 리터럴로 보내는 것이 효율적이며 디버깅할 때 좋다.

function myFunction() {
    let a='hello';
    console.log(a);
    if (true) {
        let a='bye';
        console.log(a);
    }
    console.log(a);
}

var obj= new myFunction();