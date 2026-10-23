public class ClassRankingSystem {

    // 1. Student class with name and quizzes array [at least 4 scores]
    static class Student {
        String name;
        int[] quizzes;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
        }

        double getAverage() {
            int sum = 0;
            for (int score : quizzes) {
                sum += score;
            }
            return (double) sum / quizzes.length;
        }
    }

    // 2. YOUR OWN sort algorithm - Bubble Sort by average descending
    public static void sortByAverage(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (students[j].getAverage() < students[j + 1].getAverage()) {
                    // swap
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
    }

    // 3. YOUR OWN linear search returning rank
    public static int findRankByName(Student[] rankedStudents, String targetName) {
        for (int i = 0; i < rankedStudents.length; i++) {
            if (rankedStudents[i].name.equalsIgnoreCase(targetName)) {
                return i + 1; // rank is 1-based, but we will fix ties in printing
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        // 2D array of raw quiz data
        String[] names = {"Annika", "Ysabelle", "Haku", "Choc", "Jiji"};
        int[][] rawQuizData = {
            {85, 90, 78, 92}, // Annika - avg 86.25
            {95, 92, 88, 90}, // Ysabelle - avg 91.25
            {70, 75, 80, 72}, // Haku - avg 74.25
            {95, 92, 88, 90}, // Choc - TIE with Mia 91.25
            {88, 84, 90, 86}  // Jiji - avg 87.0
        };

        // Build array of Student objects from 2D array
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

        // Rank students by average
        sortByAverage(students);

        // 4. Print formatted leaderboard with tie handling
        System.out.println("===== CLASS RANKING LEADERBOARD =====");
        System.out.printf("%-6s %-10s %-10s%n", "RANK", "NAME", "AVERAGE");
        System.out.println("----------------------------------");

        int rank = 1;
        for (int i = 0; i < students.length; i++) {
            // Handle tie: if current average == previous average, use same rank
            if (i > 0 && students[i].getAverage() == students[i-1].getAverage()) {
                // keep same rank number as previous
            } else {
                rank = i + 1;
            }
            System.out.printf("%-6d %-10s %.2f%n", rank, students[i].name, students[i].getAverage());
        }

        System.out.println("----------------------------------");

        // Demo of linear search
        String searchName = "Annika";
        int foundRank = findRankByName(students, searchName);
        // To get correct rank with ties, we need to recalculate tie rank
        int actualRank = 1;
        for(int i=0; i < students.length; i++){
            if(i>0 && students[i].getAverage() != students[i-1].getAverage()){
                actualRank = i+1;
            }
            if(students[i].name.equalsIgnoreCase(searchName)){
                System.out.println(searchName + " is found at Rank: " + actualRank);
                break;
            }
        }
    }
}
