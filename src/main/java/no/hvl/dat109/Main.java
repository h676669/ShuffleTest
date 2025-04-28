package no.hvl.dat109;

import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


    }

    private static void swap(List<String> list, int currentLocation, int newLocation) {
        String temp = list.get(currentLocation);
        list.set(currentLocation, list.get(newLocation));
        list.set(newLocation, temp);
    }

    private static void shuffle(List<String> list) {
        Random random = new Random();
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = random.nextInt(list.size());
            swap(list, i, randomIndex);
        }
    }
    private static void shuffleNext() {

    }
}