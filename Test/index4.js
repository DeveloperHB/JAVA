//함수
function bok(main) {
    console.log(`${main}볶음밥`);
}

bok('새우');
bok('제육');
bok('김치');

// 인자 = 함수의 입력 값= Argument
// 매개변수 = 함수의 입력 변수 = Parameter

function sum(a, b){
    console.log(a+b);
}

sum(10,20);

function a(){
    const b = 10;
    console.log(b);
}

a(); // 함수 호출 : 10
//console.log(b); // a()함수의 지역 변수이므로 사용불가

//전역 변수
const b = 11;
function a1() {
    console.log(b);
}
a1(); //함수 호출
console.log(b);//전연 변수 b에 접근

function sum1(a,b) {
    console.log(a+b);
}
sum(10); //sum(10, undefined)로 할당

function sum2(a, b=0){
    //default parameter 를 함수 정의 지정
    console.log(a+b);
}
sum2(10); //sum2(10,0)로 할당
sum2(10, 20) //b의 default parameter값은 무시하고 20할당
sum2(10, 20, 30) //더 많은 인자 지정(배열 처럼 저장==>에러X)

function sum3(a, b){
    console.log(arguments[0]);
    console.log(arguments[1]);
    console.log(arguments[2]);
    //arguments 는 인자값을 배열처럼 저장하고 배열처럼 처리해줌
    console.log(a+b);

}
sum3(10,20,30);

function print(a,b, ...rest){
    // ...rest 파라미터는 나머지 인자값을 하나의 배열로 받음
    //
    console.log(a);
    console.log(b);
    console.log(rest);
}

print(10, 20, 30, 40, 50, 60, 70, 80);

function sum4(a,b){
    return a+b; //호출한 곳으로 리턴 
}
console.log(sum4(20,40));

//표현 함수
const sum5 = function (a,b){
    console.log(a+b);
};
sum5(10, 20);

//화살표 함수

const sum6 = (a2,b2)=>console.log(a2+b2);
//(a,b) : 사용할 인자 정의 ==> 화살표 뒤에 실행문 작성
//{}없이 하나의 실행문을 작성하면 자동으로 결과값을 리턴해줌
//실행문을 중괄호{}와 함께 작성하면 결과값을 return 문으로 반환해 주어야 함

console.log(sum6(20,30));

//function hello(){
//console.log('Hello!!!');
//console.log('World!!!');
//}

const hello = () => {
    console.log('Hello!!!');
    console.log('World!!!');
}
hello();

//function s1(c, d){
// return c * d;
//}
const s1 = (c, d)=> c * d; //화살표 함수
console.log(s1(20, 30));

//function greeting(user){
//    console.log('Hello, ${user}!!!')
//}

const greeting = (user) => console.log(`Hello,${user}!!!`)
greeting('홍길동');
greeting('홍길순');