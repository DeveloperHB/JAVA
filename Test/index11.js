const title = document.querySelector('h2');

title.innerText = '안녕하세요!!';
title.style.color = 'pink';
//text 와 style color 를 지정해서 변경해줌

const title1 = document.createElement('h1');
const body = document.querySelector('body'); //body 영역 지정

title1.innerText = '새로운 친구예요!!'
title1.style.color = 'green'

body.appendChild(title1); //Chile 영역으로 추가하여 title1속성을 지정해줌