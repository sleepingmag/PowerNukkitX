package cn.nukkit.form.element;

public class ElementButtonImageData {
    public static final String IMAGE_DATA_TYPE_PATH = "path";
    public static final String IMAGE_DATA_TYPE_URL = "url";

    private String type;
    private String data;

    /**
     * @param type the image type {@link #IMAGE_DATA_TYPE_PATH} | {@link #IMAGE_DATA_TYPE_URL}
     * @param data the image data {@code textures/items/compass} | {@code url}
     */
    public ElementButtonImageData(String type, String data) {
        if (!type.equals(IMAGE_DATA_TYPE_URL) && !type.equals(IMAGE_DATA_TYPE_PATH)) return;
        this.type = type;
        this.data = data;
    }

    public String getType() {
        return type;
    }

    public String getData() {
        return data;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setData(String data) {
        this.data = data;
    }
}
