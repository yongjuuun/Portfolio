# 패키지

패키지 : 자바 클래스들을 구분하기 위해 사용

객체지향 프로그래밍에서는 여러 클래스들이 사용
- 내가 직접 만들지 않은 클래스 또는 라이브러리들을 사용
- 클래스 이름이 동일하다면 어플리케이션 장애가 많이 발생


자동차 => 서비스
- 바퀴 라이브러리

e.g.
회원관리 login
login 클래스가 있고
쇼핑몰, 카페 등 => login



# 제어자

제어자 : 클래스, 변수, 메서드의 선언부에 사용 (부가적인 의미 부여)

클래스의 접근 범위와 관련된 접근 제어자와 일반제어자가 있다

- 접근 제어자 : public, protected, default, private
- 일반 제어자 : static, final, abstract,,,

static
- 클래서 혹은 공통적인
- 클래스 변수
- 메서드 선언

특징
- 맴버변수와 메서드, 초기화 블럭은 인스턴스를 생성하지 않고도 사용할 수 있다.
- 모든 인스턴스에 공통적으로 사용되는 클래스 변수
- 클래스가 메모리에 로드될 때 생성


static class pet {
    private static string name;
    private static final string leg = 4;        //상수
    static void bark() {
    }
}


final
- 매서드에 사용할 경우 오버라이딩을 통해 재정의 할 수 없음
- 클래스에 사용할 경우 더이상 상속을 할 수 없는 클래스
