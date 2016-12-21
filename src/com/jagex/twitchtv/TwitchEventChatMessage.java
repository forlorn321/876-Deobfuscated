/* TwitchEventChatMessage - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class572;

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

	public void method4951(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}

	public Class572 method4952() {
		return Class572.aClass572_7634;
	}

	public Class572 method4953() {
		return Class572.aClass572_7634;
	}

	public Class572 method4954() {
		return Class572.aClass572_7634;
	}

	public void method4955(int[] is, long[] ls, Object[] objects) {
		objects[0] = name;
		objects[1] = message;
	}
}
