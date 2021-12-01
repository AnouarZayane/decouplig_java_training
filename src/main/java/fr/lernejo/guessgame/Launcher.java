package fr.lernejo.guessgame;
import java.security.SecureRandom;
public class Launcher
{

    public static void main(String[] args)
    {   Player player = new HumanPlayer();
        Simulation s = new Simulation(player);
        SecureRandom random = new SecureRandom();
        long Number = random.nextInt(100);
        s.initialize(Number);
        s.loopUntilPlayerSucceed();


    }
}
