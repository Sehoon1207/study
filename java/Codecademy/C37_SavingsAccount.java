/*
1.
main()과 생성자 SavingsAccount() 이외의 메서드를 사용하지 않고 SavingsAccount 클래스를 만들었습니다.
코드를 실행하여 일부 계정 동작이 발생하는지 확인합니다.
주요 방법을보십시오! 너무 길다! 반복되는 코드가 너무 많아요! 10번의 예금을 해야 한다면 얼마나 지저분해 보일지 상상이 가십니까?
이번 강의에서는 한 줄의 코드만으로 잔액 확인, 입금, 출금 등 모든 행위를 할 수 있는 메소드를 만드는 방법을 배우게 될 것입니다.

 */

public class C37_SavingsAccount {
    int balance;

    public C37_SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public static void main(String[] args){
        C37_SavingsAccount savings = new C37_SavingsAccount(2000);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

        //Withdrawing:
        int afterWithdraw = savings.balance - 300;
        savings.balance = afterWithdraw;
        System.out.println("You just withdrew "+300);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

        //Deposit:
        int afterDeposit = savings.balance + 600;
        savings.balance = afterDeposit;
        System.out.println("You just deposited "+600);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

        //Deposit:
        int afterDeposit2 = savings.balance + 600;
        savings.balance = afterDeposit2;
        System.out.println("You just deposited "+600);

        //Check balance:
        System.out.println("Hello!");
        System.out.println("Your balance is "+savings.balance);

    }
}

/*
37 Introduction 소개

지난 수업에서 우리는 객체에 상태와 행동이 있다는 것을 배웠습니다.
인스턴스 필드를 통해 개체 상태를 부여하는 방법을 살펴보았습니다.
이제 메서드를 사용하여 개체 동작을 만드는 방법을 알아봅니다.
저축 계좌의 예를 기억하십시오.

주에서는 저축 계좌가 알아야 할 사항을 알려줍니다.

- 사용 가능한 잔액

동작은 저축 계좌가 수행할 수 있어야 하는 작업을 알려줍니다.

-보증금    - 사용 가능한 금액 증가
-인출     - 사용 가능한 금액 감소
-잔액 확인 - 사용 가능한 금액 표시.

메서드는 특정 작업을 수행하는 데 사용되는 반복 가능한 모듈식 코드 블록입니다.
우리는 입력을 받고, 그것으로 무언가를 하고, 우리가 원하는 종류의 출력을 반환할 우리 자신의 메서드를 정의할 수 있는 능력이 있습니다.

위의 예를 보면 저축예금을 다시 만드는 것은 쉬운 일이 아닙니다.
하나의 프로그램이 어떻게 그렇게 큰 문제를 해결할 수 있습니까? 더 작고 구체적인 작업을 수행할 수 있는 기능이 있는 방법이 유용합니다.
메서드 분해를 통해 메서드를 사용하여 큰 문제를 더 작고 관리하기 쉬운 문제로 나눌 수 있습니다.

메서드도 재사용할 수 있습니다. 샌드위치 하나를 만들기 위해 20줄의 코드를 사용하는 샌드위치 만들기 프로그램을 작성했다고 상상해 보십시오.
샌드위치를 여러 개 만들면 프로그램이 매우 빨리 길어질 것입니다.
makeSandwich() 메서드를 생성하여 호출만 하면 언제든지 샌드위치를 만들 수 있습니다.

 */