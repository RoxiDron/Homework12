public class Book {
    private final String titleBook;//название книги
    private final Author nameAuthor;//автор
    private int yearOfTheBook;//год издания

    public Book(String titleBook, Author nameAuthor, int yearOfTheBook) {
        this.titleBook = titleBook;
        this.nameAuthor = nameAuthor;
        this.yearOfTheBook = yearOfTheBook;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Author getNameAuthor() {
        return nameAuthor;
    }

    public int getYearOfTheBook() {
        return yearOfTheBook;
    }
    public void setYearOfTheBook(int yearOfTheBook) {
        this.yearOfTheBook = yearOfTheBook;
    }
}




