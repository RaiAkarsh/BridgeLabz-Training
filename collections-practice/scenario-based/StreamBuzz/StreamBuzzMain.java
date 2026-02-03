import java.util.*;

public class StreamBuzzMain {
    public void RegisterCreator(CreatorStats record) {
        CreatorStats.EngagementBoard.add(record);
    }

    public Dictionary<String, Integer> GetTopPostCounts(List<CreatorStats> records, double likeThreshold) {
        Dictionary<String, Integer> d = new Hashtable<>();
        for (CreatorStats c : records) {
            int cnt = 0;
            for (double l : c.WeeklyLikes) {
                if (l >= likeThreshold) {
                    cnt++;
                }
            }
            if (cnt > 0) {
                d.put(c.CreatorName, cnt);
            }
        }
        return d;
    }

    public double CalculateAverageLikes() {

        double sum = 0;
        int weeks = 0;

        for (CreatorStats c : CreatorStats.EngagementBoard) {
            for (double l : c.WeeklyLikes) {
                sum += l;
                weeks++;
            }
        }
        return weeks == 0 ? 0 : sum / weeks;
    }

    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        StreamBuzzMain p = new StreamBuzzMain();
        boolean run = true;
        while (run) {
            System.out.println("1. Register Creator");
            System.out.println("2. Show Top Posts");
            System.out.println("3. Calculate Average Likes");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");

            int ch = x.nextInt();
            x.nextLine();
            switch (ch) {
                case 1:
                    System.out.println("Enter Creator Name:");
                    String name = x.nextLine();
                    double[] likes = new double[4];
                    System.out.println("Enter weekly likes (Week 1 to 4):");
                    for (int i = 0; i < 4; i++) {
                        likes[i] = x.nextDouble();
                    }
                    p.RegisterCreator(new CreatorStats(name, likes));
                    System.out.println("Creator registered successfully\n");
                    break;

                    case 2:
                    System.out.println("Enter like threshold:");
                    double th = x.nextDouble();

                    Dictionary<String, Integer> res =
                            p.GetTopPostCounts(CreatorStats.EngagementBoard, th);

                    if (res.isEmpty()) {
                        System.out.println("No top-performing posts this week\n");
                    } else {
                        Enumeration<String> keys = res.keys();
                        while (keys.hasMoreElements()) {
                            String k = keys.nextElement();
                            System.out.println(k + " - " + res.get(k));
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Overall average weekly likes: " +
                            (int) p.CalculateAverageLikes() + "\n");
                    break;

                case 4:
                    System.out.println("Logging off");
                    run = false;
                    break;
            }
        }
    }
}
