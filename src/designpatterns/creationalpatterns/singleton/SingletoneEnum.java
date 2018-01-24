package designpatterns.creationalpatterns.singleton;

/**
 * <p>
 *     As of JDK 1.5, you can create a singleton class using enums.
 *     The Enum constants are implicitly static and final and you
 *     cannot change their values once created.
 * </p>
 */
public class SingletoneEnum {
    public enum SingleEnum{
        SINGLETON_ENUM;
    }
}
