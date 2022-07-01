package homework.books.models;

public class Book {
    private String title;
    private Author author;
    private double price;
    private int count;
    private String genre;

    public Book() {
    }

    public Book(String title, Author author, double price, String genre, int count) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.genre = genre;
        this.count = count;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title ='" + title + '\'' +
                ", authorName =" + author.getName() +
                ", price =" + price +
                ", count =" + count +
                ", genre ='" + genre + '\'' +
                '}';
    }

//            0 - EXIT // դուրս է գալու ծրագրից
//1 - Add Book  // ավելացնելու է գիրք
//2 - Print All Books // տպելու է բոլոր գրքերը
//3 - Print Books by AuthorName // տալու ենք հեղինակի անունը, ցույց է տալու այդ հեղինակի բոլոր գրքերը
//4 - Print Books by Genre // տալու ենք ժանրը, տպելու է էդ ժանրի բոլոր գրքերը։
//5 - Print books by price range // տալու ենք երկու թիվ, տպելու է էդ գնային սահմանի բոլոր գրքերը։
//    Հլը որ այսքանը։
//    Հարցերը անպայման գրեք, ու փորձենք խմբի բոլոր մասնակիցները այս տնայինը գրեն ու հասկանան, որ մեր մյուս մի քանի տնայինները ևս կապված են լինելու այս օրինակի հետ։
//    Սա որ չգրեք ու չհասկանաք մյուսներն էլ չեք հասկանա։
}
