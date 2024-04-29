let hi; //변수 선언
hi = '안녕'; //let으로 선언한 변수는 값 변경이 가능

let name = '홍길순'; //변수 선언과 초기화

const hello = '안녕하세요!!!';
// const : 상수 선언
// const 선언은 반드시 초기값을 같이 부여함
// const는 상수이므로 값 변경 불가



console.log(hi);
console.log(name);
console.log(hello);

//변수나 상수 이름 작성 규칙
//1. 첫 번째 글자는 영어,$,_ 만 가능
//2. 두 번째 글자는 숫자도 가능
//3. 영어 소문자와 대문자는 구별됨 (abc !=ABC)
//4. let, const 자바 스크립트 예약어는 사용불가
//5. 이름에 공백은 허용 안됨(CarmelCase 방식, SnakeCase 방식 사용
//who_am_I(SnakeCase방식)