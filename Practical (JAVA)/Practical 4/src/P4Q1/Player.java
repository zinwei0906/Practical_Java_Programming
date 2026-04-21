package P4Q1;

import P4Q1ADT.ArraySet;
import P4Q1ADT.SetInterface;
import java.io.Serializable;

/**
 *
 * @author RSD2G6 TAN ZIN WEI
 */
public class Player extends Person implements Serializable {

    private static int CurrentID = 1;
    private SetInterface<Player> FriendList;
    private SetInterface<Player> FriendRequestList;

    public Player() {
    }

    public Player(String UserName, String Password) {
        super(CurrentID, UserName, Password);
        FriendList = new ArraySet<Player>();
        FriendRequestList = new ArraySet<Player>();
        CurrentID++;
    }

    public Player(String UserName, String Password, String FirstName, String LastName, char Gender) {
        super(CurrentID, UserName, Password, FirstName, LastName, Gender);
        FriendList = new ArraySet<Player>();
        FriendRequestList = new ArraySet<Player>();
        CurrentID++;
    }

    public SetInterface<Player> getFriendList() {
        return FriendList;
    }

    public void setFriendList(SetInterface<Player> FriendList) {
        this.FriendList = FriendList;
    }

    public SetInterface<Player> getFriendRequestList() {
        return FriendRequestList;
    }

    public void setFriendRequestList(SetInterface<Player> FriendRequestList) {
        this.FriendRequestList = FriendRequestList;
    }

    public boolean AddFriend(Player NewFriend) {
        if (NewFriend.equals(null)) {
            return false;
        } else {
            this.FriendList.add(NewFriend);
            return true;
        }
    }

    public boolean DeleteFriend(Player DeleteFriend) {
        if (DeleteFriend.equals(null)) {
            return false;
        } else {
            this.FriendList.remove(DeleteFriend);
            return true;
        }
    }

    public boolean AddFriendRequest(Player NewFriendRequest) {
        if (NewFriendRequest.equals(null)) {
            return false;
        } else {
            this.FriendRequestList.add(NewFriendRequest);
            return true;
        }
    }

    public boolean DeleteFriendRequest(Player DeleteFriendRequest) {
        if (DeleteFriendRequest.equals(null)) {
            return false;
        } else {
            this.FriendRequestList.remove(DeleteFriendRequest);
            return true;
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.getID();
        return hash;
    }

    @Override
    public boolean equals(Object p1) {
        return (p1 instanceof Player && this.getID() == (((Player) p1).getID())) || super.equals(p1);
    }

    @Override
    public String toString() {
        return "Player{" + super.toString() + ", FriendListSize=" + FriendList.getSizeArraySet() + ", FriendRequestListSize=" + FriendRequestList.getSizeArraySet() + '}';
    }

}
