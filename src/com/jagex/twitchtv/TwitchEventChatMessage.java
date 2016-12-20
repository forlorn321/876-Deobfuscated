/* TwitchEventChatMessage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class578;

public class TwitchEventChatMessage extends TwitchEvent {
	public String name;
	public String message;
	public int nameColourARGB;
	public int modes;
	public int subscriptions;
	public boolean isAction;

	public TwitchEventChatMessage(int i, String string, String string_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		super(i);
		name = string;
		message = string_0_;
		nameColourARGB = i_1_;
		modes = i_2_;
		subscriptions = i_3_;
		isAction = bool;
	}

	public void method6560(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}

	public Class578 method6561() {
		return Class578.aClass578_7647;
	}

	public Class578 method6562() {
		return Class578.aClass578_7647;
	}

	public Class578 method6563() {
		return Class578.aClass578_7647;
	}

	public Class578 method6564() {
		return Class578.aClass578_7647;
	}

	public Class578 method6565() {
		return Class578.aClass578_7647;
	}

	public void method6566(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}
}
