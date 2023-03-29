#include <stdio.h>

typedef struct {
    int speed;
    char fuel;
    float mileage;
    int engineTemp;
    int rpm;
}Dashboard;

int main()
{
    Dashboard d1;

    d1.speed = 80;
    d1.fuel = 'F';
    d1.mileage = 5821.442871;
    d1.engineTemp = 200;
    d1.rpm = 1830;
    


    printf("Speed: %dkm/h\n", d1.speed);
    printf("Fuel: %c\n", d1.fuel);
    printf("Mileage: %fkm\n", d1.mileage);
    printf("Engine temp: %d℃\n", d1.engineTemp);
    printf("RPM: %d\n", d1.rpm);

    return 0;
}


// struct 키워드 없이 Dashboard d1;처럼 변수를 선언하고 있는 경우에는
// Dashboard는 구조체 별칭입니다. 
// 따라서 typedef struct를 사용하여 구조체를 정의하면서 별칭을 지정합니다
// (구조체 이름을 지정해도 되고, 이름이 없는 익명 구조체로 정의해도 됩니다).

