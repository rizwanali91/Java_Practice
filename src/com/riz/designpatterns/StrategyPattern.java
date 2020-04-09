package com.riz.designpatterns;

public class StrategyPattern {
	
	public static void main(String args[]) {
		
		JumpBehavior longJump= new LongJump();
		JumpBehavior shortJump= new ShortJump();
		KickBehavior tornadoKick= new TornadoKick();
//		KickBehavior lightningKick= new LightningKick();
		
		Fighter ryu= new Ryu(longJump, tornadoKick);
//		Fighter ken = new Ken(shortJump, lightningKick);
		
		ryu.display();
		ryu.kick();
		ryu.roll();
		ryu.jump();
		
		//Changing behavior at runtime
		ryu.setJumpBehavior(shortJump);
		ryu.jump();
	}

}

//Common behaviors roll and punch are implemented here and changing behaviors 
//are referred using kickbehavoir and jumpbehavior
abstract class Fighter {

	public KickBehavior kickBehavior;
	public JumpBehavior jumpBehavior;

	public Fighter(KickBehavior kickBehavior, JumpBehavior jumpBehavior) {
		this.kickBehavior = kickBehavior;
		this.jumpBehavior = jumpBehavior;
	}

	public void setKickBehavior(KickBehavior kickBehavior) {
		this.kickBehavior = kickBehavior;
	}

	public void setJumpBehavior(JumpBehavior jumpBehavior) {
		this.jumpBehavior = jumpBehavior;
	}

	public void punch() {
		System.out.println("Punch");
	}

	public void roll() {
		System.out.println("Roll");
	}

	public void kick() {
		kickBehavior.kick();
	}

	public void jump() {
		jumpBehavior.jump();
	}

	public abstract void display();
}

//Changing behavior reference
interface KickBehavior {
	public void kick();
}

//Changing behavior implementations
class TornadoKick implements KickBehavior {

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		System.out.println("Tornado Kick");
	}
}

class LightningKick implements KickBehavior {

	@Override
	public void kick() {
		// TODO Auto-generated method stub
		System.out.println("Lightning Kick");
	}
}

//Changing behavior reference
interface JumpBehavior{
	public void jump();
}

//Changing behavior implementation
class ShortJump implements JumpBehavior{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Short Jump");
	}
}

class LongJump implements JumpBehavior{

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Long Jump");
	}
}

//Characters
class Ryu extends Fighter{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Ryu!");
	}
	
	public Ryu(JumpBehavior jumpBehavior, KickBehavior kickBehavior) {
		super(kickBehavior,jumpBehavior);
	}
	
}

class Ken extends Fighter{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Fighter Ken!");
	}
	
	public Ken(JumpBehavior jumpBehavior, KickBehavior kickBehavior) {
		super(kickBehavior,jumpBehavior);
	}
	
}

