package inMemoryModel;
import java.util.ArrayList;
import java.util.List;
import modelElements.PoligonalModel;
import modelElements.Camera;
import modelElements.Scene;
import modelElements.Flash;

public class ModelStore implements iModelChanger {

    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private iModelChangedObserver[] changeObservers;
    
    public ModelStore(iModelChangedObserver[] changeObservers) {
        this.changeObservers = changeObservers;
        this.models = new ArrayList<PoligonalModel>();
        this.scenes = new ArrayList<Scene>();
        this.flashes = new ArrayList<Flash>();
        this.cameras = new ArrayList<Camera>();
    } 
    
    public Scene  getScena(int id) {
        return scenes.get(id);
    }

    @Override
    public void notifyChange(iModelChanger sender) {
        // 
    }
}