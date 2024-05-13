const arr = [1,2,3,4,5];
arr.push(6); // push는 배열요소를 한개 추가
arr.push(7,8,9); //배열 요소를 여러 개 추가
console.log(arr);

arr.pop(); //배열 요소에서 맨 뒤의 요소 하나 삭제함
arr.pop();
console.log(arr);

arr.unshift(10,20,30); //배열 앞부분에 추가
console.log(arr);

arr.shift(); //배열 요소에서 앞쪽 부분의 요소 하나 삭제
arr.shift();
console.log(arr);

const arr1 = [1,2,3,4,5]

//1.함수 사용
function print(number, index){
    console.log(`${index} 위치의 요소 : ${number}`);
}

arr1.forEach(print); //forEach(함수명)

//2.일반 함수를 화살표 함수로 변경
const print1 = (number, index) =>{
    console.log(`${index} 위치의 요소 : ${number}`);
}
arr1.forEach(print1); //forEach(함수명)

//3.화살표 함수의 실행부분을 forEach의 인자로 넣어주도 됨
arr1.forEach((number, index) => {
    console.log(`${index} 위치의 요소 : ${number}`);
});

const arr2 = [1,2,3,4,5];
arr2.forEach((number, index) => {
    console.log(`${index} 위치의 요소 : ${number}`);
});


// forEach는 값을 변경하지 않고, 반환값도 없으므로 새로운 배열을 얻을 수 없음
//console.log(newArr); //undefined

const newArr1 = arr2.map((number, index)=> number+1);
//map 메소드는 값이 변경된 새로운 배열을 반환함
console.log(newArr1);

const arr3 = ['hello, world'];
console.log(arr3.includes('hello'));
//includes 메소드는 지정한 값이 배열에 있으면 true 반환
console.log(arr3.includes('zo'));

const arr4 = [1,2,3,4,5];
//console.log(arr4.find((number)=>number5));
//number는 배열에 있는 값, 배열에 있는 값이 3보다 크면 만족하는 첫번째 값 리턴
//조건에 만족하지 않으면 Undefined

console.log(arr4.findIndex((number)=> number>3));
//findIndex는 조건에 만족하는 첫번째 값의 인덱스를 리턴
//조건에 만족하지 않으면 -1

arr4.fill(10); //원본 배열의 값을 지정한 값 10으로 변경
console.log(arr4);

const arr5=[1,2,3,4,5];
arr5.fill(10,3); //fill의 인덱스를 3으로 지정함
console.log(arr5);

const arr6 = [1,2,3,4,5];
arr6.fill(10,1,3);
console.log(arr6);
//fill의 시작 인덱스를 1로 지정하고, 종료 인덱스는 (3-1)위치까지 10으로 채워줌

const arr7 = [1,2,3,4,5];
console.log(arr7.slice(2));//2번 인덱스부터 끝까지 잘라서 새로운 배열로 반환
console.log(arr7.slice(2,4))//2번 인덱스부터 (4-1)번 인덱스까지 잘라서 새로운 배열로 반환

arr.splice(2);//2번 인덱스부터 배열의 끝까지 제거함
console.log(arr7);//[1,2]

const arr8 = [1,2,3,4,5];
arr8.splice(2,1);//splice(시작인덱스, 제거할 요소 개수)
console.log(arr8);

const arr9 = [1,2,3,4,5]
arr9.splice(2,1,999);//splice(시작인덱스, 제거할 요소 개수, 채워 넣을 요소의 값)
console.log(arr9)

const arr10 = ['hello','world','hi','wow'];
console.log(arr10.join());// ,를 포함한 새로운 문자열을 반환함
console.log(arr10.join(';'));//';'를 지정해 주면 배열값에 ; 이 적용된 새로운 문자열 반환

const arr11 = ['hello', 'world','hi','wow'];
const numbers = [123, 456];
console.log(arr11.concat(numbers));
//concat:기존 배열에 인자로 주어진 배열을 합쳐서 새로운 배열로 반환
console.log(arr11.concat('zzz','bbbb','cccc'));

const arr12 = [1,2,3,4,5];
console.log(arr12.filter((number)=>number> 3))
// 3보다 큰 4와 5로 구성된 새로운 배열을 반환
// fileter: 조건에 만족하는 값만 걸러서 반환받음

const arr13 = [1,2,3,4,5];
const reducer =(acc, value) => acc+value;
//acc는 누산기, value는 현재 요소의 값

console.log(arr13.reduce(reducer))
console.log(arr13.reduce(reducer,100));//acc의 초기값을 100으로 지정

