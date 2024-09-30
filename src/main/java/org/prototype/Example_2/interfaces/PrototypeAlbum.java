package org.prototype.Example_2.interfaces;

public interface PrototypeAlbum extends Cloneable{
    PrototypeAlbum shallowClone();
    PrototypeAlbum deepClone();
}
