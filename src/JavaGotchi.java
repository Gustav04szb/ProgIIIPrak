public class JavaGotchi {
    enum Zustand { HUNGER, VERHUNGERT, ESSEN, GLÜCKLICH }
    private static final int HUNGER_THRESHOLD = 15;
    private static final int VERHUNGERT_THRESHOLD = 30;
    private static final double ESSEN_CHANCE = 0.15;
    private static final int HUNGER_INCREMENT_MAX = 5;
    private static final int LOOP_DELAY_MS = 400;

    private Zustand zustand = Zustand.GLÜCKLICH;
    private int hunger = 0;
    private boolean spielLaeuft = true;

    private void aktuellerZustand(){
        switch (zustand) {
            case HUNGER:
                System.out.println(":/ ... hunger");
                if (Math.random()<ESSEN_CHANCE)
                    zustand = Zustand.ESSEN;
                break;
            case VERHUNGERT:
                System.out.println("x(");
                spielLaeuft = false;
                break;
            case ESSEN:
                System.out.println(":# ... essen");
                hunger = 0;
                zustand = Zustand.GLÜCKLICH;
                break;
            case GLÜCKLICH:
                System.out.println(":)");
        }
    }
    private void aktualisiereZustand() {
        if (zustand == Zustand.HUNGER && Math.random() < ESSEN_CHANCE) {
            zustand = Zustand.ESSEN;
            hunger = 0; // Hunger zurücksetzen, wenn etwas Essbares gefunden wird
        }
    }
    private void steigereHunger() {
        if (zustand != Zustand.ESSEN) {
            hunger += (int) (Math.random() * HUNGER_INCREMENT_MAX);
            if (hunger > VERHUNGERT_THRESHOLD) {
                zustand = Zustand.VERHUNGERT;
            } else if (hunger > HUNGER_THRESHOLD) {
                zustand = Zustand.HUNGER;
            }
        }
    }
    private static void warten(){
        try {
            Thread.sleep(LOOP_DELAY_MS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void Einschalten(){
        while(spielLaeuft){
            aktuellerZustand();
            aktualisiereZustand();
            steigereHunger();
            warten();
        }
    }
}


