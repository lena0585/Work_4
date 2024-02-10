public class User{
    private String surname;
    private String firstname;
    private String midllename;

    public User(String surname, String firstname, String midllename) {
        this.surname = surname;
        this.firstname = firstname;
        this.midllename = midllename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setMidllename(String midllename) {
        this.midllename = midllename;
    }

    public String getSurname(){
        return surname;
    }

    public String getFirstname(){
        return firstname;
    }

    public String getMidllename(){
        return midllename;
    }

    @Override
    public String toString() {
        return "User{" +
                "surname='" + surname + '\'' +
                ", firstname='" + firstname + '\'' +
                ", midllename='" + midllename + '\'' + '}';
    }

}