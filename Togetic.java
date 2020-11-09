import ru.ifmo.se.pokemon.*;
public class Togetic extends Togepi
{
	public Togetic(String name, int lvl) {
		super(name, lvl);
		setStats(55, 40, 85, 80, 105, 40);
		setType(Type.FAIRY, Type.FLYING);
		setMove(new FireBlast(), new ShadowBall(), new Charm());
	}
}
class Charm extends StatusMove {
	public Charm() {
		super(Type.FAIRY, 0, 1.0);
	}
	@Override
	protected void applyOppEffects(Pokemon p){
		p.setMod(Stat.ATTACK, -2);
	}
}