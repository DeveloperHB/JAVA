const button = document.querySelector('button');
const removeButton = document.querySelector('.remove');
                  // 클래스이름이 remove 인 영억을 선택

function handler(event){
    console.log('😍🐱‍🚀😘');
}

function removeHandler(event){
    button.removeEventListener('click', handler);
    // 등록한 handler 를 삭제해줌
    //console.log('이벤트삭제');
}

button.addEventListener('click', handler);
removeButton.addEventListener('click', removeHandler);
// removeButton의 addEventListner 를 사용해서 버튼이 클릭되면
// removerHandler가 실행되게 함