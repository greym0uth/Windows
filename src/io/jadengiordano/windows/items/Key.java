package io.jadengiordano.windows.items;

import io.jadengiordano.windows.Door;
import io.jadengiordano.windows.Item;

/**
 * Created by Jaden on 12/5/2015.
 */
public class Key extends Item {

    public enum KeyType {
        GOLD
    }

    protected KeyType keyType;

    public Key(int id, KeyType keyType) {
        super(id);

        this.keyType = keyType;
    }

    public void use(Door door) {
        if (door.getKeyType().ordinal() == this.keyType.ordinal()) {
            door.unlock();
        }
    }

}