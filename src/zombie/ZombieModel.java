package zombie;

import java.awt.Color;

public class ZombieModel {
	
	private int tempx;
	private int tempy;
	
	private final Color[][] matrix;
	private final int width;
	private final int height;
	private final int dotSize;
	
	public ZombieModel(int widthArg, int heightArg, int dotSizeArg) {
		width = widthArg;
		height = heightArg;
		dotSize = dotSizeArg;
		matrix = new Color[width][height];
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				matrix[i][j] = Color.BLACK;
			}
		}
	}
	
	public int getWidth() { return width; }
	public int getHeight() { return height; }
	public int getDotSize() { return dotSize; }
	public Color getColor(int x, int y) { return matrix[x][y]; }
	public void setColor(int x, int y, Color color) { matrix[x][y] = color; }
	
	public void initialize() {
		//
	}
	
	public void update() {
		// 
	}
}
