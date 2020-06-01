import java.util.HashMap;
import java.util.Set;
public class HashMapSong {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Stronger", "I don't do this for the riches, I'm infected, my condition is I'm always in my head, These words are my religion, I'm obsessive by decision, I'ma do this 'til I'm dead-ead");
        trackList.put("Unstoppable", "We can be heroes everywhere we go, We can have all that we ever want, Swinging like Ali, knocking out bodies, Standing on top like a champion, Keep your silver, give me that gold, You'll remember when I say, We can be heroes everywhere we go, Keeping us down is impossible, 'Cause we're unstoppable");
        trackList.put("Legend", "Won't stop till we're legend");
        trackList.put("Born For This", "I know I was born for this");

        String songLyrics = trackList.get("Unstoppable");
        System.out.println(songLyrics);

        Set<String> tracks = trackList.keySet();
        for(String track : tracks) {
            System.out.println(track +" : "+ trackList.get(track));
        }

    }

}