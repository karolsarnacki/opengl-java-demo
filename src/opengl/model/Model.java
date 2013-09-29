package opengl.model;

public class Model {

    private Material[] materials;
    private Mesh[] meshes;
    private boolean block;
    private int displayList;

    public boolean animated = false;
    public float[] animationDelta;
    public float[] animation;

    public Material[] getMaterials() {
        return materials;
    }

    public void setMaterials(Material[] materials) {
        this.materials = materials;
    }

    public Mesh[] getMeshes() {
        return meshes;
    }

    public void setMeshes(Mesh[] meshes) {
        this.meshes = meshes;
    }

    public boolean isBlock() {
        return block;
    }

    public void setBlock(boolean block) {
        this.block = block;
    }

    public int getDisplayList() {
        return displayList;
    }

    public void setDisplayList(int displayList) {
        this.displayList = displayList;
    }

}
