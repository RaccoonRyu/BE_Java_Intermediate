package Java_Inter_Post_Education.CH01_Class;

public class MovieReviewMain2 {
    public static void main(String[] args) {
        MovieReivew movieReivew1 = new MovieReivew();
        MovieReivew movieReivew2 = new MovieReivew();

        movieReivew1.title = "인셉션";
        movieReivew1.review = "인생은 무한 루프!";

        movieReivew2.title = "어바웃 타임";
        movieReivew2.review = "인생 시간 영화";

        MovieReivew[] movieReivews = {movieReivew1, movieReivew2};

        for (MovieReivew re : movieReivews) {
            System.out.println("영화 제목 : " + re.title + ", 리뷰 : " + re.review);
        }

    }
}
