// 조건문(if)
const a = 10;
const b = 20;
const c = 20;
  //실행부가 한 줄이면 {} 생략 가능
  if (a>b) {
    console.log('a가 더 작아요!');
  } else if (b !== c) {
    console.log('b랑 c가 같다.') 
}  else {
    console.log('언제 출력');
}
 //switch문
 const number = 10;

 switch(number){
  case 1:
  console.log(number);
  break;
  case 10:
    console.log(number);
    break;
    default:
      console.log('아무 것도 해당되지 않아요!!!')
 }

 if(number % 2 == 0) {
  console.log('짝수!');
 }else{
  console.log('홀수!');
 }

 switch(number%2) {
  case 0 : 
  console.log('짝수!');
  break;
  case 1 : 
  console.log('홀수!');
 }
 //반복문(for)
 for(let i=0; i<5; i++) {
  console.log(i);
 }

 let i=10;
 for(;i<15;i++) {//초기값을 생략하고 ; 만 사용
console.log(i);}
let k=10;
for(;k<15;) {//증감식을 생략하고 ; 만 사용
console.log(k++);}

//breadk 문
for(let i=0; j<15; j++){
  if (j===7){
    break; // 반복문을 빠져나감
  }
  console.log(j);
}
//continue 문
for(let j=0; j<15; j++) {
  if(j===7){
    continue;//for문의 증감식으로 돌아가 반복문을 계속 수행함
  }
  console.log(j);
}