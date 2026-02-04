import java.util.*;
import java.time.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String name, LocalDate expiry) {
        this.name = name;
        this.expiry = expiry;
    }
}

public class FilteringExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = List.of(
                new Member("Arsh", LocalDate.now().plusDays(10)),
                new Member("Shikhar", LocalDate.now().plusDays(40))
        );
        members.stream()
                .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
                .forEach(m -> System.out.println(m.name));
    }
}
