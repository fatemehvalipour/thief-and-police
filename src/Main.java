import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int m = scan.nextInt();//tool
        int n = scan.nextInt();//arz
        Ground ground = new Ground(m,n);
        int numOfPolice = scan.nextInt();
        int firstXThief = rand.nextInt(m);
        int firstYThief = rand.nextInt(n);
        Thief thief = new Thief(firstXThief,firstYThief);
        ground.setPlace(firstXThief,firstYThief,"D");
        for(int i = 0 ;i < numOfPolice ;i++){
            int xP = rand.nextInt(m);
            int yP = rand.nextInt(n);
            if(ground.getGround()[xP][yP].equals("-")){
                Police police = new Police(xP,yP);
                ground.setPlace(xP,yP,"P");
            }else {
                i--;
                continue;
            }
        }
        ground.print();
        
    }
}
