package Java_Inter_Post_Education.CH04_Construct;

public class Book {
    String title;
    String author;
    int page;

    Book() {
        // 기본 생성자
        this("", "");
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, int page) {
        this(title, author);
        this.page = page;
    }

    void displayInfo() {
        System.out.println("제목 : " + this.title + ", 저자 : " + this.author + ", 페이지 : " + this.page);
    }
}
