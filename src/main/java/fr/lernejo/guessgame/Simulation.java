package fr.lernejo.guessgame;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;



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
            public void loopUntilPlayerSucceed()
            {
                //TODO implement me
                boolean test = nextRound();
                while (!test) {
                    test = nextRound();
                }
            }
        }


