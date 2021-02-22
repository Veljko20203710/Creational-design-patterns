/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns.singleton;

/**
 *
 * @author Veljko
 */
public class MultipleInstancesException extends RuntimeException {

    /**
     * Creates a new instance of <code>MultipleInstances</code> without detail
     * message.
     */
    public MultipleInstancesException() {
        super();
    }

    /**
     * Constructs an instance of <code>MultipleInstances</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public MultipleInstancesException(String msg) {
        super(msg);
    }
}
