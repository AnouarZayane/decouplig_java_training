package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;


public class Simulation {

        private final Logger logger = LoggerFactory.getLogger("simulation");
        private final Player player;  //TODO add variable type
        private long numberToGuess; //TODO add variable type


        public Simulation(Player player) {
            this.player = player;
        }

        public void initialize(long numberToGuess) {
            this.numberToGuess = numberToGuess;

        }

        /**
         * @return true if the player have guessed the right number
         */
        private boolean nextRound() {

            long newnumber = player.askNextGuess();
            if (newnumber == numberToGuess) {
                logger.log("Number has been found.");
                return true;
            } else {
                if (newnumber < numberToGuess) {
                    player.respond(false);
                } else {
                    player.respond(true);
                }
                return false;
            }
        }
            public void loopUntilPlayerSucceed(long maxiteration)
            {
                logger.log(("Début de la partie"));
                long debut = System.currentTimeMillis();
                int i=0;
                boolean test = nextRound();
                while (!test)
                {
                    test = nextRound();
                    i++;
                }
                if (test && i<maxiteration)
                {
                    logger.log("Fini avant le maximum d'itérations : "+i);
                }
                else
                {
                    logger.log(("Fini après le maximum d'itérations" + i));
                }
                long fin = System.currentTimeMillis();
                Timestamp timestamp=new Timestamp(fin-debut);
                logger.log("Temps : "+new SimpleDateFormat("mm:ss.SSS").format(timestamp));

            }


    }


