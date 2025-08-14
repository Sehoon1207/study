/*
C auf Ihren lokalen Computer bringen

Entdecken Sie die Leistungsfähigkeit der Programmiersprache C mit einer lokalen Programmierumgebung.

Obwohl das Schreiben von Code auf der Codecademy-Plattform einfach und angenehm ist, möchten Sie möglicherweise irgendwann mit der Programmiersprache C auf Ihrem lokalen Computer arbeiten. Am besten gelingt dies mit einer integrierten Entwicklungsumgebung ( IDE) .

IDEs sind nützliche Anwendungen, die Programmierer bei vielen Aufgaben unterstützen, wie zum Beispiel:

Dateisystemnavigation
Codesuche und Autovervollständigung
Hervorhebung von Syntaxfehlern
Lokaler Befehlszeilenzugriff.
Es gibt viele IDEs zur Auswahl. Es empfiehlt sich, eine kostenlose IDE zu verwenden, die eine Vielzahl von Programmiersprachen unterstützt. VSCode ist eine Open-Source-IDE, die von Microsoft entwickelt und gepflegt wird und sich hervorragend für die C-Programmierung eignet.

Installieren Sie VSCode
Um mit VSCode zu beginnen, installieren Sie es von der VSCode-Homepage .

Wenn die Installation abgeschlossen ist, sollten Sie VSCode auf Ihrem lokalen Computer öffnen können.

Installieren Sie die C-Erweiterung und den Compiler
Nach der Installation müssen Sie C-Unterstützung und den richtigen Compiler für Ihr Betriebssystem hinzufügen. Dies wird in den VSCode C/C++-Dokumenten erklärt .

Nach Abschluss sollten Sie in der Lage sein, ein C-Skript innerhalb der VSCode-Befehlszeile zu kompilieren und auszuführen.

VSCode erkunden
Nachdem Ihr System eingerichtet ist, können Sie loslegen. VSCode bietet Ihnen vielfältige Möglichkeiten. Nehmen Sie sich die Zeit, die Funktionen zu erkunden! Ein guter erster Schritt ist die Einführung in VSCode .

Viel Spaß beim Programmieren!




로컬 컴퓨터에서 C를 활용하세요

로컬 프로그래밍 환경에서 C 프로그래밍 언어의 강력한 기능을 경험해 보세요.

Codecademy 플랫폼에서 코드를 작성하는 것은 쉽고 즐겁지만, 결국에는 로컬 컴퓨터에서 C 프로그래밍 언어로 작업하고 싶을 수도 있습니다. 이를 위한 가장 좋은 방법은 통합 개발 환경(IDE)을 사용하는 것입니다.

IDE는 프로그래머가 다음과 같은 다양한 작업을 수행할 수 있도록 지원하는 유용한 애플리케이션입니다.

파일 시스템 탐색
코드 검색 및 자동 완성
구문 오류 강조 표시
로컬 명령줄 액세스
선택할 수 있는 IDE는 다양합니다. 다양한 프로그래밍 언어를 지원하는 무료 IDE를 사용하는 것이 가장 좋습니다. VSCode는 Microsoft에서 개발 및 관리하는 오픈 소스 IDE로, C 프로그래밍에 이상적입니다.

VSCode 설치
VSCode를 시작하려면 VSCode 홈페이지에서 설치하세요.

설치가 완료되면 로컬 컴퓨터에서 VSCode를 열 수 있습니다.

C 확장 프로그램 및 컴파일러 설치
설치 후에는 C 지원 및 운영 체제에 맞는 컴파일러를 추가해야 합니다. 자세한 내용은 VSCode C/C++ 문서에서 확인할 수 있습니다.

설치가 완료되면 VSCode 명령줄에서 C 스크립트를 컴파일하고 실행할 수 있습니다.

VSCode 살펴보기
이제 시스템 설정이 완료되었으므로 시작할 준비가 되었습니다. VSCode는 다양한 기능을 제공합니다. 시간을 내어 VSCode의 기능을 살펴보세요! 첫 단계로 VSCode 소개를 살펴보는 것이 좋습니다.

즐거운 코딩 되세요!

*/


#include <stdio.h>

int main() {
  // output a line
  printf("Hello World!\n");
}

// 컴파일하기   : gcc helloWorld.c -o helloWorld
// 실행하기     : ./helloWorld