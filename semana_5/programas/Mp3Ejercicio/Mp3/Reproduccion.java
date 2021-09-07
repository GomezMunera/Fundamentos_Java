
package reproducir;


public class Reproduccion implements Mp3Player{
    boolean isPlay = false;
    int song = 0;
    
    @Override
    public void play(){
      isPlay = true;
      song = 1;
    }
    @Override
    public void pause(){
        isPlay = false;
        song = 1;
    }
    @Override
    public void stop(){
        isPlay = false;
        song = 0;
    }
    @Override
    public boolean isPlaying(){
        return isPlay;        
    }
}
