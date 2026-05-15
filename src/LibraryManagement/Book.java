package LibraryManagement;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isAvailable;

    Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    @Override
    public boolean lend(User user){
        if(user.canBorrowBooks() && isAvailable){
            isAvailable = false;
            return true;
        }
        return false;
    }

    @Override
    public void returnBook(User user){
        isAvailable = true;
    }

    @Override
    public boolean isAvailable(){
        return isAvailable;
    }

    public abstract void displayBookDetails();
}
