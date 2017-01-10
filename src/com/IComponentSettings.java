package com;

import java.util.Arrays;

public class IComponentSettings {
	
	public enum UseFlag {
		GroundItem(0x1),
		NPC(0x2), 
		Object(0x4),
		OtherPlayer(0x8),
		Self(0x10),
		IComponent(0x20);
		
		private int flag;
		
		private UseFlag(int flag) {
			this.flag = flag;
		}
		
		public int getFlag() {
			return flag;
		}
	}
	
	private int interfaceId;
	private int componentId;
	private int fromSlot;
	private int toSlot;
	private int settings;
	
	public IComponentSettings(int interfaceId, int componentId, int fromSlot, int toSlot, int settings) {
		this.interfaceId = interfaceId;
		this.componentId = componentId;
		this.fromSlot = fromSlot;
		this.toSlot = toSlot;
		this.settings =  settings;
	}
	
	public IComponentSettings(int interfaceId, int componentId, int fromSlot, int toSlot) {
		this(interfaceId, componentId, fromSlot, toSlot, 0);
	}

	public boolean clickOptionEnabled(int i) {
		return 0 != (settings >> 1 + i & 0x1);
	}
	
	public IComponentSettings enableRightClickOptions(int... ids) {
		Arrays.stream(ids).forEach((id) -> enableRightClickOption(id));
		return this;
	}
	
	public IComponentSettings enableRightClickOption(int id) {
		if (id < 0 || id > 9)
			return null;
		settings &= ~(0x1 << (id + 1));
		settings |= (0x1 << (id + 1));
		return this;
	}

	public final boolean useOptionEnabled(UseFlag flag) {
		return ((settings >> 11 & 0x7F) & flag.getFlag()) != 0;
	}
	
	public IComponentSettings enableUseOptions(UseFlag... flags) {
		Arrays.stream(flags).forEach(this::enableUseOption);
		return this;
	}
	
	public IComponentSettings enableUseOption(UseFlag flag) {
		settings &= ~(0x7F << 11);
		settings |= (flag.getFlag() << 11);
		return this;
	}

	public boolean dragEnabled() {
		return (settings >> 21 & 0x1) != 0;
	}
	
	public IComponentSettings enableDrag() {
		settings &= ~(1 << 21);
		settings |= (1 << 21);
		return this;
	}

	public boolean continueOptionEnabled() {
		return (settings & 0x1) != 0;
	}
	
	public void enableContinueButton() {
		settings |= 0x1;
	}

	public boolean bit23Enabled() {
		return 0 != (settings >> 23 & 0x1);
	}
	
	public IComponentSettings enableBit23() {
		settings &= ~(1 << 23);
		settings |= (1 << 23);
		return this;
	}

	public boolean bit22Enabled() {
		return 0 != (settings >> 22 & 0x1);
	}
	
	public IComponentSettings enableBit22() {
		settings &= ~(1 << 22);
		settings |= (1 << 22);
		return this;
	}
	
	public boolean depthEnabled(int depth) {
		return (depthFlags() & depth) != 0;
	}

	public int depthFlags() {
		return settings >> 18 & 0x7;
	}
	
	public IComponentSettings enableDepths(int... ids) {
		Arrays.stream(ids).forEach((id) -> enableDepth(id));
		return this;
	}
	
	public IComponentSettings enableDepth(int depth) {
		if (depth < 0 || depth > 7)
			return null;
		settings &= ~(0x7 << 18);
		settings |= (depth << 18);
		return this;
	}
	
	public int getSettingsHash() {
		return settings;
	}
	
	@Override
	public String toString() {
		String s = "player.getPackets().sendIComponentSettings(new IComponentSetings(" + interfaceId + ", " + componentId + ", " + fromSlot + ", " + toSlot + ")";
		String useFlags = "";
		for (int i = 0;i < UseFlag.values().length;i++) {
			useFlags += useOptionEnabled(UseFlag.values()[i]) ? "UseFlag." + UseFlag.values()[i].name() + "," : "";
		}
		
		if (!useFlags.equals("")) {
			s += ".enableUseOptions(" + useFlags.substring(0, useFlags.length()-1) + ")";
		}
		String rightClicks = "";
		for (int i = 0;i <= 9;i++) {
			rightClicks += clickOptionEnabled(i) ? "" + i + "," : "";
		}
		if (!rightClicks.equals("")) {
			s += ".enableRightClickOptions(" + rightClicks.substring(0, rightClicks.length()-1) + ")";
		}
		String depths = "";
		for (int i = 0;i <= 7;i++) {
			depths += depthEnabled(i) ? "" + i + "," : "";
		}
		if (!depths.equals("")) {
			s += ".enableDepths(" + depths.substring(0, depths.length()-1) + ")";
		}
		if (continueOptionEnabled()) {
			s += ".enableContinueButton()";
		}
		if (dragEnabled()) {
			s += ".enableDrag()";
		}
		if (bit23Enabled()) {
			s += ".bit23Enabled()";
		}
		if (bit22Enabled()) {
			s += ".bit22Enabled()";
		}
		s += ") //" + settings;
		return s;
	}
}
