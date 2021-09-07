
import java.util.ArrayList;


public class MockMp3Player implements Mp3Player{
    
    // State of the player
    private boolean isPlaying = false;
    // Position within the current song
    private double currentPos = 0.0;
    // List of song names
    private ArrayList songList = new ArrayList();
    // Index of current song
    private int currentIndex;
    @Override
    public void play() {
        if (songList.size() > 0) {
            isPlaying = true;
            // While playing, we’re always 1 second
            // into the song. For a more realistic mock,
            // you could implement a timer in a thread
            // that would advance the position and switch
            // to the next song when needed.
            currentPos = 1.0;
        } else {
            isPlaying = false;
            currentPos = 0.0;
        }
    }
    @Override
    public void pause() {
        isPlaying = false;
    }
    @Override
    public void stop() {
        isPlaying = false;
        // Rewind to beginning of current song
        currentPos = 0.0;
    }
    @Override
    public double currentPosition() {
        return currentPos;
    }
    @Override
    public String currentSong() {
        if (songList.size() == 0) {
            return null;
        } 
        return (String)songList.get(currentIndex);
    }
    
    @Override
    public void next() {
        if (currentIndex < songList.size()-1) {
            currentIndex++;
        }
        currentPos = 0.0;
    }
    @Override
    public void prev() {
    if (currentIndex > 0) {
        currentIndex--;
    }
        currentPos = 0.0;
    }
    @Override
    public boolean isPlaying() {
        return isPlaying;
    }
    
    @Override
    public void loadSongs(ArrayList names) {
        songList = names;
    } 
}
