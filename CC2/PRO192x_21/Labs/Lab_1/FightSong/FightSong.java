

public class FightSong {
    public static void song() {
        String intro = "Go, team, go!\nYou can do it.\n";
        String mid = "You're the best,\nIn the West.\n";
        String chorus = intro + mid + intro;

        System.out.println(intro + "\n" + chorus + "\n" + chorus + "\n" + intro);
    }

    public static void main(String[] args) {
        song();    
    }
}
