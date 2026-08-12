import java.util.*;
public class Choa_MachineProblem1 {
    public class Candidate {
        private int ctr; 

        public Candidate(int ctr) {
            this.ctr = ctr;
        }

        public void getCandidate(Election election) {
            Scanner input = new Scanner(System.in);
            String names;
            if (ctr >= 5 && ctr <= 10) {
                for (int a = 1; a <= ctr; a++) {
                    System.out.print("Enter the name of the candidate for voter " + a + ": ");
                    names = input.nextLine().trim().toLowerCase();
                    names = names.replaceAll("\\s+", ""); 
                    election.counting(names);
                }
            } else {
                System.out.println("Invalid number of votes entered.");
                System.exit(0); 
            }
        }
    }

    public class Election {
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0;
        String[] listProper = {"Theodore Choa", "Joaquin Elcana", "Kristian Reyes", "Kevin Piosca", "Stevenson Yan", "Rohan Villamil", "Carlos Del Rosario", "Andrei Manalad", "Gian Cayari", "Sam Certeza"}; 
        public void counting(String names) {
            if (names.equals(listProper[0].trim().toLowerCase().replaceAll("\\s+", ""))) c1++;
            else if (names.equals(listProper[1].trim().toLowerCase().replaceAll("\\s+", ""))) c2++;
            else if (names.equals(listProper[2].trim().toLowerCase().replaceAll("\\s+", ""))) c3++;
            else if (names.equals(listProper[3].trim().toLowerCase().replaceAll("\\s+", ""))) c4++;
            else if (names.equals(listProper[4].trim().toLowerCase().replaceAll("\\s+", ""))) c5++;
            else if (names.equals(listProper[5].trim().toLowerCase().replaceAll("\\s+", ""))) c6++;
            else if (names.equals(listProper[6].trim().toLowerCase().replaceAll("\\s+", ""))) c7++;
            else if (names.equals(listProper[7].trim().toLowerCase().replaceAll("\\s+", ""))) c8++;
            else if (names.equals(listProper[8].trim().toLowerCase().replaceAll("\\s+", ""))) c9++;
            else if (names.equals(listProper[9].trim().toLowerCase().replaceAll("\\s+", ""))) c10++;
            else {
                System.out.println("Invalid candidate entered.");
                System.exit(0); 
            }
        }

        public void announceWinner() {
            int[] votes = {c1, c2, c3, c4, c5, c6, c7, c8, c9, c10};
            int maxVotes = 0, winnerIndex = -1, tie = 0;
            for (int a = 0; a < votes.length; a++) {
                if (votes[a] > maxVotes) {
                    maxVotes = votes[a];
                    winnerIndex = a;
                    tie = 0;
                }
                else if (maxVotes == votes[a]) 
                	tie++; 
            }
            if (tie > 0) {
                System.out.println("There is a tie. Please redo the votings."); 
                return; 
            }
            System.out.println("\nTotal of Votes");
            System.out.println(listProper[0] + ": " + c1 + " vote");
            System.out.println(listProper[1] + ": " + c2 + " vote");
            System.out.println(listProper[2] + ": " + c3 + " vote");
            System.out.println(listProper[3] + ": " + c4 + " vote");
            System.out.println(listProper[4] + ": " + c5 + " vote");
            System.out.println(listProper[5] + ": " + c6 + " vote");
            System.out.println(listProper[6] + ": " + c7 + " vote");
            System.out.println(listProper[7] + ": " + c8 + " vote");
            System.out.println(listProper[8] + ": " + c9 + " vote");
            System.out.println(listProper[9] + ": " + c10 + " vote");
            System.out.println("\nOverall Winner: " + listProper[winnerIndex]);
            System.out.println("Congratulations " + listProper[winnerIndex] + "!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Choa_MachineProblem1 problem = new Choa_MachineProblem1(); 

        Election election = problem.new Election(); 
        System.out.println("List of Candidates:");
        System.out.println("Theodore Choa\nJoaquin Elcana\nKristian Reyes\nKevin Piosca\nStevenson Yan\nRohan Villamil\nCarlos Del Rosario\nAndrei Manalad\nGian Cayari\nSam Certeza");

        System.out.print("\nEnter number of voters: ");
        String ctr2 = input.nextLine();
        int ctr;
		try {
            ctr = Integer.parseInt(ctr2);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid integer.");
            return; 
        }

        Candidate candidate = problem.new Candidate(ctr); 
        candidate.getCandidate(election);
        election.announceWinner();
    }
}