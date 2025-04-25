package proyectoprueba;
import java.util.Random;

public class Randnumber {
    public static void main (String[] args){
        Random random = new Random();
        int random_number = random.nextInt(1,10);
        System.out.println(random_number);
    }
}
