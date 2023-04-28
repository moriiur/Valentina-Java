package lezione7;

public class main {
    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Mario" ,"Rossi");
        conto.deposita(500);
        System.out.println(conto.getSaldo());
        conto.preleva(100);
        System.out.println(conto.getSaldo());
    }
}
