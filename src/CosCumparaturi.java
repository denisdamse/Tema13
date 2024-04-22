import java.util.LinkedList;

public class CosCumparaturi {
    public static LinkedList<Produs> produseDinCos=new LinkedList<Produs>();
    public static void adaugaProdus(Produs p)
    {
        produseDinCos.add(p);
    }
    public int calculeazaTotal()
    {
        int pretTotal=0;
        for(Produs p:produseDinCos)
        {
            pretTotal=pretTotal+p.getPret();
        }
        return pretTotal;
    }
    public static void testCosCumparaturi()
    {
        Produs produs1 = new Produs("Rosii", 5);
        Produs produs2 = new Produs("Castraveti", 6);
        CosCumparaturi cos = new CosCumparaturi();
        CosCumparaturi.adaugaProdus(produs1);
        CosCumparaturi.adaugaProdus(produs2);
        System.out.println(cos.calculeazaTotal());
    }
    public static void main(String[] args) {
        CosCumparaturi.testCosCumparaturi();
    }
}
