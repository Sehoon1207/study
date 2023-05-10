/*
1. 동물원에 있는 얼룩말의 수와 기린의 수를 더한 값을 저장하는 animalsInZoo라는 int 변수를 만듭니다.
그런 다음 animalsInZoo 변수를 인쇄하십시오.

2. 얼룩말 중 두 마리는 이웃 경쟁 동물원과 거래되었습니다.
얼룩말 수에서 2를 빼고 그 결과를 numZebrasAfterTrade라는 변수에 저장합니다.
그런 다음 numZebrasAfterTrade 변수를 인쇄하십시오!
 */

public class C17_PlusAndMinus {
    public static void main(String[] args) {
        int zebrasInZoo = 8;
        int giraffesInZoo = 4;
        int animalsInZoo = zebrasInZoo + giraffesInZoo;
        System.out.println(animalsInZoo);
        int numZebrasAfterTrade = zebrasInZoo - 2;
        System.out.println(numZebrasAfterTrade);
    }
}

/*
17 Addition and Subtraction

지난 연습의 은행 계좌 예에서는 + 연산자를 사용하여 balance 및 depositAmount 값을 추가했습니다.

```
double balance = 20000.99;
double depositAmount = 1000.0;
balance = balance + depositAmount;
// balance now holds 21000.99
```

잔액에서 인출하려면 - 연산자를 사용합니다.

```
double withdrawAmount = 500;
balance = balance - withdrawAmount;
// balance now holds 19500.99
```

덧셈과 뺄셈은 int 유형 값에서도 작동합니다!
휴대폰에 60장의 고양이 사진이 있고 24장을 더 가져간 경우 다음 코드 줄을 사용하여 numPicturesOfCats에 84장을 저장할 수 있습니다.

```
int numPicturesOfCats = 60 + 24;
```

우리 고양이 사진을 한 장 더 찍으면 어떨까요?
증분 연산자 ++를 사용하여 이 변경 사항을 반영할 수 있습니다.
숫자 기반 변수에 ++를 추가하면 값이 1씩 증가합니다.
또한 값을 1씩 감소시키는 감소 연산자 --도 있습니다.

```
// Take a picture
numPicturesOfCats++ // Value is now 85

// Delete a picture
numPicturesOfCats-- // Value is now 84
```


 */