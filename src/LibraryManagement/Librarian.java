package LibraryManagement;

import java.awt.print.Book;

public class Librarian extends User {
    String employeeNumber;

    Librarian(String username, String password, String employeeNumber) {
        super(username, password);
        this.employeeNumber = employeeNumber;
    }

    @Override
    public void displayDashboard(){
        System.out.println("Librarian Dashboard");
        System.out.println(employeeNumber);
    }

    @Override
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book){
        // Implementations
    }

    public void removeBook(Book book){
        // Implementations
    }
}
