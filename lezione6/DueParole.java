public class DueParole {
    public static void main(String[] args) {
        String s1= "Coccodrillo";
        String s2="Cocomero";
        stampaIncomune(s1, s2);
    }
private static void stampaIncomune(String s1, String s2){
    String inComune = "";
    for (int i = 0; i<s1.length(); i++){
        if (s2.contains(s1.substring(i, i+1)) &&
        !inComune.contains(s1.substring(i, i+1)))
        inComune += s1.substring(i, i+1);
    }
    System.out.println (inComune);
}
}
