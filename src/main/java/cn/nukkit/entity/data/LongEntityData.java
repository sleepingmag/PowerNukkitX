package cn.nukkit.entity.data;

import cn.nukkit.entity.Entity;

/**
 * @author MagicDroidX (Nukkit Project)
 */
public class LongEntityData extends EntityData<Long> {
    public long data;

    public LongEntityData(int id, long data) {
        super(id);
        this.data = data;
    }

    @Override
    public Long getData() {
        return data;
    }

    @Override
    public void setData(Long data) {
        this.data = data;
    }

    @Override
    public int getType() {
        return EntityData.DATA_TYPE_LONG;
    }

    @Override
    public String toString() {
        return data + "l";
    }
}
