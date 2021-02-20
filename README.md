## 자바의 4가지 특성

- 은닉(Encapsulation)
- 상속(Inheritance)
- 다형성(Polymorphism)
- 추상화(Abstraction)

[1. 지역변수, 멤버변수 영역과 초기화](https://www.notion.so/0f1b5cb7da444e6ea7dd8161562a0d0b)

### 2. 연산자

- 삼항연산자
    - ? :

    사용 : 조건문 ? 참 : 거짓

    ex) x > 5 ? "x는 5초과" : "x는 5이하"

- 비교연산자
    - ==
    - ! =
- 증감연산자
    - ++x : x값을 증가 후, 연산에 사용
    - x++ : 연산에 사용 후, x값을 증가

        ex) x = 4;

        (++x) + 5 = 10, x = 5;

        (x++) + 5 = 9, x = 5;

- instanceof 연산자

    : 현재 Reference 되고 있는 객체가 상속 관계에서 어떤 객체인지 확인하기 위해서 사용

    - instanceof연산자는 참조될 수 있는 Type인지 확인하고 그 결과를 boolean으로 return 한다.
    - if/else문에서 instanceof를 사용하려면 하위Class먼저 검사해야함!!

        ex) IOA ← IOB ← IOC의 상속관계를 가질때,

        if( ioc instanceof IOC)

        else if( ioc instanceof IOB)

        else if(ioc instanceof IOA)

        순으로 해야함.

### 3. switch~ case (break, 자료형)

```java
switch(A) {
	case a :
		break;
	case b :
		break;
	default:
}
```

- A의 타입

    가능 : int, short, byte, char, String, 객체(ex : Integer, Byte) 

    불가능 : double

- a, b는 타입이 같아야함!!
- break문이 없으면 선택된 case절 안의 문장을 실행한 다음, 계속해서 다음 case절의 문장들을 실행하게 된다.

### 4. 상속(Inheritance)

: 어떤 Class B가  다른 Class A의 멤버변수와 method를 그대로 받으면 B가 A를 상속 받는다고 한다. A와 B의 관계를 부모 - 자식 또는 상위 - 하위 관계로 표현함.

- extends keyword를 사용
- 자바는 다중 상속을 지원하지 않음. (하나의 부모는 여러 자식을 가질 수 있으나 자식은 여러 부모를 가질 수 없음)

    (대신 Interface를 이용하여 다중상속의 기능 구현은 가능함.)

- 어떤 클래스가 아무런 상속을 받지 않을 경우, 자동으로 java.lang.Object 클래스가 부모가 됨. → 자바에서는 Object의 클래스를 제외하면 모두 부모 클래스가 존재함.
- 상속관계에선 자식의 접근제한자 범위가 부모의 접근제한자보다 넓거나 같아야함.
- 부모와 자식간의 관계

부모클래스 a= new 자식클래스(); //가능
자식클래스 b= new 부모클래스();//오류뜸 (오류 없애려면 명시적 형변환(캐스팅)필요

```java
class AA{void a(int i) { 
	System.out.println("AA:a(int i)"); }
}
class BB extends AA{
	void b() { System.out.println("BB:b()"); }
}
class CC extends BB{
	void a() { System.out.println("CC:a()"); }
	void b(int i) { System.out.println("CC:b(int i)"); }
}
class DD extends CC{
	void a(int i) { System.out.println("DD:a(int i)"); }
	void b() { System.out.println("DD:b()");}
}
class EE extends DD{
	void a() { System.out.println("EE:a()"); }
	void b() { System.out.println("EE:b()"); }
}
public class OverridingABCDE {
	public static void main(String[] args) {
		//AA x = new CC(); x.a();//오류
		//CC x = new EE(); x.b(3);//CC:b(int i)
		//DD x = new BB(); x.b();//오류
		//BB x = new DD(); x.a(3);//DD:a(int i)
	}
}
```

### 5. this, super

this → 자기 자신

super → 부모 객체

cf) 만약, 자식 객체에 부모 객체와 같은 멤버 변수가 없다면 this를 이용하여 super에 접근이 가능. 하지만 추천x

[6. Access Modifier](https://www.notion.so/16f30a3aa5ab42ac924f89a27b24dab4)

- private, default 생성자는 하위 클래스가 상속받아도 Access 불가

    cf ) default 생성자의 경우, 동일 packaged에서는 상속이 가능하기 때문에 같은 packaged내에서 상속 받으면 접근이 가능함. → 이는 상속을 받아서 가능한 것이 아니라 같은 packaged라서 접근이 가능한거임. (오해x)

- 하위 Class에서 접근하려면, protected이상으로 선언하거나 상위 Class의 public method를 통해서 접근 가능

### 7. 다형성

### methods

- 오버라이딩(Overriding)

     : 상속관계에서 부모 class의 method를 자식 클래스에서 재정의

    - 오버라이딩 규칙

        1) 메소드 이름이 같다(변수 아님)

        2) 서로 다른 클래스에 있는 메소드 (서로 다른 클레스는 반드시 상속 관계여야한다.)

        3) 매개변수의 개수와 타입이 같아야함 (반환되는 타입이 같다)

        4) 접근 제한자는 부모보다 같거나 넓어야함. 

    - 재정의(Overriding) method를 불러올때, 자식 클래스에서 재정의된 method를 불러옴.
- 오버로딩(Overloading)

     : 이름이 같아도, parameter가 다르면 별개의 method로 간주함. (생성자도 동일)

    - 오버로딩 규칙

        1) 메소드의 이름이 같다

        2) within a class(같은 클래스) 여야한다.

        3) 반드시 매개변수의 타입 or 개수가 달라야함

        4) 반환타입은 관계가 없다.

        5) 접근제한자는 상관없다.

### Type

- 부모 Type으로 자식 Type의 객체를 Reference할 수 있습니다. 즉, 한 개의 Type으로 여러 하위 Type의 객체를 할당 받을 수 있습니다.

    ex) 부모클래스 a= new 자식클래스(); //가능

### 9. 생성자

- 자식 Class의 기본 생성자는 부모 Class의 생성자를 별도로 호출하지 않으면, 부모 Class의 기본 생성자를 자동으로 호출. (이때 부모 Class의 생성자가 없으면 오류 발생)
- super()로 부모 Class의 생성자를 호출할때 항상 첫번째 줄에 적어야함!!

### 10. 추상화

: 자바는 단일 상속(extends)만 가능하기 때문에, 한 Class가 여러 개의 Interface를 구현(implements) 할 수 있도록 하였음.

cf) 상속은 본질적으로 재사용인데 반해, 인터페이스는 본질적으로 규약, 약속이다.

### 11. 인터페이스

- 모든 메소드가 추상메소드인 클래스
- implements를 통해 Class는 인터페이스(interface)에 있는 추상 methods 선언을 반드시 구현해야 한다.(default 제외)
- interface안의 method는 access modifier를 생략하면 public이 됨. (default 아님)
- interface의 필드에는 public static final이 생략되어있음.
- interface를 상속해서 Overriding한 메소드는 반드시 public
- implements keyword사용
- 자바 8부터 인터페이스에서 default를 메소드에 붙이면 인터페이스에서 메소드 구현가능

### 12. 추상클래스

- 추상Class는 Class나 추상 method를 가져, 스스로 객체를 만들지 못한다.
- 추상Class를 상속받은 Class는 Interface를 구현하는 Class처럼 추상 method의 구현 의무를 가짐.
- 단일 상속 기준에 의해 추상 Class를 상속하면, 다른 Class를 상속 할 수 없음.
- 추상 메소드는 private으로 지정 불가능
- abstract메소드, abstract멤보변수 뿐 아니라 일반 변수, 일반 메소드를 가질 수있음.

### 13. Inner Class

: Class안에서 다시 정의되는 Class

- anonymous

[14.Collection 대표 인터페이스](https://www.notion.so/df77d9f68cfa48598b43ba9a033f9e4a)

- Collection에서 자주 사용하는 method
    - boolean add(E e)
    - boolean remove(Object o)
    - boolean isEmpty()
    - void clear()
    - int size()
    - boolean contains(Object o)
    - Object[] toArray() : ArrayList로 바꾼다
    - Iterator<E> iterator() : 순회하는 형태의 자료구조 제공
- Iterator<E>
    - Iterator에서 자주쓰는 method
        - hasNext() : 다음꺼있나? (반환 boolean)
        - next() : 다음꺼 가져오자 (반환 E)

        ```java
         while(itr.hasNext()){
        	temp = itr.next();
        }
        ```
