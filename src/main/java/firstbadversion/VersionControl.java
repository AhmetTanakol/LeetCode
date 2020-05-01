package firstbadversion;

//Dummy class, original isBadVersion method functions differently
public class VersionControl {

    boolean isBadVersion(int version) {
        return version % 2 == 0;
    }
}
