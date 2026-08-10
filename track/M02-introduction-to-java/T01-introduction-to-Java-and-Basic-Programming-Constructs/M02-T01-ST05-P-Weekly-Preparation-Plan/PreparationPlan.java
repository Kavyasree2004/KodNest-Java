public class PreparationPlan {
    public static void main(String[] args) {

        int completedTopics = 17;
        int totalTopics = 20;
        int dailyHours = 3;
        int learningDays = 5;

        int remainingTopics = totalTopics - completedTopics;

        int weeklyHours = dailyHours * learningDays;

        double progressPercentage =
                (double) completedTopics * 100 / totalTopics;

        System.out.println(
                "Completed Topics: " + completedTopics);

        System.out.println(
                "Remaining Topics: " + remainingTopics);

        System.out.println(
                "Weekly Learning Hours: " + weeklyHours);

        System.out.println(
                "Progress Percentage: " + progressPercentage);
    }
}