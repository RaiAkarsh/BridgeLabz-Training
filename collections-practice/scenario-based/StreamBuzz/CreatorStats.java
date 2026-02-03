import java.util.*;

public class CreatorStats {

    public String CreatorName;
    public double[] WeeklyLikes;

    public static List<CreatorStats> EngagementBoard = new ArrayList<>();

    public CreatorStats(String name, double[] likes) {
        CreatorName = name;
        WeeklyLikes = likes;
    }
}
