package engine.graphics;

import towerDefense.Gameplay;
import engine.Drawable;

public class Background implements Drawable {
	protected OwnSprite picture;
	protected Gameplay game;

	public Background(float scale, String backgroundPath, Gameplay game) {
		this.picture = new OwnSprite(backgroundPath, scale);
		this.game = game;
	}

	@Override
	public void draw() {
		this.picture.draw(0, 0, 1f);

	}

}
