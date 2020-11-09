import ru.ifmo.se.pokemon.*;
public class Main
{
	public static void main(String[] args) {
		Battle b = new Battle();
        b.addAlly(new Dunsparce("Artem1", 1));
        b.addAlly(new Tyrogue("Artem2", 1));
        b.addAlly(new Hitmonlee("Artem3", 1));
        b.addFoe(new Togepi("Artem4", 1));
        b.addFoe(new Togetic("Artem5", 1));
        b.addFoe(new Togekiss("Artem6", 1));
        b.go();
	}
}