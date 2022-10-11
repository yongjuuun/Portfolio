## Generic

정의 : "일반적인" 뜻
        데이터 형식에 의존하지 않고, 하나의 값이 여러 다른 데이터 타입들을 가질 수 있도록 하는 방법

LinkedList<Double> list3 = new LinkedList<Double>();  
LinkedList<Character> list4 = new LinkedList<Character>();

- 비효율적이고, 불편  
해결방안 : *제너릭*  
- 클래스 내부에서 지정하는 것이 아닌 외부에서 사용자에 의해 지정되는 것을 의미한다.  
- 컴파일 할 때 해당 타입으로 캐스팅하여 매개변수화 된 유형을 삭제하는 것이다.

장점
1. 잘못된 타입이 들어올 수 있는 것을 컴파일 단계에서 방지 가능
2. 클래스 외부에서 타입을 지정해주기 때문에 따로 타입을 체크하고 변환해줄 필요가없다
3. 비슷한 기능을 지원하는 경우 코드의 재사용성이 높아진다


특징
타입 안전성(Type Safe)



// T : Type
// E : Element
// K : Key
// V : Value
// N : Number

주의해야할 점
- 타입 파라미터로 명시할 수 있는 것은 참조 타입 밖에 올 수 없다.
- int, double, char => primitive type (x)
- Integer, Double 같은 Wrapper Type으로 사용할 수 있다.

