package olympicsPackage;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("Gymnastics Team", 5);
        
        Athlete athlete1 = new Athlete("Alice", 0, 5);
        Athlete athlete2 = new Athlete("Bob", 0, 5);
        
        group.addAthlete(athlete1);
        group.addAthlete(athlete2);

        athlete1.addGrade(new Grade("Beam", 9.5));
        athlete1.addGrade(new Grade("Floor", 8.5));
        
        athlete2.addGrade(new Grade("Beam", 9.0));
        athlete2.addGrade(new Grade("Floor", 9.2));

        System.out.println(athlete1.getName() + "'s average: " + athlete1.average());
        System.out.println(athlete2.getName() + "'s average: " + athlete2.average());

        System.out.println(athlete1.getName() + " all grades above 8.0: " + athlete1.allGradesAbove(8.0));
        System.out.println(athlete2.getName() + " all grades above 9.1: " + athlete2.allGradesAbove(9.1));

        System.out.println(athlete1.getName() + " is better than " + athlete2.getName() + ": " + athlete1.isBetter(athlete2));
        System.out.println("Best athlete in the group: " + group.getBestAthleteName());

        athlete1.deleteGrade("Beam");
        System.out.println(athlete1.getName() + "'s average after deletion: " + athlete1.average());

        group.deleteAthlete("Bob");
        System.out.println("Best athlete in the group after deletion: " + group.getBestAthleteName());

        boolean gradeAdded = group.addGrade("Bob", "Vault", 9.0);
        System.out.println("Grade added for Bob: " + gradeAdded);
    }
}
