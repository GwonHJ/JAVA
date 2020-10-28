# JAVA(자바프로그래밍)

자바프로그래밍 수업시간에 배운 실습예제와 텀프로젝트를 올렸습니다.

개발환경 : 실습 - 메모장, 텀프로젝트 - Eclipse


## 실습예제

    수업시간에 교수님께서 설명해주신 개념을 이용하여 실습예제 푼 코드
    주된 내용은 파일명을 참고

    
## 텀프로젝트

    프로젝트명 : DietHelper
    팀원 : 권현지 이혜림 임주영 태현지
    프로젝트 주제 : 다이어트를 도와주는 프로그램
    기능
      1. 키, 몸무게, 날짜 데이터 저장 및 삭제
      2. 음식별 칼로리 사전 + 계산기능
      3. 운동별 칼로리 사전 + 계산기능
      4. 추천 운동법
      
### **실행화면 예시**

#### 메인화면

![diet메인화면](https://user-images.githubusercontent.com/45057466/97435772-416cb780-1964-11eb-9107-5890f643d45b.png)


#### 몸무게 관리

![diet몸무게관리](https://user-images.githubusercontent.com/45057466/97435777-43367b00-1964-11eb-8ad1-fa11b9dea991.png)


### 주제 선정 이유
    
    자바 프로그래밍을 이용하여 한학기 동안 배운 내용을 잘 활용하면서 팀원들의 적극적인 참여를 불러일으킬 만한 주제에 관해서 고민을 하던 중, 팀원들 모두의 관심사이면서 파일처리를 이용 그리고 수업을 통해서 배우진 않았지만 GUI를 다뤄보고싶다는 생각에 데이터를 이용하여 체계적이고 효과적인 다이어트를 도와주는 프로그램을 개발하게 되었습니다.


### 내용

1. 메인화면
 
    - 메인화면에서 몸무게 관리, 음식 칼로리 사전, 운동 칼로리 사전, 추천 운동법의 페이지를 버튼을 통해서 이동할 수 있습니다. 
 
    - 로그인 버튼을 통해서 사용자의 정보를 불러올수있습니다.
 
     - 버전버튼을 누르면 개발 버전, 개발 날짜, 개발자 등의 정보를 확인할 수 있습니다.
 
2. 몸무게 관리
 
      - 키, 몸무게를 입력하고 입력 버튼을 누르면 그동안 입력했던 값과 BMI정보를 보여줍니다
      
      - 취소를 누르면 입력했던 키, 몸무게 값이 지워집니다.

3. 음식 칼로리
   
   - 다양한 음식의 칼로리를 보여줍니다.
   
   - 섭취한 음식을 클릭하면 칼로리 계산기에 섭취한 음식의 칼로리가 입력되어 계산됩니다.
   
4. 운동 칼로리
   
   - 다양한 운동의 칼로리를 보여줍니다.
   
   - 활동한 운동을 클릭하면 칼로리 계산기에 소비된 칼로리가 입력되어 계산됩니다.
   
5. 추천 운동법
   
   - 다양한 운동을 추천합니다.
   
   - 본인이 하고 싶은 운동을 클릭하면 링크를 통해서 해당 운동 설명 영상으로 이동됩니다.
   
   
   
코드에 관한 설명은 코드에 주석으로 적혀있습니다.


      
      






-------------------------------------------------------------------------------------------------


자바 코드 저장형식 .java

JAVA jdk 설치 사이트 : http://www.oracle.com/technetwork/java/javase/downloads/index.html

Eclipse 설치 사이트 : https://www.eclipse.org/downloads/

<메모장을 이용하여 코딩할때 주의할 점>
    
        1. 클래스 이름과 파일명이 동일해야함
        
        2. 파일형식은 java 파일로 저장


<cmd창을 이용하여 컴파일할때 주의할 점>

        1. 저장한 파일 경로로 이동하여 컴파일을 해야한다.
            상위 폴더 이동 : cd..
            하위 폴더 이동 : cd 폴더명
            하위 폴더 목록 보기 : dir
            드라이브 간 이동 : C or D:

        2. javac 파일명.java를 하여서 컴파일을 먼저 해야한다. 컴파일이 완료되면 .class파일이 생성됨

        3. 실행할때는 java 파일명을 적어서 실행한다.
        
 <Eclipse 프로젝트 시작하기>
        
        1. File - New - Project 선택 후 Next 클릭
        
        2. Project name에 프로젝트 이름을 적고 Finish 버튼 누르기
        
        3. src폴더에서 오른쪽 마우스 클릭 New - Class 선택
        
        4. Name에 클래스 이름을 적고 Finish 버튼 누르기
        
        5. 코드작성
        
        6. Debug As 또는 Run As 클릭 Eclipse는 컴파일과 실행이 동시에 일어남 
                Debug As는 브레이크 포인트를 걸수있어서 오류찾기에 용이
 
       

 
