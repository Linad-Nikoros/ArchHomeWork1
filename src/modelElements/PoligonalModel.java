package modelElements;
import java.util.ArrayList;
import java.util.List;
import Else.Poligon;
import Else.Texture;

public class PoligonalModel {
    public List<Poligon> poligons;
    public List<Texture> textures;
    
    public PoligonalModel(List<Texture> textures) {
        this.poligons = new ArrayList<>();
        this.textures = textures;

    }
}