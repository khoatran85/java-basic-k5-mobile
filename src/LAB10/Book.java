package LAB10;

public class Book {
    private String ISBN;
    private String title;
    private String authorName;
    private int year;

    protected Book(String ISBN, String title, String authorName, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.authorName = authorName;
        this.year = year;
    }

    protected String getISBN() {
        return ISBN;
    }

    protected void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    protected String getTitle() {
        return title;
    }

    protected void setTitle(String title) {
        this.title = title;
    }

    protected String getAuthorName() {
        return authorName;
    }

    protected void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    protected int getYear() {
        return year;
    }

    protected void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "ISBN=" + ISBN +
                "| title=" + title +
                "| authorName=" + authorName +
                "| year=" + year;
    }
}
