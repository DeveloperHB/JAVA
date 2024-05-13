const arr = [1, 2, 3, 4, 5];//일반적인 배열 선언

const one = arr[0]; // 배열값 할당
const two = arr[1];
const three = arr[2];

const [one1, two1, three1] = arr;
//각가의 변수에 arr 배열의 구조가 분해되어 각각 할당됨
//==> 배열의 구조 분해 할당

console.log(one1, two1, three1);

const obj = {
    x: 100,
    y: 200,
};

const {x, y} = obj; //객체의 구조 분해 할당

console.log(x, y);

const{x: hello, y:world} = obj;
//x 변수의 이름은 hello 로 사용하고 
//y 변수의 이름은 world 로 사용함
console.log(hello, world);

//객체의 중첩 구조 표현
const obj1 = {
    one: {
        two:{
            three:'Dingo',
        },
    },
};

const Dingo = obj1.one.two.three;
console.log(Dingo);

const {
    one:{
        two:{three:hello1},
    },
} =obj1;

console.log(hello1)

const obj3= {
    one: {
        two: {
            three3: 'Dingo',
        },
    },
};
const {one:{two:{three3}}} = obj3;
console.log(three3);

const obj2 = {
    x:10,
    y:20,
};

function sum(obj2){
    return obj2.x + obj2.y;
    //객체를 받아서 객체의 구조 분해한 값을 연산해서 리턴한다
}

console.log(sum(obj2));

function sum() {//객체의 키값을 {}안에 변수로 지정하여 사용
    return x + y;
}

console.log(sum(obj2));

function sum({x:hello, y:world}) {//다른 이름을 붙여서 사용
    return hello + world;
}

console.log(sum(obj2));

let a = 123;
let b = 456;
[a,b] = [b, a]; //두 변수의 값을 변경 가능함
console.log(a); //456
console.log(b); //123

const [a1, b1] = [10];
console.log(a1, b1);

const [a2=50, b2=20] = [10];
console.log(a2,b2);

const arr1 = (1,2,3,4,5);
const [oone, , othree, ,ofive] = arr1;
// 배열에서 구조분해 할당할 변수 이름만 지정해 주고, 
// 할당하지 않는 부분은 ,comma 만 사용

console.log(oone, othree, ofive);

const[oOne, oTwo, ...others] = arr1;
// oOne, oTwo는 배열 요소 하나씩 할당받고, ...others는
// 나머지 배열값을 모두 할당
console.log(oOne, oTwo, others);


