/*
1. Creator.java에는 Java의 창시자인 James Gosling과 관련된 몇 가지 변수를 정의했습니다.
main() 내부에서 System.out.println()을 사용하여 변수 이름을 출력합니다.

2. 동일한 명령을 사용하여 yearCreated를 인쇄합니다.
*/

public class C07_Creator {
    public static void main(String[] args) {
        String name = "James Gosling";
        int yearCreated = 1995;
        System.out.println(name);
        System.out.println(yearCreated);
    }
}

/*
07 Introduction 소개
사용자와 새 작업을 연결하는 프로그램이 필요하다고 가정해 보겠습니다.
사용자의 이름, 급여 및 고용 상태가 필요합니다. 이러한 모든 정보는 우리 프로그램에 저장됩니다.

우리는 메모리의 이름이 지정된 변수에 정보를 저장합니다.
정보에 이름을 지정하면 나중에 해당 이름을 사용하여 저장된 정보에 액세스할 수 있습니다.

변수는 또한 우리가 저장하는 데이터에 컨텍스트와 의미를 부여합니다. 값 42는 사람의 나이, 파운드 단위의 무게 또는 주문 횟수일 수 있습니다.
이름을 통해 값 42가 age, weightInPounds 또는 numOrdersPlaced임을 알 수 있습니다.

Java에서는 저장하는 정보 유형을 지정합니다.
기본 데이터 유형은 Java 시스템에 내장된 데이터 유형입니다.우리가 다룰 세 가지 주요 기본 유형은 int, double 및 boolean입니다.
이 레슨에서는 이러한 기본 제공 유형 등을 소개합니다.

프로그램 내에서 변수를 참조하려면 변수를 선언해야 합니다. 변수를 선언하려면 유형과 이름을 지정해야 합니다.

```
// datatype variableName
int age;
double salaryRequirement;
boolean isEmployed;
```

위의 변수 이름은 age, salaryRequirement, and isEmployed.
이러한 변수에는 연결된 값이 없습니다. 변수에 값을 할당하려면 할당 연산자 =를 사용합니다.

```
age = 85;
```

이제 나이의 값은 85입니다. 코드가 85와 같이 고정된 값을 나타내는 데 사용되는 경우 이를 리터럴이라고 합니다.

변수를 선언하고 한 줄에 값을 할당하는 것도 일반적입니다!

예를 들어, 2011년을 int 유형의 yearCodecademyWasFounded라는 변수에 할당하려면 다음과 같이 작성합니다.

```
int yearCodecademyWasFounded = 2011;
```


*/