public class Volcano {
    private String name;
    private int[] degrees;
    private int count;

    public Volcano(String name, int size) {
        this.name = name;
        this.degrees = new int[size];
        this.count = 0;
    }

    public Volcano(Volcano other) {
        this.name = other.name;
        this.count = other.count;
        this.degrees = new int[other.getDegrees().length];
        System.arraycopy(other.getDegrees(), 0, this.degrees, 0, other.getDegrees().length);
    }

    public int getCount() {
        return this.count;
    }

    public String getName() {
        return this.name;
    }

    public int[] getDegrees() {
        return this.degrees;
    }

    public boolean add(int measurement) {
        if (this.count < this.degrees.length) {
            this.degrees[this.count] = measurement;
            count++;
            return true;
        }
        return false;
    }

    public void delete(int index) {
        if (index < count && index >= 0) {
            this.degrees[index] = 0;
            sortZero(this.degrees);
            count--;
        }
    }

    public void deleteAll() {
        for (int i = 0; i < this.degrees.length; i++) {
            delete(i);
        }
        this.count = 0;
    }

    public void sortZero(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array[index++] = array[i];
            }
        }
        while (index < array.length) {
            array[index++] = 0;
        }
    }

    public void fix(int index, int measurement) {
        if (index >= 0 && index < this.degrees.length) {
            this.degrees[index] = measurement;
        }
    }

    public double average() {
        int sum = 0;
        for (int i = 0; i < this.count; i++) {
            sum += this.degrees[i];
        }
        return count > 0 ? (double) sum / count : 0;
    }

    public int maxUnder(int value) {
        int maximum = -1;
        for (int i = 0; i < this.count; i++) {
            if (this.degrees[i] < value && this.degrees[i] > maximum) {
                maximum = this.degrees[i];
            }
        }
        return maximum;
    }

    public void print() {
        for (int i = 0; i < this.count; i++) {
            System.out.println((i + 1) + ") " + this.degrees[i]);
        }
    }

    public String toString() {
        return "The total values in the array is: " + this.count + "\nThe length of the array is: " + this.degrees.length;
    }
}
