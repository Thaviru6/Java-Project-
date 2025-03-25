// Vtuber Gacha Game

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class GachaSimulator {
    public static void main(String[] args) {
        // Gacha rate
        int fiveStarRate = 5;   
        int fourStarRate = 15; 
        int threeStarRate = 80; 

        // Vtuber characters
        Map<String, String[]> gachaPool = new HashMap<>();
        gachaPool.put("5-star", new String[]{"Ironmouse"});
        gachaPool.put("4-star", new String[]{"Zentreya", "Shylilly"});
        gachaPool.put("3-star", new String[]{"ChaCha", "Vexoria", "Sinder", "Bao The whale", "Numi","Matara Kan" });

        // Simulate a pull
        String rarity = getRarity(fiveStarRate, fourStarRate, threeStarRate);
        String pulledCharacter = getRandomCharacter(gachaPool, rarity);

        // Display the result
        System.out.println("✨ You pulled: " + pulledCharacter + " (" + rarity + ") ✨");
    }

    // Rarity
    public static String getRarity(int fiveStar, int fourStar, int threeStar) {
        Random rand = new Random();
        int roll = rand.nextInt(100) + 1; // Generates a number from 1 to 100

        if (roll <= fiveStar) {
            return "5-star";
        } else if (roll <= fiveStar + fourStar) {
            return "4-star";
        } else {
            return "3-star";
        }
    }

    // Selection
    public static String getRandomCharacter(Map<String, String[]> gachaPool, String rarity) {
        Random rand = new Random();
        String[] characters = gachaPool.get(rarity);
        return characters[rand.nextInt(characters.length)];
    }
}
