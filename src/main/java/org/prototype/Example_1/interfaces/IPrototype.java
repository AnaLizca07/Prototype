/**
 * This interface defines methods for creating clones of objects.
 *
 * @param <T> The type of the object that implements this interface.
 */
package org.prototype.Example_1.interfaces;

public interface IPrototype<T extends IPrototype<T>> extends Cloneable{

    /**
     * Creates a shallow copy of the object.
     *
     * @return A shallow copy of the object.
     * @throws CloneNotSupportedException If the object's class does not implement the Cloneable interface.
     */
    public T clone();
    
    /**
     * Creates a deep copy of the object.
     *
     * @return A deep copy of the object.
     * @throws CloneNotSupportedException If the object's class does not implement the Cloneable interface.
     */
    public T deepClone();
}
