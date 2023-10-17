import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Observable{
    
    private List<Observer> channelSubscribers = new ArrayList<>();


    public void attach(Observer o){
        channelSubscribers.add(o);
    }

    public void detach(Observer o){
        channelSubscribers.remove(o);
    }

    public void notifyObservers(){
        for(Observer o : channelSubscribers){
            o.updateSub();
        }
    }

}
