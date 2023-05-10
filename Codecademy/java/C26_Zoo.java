/*
1. 우리 동물원에는 특정 종의 동물에 저장된 특정 수의 동물이 종에 저장되어 있습니다.
+를 사용하여 zooDescription이라는 새 문자열 변수를 만듭니다. 다음과 같은 문자열을 포함해야 합니다.
```
Our zoo has <animals> <species>s!
```
예를 들어, 모두 Masai Giraffe 종인 5마리의 동물이 있는 경우 String은 다음과 같이 말할 것입니다.
```
Our zoo has 5 Masai Giraffes!
```

2. 변수 zooDescription을 출력하세요!
 */

public class C26_Zoo {
    public static void main(String[] args){
        int animals = 12;
        String species = "zebra";
        String zooDescription = "Our zoo has " + animals + " " + species + "s!";
        System.out.println(zooDescription);
    }
}

/*
26 String Concatenation

우리는 이 강의 전반에 걸쳐 Java의 많은 내장 기능을 다루었습니다.
 +, -, <, == 및 기타 여러 연산자를 살펴보았습니다.
 이들 중 대부분은 프리미티브에서만 작동하지만 일부는 문자열에서도 작동합니다!

변수를 출력하고 싶고 출력하면서 설명하고 싶다고 가정해 봅시다.
은행 계좌 예시의 경우 사용자에게 다음과 같이 말하고 싶다고 가정해 보겠습니다.

```
Your username is: <username>
```

사용자 이름 변수 값이 표시됩니다.

숫자를 더하는 데 사용한 + 연산자는 문자열을 연결하는 데 사용할 수 있습니다.
즉, 두 문자열을 결합하는 데 사용할 수 있습니다!

```
String username = "PrinceNelson";
System.out.println("Your username is: " + username);
```

이 코드는 다음과 같이 인쇄됩니다.

```
Your username is: PrinceNelson
```

기본 데이터 유형을 연결할 두 번째 변수로 사용할 수도 있으며 Java는 이를 지능적으로 먼저 문자열로 만듭니다.

```
int balance = 10000;
String message = "Your balance is: " + balance;
System.out.println(message);
```

이 코드는 다음과 같이 인쇄됩니다.

```
Your balance is: 10000
```

 */