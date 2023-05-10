#include <stdio.h>

int main() {

double weigt;
int planet;

printf("What is your earth weight?\n");
scanf("%lf",&weigt);

printf("\nI have information for the following planets:\n\n");
  printf("\t1. Mercury\t2. Venus\t3. Mars\t4. Jupiter\n");
  printf("\t5. Saturn\t6. Uranus\t7. Neptune\n\n");

printf("Enter a number for the planet you want to fight?\n");
scanf("%i",&planet);

switch(planet){
   case 1:
   weigt*=0.38;
   printf("Your weight is %fkg on the Mercury\n", weigt);
   break;
   case 2:
   weigt*=0.91;
   printf("Your weight is %fkg on the Venus\n", weigt);
   break;
   case 3:
   weigt*=0.38;
   printf("Your weight is %fkg on the Mars\n", weigt);
   break;
   case 4:
   weigt*=2.34;
   printf("Your weight is %fkg on the Jupiter\n", weigt);
   break;
   case 5:
   weigt*=1.06;
   printf("Your weight is %fkg on the Saturn\n", weigt);
   break;
   case 6:
   weigt*=0.92;
   printf("Your weight is %fkg on the Uranus\n", weigt);
   break;

   default:
   printf("Unknown\n");
   break;
}

}