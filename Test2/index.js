const form = document.querySelector('form');//form영역을 가져옴
const input = document.querySelector('input');
const ul = document.querySelector('ul');

form.addEventListener('submit', (event)=>{
  //form에서 submit이 일어났을 때 ==> 동작할 이벤트 리스너를 등록
  event.preventDefault();
  //form이 제출될 때 새로 고침되는 현상을 막기위해 추가해줌
  if(input.value !=='') {
  //input.value가 공백이 아닐 때만 추가작업 진행
 const li = document.createElement('li');
 //새로운 요소의 이름을 li 로 지정하고, 새로운 요소를 생성해줌
 li.innerText = input.value;
 //새로운 요소의 이름을 li의 innerText 속성을 이용 ==> 입력한 텍스트 value값을 넣어줌
 ul.appendChild(li);
 //입력값인 li요소를 출력하기 위해서는 문서의 ul(부모요소)태그의 자식요소로 붙여줌

 input.value = ''; //빈 초기상태로 바꿔줌
  }
});