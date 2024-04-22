public class Produs {
    public Produs(String nume, int pret)
    {
        this.nume=nume;
        this.pret=pret;
    }
    private int pret;
    private String nume;
    public int getPret()
    {
        return this.pret;
    }
    public String getNume()
    {
        return this.nume;
    }
}
