package danmw3.games.blocker;

import java.util.Random;

import org.lwjgl.opengl.GL11;

public class WorldGenerator {

	private Random r = new Random();

	public int chunkCount;

	private int chunkMaxHeight = 16;
	private int chunkWidth = 16;
	private int chunkLength = 16;

	public WorldGenerator(int chunkCount) {
		this.chunkCount = chunkCount;
	}

	public void generateTerrain() {
		for (int cc = 0; cc < chunkCount; cc++) {
			for (int x = 0; x < chunkLength; x++) {
				for (int y = 0; y < chunkMaxHeight; y++) {
					for (int z = 0; z < chunkWidth; z++) {
						RenderCube();
						GL11.glTranslatef(0f, 0f, 2f);
					}
					GL11.glTranslatef(0f, 2f, -(chunkWidth * 2));
				}

				GL11.glTranslatef(2f, -(chunkMaxHeight * 2), 0);
			}
			GL11.glTranslatef(0, 0, 0);
		}
	}

	public void RenderCube() {
		// GL11.glBegin(GL11.GL_LINE_LOOP);
		GL11.glBegin(GL11.GL_QUADS);
		GL11.glColor3f(0.0f, 1.0f, 0.0f);
		GL11.glVertex3f(1.0f, 1.0f, -1.0f);
		GL11.glVertex3f(-1.0f, 1.0f, -1.0f);
		GL11.glVertex3f(-1.0f, 1.0f, 1.0f);
		GL11.glVertex3f(1.0f, 1.0f, 1.0f);

		GL11.glColor3f(1.0f, 0.5f, 0.0f);
		GL11.glVertex3f(1.0f, -1.0f, 1.0f);
		GL11.glVertex3f(-1.0f, -1.0f, 1.0f);
		GL11.glVertex3f(-1.0f, -1.0f, -1.0f);
		GL11.glVertex3f(1.0f, -1.0f, -1.0f);

		GL11.glColor3f(1.0f, 0.0f, 0.0f);
		GL11.glVertex3f(1.0f, 1.0f, 1.0f);
		GL11.glVertex3f(-1.0f, 1.0f, 1.0f);
		GL11.glVertex3f(-1.0f, -1.0f, 1.0f);
		GL11.glVertex3f(1.0f, -1.0f, 1.0f);

		GL11.glColor3f(1.0f, 1.0f, 0.0f);
		GL11.glVertex3f(1.0f, -1.0f, -1.0f);
		GL11.glVertex3f(-1.0f, -1.0f, -1.0f);
		GL11.glVertex3f(-1.0f, 1.0f, -1.0f);
		GL11.glVertex3f(1.0f, 1.0f, -1.0f);

		GL11.glColor3f(0.0f, 0.0f, 1.0f);
		GL11.glVertex3f(-1.0f, 1.0f, 1.0f);
		GL11.glVertex3f(-1.0f, 1.0f, -1.0f);
		GL11.glVertex3f(-1.0f, -1.0f, -1.0f);
		GL11.glVertex3f(-1.0f, -1.0f, 1.0f);

		GL11.glColor3f(1.0f, 0.0f, 1.0f);
		GL11.glVertex3f(1.0f, 1.0f, -1.0f);
		GL11.glVertex3f(1.0f, 1.0f, 1.0f);
		GL11.glVertex3f(1.0f, -1.0f, 1.0f);
		GL11.glVertex3f(1.0f, -1.0f, -1.0f);
		GL11.glEnd();
	}
	
	public int getRandomUpDown(int start) {
		int change = r.nextInt(3) - 1; // Gets a random number -1 to 1
		return start - change; // Returns that.
	}
}
