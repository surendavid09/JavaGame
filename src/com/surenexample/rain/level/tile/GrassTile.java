package com.surenexample.rain.level.tile;

import com.surenexample.rain.graphics.Screen;
import com.surenexample.rain.graphics.Sprite;

public class GrassTile extends Tile {
	
	public GrassTile(Sprite sprite) {
		super(sprite);
	}
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x, y, this);
	}

}
