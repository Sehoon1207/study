public class Newsfeed {

    String[] trendingArticles;
    int[] views;
    double[] ratings;

    public Newsfeed(String[] initialArticles, int[] initialViews, double[] initialRatings){
        trendingArticles = initialArticles;
        views = initialViews;
        ratings = initialRatings;
    }

    public String getTopArticle(){
        return trendingArticles[0];
    }

    public void viewArticle(int articleNumber){
        views[articleNumber] = views[articleNumber] + 1;
        System.out.println("The article '" + trendingArticles[articleNumber] + "' has now been viewed " + views[articleNumber] + " times!");
    }

    public void changeRating(int articleNumber, double newRating){
        if (newRating > 5 || newRating < 0) {
            System.out.println("The rating must be between 0 and 5 stars!");
        } else {
            ratings[articleNumber] = newRating;
            System.out.println("The article '" + trendingArticles[articleNumber] + "' is now rated " + ratings[articleNumber] + " stars!");
        }
    }

    public static void main(String[] args){
        String[] robotArticles = {"Oil News", "Innovative Motors", "Humans: Exterminate Or Not?", "Organic Eye Implants", "Path Finding in an Unknown World"};
        int[] robotViewers = {87, 32, 13, 11, 7};
        double[] robotRatings = {2.5, 3.2, 5.0, 1.7, 4.3};
        Newsfeed robotTimes = new Newsfeed(robotArticles, robotViewers, robotRatings);

        robotTimes.viewArticle(2);
        robotTimes.viewArticle(2);
        System.out.println("The top article is " + robotTimes.getTopArticle());
        robotTimes.changeRating(3, 5);
    }
}


/*

58 Introduction 소개

단일 데이터 조각을 변수에 저장하는 방법을 살펴보았습니다.
데이터 그룹을 저장해야 하는 경우 어떻게 됩니까?
교실에 학생 목록이 있으면 어떻게 될까요?
아니면 경마를 완주한 상위 10위 말의 순위입니까?

예를 들어 5개의 복권 번호를 저장하는 경우 각 값에 대해 다른 변수를 만들 수 있습니다.

```
int firstNumber = 4;
int secondNumber = 8;
int thirdNumber = 15;
int fourthNumber = 16;
int fifthNumber = 23;
```

 */