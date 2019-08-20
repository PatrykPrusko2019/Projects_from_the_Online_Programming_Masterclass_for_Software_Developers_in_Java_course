package chapter_9.exercise_109;

import java.util.ArrayList;


//gear box -> skrzynia biegow
public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    //operateClutch -> obslugiwac sprzeglo
    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if((number > 0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if((newGear >= 0 ) && (newGear < this.gears.size()) && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind!"); //grind -> ucierac
            this.currentGear = 0;
        }
    }

    //wheelSpeed -> predkosc kola
    public double wheelSpeed(int revs) {
        if(clutchIsIn) {
            System.out.println("Scream!!!"); //scream -> krzyk
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio(); //current gear -> aktualny bieg
    }

    //class inside
     class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        public double getRatio() {
            return ratio;
        }

        //driveSpeed -> predkosc jazdy
        public double driveSpeed(int revs) {
            return revs *( this.ratio);
        } // revs -> obroty
    }
}
