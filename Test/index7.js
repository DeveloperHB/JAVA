const obj = {//객체 생성{키1: 값1, 키2: 값2,};
 x: 1,
 y: 2,
 z: 3,
};

for(key in obj) {// for in은 객체에서 사용(반복이 가능한 객체)
 console.log(key) //객체에 포함된 key값을 콘솔에 출력
};

const name = '하딩거';
const country = 'KR';

const user1 = {
 name: name,
 country: country,
};

console.log(user1);

const user = { // 객체 축약 표현
    //중복된 이름은 키값을 지우고 사용가능함
    name,
   country,
   };

   console.log(user);

   
   const obj1 = {//객체내 메소드 정의
    greeting: function() {
        console.log('Hi');
    },

   };

   obj1.greeting(); //객체에 정의된 메소드에 접근

   const obj2 = { //객체내 메소드 정의 2
    greeting() {//function을 생략하고 메소드를 축약해서 사용
        console.log('Hi');
    },
   };

   obj2.greeting(); //obj2 객체에 정의된 greeting메소드에 접근

   const obj3 = {
    x: 10,
    y: 20,
    z: 30,
   };

   console.log(Array.isArray(obj3));
   //Object, Array 클래스가 가지고 있는 정적 메소드는
   //Object, Array등을 붙여서 사용 가능함 

   console.log(Object.values(obj3));
   //Object.values 는 obj3 객체가 가지고 있는 값들을 배열로 반환

   const obj4 = Object.values(obj3);
   console.log(obj4);
   console.log(Array.isArray(obj4)); //true

   console.log(Object.entries(obj3));
   //Object.entries는 obj3 객체가 가지고 있는 키와 값의 쌍을 
   //하나의 배열로 묶어서 각각 개별적인 요소를 가지는 배열로 반환함