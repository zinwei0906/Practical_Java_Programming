package P4Q1;

import java.io.Serializable;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class Person implements Serializable {

    private int ID;
    private String UserName;
    private String Password;
    private String FirstName;
    private String LastName;
    private char Gender;

    public Person() {
    }

    public Person(int ID, String UserName, String Password) {
        this.ID = ID;
        this.UserName = UserName;
        this.Password = Password;
    }

    public Person(int ID, String UserName, String Password, String FirstName, String LastName, char Gender) {
        this.ID = ID;
        this.UserName = UserName;
        this.Password = Password;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Gender = Gender;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public boolean MatchPassword(String userName, String password) {
        if (this.UserName.equals(userName) && this.Password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean CheckSameUserName(String Name) {
        if (this.UserName.toUpperCase().equals(Name.toUpperCase())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.ID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.ID != other.ID) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID=" + ID + ", UserName=" + UserName + ", Password=" + Password + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Gender=" + Gender;
    }

}
