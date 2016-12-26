/* Class325 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex;

import java.util.List;
import java.util.Map;

import com.jagex.twitchtv.TwitchEventLiveStreams;

public abstract class Class325 implements Interface6 {
	Map aMap3560;
	public static TwitchEventLiveStreams aTwitchEventLiveStreams3561;
	public static List aList3562;

	Class325(Map map) {
		aMap3560 = map;
	}

	public static int method4277(int i) {
		aTwitchEventLiveStreams3561 = null;
		int i_0_ = Class536_Sub42.aTwitchTV10811.RequestLiveStreams(client.aClass670_11043.aString8574);
		return i_0_;
	}

	static void method4278(boolean bool, int i) {
		Class105.aString1243 = Class105.aString1243.trim();
		Class105.anInt1239 = 0;
		if (Class105.aString1243.length() == 0)
			Class105.anInt1246 = 0;
		else {
			Class214.sendPanelBoxMessage(new StringBuilder().append("--> ").append(Class105.aString1243).toString());
			Class512.method6211(Class105.aString1243, false, bool, (byte) 80);
			if (!bool) {
				Class105.anInt1246 = 0;
				Class105.aString1243 = "";
			} else
				Class105.anInt1246 = Class105.aString1243.length() * -1505065287;
		}
	}

	static final void method4279(Class668 class668, int i) {
		Class85.method1187(-523079933 * Class542_Sub1.anInt10703, 1659289989);
	}
}
