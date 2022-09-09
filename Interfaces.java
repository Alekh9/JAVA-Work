public class Interfaces {
	public static void main(String[] args) {
		Queen q = new Queen();
		q.moves();
		Rook r = new Rook();
		r.moves();
	}
}
// It is blueprint of Class and Class are blueprint of objects.

interface ChessPlayer {
	void moves();
}
class Queen implements ChessPlayer {
	@Override
	public void moves() {
		System.out.println("UP, DOWN, LEFT, RIGHT, Digonally (In all Directions)");
	}
}
class Rook implements ChessPlayer {
	@Override
	public void moves() {
		System.out.println("UP, DOWN, LEFT, RIGHT");
	}
}