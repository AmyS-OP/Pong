import java.awt.Color;

public class Ball extends Sprite{

		private static final int BALL_WIDTH=25;
		private static final int BALL_HEIGHT=25;
		private static final Color BALL_COLOUR = Color.WHITE;
		
		public Ball(int panelWidth, int panelHeight) {
			setWidth(BALL_WIDTH);
			setHeight(BALL_HEIGHT);
			setColour(BALL_COLOUR);
			setInitialPoistion(panelWidth/2 - (getWidth()/2), panelHeight/2 - (getHeight()/2));
			
			resetToInitialPosition();
			
		}

		private void setInitialPoistion(int i, int j) {
			// TODO Auto-generated method stub
			
		}

		private void setColour(Color ballColour) {
			// TODO Auto-generated method stub
			
		}

			
		}
