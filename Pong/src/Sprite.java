
public class Sprite {
	private int xPosition, yPosition;
	private int xVelocity, yVelocity;
	private int width, height;
	
	public int getXPosition() {return xPosition;}
	public int getYPosistion() {return yPosition;}
	public int getXVelocity() {return xVelocity;}
	public int getYVelocity() {return yVelocity;}
	public int getWidth() {return width;}
	public int getHeight() {return height;}
	
	public void setXPosition(int newX ) {
		xPosition = newX;
	}
	public void setYPosition(int newY) {
		yPosition = newY;
	}
	public void setXVelocity(int newXVelocity) {
		xVelocity = newXVelocity;
	}
	public void setYVelocity(int newYVelocity) {
		yVelocity = newYVelocity;
	}
	public void setWidth(int newWidth) {
		width = newWidth;
	}
	public void setHeight(int newHeight) {
		height = newHeight;
	}
}
