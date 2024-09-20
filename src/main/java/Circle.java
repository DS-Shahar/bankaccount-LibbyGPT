

package BankAccountPackage;

public class Circle {
	private double radius;
	
	
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	public double area() {
		return 2 * Math.PI * this.radius;   
		
	}
	
	public void draw() {
        int diameter = (int) Math.ceil(this.radius * 2);
        double center = this.radius;

        for (int y = 0; y <= diameter; y++) {
            for (int x = 0; x <= diameter; x++) {
                double distance = Math.sqrt(Math.pow(x - center, 2) + Math.pow(y - center, 2));

                if (Math.abs(distance - this.radius) < 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
