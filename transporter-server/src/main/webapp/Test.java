
package main.webapp;


import org.apache.log4j.Logger;



/**
 * <pre>
 *     Test some stuff
 * </pre>
 * <hr/>
 * 
 * @author W.S.
 * @version 0.0.1
 */
public class Test {

    private static final Logger LOGGER = Logger.getLogger(Test.class);


    public Test() {
        LOGGER.debug("Test DEBUG");
        LOGGER.info("Test INFO");
        LOGGER.warn("Test WARN");
    }

}
