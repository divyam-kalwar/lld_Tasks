package LibraryManagement;

public class Member extends User {
    private int borrowedBooksCount;
    private final int MAX_BORROW_LIMIT = 5;

    Member(String username, String password, int borrowedBooksCount) {
        super(username, password);
        this.borrowedBooksCount = borrowedBooksCount;
    }

    @Override
    public void displayDashboard() {
        System.out.println("Member Dashboard");
        System.out.println("Borrowed Books: " + borrowedBooksCount);
    }

    @Override
    public boolean canBorrowBooks(){
        if(borrowedBooksCount<MAX_BORROW_LIMIT) {
            return true;
        }
        return false;
    }
}
