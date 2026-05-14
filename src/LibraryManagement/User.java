package LibraryManagement;

public abstract class User {
    private final String userId;
    private String name;
    private String contactInfo;
    private static int id = 0;
    private static int totalUsers = 0;

    // Default constructor
    public User(){
        this.userId = generateUniqueId();
        totalUsers++;
    }

    //
    public User(String name, String contactInfo) {

        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User other){
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    private final static int generateUniqueId(){
        return String.valueOf(++id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

// Every user have its own implementation of displaying the dashboard &
// behaviour of the books that can be borrowed.
    public abstract void displayDashboard();

    public abstract boolean canBorrowBooks();
}

