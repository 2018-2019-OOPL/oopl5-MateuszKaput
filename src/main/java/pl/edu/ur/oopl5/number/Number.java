package pl.edu.ur.oopl5.number;

/**
 */
public class Number implements NumberInterfaces {
    int b;
    String number;
    public Number(String number) {
        this.number=number;
        b = Integer.parseInt(number);
    }
    public void setNumber(String number) {
        b = Integer.parseInt(number);
    }

    public int factorial() {
        int wynik =1;
        for(int i = 1; i<=b; i++){
            wynik=wynik*i;
        }
        return wynik;
    }

    public int multiply(int i) {
        return b*i;
    }

}
