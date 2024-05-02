//산술 연산자 +,-,*,/
//**
// % (모듈러) 
console.log(10%5);
console.log(2**3);
//증감 연산자 ++, --
let number= 10;
number++;
console.log(number);
number--;
console.log(number);

// ==(추상 비교), ===(엄격 비교)
const a = 10;
const b = '10';
console.log(a === b);

const a1 = 10;
const b1 = 10;
console.log(a1 != b1);

//논리 연산자 (&&, ||, !)
const a2 = 2 < 3; //true
const b2 = 30 > 50; //false
console.log(a2 && b2); //and
console.log(a2 || b2); //or
console.log(!a2); //not
//삼항 연산자
//조건 ? 참일 때 실행부분 : 거짓일 때 실행부분
console.log(2>3 ? '참' : '거짓');

//Nullish 연산자(??): 값이 확정되어 있는 변수를 찾음
const a3 = undefined;
const b3 = null;
const c3 = '홍길동';
console.log(a3 ?? b3 ?? c3);

//비트 연산자(&, |, ~, ^, <<, >>) 지원

//복합 대입 연산자(+=, -=, *=, /=, %=, **=)
let number1 = 10;
number1 += 2; // number1 = number1 + 2
console.log(number1);

//전개 연산자(...) : 펼쳐서 보여줌
const numbers = [1,2,3];
console.log(numbers);
console.log(...numbers);
const numbers2 = [4,5,6];

const newNumbers =[...numbers,...numbers2];
console.log(newNumbers);