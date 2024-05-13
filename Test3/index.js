const form = document.querySelector('form');//form영역을 가져옴
const input = document.querySelector('input');
const ul = document.querySelector('ul');

let todos = []; // 아이템을 저장할 배열 생성

const save = () =>{
  //로컬스토리지의 todos 키값을 가진 값을 todos 배열에 저장함
localStorage.setItem('todos', JSON.stringify(todos));
                                //배열을 JSON문자열로 변환해 줌


};

const delItem = (event)=> {
  const target = event.target.parentElement;
  //지워야할 요소를 target 변수에 저장해 줌
  
  //target.id는 지우려는 li요소 
  todos = todos.filter((todo)=>todo.id !== parseInt(target.id));
  // != : 타입은 무시하고 내용물만 비교함
  //(todo.id!==target.id) 는 지우려는 li 요소를 제외하고
  //나머지만 todos 배열에 다시 저장
  save();
  target.remove(); //target 요소를 문서에서 삭제해 줌
  

};

function addItem (todo){//addItem 함수 생성
  //input.value를 text로 받아 오도록 지정해줌
  //텍스트를 입력 받아서 html의 새로운 요소로 추가해 준 코드부분
  if(todo.text !=='') {
    const li = document.createElement('li');
    const button = document.createElement('button'); //button추가
    const span = document.createElement('span'); //span태그 영역 추가

    span.innerText = todo.text; //span 태그 영역에 text를 넣어줌
    button.innerText = '삭제'; //버튼의 내용을 '삭제'로 넣어줌
    button.addEventListener('click', delItem);//delItem 함수 실행되도록 지정
    
    li.appendChild(span); //span 영역 추가 
    li.appendChild(button); //button 영역 추가
    ul.appendChild(li); 
    li.id = todo.id;//id값을 todo가 가지고 있는 id값으로 지정함
    text = ''; 
  }
};

function handler(event) {
  //핸들러의 이름은 handler 지정하고, submit 폼이 제출될 때 페이지가
  //새로고침되지 않도록 만들어줌
  event.preventDefault();


  const todo = { //로컬스토리지에 저장하기 위한 코드
    id : Date.now(),
    text : input.value, 
  };

  
  todos.push(todo);// todo객체를 todos 배열에 저장함
  addItem(todo);
  save();

  input.value = ''; // 입력창을 초기화하는 작업 추가 
};



function init() {
  const userTodos = JSON.parse(localStorage.getItem('todos'));
  
  //if문을 사용해서userTodos가 존재할 경우에만 동작하도록 함
  if(userTodos){
    userTodos.forEach((todo) => addItem(todo));
    todos = userTodos;
      
    }
  }

init();


form.addEventListener('submit', handler);//handler를 지정해줌


 