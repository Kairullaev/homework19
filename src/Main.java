public class Main {
    public static void main(String[] args) {

     Planeta[]planeta=Planeta.values();
        for (Planeta p:planeta
             ) {
            System.out.println(p+"  : "+p.getInformation());

        }
        System.out.println();
        Planeta planeta1 = Planeta.EARTH;
        System.out.println(planeta1+"  : "+planeta1.getInformation());
    }
}