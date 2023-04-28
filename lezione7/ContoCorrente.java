package lezione7;

public class ContoCorrente {
    private String nome;
    private String cognome;
    private double saldo;

    public void ContoCorrente(String nome, String cognome) {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = 0;
    }


    public void preleva(double q) {
        if (saldo < 0) {
            System.out.println("Non si puo prelevare un numero negativo");
        } else if (q > saldo)
            System.out.println("Non hai un saldo suficiente");
        else
            saldo -= q;
    }

    public void deposita(double q) {
        if (saldo < 0) {
            System.out.println("Non si puo depositare un numero negativo");
        } else
            saldo += q;
    }
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public double getSaldo(){
        return saldo;

    }
}




