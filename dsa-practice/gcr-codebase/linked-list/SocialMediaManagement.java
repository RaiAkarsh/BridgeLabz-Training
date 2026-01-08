class Node {
    int userId;
    String name;
    int age;
    int[] friends;
    int friendCount;
    Node next;

    Node(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new int[10]; // max 10 friends
        this.friendCount = 0;
        this.next = null;
    }
}

public class SocialMediaManagement {

    private Node head;

    public SocialMediaManagement() {
        head = null;
    }

    // Add user at last
    public void addUser(int userId, String name, int age) {
        Node newNode = new Node(userId, name, age);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Search user by ID
    private Node searchUser(int userId) {
        Node current = head;
        while (current != null) {
            if (current.userId == userId) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Add friend connection
    public void addFriend(int id1, int id2) {
        Node user1 = searchUser(id1);
        Node user2 = searchUser(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        user1.friends[user1.friendCount++] = id2;
        user2.friends[user2.friendCount++] = id1;

        System.out.println("Friend connection added");
    }

    // Remove friend connection
    public void removeFriend(int id1, int id2) {
        Node user1 = searchUser(id1);
        Node user2 = searchUser(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        removeFromFriendList(user1, id2);
        removeFromFriendList(user2, id1);

        System.out.println("Friend connection removed");
    }

    private void removeFromFriendList(Node user, int id) {
        for (int i = 0; i < user.friendCount; i++) {
            if (user.friends[i] == id) {
                for (int j = i; j < user.friendCount - 1; j++) {
                    user.friends[j] = user.friends[j + 1];
                }
                user.friendCount--;
                return;
            }
        }
    }

    // Display friends of a user
    public void displayFriends(int userId) {
        Node user = searchUser(userId);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Friends of " + user.name + ": ");
        for (int i = 0; i < user.friendCount; i++) {
            System.out.print(user.friends[i] + " ");
        }
        System.out.println();
    }

    // Find mutual friends
    public void mutualFriends(int id1, int id2) {
        Node user1 = searchUser(id1);
        Node user2 = searchUser(id2);

        if (user1 == null || user2 == null) {
            System.out.println("User not found");
            return;
        }

        System.out.print("Mutual Friends: ");
        for (int i = 0; i < user1.friendCount; i++) {
            for (int j = 0; j < user2.friendCount; j++) {
                if (user1.friends[i] == user2.friends[j]) {
                    System.out.print(user1.friends[i] + " ");
                }
            }
        }
        System.out.println();
    }

    // Count number of friends for each user
    public void countFriends() {
        Node current = head;
        while (current != null) {
            System.out.println(current.name + " has " + current.friendCount + " friends");
            current = current.next;
        }
    }
    public static void main(String[] args) {
        SocialMediaManagement sm = new SocialMediaManagement();

        sm.addUser(1, "Akarsh", 21);
        sm.addUser(2, "Kanahiya", 22);
        sm.addUser(3, "Arsh", 22);
        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.displayFriends(1);
        sm.mutualFriends(1, 2);
        sm.countFriends();
        sm.removeFriend(1, 2);
        sm.displayFriends(1);
    }
}
