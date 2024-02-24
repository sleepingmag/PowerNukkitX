package cn.nukkit.entity.data;

/**
 * @author MagicDroidX (Nukkit Project)
 */
public class IntEntityData extends EntityData<Integer> {
    public int data;

    public IntEntityData(int id, int data) {
        super(id);
        this.data = data;
    }

    @Override
    public Integer getData() {
        return data;
    }

    @Override
    public void setData(Integer data) {
        if (data == null) {
            this.data = 0;
        } else {
            this.data = data;
        }
    }

    @Override
    public int getType() {
        return EntityData.DATA_TYPE_INT;
    }

    @Override
    public String toString() {
        return data + "i";
    }
}
