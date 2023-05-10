/*
1.
동작에 대해 배웠으므로 이제 메서드를 사용하여 SavingsAccount 클래스에 동작을 적용할 수 있습니다!
이제 main() 내부의 각 메서드에 대한 기능을 추가했지만 main() 위에서 각 메서드를 다시 빌드하게 됩니다.
메서드는 balance 필드에 직접 액세스할 수 있습니다.
먼저 다음을 인쇄하는 checkBalance()라는 메서드를 작성합니다.

```
Hello!
Your balance is
```
계정 잔액이 표시됩니다.
매개변수를 받지 않고 아무 것도 반환하지 않아야 합니다.

2.
이제 int 매개변수 amountToDeposit를 받아 잔액에 추가하는 deposit()이라는 메소드를 작성하십시오.
아무 것도 반환하지 않아야 합니다.

원하는 경우 메서드를 인쇄할 수도 있습니다.
```
You just deposited amountToDeposit
```
amountToDeposit 값이 표시됩니다.

3.
이제, int 매개변수 amountToWithdraw를 받아 잔액에서 빼는 withdraw()라는 메서드를 작성합니다.
amountToWithdraw을 반환해야 합니다.
원하는 경우 메서드를 인쇄할 수도 있습니다.
```
You just withdrew amountToWithdraw
```
amountToWithdraw 값이 표시됩니다.

4.
main() 메소드의 일부 코드를 동등한 메소드로 대체하여 메소드를 테스트하십시오!
checkBalance(), deposit() 및draft()를 각각 한 번 이상 사용하십시오.

5.
축하해요! 기본적인 SavingsAccount를 만들었습니다.

원하는 경우 여기에 더 많은 기능을 추가할 수 있습니다! 추적하고 싶은 다른 인스턴스 필드는 무엇입니까?
이 클래스에서 toString()은 어떻게 생겼을까요?
 */

public class C45_SavingsAccount {
    int balance;

    public C45_SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public void checkBalance(){
        System.out.println("Hello!");
        System.out.println("Your balance is "+balance);
    }

    public void deposit(int amountToDeposit){
        balance = amountToDeposit + balance;
        System.out.println("You just deposited "+amountToDeposit);
    }

    public int withdraw(int amountToWithdraw){
        balance = balance - amountToWithdraw;
        System.out.println("You just withdrew "+amountToWithdraw);
        return amountToWithdraw;
    }
    public static void main(String[] args){
        C45_SavingsAccount savings = new C45_SavingsAccount(2000);

        //Check balance:
        savings.checkBalance();
//        System.out.println("Hello!");
//        System.out.println("Your balance is "+savings.balance);

        //Withdrawing:
        savings.withdraw(300);
//        int afterWithdraw = savings.balance - 300;
//        savings.balance = afterWithdraw;
//        System.out.println("You just withdrew "+300);

        //Check balance:
        savings.checkBalance();
//        System.out.println("Hello!");
//        System.out.println("Your balance is "+savings.balance);

        //Deposit:
        savings.deposit(600);
//        int afterDeposit = savings.balance + 600;
//        savings.balance = afterDeposit;
//        System.out.println("You just deposited "+600);

        //Check balance:
        savings.checkBalance();
//        System.out.println("Hello!");
//        System.out.println("Your balance is "+savings.balance);

        //Deposit:
        savings.deposit(600);
//        int afterDeposit2 = savings.balance + 600;
//        savings.balance = afterDeposit2;
//        System.out.println("You just deposited "+600);

        //Check balance:
        savings.checkBalance();
//        System.out.println("Hello!");
//        System.out.println("Your balance is "+savings.balance);

    }
}

/*
45 Review 검토
잘 했어! 메서드는 작업을 추상화하고 반복 가능하게 만드는 강력한 방법입니다.
이를 통해 클래스에 대한 동작을 정의할 수 있으므로 생성한 객체가 기대하는 작업을 수행할 수 있습니다.
지금까지 메서드에 대해 배운 모든 내용을 검토해 보겠습니다.

메서드 정의: 메서드 선언은 메서드의 반환 유형, 이름 및 매개변수를 선언합니다.
메서드 호출: 메서드는 . 그리고 ()
매개변수: 메소드에 대한 입력과 해당 유형은 메소드 서명에서 괄호 안에 선언됩니다.
인스턴스 필드 변경 : 인스턴스 필드의 값을 변경하는 방법을 사용할 수 있습니다.
범위 : 변수는 변수가 생성된 도메인 내에서만 존재합니다.
Return : 출력할 변수의 타입은 메소드 선언부에 선언

더 많은 Java 자료를 살펴보면서 생성하는 작업을 메서드 측면에서 구성하는 것이 도움이 될 것입니다.
이렇게 하면 필요한 입력과 기대하는 출력을 생각하는 데 도움이 됩니다.

 */