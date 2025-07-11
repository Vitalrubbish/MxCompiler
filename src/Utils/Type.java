package Utils;

import java.util.HashMap;

public class Type {
    public String basicType;
    public int dimension;

    public Type(String basicType) {
        this.basicType = basicType;
        this.dimension = 0;
    }
    
    public Type(String basicType, int dimension) {
        this.basicType = basicType;
        this.dimension = dimension;
    }
}