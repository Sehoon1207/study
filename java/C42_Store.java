/*
1.
Store 클래스에 가격 인스턴스 필드를 추가했습니다.
그러나 인플레이션 비용과 싸우기 위해 우리는 제품 가격을 계속해서 인상했습니다.
Store 클래스에 빈 incrementPrice() 메서드를 추가했습니다.
이중 매개 변수 priceToAdd를 사용합니다.
incrementPrice() 메서드 내에서 newPrice라는 변수를 만듭니다.
이를 double로 선언하고 가격에 priceToAdd를 더한 값과 같게 설정합니다.
 */

public class C42_Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public C42_Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){

    }

    // main method
    public static void main(String[] args) {
        C42_Store lemonadeStand = new C42_Store("Lemonade", 3.75);

    }
}

/*
42 Reassigning Instance Fields 인스턴스 필드 재할당

이전에 우리는 예금 계좌를 자바로 표현할 수 있는 객체 유형으로 생각했습니다.
필요한 두 가지 방법은 입금 및 출금입니다.

```
public class SavingsAccount{
  double balance;
  public SavingsAccount(double startingBalance){
    balance = startingBalance;
  }

  public void deposit(double amountToDeposit){
     //Add amountToDeposit to the balance
  }

  public void withdraw(double amountToWithdraw){
     //Subtract amountToWithdraw from the balance
  }

  public static void main(String[] args){

  }
}
```

이러한 방법은 변수 잔액balance의 값을 변경합니다. 할당 연산자 =를 다시 사용하여 잔액을 새 값으로 재할당할 수 있습니다.

```
public void deposit(double amountToDeposit){
  double updatedBalance = balance + amountToDeposit;
  balance = updatedBalance;
}
```

이제 deposit()을 호출하면 instance 필드 balance의 값이 변경됩니다.

```
public static void main(String[] args){
  SavingsAccount myAccount = new SavingsAccount(2000);
  System.out.println(myAccount.balance);
  myAccount.deposit(100);
  System.out.println(myAccount.balance);
}
```

이 코드는 먼저 myAccount.balance의 초기 값인 2000을 인쇄한 다음 deposit() 메소드가 실행된 후 myAccount.balance의 값인 2100을 인쇄합니다.

인스턴스 필드 변경은 개체의 상태를 변경하고 개체를 보다 유연하고 사실적으로 만드는 방법입니다.

 */