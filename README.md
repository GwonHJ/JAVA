## [노션에 자바에 관한 내용을 정리](https://www.notion.so/SSAFY-1-2-13f47e7e4ca34fa4a69cb112d6661825)

아래의 내용은 노션을 복붙한 내용이기 때문에 깃허브에서 바로 보기 불편할 수 도 있습니다.

## 자바의 4가지 특성

- 은닉(Encapsulation)
- 상속(Inheritance)
- 다형성(Polymorphism)
- 추상화(Abstraction)

-----------------------------------------------------------------------------------------------
## 목차

1. [지역변수, 멤버변수](#1.-지역변수,-멤버변수)
2. [연산자](#2.-연산자)
3. switch ~ case문
4. 상속
5. this, super
6. 접근제어자
7. 다형성
8. 생성자
9. 추상화
10. 인터페이스
11. 추상클래스
12. Inner클래스
13. Collection
14. 정렬
15. 예외처리
16. IO
17. 객체직렬화(Serializable)

-----------------------------------------------------------------------------------------------
### 1. 지역변수, 멤버변수
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


### 15. 정렬

- **Comparator**
    - Sort할때 뒤에 Comparator를 상속받은 인스턴스를 삽입
    - Comparator의 compare메소드를 오버라이딩 해서 사용
    - Sort할때, Anonimous Class를 이용하면 편함

    ```java
    Collections.sort(list, new Comparator<Virus>(){

    	@Override
    	public int compare(Virus o1, Virus o2){
    		return o1.getLevel() - o2. getLevel();
    	}
    });
    ```

- **Comparable**
    - 정렬될 객체의 Class가 Comparable Interface를 가지고 있을때 사
    - Comparable을 구현한 클래스는 compareTo메서드를 재정의 하여 sort기준을 정할수 있음

    ```java
    @Override
    public int compareTo(Corona c){
    	return this.spreadSpeed - c.spreadSpeed;
    }
    ```
### 16. 예외

- 오류 Vs 예외
    - 오류(Error) : 내가 통제 못함
    - 예외(Exception) : 내가 통제 가능
- RuntimeException (UnChecked)
    - 컴파일러가 잡아내지 못함 실행시 오류발생
    - 이건 throws안해도 컴파일 됨 JVM에서 실행할때 멈춰줌
    - try catch말고 조건문으로 처리
    - 종류
        - NullPointerException
        - IllegalArgumentException
        - IndexOutOfBoundException
        - SystemException
- OtherException (Checked)
    - try catch문으로 처리
    - 컴파일러가 확인가능
    - 종류
        - IOException
        - SqlException
- try블럭은 전체 속도를 무지 느리게 만든다(꼭 필요한 부분만 사용, 영역을 작게 지정)
- **throws**
    - 자신에게서 발생한 예외를 바로 처리하지않고 자신을 호출한 곳으로 넘김
    - throws는 아무것도 안하다가 어? 예외 생겻네? 하면 던져주고
    try는 한줄한줄 빡빡하게 검사하면서 예외처리(그래서 느림)
- **throw**
    - 스스로 예외를 발생시킴
    - new UserException();//이런식으로 직접 만든 예외를 던질때 많이 사용
- **유저가 정의 예외처리**
    - 클래스를 생성한뒤 Exception을 상속 받아서 만듦
    - 보통 message를 매개변수로 갖는 생성자를 재정의 해줌
- **finally**
    - try ~ catch ~ finally이런식으로 사용
    - 예외가 생기든 안생기든 무조건 finally문은 실행 시켜줌( try가 끝난후, catch가 실행된후에 마지막에 실행됨)
- **AutoCloseable**
    - 파일입출력처럼 닫아줘야 되는애는 예외처리가 까다로움 그래서 autocloseable을 지원함
    - autocloseable에 넣을수 있는 객체는 autocloseable인터페이스를 구현한 객체여야한다

- 기타사항
    - 만약 catch문에서 적어준 예외말고 다른예외가 발생하면 try에서 멈추고 빠져나간뒤
      catch문 실행안됨
    - try문은 조건문처럼 실행 될수도 실행 안될수도 있는 공간이다
      만약 초기화 되지않은 지역변수를 try안에서만 초기화했다면 이를 사용할때 오류가 날 수 있다
    - Exception call 순서
        - instanceof와 마찬가지로 try catch 도 Exception이 상속관계이면 구체적인 Exception부터한다.
    - **Exception method overriding** : 클래스가 상속 관계가 있을때 자식의 예외는 부모가 처리한 예외보다 좁은 범위여야한다(자식 예외) 
    (상속의 접근 지정자는 부모가 지정한 접근지정자보다 자식이 넓어야한다)
    - 현업에서 Exception을 최상위로 표시하면 안댐 쫒겨남
      부하를 많이 검
    - catch에서 예외를 등록할때 |를 이용해 여러개 등록할 수 있음
      ex) catch(FileNotFoundException | NullPointerException e){}

### 17. IO

- 자바의 I/O는 Stream을 통해서 데이터를 주고 받는 구조
1. Node Stream
    - Node: 데이터의 소스 or 목적지
    - IO스트림은 전송되는 데이터 타입, 노드타입, 방향에따라 다양한 클래스가 제공됨
        - 데이터타입: byte(~~~Stream), char(~~~Reader,Writer)
        - 노드타입: 키보드,모니터, 파일, 네트워크
        - 방향: input, output, Reader, Writer
    - : (키보드, 모니터)==표준IO, 파일IO, 네트워크IO 터미널, Node
2. 보조 Stream(Filter Stream)
    - 노드 스트림과 달리 노드에 직접 연결되지 않고 다른 스트림과 연력하여 사용
    - Node Stream만으로 부족한 기능들을 Filter Stream을 통해 확장, 변환시켜줌
    - 필터 생성자는 반드시, 생성자에 다른 필터, 또는 노드를 가르켜야한다.
    - 버퍼드는 바이트 타입 넣어주면 안됨. 그래서 reader를 통해 넣어줌
    BufferedReader br= new BufferedReader(new 필터(new 노드));
    BufferedReader br= new BufferedReader(new InputStreamReader(new FileInputStream( new File("text.txt"))));
    - PrintWriter
    얘는 바이트 단위 받을수 잇게 오버로딩 되어있음
    close도 그냥 적어만 주면됨

    [보조 스트림](https://www.notion.so/cf9e9ac49c914090a307a55c7c5b73cd)

- **FILE I/O**
    - FileIO에서 read는 int형(4바이트)만큼씩 읽어옴
    파일의 데이터는 char형(1바이트)로 구성이 되어잇음
    그래서 1을 읽어온다할경우
    00000000 00000000 00000000 00000001으로 읽어옴
    앞부분의 3바이트는 0으로 채움
    만약 파일의 끝(마지막)에 도달하면 -1리턴
    이때 -1은 11111111 11111111 11111111 11111111임
    파일에서 char형 -1은 00000000 00000000 00000000 11111111임
    - IO를 try처리 해주게되면 IOException이나 close처리해주거나 null인경우 처리가 번거러움
    이때 AutoClosable을 사용하면 편함
    try(여기에 선언해주면 알아서 close해줌){

        }

        - 노드 스트림만 이용한 경우

        ```java
        		//Node
        		File source = new File("IOTest1.java"); // . 현재경로 , .. 상위경로
        		String desName = "IOTest3.java";

        		//		FileInput, FileOutput(NodeStream)
        		//		현재 프로젝트 폴더에 있는 IOTest1.java 파일을 C:\IOTest1.java파일로 복사
        		FileInputStream fis = null;
        		FileOutputStream fos = null;
        		try {
        			fis = new FileInputStream(source);
        			fos = new FileOutputStream(desName);
        //			파일 마지막까지 읽을때까지 읽어서 모든 바이트를 출력 파일에 쓰기
        			int data = 0;
        			while( (data = fis.read()) != -1) {
        				fos.write(data);
        			}
        			fos.flush();  // 습관적 실행
        //			close구문을 실행하면 자신이 내부 flush메소드를 호출하고 닫기한다.
        			System.out.println("파일 복사 성공");
        		}catch(FileNotFoundException e) {
        			System.out.println("파일 오류 e:" + e);
        		}catch(IOException e){
        			System.out.println("입출력 오류 : " + e);
        		}finally {
        			try {
        				if(fos != null) {
        					fos.close();
        				}
        			}catch(IOException e) {
        			}
        			try {
        				if(fis != null) {
        					fis.close();
        				}
        			}catch(IOException e) {
        			}
        		}
        ```

        - 보조 스트림을 이용한 경우

        ```java
        		File source = new File("IOTest1.java"); // . 현재경로 , .. 상위경로
        		String desName = "IOTest5.java";
        		
        		BufferedReader br = null;
        		PrintWriter pw = null;
        		try {
        			br = new BufferedReader
        					(new InputStreamReader
        							(new FileInputStream(source)));
        			pw = new PrintWriter(new FileOutputStream(desName));
        			String data = null; //마지막 정보를 읽으면 null을 반환
        			while( (data = br.readLine()) != null) {
        				pw.println(data);
        			}
        			pw.flush();  // 습관적 실행
        			System.out.println("파일 복사 성공");
        		}catch(FileNotFoundException e) {
        			System.out.println("파일 오류 e:" + e);
        		}catch(IOException e){
        			System.out.println("입출력 오류 : " + e);
        		}finally {
        			pw.close();//pw는 안해줘도됨
        			try {
        				if(br != null) {
        					br.close();
        				}
        			}catch(IOException e) {
        			}
        		}
        ```

        - AutoClosable사용

        ```java
        try ( BufferedReader br = new BufferedReader
        				(new InputStreamReader
        						(new FileInputStream(source)));
        				PrintWriter pw  = new PrintWriter(new FileOutputStream(desName)); 	
        			) {
        			String data = null; //마지막 정보를 읽으면 null을 반환
        			while( (data = br.readLine()) != null) {
        				pw.println(data);
        			}
        			pw.flush();  // 습관적 실행
        			System.out.println("파일 복사 성공");
        		}catch(FileNotFoundException  | NullPointerException e) {
        			System.out.println("같은 처리" + e);
        		}catch(IOException e){
        			System.out.println("같은 처리 " + e);
        		}
        ```

- RandomAccessFile: 인풋 아웃풋 둘다가능

*참고:[https://blog.naver.com/force44/130096540429](https://blog.naver.com/force44/130096540429)*

### 18. 객체 직렬화(SerialLizable)

---

- 객체 직렬화란?
말그대로 객체를 직렬화하여 전송 가능한 형태로 만드는 것을 의미한다. 객체들의 데이터를 연속적인 데이터로 변형하여 Stream을 통해 데이터를 읽도록 해준다.
- 데이터들은 전부 오프젝트화 시켜서 바이트배열로 만들어 저장함
저장한 데이터를 불러올때 serialVersion으로 객체 구분함
불러온 데이터는 Object형으로 불러와지니까 형변환해서 저장해야함
    - 객체를 파일에 저장-> Stream은 모든 정보를 byte[] 배열로 전송
    -> 객체 입출력에 사용되는 입출력 객체가 바로 ObjectInput(Output)Stream
- 직렬화를 하면 serialVersionUID로 객체가 같은 객체인지 구분함
그래서 꼭 명시적으로 UID를 지정해줘야됨
안그러면 객체의 메소드나 필드가 바뀌면 같은 객체인지 못알아봄 데이터 깨짐
- 직렬화를 할려면 Serializable 인터페이스를 구현해준 클래스여야만 함
- transient키워드를 앞에 붙이면 해당 필드는 객체 직렬화에서 제외됨 (default값 들어감)

```java
class Person implements Serializable{

	private static final long serialVersionUID = -3539476484067494349L;
// 반드시 serivUID 값 랜덤생성
	
	String name;
}

public class SerialTest {

	public SerialTest() throws Exception {
		Person person = new Person();
		person.name = "김길동";

//    데이터 저장
//		ObjectOutputStream oos = null;
//		
//		oos = new ObjectOutputStream(new FileOutputStream("sam.dat"));
//		oos.writeObject(person);
		
//  데이터 불러오기
		ObjectInputStream ois =
				new ObjectInputStream(new FileInputStream("sam.dat"));
		
		Person newPerson = (Person)ois.readObject();
		System.out.println(newPerson);
	}

	public static void main(String[] args) throws Exception{
		new SerialTest();
	}
}
```
