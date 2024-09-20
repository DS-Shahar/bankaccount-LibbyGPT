

package BankAccountPackage;

public class Circle {
	private double radius;
	
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double area() {
        return Math.PI * this.radius * this.radius;  
    }
	
	public void draw() {
        int length = (int) Math.ceil(this.radius * 2);
        int[][] matrix = new int[length][length];

        for (int angle = 0; angle < 360; angle++) {
            double radians = Math.toRadians(angle);
            int x = (int) (radius + radius * Math.cos(radians));
            int y = (int) (radius + radius * Math.sin(radians));

            if (x >= 0 && x < length && y >= 0 && y < length) {
                matrix[y][x] = 1;
            }
        }

        for (int[] row : matrix) {
            for (int cell : row) {
                if (cell == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
    }
	}
}
