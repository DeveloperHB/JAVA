function greeting(){
    console.log('Hello !!!');
    //export선언하면 모듈로써 외부에 함수를 내보낼 수 있음
    //export default : 기본 내보내기 방식
    //==> import 문에서 함수 이름에 {} 생략 가능


}
export default greeting// 기본 내보내기 방식으로 함수 지정
//export {greeting};//이름이 정의된 내보내기 방식으로 함수 지정