/* TwitchEventReport - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import com.jagex.Class578;

public class TwitchEventReport extends TwitchEvent {
	public String message;

	public TwitchEventReport(int i, String string) {
		super(i);
		message = string;
	}

	public void method6560(int[] is, long[] ls, Object[] objects) {
		is[0] = eventType;
		objects[0] = message;
	}

	public Class578 method6561() {
		return Class578.aClass578_7643;
	}

	public Class578 method6562() {
		return Class578.aClass578_7643;
	}

	public Class578 method6563() {
		return Class578.aClass578_7643;
	}

	public Class578 method6564() {
		return Class578.aClass578_7643;
	}

	public Class578 method6565() {
		return Class578.aClass578_7643;
	}

	public void method6566(int[] is, long[] ls, Object[] objects) {
		is[0] = eventType;
		objects[0] = message;
	}
}
