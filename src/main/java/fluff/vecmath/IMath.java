package fluff.vecmath;

/**
 * A generic interface representing a mathematical object.
 *
 * @param <V> the type of the implementing class extending IMath
 */
public interface IMath<V extends IMath<V>> {
    
    /**
     * Creates a copy of this mathematical object.
     * 
     * @return a new instance that is a copy of this object
     */
    V copy();
}
