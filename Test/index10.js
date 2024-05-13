const title = document.getElementById('title');
console.log(title);

const title1 = document.getElementsByClassName('title_class');
//동일한 classname으로 반환되는 값들을 배열처럼 출력
console.log(title1);

const title2 = document.getElementsByTagName('h2');
//동일한 태그네임을 가지는 값들이 배열처럼 출력된다
console.log(title2);

const title3 =document.querySelector('h2');
console.log(title3);

const title4 = document.querySelector('#title');
//#에 아이디값인 title을 ''와 함께 인자로 입력
console.log(title4);

const title5 = document.querySelector('.title_class');
//.에 클래스이름인 title_class 를 ' '와 함께 인자로 입력
console.log(title5);

const title6 = document.querySelectorAll('.title_class');
console.log(title6);
//querySelectorAll은 클래스(title_class)를 사용하는 모든 요소를 배열로 가져옴
