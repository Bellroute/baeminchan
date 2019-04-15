# 배민찬 서비스
## 진행 방법
* 배민찬 서비스에 대한 html template은 src/main/resources 디렉토리의 static에서 확인할 수 있다. html template을 통해 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://github.com/code-squad/codesquad-docs/blob/master/codereview/README.md)
* [동영상으로 살펴보는 코드스쿼드의 온라인 코드 리뷰 과정](https://youtu.be/a5c9ku-_fok)

# 학습내용

## spring security 인증범위 설정
- https://gs.saro.me/dev?page=20&tn=480

## 동기화
- synchronized 의 동작방식, 동기화 블럭, 예제 
    - https://tourspace.tistory.com/54
    
## validation
- 커스텀 password validation annotation 만들기
    - https://memorynotfound.com/custom-password-constraint-validator-annotation/ 
    
- 자바의 커스텀 어노테이션 생성을 위한 메타 어노테이션 설명
    - https://jdm.kr/blog/216
    
## enum 
- entity필드 값으로 사용하기
    - http://woowabros.github.io/tools/2017/07/10/java-enum-uses.html 
    
- enumerated
    - http://tomee.apache.org/examples-trunk/jpa-enumerated/
   
## HttpMessageConverter
- 설명과 컨버터의 종류
    - https://yoojh9.github.io/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-HttpMessageConverter/
    - https://devbox.tistory.com/entry/Spring-RequestBody-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98%EA%B3%BC-ReponseBody-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98%EC%9D%98-%EC%82%AC%EC%9A%A9 
    
- @ResponseBody, @RequestBody
    - https://jongmin92.github.io/2018/03/02/Spring/spring-requestbody-responsebody/
    - https://lee-mandu.tistory.com/242

## Jackson 라이브러리
- Jackson에 대한 이해
    - https://mommoo.tistory.com/83
- Jackson으로 컨버팅해서 만드는 DTO에 no args constructor이 필요한 이유에 대한 설명 

    - https://manosnikolaidis.wordpress.com/2015/08/25/jackson-without-annotations/
    - ~~이 글은 나도 다시보고 이해해야겠다.~~

    
## RestTemplate
- TestRestTemplate을 이용한 Rest서비 통합테스트 구현
    - http://blog.saltfactory.net/using-resttemplate-in-spring/ 
    
- RestTemplate의 HttpEntity<T> 객체 이해
    - https://docs.spring.io/spring-framework/docs/5.1.6.RELEASE/javadoc-api/org/springframework/http/HttpEntity.html

## Spring 기본
- 서블릿 컨테이너의 개념 및 웹 동작의 구조
    - https://minwan1.github.io/2017/10/08/2017-10-08-Spring-Container,Servlet-Container/

## SLF4J
- SLF4J를 사용해야 하는 이유
    - https://inyl.github.io/programming/2017/05/05/slf4j.html
- 로깅 전략


# Javascript 

## JS문법
- 객체 초기자 {} 사용법
    - https://developer.mozilla.org/ko/docs/Web/JavaScript/Reference/Operators/Object_initializer
 
## ajax
- http Head content-type의 의미
    - https://github.com/HomoEfficio/dev-tips/blob/master/Request%20Body%EB%A1%9C%20%EB%B3%B4%EB%82%B4%EC%A7%80%EB%8A%94%20JSON%EC%9D%98%20%ED%96%89%EB%B0%A9%20%EB%B6%88%EB%AA%85.md 
    
- JSON.stringify
    - https://babolsk.tistory.com/1067 
    
- ajax 크게 설명
    - https://poiemaweb.com/js-ajax 
    
- ajax fetch 설명
    - https://gs.saro.me/dev?tn=564
    