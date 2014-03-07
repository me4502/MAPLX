package com.me4502.MAPLX;

import java.util.Collection;
import java.util.HashMap;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;

public class TextureStorage {

	private static HashMap<String, Texture> textures = new HashMap<String, Texture>();

	public static void addTexture(String name, Texture texture) {
		addTexture(name,texture,TextureFilter.Nearest,TextureFilter.Nearest);
	}

	public static void addTexture(String name, Texture texture, TextureFilter minFilter, TextureFilter magFilter) {
		texture.setFilter(minFilter, magFilter);
		textures.put(name, texture);
	}

	public static Texture getTexture(String name) {
		return textures.get(name);
	}

	public static Collection<Texture> getTextures() {

		return textures.values();
	}
}