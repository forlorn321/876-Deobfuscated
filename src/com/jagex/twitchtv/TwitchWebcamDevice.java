/* TwitchWebcamDevice - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.twitchtv;

import java.util.LinkedList;

public class TwitchWebcamDevice {
	public String aString1118;
	public String aString1119;
	public int anInt1120;
	public int anInt1121;
	private LinkedList aLinkedList1122 = new LinkedList();

	public TwitchWebcamDevice(int i, int i_0_, String string, String string_1_) {
		anInt1120 = i * -1790142481;
		anInt1121 = -1826770099 * i_0_;
		aString1118 = string;
		aString1119 = string_1_;
	}

	public void AddCapability(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		aLinkedList1122.add(new TwitchWebcamDeviceCapability(i, i_2_, i_3_, i_4_, i_5_));
	}

	public TwitchWebcamDeviceCapability method1691(int i) {
		if (i < 0 || i >= aLinkedList1122.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList1122.get(i);
	}

	public TwitchWebcamDeviceCapability method1692(int i) {
		for (int i_6_ = 0; i_6_ < aLinkedList1122.size(); i_6_++) {
			if ((((TwitchWebcamDeviceCapability) aLinkedList1122.get(i_6_)).anInt1130) * 268176839 == i)
				return ((TwitchWebcamDeviceCapability) aLinkedList1122.get(i_6_));
		}
		return null;
	}

	public int method1693() {
		return aLinkedList1122.size();
	}

	public TwitchWebcamDeviceCapability method1694(int i) {
		if (i < 0 || i >= aLinkedList1122.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList1122.get(i);
	}

	public TwitchWebcamDeviceCapability method1695(int i) {
		if (i < 0 || i >= aLinkedList1122.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList1122.get(i);
	}

	public TwitchWebcamDeviceCapability method1696(int i) {
		if (i < 0 || i >= aLinkedList1122.size())
			return null;
		return (TwitchWebcamDeviceCapability) aLinkedList1122.get(i);
	}

	public TwitchWebcamDeviceCapability method1697(int i) {
		for (int i_7_ = 0; i_7_ < aLinkedList1122.size(); i_7_++) {
			if ((((TwitchWebcamDeviceCapability) aLinkedList1122.get(i_7_)).anInt1130) * 268176839 == i)
				return ((TwitchWebcamDeviceCapability) aLinkedList1122.get(i_7_));
		}
		return null;
	}

	public int method1698() {
		return aLinkedList1122.size();
	}

	public int method1699() {
		return aLinkedList1122.size();
	}

	public int method1700() {
		return aLinkedList1122.size();
	}

	public int method1701() {
		return aLinkedList1122.size();
	}

	public int method1702() {
		return aLinkedList1122.size();
	}
}
