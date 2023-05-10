/*
1. 학생을 3명씩 그룹으로 나누려고 합니다. 그룹이 만들어지면 몇 명의 학생이 제외됩니까?
학생과 3의 모듈로를 보유하는 leftOut이라는 변수를 생성합니다. 그런 다음 변수를 인쇄합니다!


 */

public class C19_Modulo {
    public static void main(String[] args) {
        int students = 26;
        int leftOut = 26%3;
        System.out.println(leftOut);
    }
}

/*
19 Modulo

쿠키 10개를 구워서 3개 묶음으로 나눠준다면 가능한 모든 묶음을 다 나눠주고 남은 쿠키는 몇 개일까요?
모듈로 연산자 %는 두 숫자를 나눈 후 나머지를 제공합니다.

```
int cookiesBaked = 10;
int cookiesLeftover = 10 % 3;
//cookiesLeftover holds 1
```

가능한 한 3개의 배치를 모두 나눠주고 나면 1개의 쿠키가 남습니다!
Modulo는 까다로운 개념일 수 있으므로 다른 예를 살펴보겠습니다.
숫자가 짝수인지 홀수인지 알아야 한다고 상상해 보십시오. 짝수는 2로 나누어집니다.
모듈로가 도와드리겠습니다! 짝수를 2로 나누면 나머지는 0이 됩니다. 홀수를 2로 나누면 나머지는 1이 됩니다.

```
7 % 2
// 1, odd!
8 % 2
// 0, even!
9 % 2
// 1, odd!
```

 */