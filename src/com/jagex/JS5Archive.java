/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

public class JS5Archive {
	public static JS5Archive CLIENT_SCRIPTS;
	public static JS5Archive BASES;
	public static JS5Archive DEFAULTS;
	public static JS5Archive CONFIG;
	public static JS5Archive MAPS;
	public static JS5Archive MODELS;
	public static JS5Archive SHADERS;
	public static JS5Archive BINARY;
	public static JS5Archive INTERFACES;
	public static JS5Archive FONT_METRICS;
	public static JS5Archive BILLBOARDS;
	public static JS5Archive CONFIG_LOC;
	public static JS5Archive CONFIG_ENUM;
	static JS5Archive aClass46_543;
	public static JS5Archive PARTICLES;
	public static JS5Archive CONFIG_SEQ;
	public static JS5Archive CONFIG_SPOT;
	public static JS5Archive CONFIG_STRUCT;
	public static JS5Archive CUTSCENES;
	public static JS5Archive QUICK_CHAT;
	static JS5Archive TEXTURES_HDR_PNG_MIPPED;
	public static JS5Archive MATERIALS;
	public static JS5Archive WORLD_MAP;
	public static JS5Archive VORBIS;
	static int anInt554;
	public static JS5Archive DLLS;
	public static JS5Archive DB_TABLE_INDEX;
	public static JS5Archive SPRITES;
	public static JS5Archive LOADING_SCREENS;
	public static JS5Archive LOADING_SPRITES_RAW;
	int anInt560;
	public static JS5Archive AUDIO_STREAMS;
	public static JS5Archive WORLD_MAP_AREA;
	public static JS5Archive CONFIG_NPC;
	public static JS5Archive TEXTURES_DIFFUSE_PNG;
	public static JS5Archive TEXTURES_HDR_PNG;
	static JS5Archive TEXTURES_DIFFUSE_DXT;
	static JS5Archive aClass46_567;
	static JS5Archive MODELS_RT7;
	static JS5Archive ANIMATIONS_RT7;
	static JS5Archive WORLD_MAP_LABELS;
	public static JS5Archive ANIMATIONS;
	public static JS5Archive LOADING_SPRITES;
	public static JS5Archive CONFIG_OBJ;
	boolean aBool574;
	public static JS5Archive QUICK_CHAT_GLOBAL;

	public boolean method902(int i) {
		return aBool574;
	}

	public int method903(int i) {
		return -960064969 * anInt560;
	}

	JS5Archive(int i, String string, boolean bool, boolean bool_0_, boolean bool_1_) {
		anInt560 = i * -488651897;
		aBool574 = bool_1_;
	}

	public static int method904() {
		if (-1 == anInt554 * 819264887) {
			JS5Archive[] class46s = ShadowQualitySetting.method10035(1134937128);
			for (int i = 0; i < class46s.length; i++) {
				JS5Archive class46 = class46s[i];
				if (-960064969 * class46.anInt560 > 819264887 * anInt554)
					anInt554 = 1612792129 * class46.anInt560;
			}
			anInt554 += 1071443015;
		}
		return anInt554 * 819264887;
	}

	public int method905() {
		return -960064969 * anInt560;
	}

	public static int method906() {
		if (-1 == anInt554 * 819264887) {
			JS5Archive[] class46s = ShadowQualitySetting.method10035(-967724144);
			for (int i = 0; i < class46s.length; i++) {
				JS5Archive class46 = class46s[i];
				if (-960064969 * class46.anInt560 > 819264887 * anInt554)
					anInt554 = 1612792129 * class46.anInt560;
			}
			anInt554 += 1071443015;
		}
		return anInt554 * 819264887;
	}

	static {
		ANIMATIONS = new JS5Archive(0, "", false, false, false);
		BASES = new JS5Archive(1, "", false, false, false);
		CONFIG = new JS5Archive(2, "", true, false, false);
		INTERFACES = new JS5Archive(3, "", true, false, false);
		MAPS = new JS5Archive(5, "", false, false, false);
		MODELS = new JS5Archive(7, "", false, false, false);
		SPRITES = new JS5Archive(8, "", false, false, false);
		BINARY = new JS5Archive(10, "", false, false, false);
		CLIENT_SCRIPTS = new JS5Archive(12, "", true, false, false);
		FONT_METRICS = new JS5Archive(13, "", false, false, false);
		VORBIS = new JS5Archive(14, "", false, false, false);
		CONFIG_LOC = new JS5Archive(16, "", true, false, false);
		CONFIG_ENUM = new JS5Archive(17, "", true, false, false);
		CONFIG_NPC = new JS5Archive(18, "", true, false, false);
		CONFIG_OBJ = new JS5Archive(19, "", true, false, false);
		CONFIG_SEQ = new JS5Archive(20, "", true, false, false);
		CONFIG_SPOT = new JS5Archive(21, "", true, false, false);
		CONFIG_STRUCT = new JS5Archive(22, "", true, false, false);
		WORLD_MAP = new JS5Archive(23, "", true, false, false);
		QUICK_CHAT = new JS5Archive(24, "", true, false, false);
		QUICK_CHAT_GLOBAL = new JS5Archive(25, "", true, false, false);
		MATERIALS = new JS5Archive(26, "", false, false, false);
		PARTICLES = new JS5Archive(27, "", false, false, false);
		DEFAULTS = new JS5Archive(28, "", false, false, false);
		BILLBOARDS = new JS5Archive(29, "", false, false, false);
		DLLS = new JS5Archive(30, "", false, false, false);
		SHADERS = new JS5Archive(31, "", false, false, false);
		LOADING_SPRITES = new JS5Archive(32, "", false, false, false);
		LOADING_SCREENS = new JS5Archive(33, "", true, false, false);
		LOADING_SPRITES_RAW = new JS5Archive(34, "", false, false, false);
		CUTSCENES = new JS5Archive(35, "", true, false, false);
		AUDIO_STREAMS = new JS5Archive(40, "", false, false, true);
		WORLD_MAP_AREA = new JS5Archive(41, "", false, false, false);
		WORLD_MAP_LABELS = new JS5Archive(42, "", false, false, false);
		TEXTURES_DIFFUSE_PNG = new JS5Archive(43, "", false, false, false);
		TEXTURES_HDR_PNG = new JS5Archive(44, "", false, false, false);
		TEXTURES_DIFFUSE_DXT = new JS5Archive(45, "", false, true, false);
		TEXTURES_HDR_PNG_MIPPED = new JS5Archive(46, "", false, true, false);
		MODELS_RT7 = new JS5Archive(47, "", false, true, false);
		ANIMATIONS_RT7 = new JS5Archive(48, "", false, true, false);
		DB_TABLE_INDEX = new JS5Archive(49, "", true, true, false);
		aClass46_567 = new JS5Archive(50, "", false, true, false);
		aClass46_543 = new JS5Archive(51, "", false, true, false);
		anInt554 = -1071443015;
	}

	static final void method907(Class668 class668, int i) {
		class668.anIntArray8541[(class668.anInt8542 += -1411037171) * 1867269829 - 1] = ClientSetting.aClass536_Sub40_8843.shadowSetting.method10004(2119230397);
	}
}
