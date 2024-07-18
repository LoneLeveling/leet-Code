import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class robotCollide {

    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < healths.length; i++) {
            al.add(healths[i]);
        }
        StringBuilder sb = new StringBuilder(directions);
        // Check if all directions are the same
        boolean allSameDirections = true;
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) != sb.charAt(i + 1)) {
                allSameDirections = false;
                break;
            }  }

        if (allSameDirections) {
            return al; // Return initial healths if all directions are the same
        }
        List<Integer> finalHealth = new ArrayList<>();
        boolean collisionCheck=false;
        // Check for collisions and calculate surviving healths
        if(positions.length%2==0){
            for (int i = 0; i < positions.length - 1; i++) {
                if ((positions[i] < positions[i + 1] && sb.charAt(i) == 'R' && sb.charAt(i + 1) == 'L') ||
                        (positions[i] > positions[i + 1] && sb.charAt(i) == 'L' && sb.charAt(i + 1) == 'R')) {
                    collisionCheck=true;
                    // Collision detected between robot i and robot i+1
                    if (healths[i] == healths[i + 1]) {
                        // Both robots are removed, skip both robots
                        i++;
                    } else {
                        int survivingHealth = Math.max(healths[i], healths[i + 1]) - 1;
                        finalHealth.add(survivingHealth);
                        i++;
                    }
                }
                //finalHealth.add(healths[i]);  
            }
            if(!collisionCheck){
                return al;
            }
            return finalHealth;
        }
        else
        {
            for (int i = 0; i < positions.length - 1; i++) {
                if ((positions[i] < positions[i + 1] && sb.charAt(i) == 'R' && sb.charAt(i + 1) == 'L') ||
                        (positions[i] > positions[i + 1] && sb.charAt(i) == 'L' && sb.charAt(i + 1) == 'R')) {
                    if (healths[i] == healths[i + 1]) {
                        // Both robots are removed, skip both robots
                        i++;
                    }
                    else{
                        finalHealth.add(Math.max(healths[i], healths[i + 1]) - 1);
                    }

                }else  //no collision

                {

                    finalHealth.add(healths[i]);
                }
            }

        }
        return finalHealth;
    }
}