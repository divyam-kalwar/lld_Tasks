package LibraryManagement;

import java.util.*;

public class LibraryManagementSystem extends Book{
    List<Book> bookInventory;
    List<User> registeredUsers;

    LibraryManagementSystem(String isbn, String title, String author) {
        super(isbn, title, author);
        bookInventory = new ArrayList<>();
        registeredUsers = new ArrayList<>();
    }

    public void addBook(Book book) {
        bookInventory.add(book);
    }

    public void registerUser(User user) {
        registeredUsers.add(user);
    }

    @Override
    public void displayBookDetails(){

    }
}
