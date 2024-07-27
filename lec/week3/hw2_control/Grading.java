import java.util.Scanner;

public class Grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("กรอกคะแนนรวม: ");
        int score = in.nextInt();

        System.out.print("กรอกคะแนนสอบรวม: ");
        int scoreExam = in.nextInt();

        System.out.print("สถานะการทำโปรเจค (true คือสำเร็จ / false คือไม่เสร็จ): ");
        boolean projectStatus = in.nextBoolean();

        System.out.print("จำนวนครั้งการขาดเรียน: ");
        int numAbsent = in.nextInt();

        System.out.println("Your grade: " + getGrade(score, scoreExam, projectStatus, numAbsent));
    }

    public static String getGrade(int totalScore, int examScore, boolean projectStatus, int numAbsent) {
            if(examScore<40 || numAbsent>3) return "F";
            
            // your code (can be many lines)
            int score = totalScore + examScore;
            if(!projectStatus)return "I";
            else if(score >= 80) return "A";
            else if(score >= 75) return "B+";
            else if(score >= 70) return "B";
            else if(score >= 65) return "C+";
            else if(score >= 60) return "C";
            else if(score >= 55) return "D+";
            else if(score >= 50) return "D";
            else return "F";
    }
}

