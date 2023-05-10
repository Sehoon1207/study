/*
1. Timeline.java 파일에는 Java에 대한 일반 텍스트 정보가 있습니다.
일반 텍스트 팩트는 유효한 구문이 아닙니다. 프로그램 중단을 방지하기 위해 주석을 사용합니다.
첫 번째 팩트에는 한 줄 주석 구문을 사용하십시오.
이 줄을 주석으로 변경하십시오.

Sun Microsystems announced the release of Java in 1995

2.우리 프로그램은 여전히 손상되었습니다!

여러 줄 구문을 사용하여 이러한 줄을 단일 주석으로 만듭니다.

*/

public class C04_Timeline {
    public static void main(String[] args) {
        System.out.println("Hello Java!");

        System.out.println("You were born in 1995");

        //Sun Microsystems announced the release of Java in 1995

        System.out.println("You were created by James Gosling");
        /*
        James Gosling is a Canadian engineer who
        created Java while working at Sun Microsystems.
        His favorite number is the square root of 2!
        */
                System.out.println("You are a fun language!");
    }
}

/*
04 Commenting Code

코드 작성은 환상적인 작업을 완료하도록 컴퓨터에 지시하는 흥미로운 과정입니다.

코드도 사람이 읽으며, 우리는 우리의 지시가 컴퓨터에게 명확하기를 원하는 것처럼 우리의 의도가 인간에게 명확하기를 원합니다.

다행스럽게도 우리는 작업을 수행하는 구문 작성에 국한되지 않습니다. 또한 코드를 읽는 사람에게 주석과 메모를 작성할 수도 있습니다.
이러한 주석은 실행되지 않으므로 주석 내에 유효한 구문이 필요하지 않습니다.

주석이 짧으면 한 줄 구문을 사용합니다: //.

```
// calculate customer satisfaction rating
```
주석이 길면 여러 줄 구문을 사용합니다: * 및 *

```
We chose to store information across multiple databases to
minimize the possibility of data loss. We'll need to be careful
to make sure it does not go out of sync!
```

다른 유형의 주석 옵션은 ** 및 *로 표시되는 Javadoc 주석입니다.
Javadoc 주석은 API(Application Programming Interface)에 대한 문서를 작성하는 데 사용됩니다.
Javadoc 주석을 작성할 때 사용자가 읽을 수 있는 문서에서 결국 사용된다는 점을 기억하십시오.
따라서 이러한 주석을 작성할 때 특히 신중해야 합니다.

Javadoc 주석은 일반적으로 필드, 메서드 및 클래스 선언 전에 작성됩니다(이 과정의 뒷부분에서 다룰 것임).

```
**
* The following class accomplishes the following task...
*
```
다음은 완전한 프로그램에서 주석이 어떻게 보이는지 보여줍니다.

```
**
* The following class shows what a comment would look like in a program.
*
publicclass CommentExample {
    // I'm a comment inside the class
    public static void main(String[] args) {
        // I'm a comment inside a method
        System.out.println("This program has comments!");
    }
}
```

주석은 System.out.println()을 사용할 때 화면에 출력하는 것과 다릅니다.
이 주석은 터미널에 표시되지 않으며 텍스트 편집기에서 코드를 읽는 사람들만을 위한 것입니다.


*/