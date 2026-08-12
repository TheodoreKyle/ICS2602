import java.util.*; 
@SuppressWarnings("resource") 
public class November_12_2024 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int N, i, a, tmp, highest, sum = 0, below = 0, between = 0, above = 0; 
        double average; 
        System.out.print("Enter number of students: ");
        N = input.nextInt(); 
        System.out.println(); 
        int[] student_number = new int[N];
        int[] scores = new int[N]; 

        for (i = 0; i < N; i++) {
            System.out.print("Enter student number: "); 
            student_number[i] = input.nextInt(); 
            System.out.print("Enter student score: "); 
            scores[i] = input.nextInt();
            sum += scores[i]; 
            System.out.println();
        }

        average = sum * 1.0 / N;
        System.out.println("Class average: " + average + "\n");
        for (i = 0; i < N; i++) {
            if (scores[i] < average)
            System.out.println("Student " + student_number[i] + " has a score of " + scores[i]);
        } 

        System.out.println(); 
        highest = scores[0];
        for (i = 1; i < N; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        System.out.println("Highest test score: " + highest);
        for (i = 0; i < N; i++) {
            if (scores[i] == highest) {
                System.out.println("Student " + student_number[i] + " with score " + scores[i]);
            }
        }

        System.out.println();
        for (int score : scores) {
            if (score < 50)
            below++;
            else if (score >= 50 && score <= 75)
            between++;
            else
            above++;
        }
        System.out.println("Number of students with scores below 50: " + below);
        System.out.println("Number of students with scores between 50 and 75: " + between);
        System.out.println("Number of students with scores above 75: " + above);
        
        System.out.println();
        System.out.println("Students and their scores in descending order:");
        for (i = 0; i < N - 1; i++) { 
            for (a = i + 1; a < N; a++) {
                if (student_number[i] < student_number[a]) { 
                    tmp = student_number[i]; 
                    student_number[i] = student_number[a];
                    student_number[a] = tmp;
                    tmp = scores[i]; 
                    scores[i] = scores[a];
                    scores[a] = tmp;
                }
            }
        }

        for (i = 0; i < N; i++)
        System.out.print("Student number " + student_number[i] + " with score " + scores[i] + "\n"); 
    }
}