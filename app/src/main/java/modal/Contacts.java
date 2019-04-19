package modal;

public class Contacts {
    private String name, contact, address, email;
    private int imageId;

    public String getAddress() {
        return address;
    }

    public Contacts(String name, String contact, String address, String email, int imageId) {
        this.name = name;
        this.contact = contact;
        this.address = address;
        this.email = email;
        this.imageId = imageId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
