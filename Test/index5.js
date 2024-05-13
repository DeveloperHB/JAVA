const str = 'Hello World';
console.log(str.toUpperCase()); //대문자로 변환
console.log(str.toLowerCase()); //소문자로 변환

const str1 = '        haha';
console.log(str1.trim()); //앞뒤 공백을 제거

const str2 = '        haha       ';
console.log(str2.trimStart()); // 앞 공백만 제거
console.log(str2.trimEnd()); //뒤 공백만 제거

const str3 = 'Hello';
console.log(str3.repeat(3)); //반복 횟수 지정
console.log(str3);

const str4 = 'Hello';
console.log(str4.padStart(10,'*'));
//10자리 중에서 글자를 지정하고 남는 여백은 시작부분
//padding으로 지정하여 지정한 '*' 문자로 채워줌
console.log(str4.padEnd(10,'#')); //지정한 '#'문자를 뒤에 채워줌

const str5 = '안녕하세요. 하딩거입니다!!!';
console.log(str5.indexOf('이딩거'));//키워드가 시작되는 인덱스 번호를 출력
//문자열을 찾지 못했을 경우 -1리턴

console.log(str5.includes('하딩거'));//includes 는 문자열내에 있으면 true반환
console.log(str5.includes('이딩거')); //false

console.log(str5.startsWith('안녕'));//지정한 문자열로 시작하면 true반환
console.log(str5.endsWith('안녕'));//지정한 문자열로 끝나면 true반환

console.log(str5.replace('하딩거', '개발자 머딩거'));
//replace('원본 문자열','교체할 문자열 지정'
    console.log(str5);

    const str6 = '안녕하세요. 하딩거입니다!!! 하딩거 하딩거 하딩거';
    console.log(str6.replace('하딩거','개발자 머딩거'));
    //replace 메소드는 첫번째 일치하는 문자열만 교체함
    console.log(str6.replaceAll('하딩거','개발자 머딩거'));
    //replaceAll 메소드는 일치하는 문자열을 지정한 문자열로 모두 교체함
    
    console.log(str6.substring(0, 5));
    //substring(시작인덱스,n인덱스):시작인덱스부터 n-1인덱스까지의 문자열 반환
    
    const str7 = '월요일, 화요일, 수요일, 목요일, 금요일, 토요일, 일요일';
    console.log(str7.split(',')); //split 구분자를 (',')로 지정
    //구분자를 기준으로 잘라서 배열로 만들어줌

    const str8 = 'Hello World!';
    console.log(str8.slice(3));
    //문자열을 해당 시작위치부터 끝가지 잘라서 새로운 문자열로 반환
    console.log(str8.slice(3,5));
    //문자열을 해당 시작위치 3부터 (5-1)위치까지 잘라서 새로운 문자열로 반환
    console.log(str8.slice(-3));
    //문자열을 끝위치부터 시작해서 3글자만큼 잘라서 새로운 문자열로 반환

