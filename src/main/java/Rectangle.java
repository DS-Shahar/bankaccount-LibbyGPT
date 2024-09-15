package BankAccountPackage;

class Rectangle {
	private int length;
	private int width;
	
	
	public Rectangle(int initialLengh, int initialWidth) {
		this.length = initialLengh;
		this.width = initialWidth;
		
	}
	
	
	public void draw() {
		for (int i = 0; i < length; i++) {
			for(int j = 0 ; j < width ; j++) {
				System.out.print("* ");
				
			}
			System.out.println();
		}
	}
	
	public int calcArea() {
		return width * length;
	}
	
	public int calcPerimeter() {
		return (width * 2) + (length * 2);
	}
	
	public void scale(int factor) {
        this.length *= factor;
        this.width *= factor;
    }
	
	public String toString() {
        return "Rectangle properties : length=" + length + ", width=" + width + "]";
    }
	
	
}

