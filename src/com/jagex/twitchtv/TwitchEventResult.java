/* TwitchEventResult - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class572;

public class TwitchEventResult extends TwitchEvent {
	public int result;

	public TwitchEventResult(int i, int i_0_) {
		super(i);
		result = i_0_;
	}

	public void method4951(int[] is, long[] ls, Object[] objects) {
		is[0] = eventType;
		is[1] = result;
	}

	public Class572 method4952() {
		return Class572.aClass572_7635;
	}

	public Class572 method4953() {
		return Class572.aClass572_7635;
	}

	public Class572 method4954() {
		return Class572.aClass572_7635;
	}

	public void method4955(int[] is, long[] ls, Object[] objects) {
		is[0] = eventType;
		is[1] = result;
	}
}
