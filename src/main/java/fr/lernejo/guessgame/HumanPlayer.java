package fr.lernejo.guessgame;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class HumanPlayer implements Player
{
    Logger l = LoggerFactory.getLogger("player");

    @Override
    public long askNextGuess() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLong();
    }
    @Override
    public void respond(boolean lowerOrGreater)
    {
        if (lowerOrGreater)
        {
            l.log("Lower");
        }
        else
        {
            l.log("Greater");
        }

    }

}
