public class App{
    public static void main(String[] args) throws Exception {
        Player p1=new Player("fabio");
        Player p2=new Player("giuseppe");
        System.out.println(p1.getPlayer()+" ha iniziato a giocare");
        System.out.println(p2.getPlayer()+" ha iniziato a giocare");
        p1.setPriority(10);
        p1.start();
        p2.start();

        p1.join();
        p2.join();
        System.out.println("partita finita");
        
        
    }
}
