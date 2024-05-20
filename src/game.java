public class game {

    private gpanel gpan;
    private window gwind;

    public  game() {
        gpan = new gpanel();
        gwind = new window(gpan);
    }
}
