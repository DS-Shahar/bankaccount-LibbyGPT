package olympicsPackage;

public class Athlete {
    private String name;
    private Grade[] grades;
    private int count;

    public Athlete(String name, int count, int size) {
        this.name = name;
        this.grades = new Grade[size];
        this.count = count;
    }

    public Athlete(Athlete other) {
        this.name = other.getName();
        this.grades = new Grade[other.getGrades().length];
        for (int i = 0; i < this.grades.length; i++) {
            if (other.grades[i] != null) {
                this.grades[i] = new Grade(other.grades[i]);
            }
        }
        this.count = other.getCount();
    }

    public String getName() {
        return name;
    }

    public Grade[] getGrades() {
        return grades;
    }

    public int getCount() {
        return count;
    }

    public boolean addGrade(Grade grade) {
        if (this.count < this.grades.length) {
            this.grades[this.count] = grade;
            count++;
            return true;
        }
        return false;
    }

    public boolean deleteGrade(String apparatusName) {
        for (int i = 0; i < count; i++) {
            if (grades[i].getApparatus().equals(apparatusName)) {
                grades[i] = grades[count - 1];
                grades[count - 1] = null;
                count--;
                return true;
            }
        }
        return false;
    }

    public double average() {
        if (count == 0) {
        	return -	1;
        }
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += grades[i].getScore();
        }
        return sum / count;
    }

    public boolean allGradesAbove(double score) {
        for (int i = 0; i < count; i++) {
            if (grades[i].getScore() <= score) {
                return false;
            }
        }
        return true;
    }

    public boolean isBetter(Athlete other) {
        for (int i = 0; i < count; i++) {
            if (grades[i] != null) {
                boolean foundBetterGrade = false;
                for (int j = 0; j < other.count; j++) {
                    if (other.getGrades()[j] != null && grades[i].getApparatus().equals(other.getGrades()[j].getApparatus())) {
                        if (grades[i].getScore() <= other.getGrades()[j].getScore()) {
                            return false;
                        } else {
                            foundBetterGrade = true;
                        }
                    }
                }
                if (!foundBetterGrade) {
                    return false;
                }
            }
        }
        return true;
    }
}