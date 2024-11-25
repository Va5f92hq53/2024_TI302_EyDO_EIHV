package tema2.estructuraLineal;

public class SlotsGame {

    public static void main(String[] args) {
        CirculartyLinkendList cll1 = new CirculartyLinkendList();
        CirculartyLinkendList cll2 = new CirculartyLinkendList();

        cll1.addFirst("1");
        cll1.addFirst("2");
        
        cll2.addFirst("1");
        cll2.addFirst("2");

        int nRotaciones = (int) (Math.random() * 10 + 1);
        for (int i = 0; i < nRotaciones; i++) {
            cll1.rotate();
        }
        for (int i = 0; i < nRotaciones; i++) {
            cll2.rotate();
        }
        
          
        System.out.println(cll1.first());
        System.out.println(cll2.first());
    }
}
