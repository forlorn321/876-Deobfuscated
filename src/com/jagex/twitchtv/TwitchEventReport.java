/* TwitchEventReport - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class572;

public class TwitchEventReport extends TwitchEvent {
	public String message;

	public TwitchEventReport(int i, String string) {
		super(i);
		message = string;
	}

	public void method4951(int[] is, long[] ls, Object[] objects) {
		is[0] = eventType;
		objects[0] = message;
	}

	public Class572 method4952() {
		return Class572.aClass572_7636;
	}

	public Class572 method4953() {
		return Class572.aClass572_7636;
	}

	public Class572 method4954() {
		return Class572.aClass572_7636;
	}

	public void method4955(int[] is, long[] ls, Object[] objects) {
		is[0] = eventType;
		objects[0] = message;
	}
}
