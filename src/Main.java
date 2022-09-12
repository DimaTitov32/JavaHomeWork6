import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        boolean[] ans = new boolean[5];
        ParkingSystem PS = new ParkingSystem(1, 1, 0);

        for (int i = 0; i < ans.length; i++) {
            ans[i] = PS.addCar(i);
        }
        System.out.println(Arrays.toString(ans));
    }


}