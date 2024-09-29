package olympicsPackage;

public class Group {
    private String name;
    private Athlete[] athletes;
    private int count;

    public Group(String name, int size) {
        this.name = name;
        this.athletes = new Athlete[size];
        this.count = 0;
    }

    public boolean addAthlete(Athlete athlete) {
        if (count < athletes.length) {
            athletes[count] = athlete;
            count++;
            return true;
        }
        return false;
    }

    public boolean deleteAthlete(String name) {
        for (int i = 0; i < count; i++) {
            if (athletes[i].getName().equals(name)) {
                athletes[i] = athletes[count - 1];
                athletes[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public String getBestAthleteName() {
        double bestAverage = 0;
        String bestAthleteName = null;
        for (int i = 0; i < count; i++) {
            double avg = athletes[i].average();
            if (avg > bestAverage) {
                bestAverage = avg;
                bestAthleteName = athletes[i].getName();
            }
        }
        return bestAthleteName;
    }

    public boolean addGrade(String athleteName, String apparatus, double score) {
        for (int i = 0; i < count; i++) {
            if (athletes[i].getName().equals(athleteName)) {
                return athletes[i].addGrade(new Grade(apparatus, score));
            }
        }
        return false;
    }
}