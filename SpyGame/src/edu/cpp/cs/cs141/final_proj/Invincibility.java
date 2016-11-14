package edu.cpp.cs.cs141.final_proj;

public class Invincibility extends Item{
	
	public Invincibility() {
		setObjectType("I");
	}

	/**
	 * Set the spy invincibility
	 */
	public void toSpy(Spy player) {
		player.hasInvincibility();
	}
}
