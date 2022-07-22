package ch4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player=new Player();
		player.play(1);
		
		AdvancedLevel aLevel=new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		SuperLevel sLevel=new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);
		
		
	}

}
