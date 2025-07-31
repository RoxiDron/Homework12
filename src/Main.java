public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Михаил"," Булгаков");
        Author secondAuthor = new Author("Лев", " Толстой");
        Book firstBook = new Book("Мастер и Маргарита", firstAuthor, 1967);
        Book secondBook = new Book("Война и мир", secondAuthor,1867);

        System.out.println("Книга - " + firstBook.getTitleBook() + ", год публикации " + secondBook.getYearOfTheBook() +  ", автор -  " + firstAuthor.getNameAuthor() + " " + firstAuthor.getAuthorSurname());

        System.out.println("Книга - " + secondBook.getTitleBook() + ", год публикации " + secondBook.getYearOfTheBook() + ", автор - " + secondAuthor.getNameAuthor() + " " + secondAuthor.getAuthorSurname());

        secondBook.setYearOfTheBook(2000);
        System.out.println("Год публикации " + secondBook.getYearOfTheBook());
    }
}


