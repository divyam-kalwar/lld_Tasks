package MilestoneA;

public class User {
    String userId;
    private String name;
    private String contactInfo;
    private static int id = 0;

    public User(){
        this.userId = String.valueOf(generateUniqueId());
    }

    public User(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public User(User other){
        this.userId = other.userId;
        this.name = other.name;
        this.contactInfo = other.contactInfo;
    }

    private static final int generateUniqueId(){
        return id+=1;
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
}

