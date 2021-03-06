package dereck.creational.abstractfactorypattern;

public class RocketEnemyShipFactory implements EnemyShipFactory {

	@Override
	public ESWeapon addESGun() {
		return new ESRocketGun();
	}

	@Override
	public ESEngine addESEngine() {
		return new ESRocketEngine();
	}

}
