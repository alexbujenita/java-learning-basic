package javaCollections;

public class Main {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Massimo", 8, 12);
        theatre.getSeats();
        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat already taken");
        }

        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Seat already taken");
        }
    }
}