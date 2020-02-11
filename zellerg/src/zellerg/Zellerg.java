//Authot: Sergio Iglesias Tejedor
package zellerg;

public class Zellerg {
    
    String[] arrayDias;

    public static void main(String[] args) {
        int d = zellerg(18, 7, 2000);
        System.out.println(d);
        //modifiquemos el programa para que se vea el dia de la semana en el que nacimos (Lunes, Martes...)
    }

    private static int zellerg(int Day, int Month, int Year) {
        int Zeller;
        Month = (Month + 10) % 12;
        Year = Year - 1 * ((Month > 10) ? 1 : 0);
        Zeller = (13 * Month - 1) / 5 + 1 + Year % 100 + (Year % 100) / 4 + (-2 * (Year / 100)) + (Year / 400) % 7;
        Zeller = ((Zeller + Day) % 7 + 6) % 7;
        return Zeller;
    }
    private void diasSemana() {
        arrayDias = new String[]
    }
}
