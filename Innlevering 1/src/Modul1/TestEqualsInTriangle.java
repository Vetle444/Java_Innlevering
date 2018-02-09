package Modul1;

public class TestEqualsInTriangle {
    public static void main(String[] args) {
        TriangleExtra t1 = new TriangleExtra(1);
        TriangleExtra t2 = new TriangleExtra(2);
        TriangleExtra t3 = new TriangleExtra(1);

        // == Sjekker om det er samme referanse
        System.out.println("t1 == t1 gir " + (t1 == t1)); // Siden begge har samme referanse blir det true
        System.out.println("t1 == t2 gir " + (t1 == t2)); // t1 og t2 har ulik referanse og dermed blir det false
        System.out.println("t1 == t3 gir " + (t1 == t3)); // t1 og t3 har ulik refernase og dermed blir det false her også

        // Equals metoden sjekker om sidene er like lange
        System.out.println("t1.equals(t1) gir " + t1.equals(t1)); // T1 har selvfølgelig samme lengde som t1 siden de begger er helt lik, så det blir true
        System.out.println("t1.equals(t2) gir " + t1.equals(t2)); // T1 har 'sidevalue' lik 1 og t2 har 'sidevalue' lik 2 og dermed blir det false
        System.out.println("t1.equals(t3) gir " + t1.equals(t3)); // T1 og t3 har lik 'sidevalues' og dermed blir det true
    }
}
