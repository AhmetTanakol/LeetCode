package groupanagrams;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class GroupAnagramsTest {

    private GroupAnagrams groupAnagrams;

    @Before
    public void setup() {
        groupAnagrams = new GroupAnagrams();
    }

    @Test
    public void groupAnagrams_1() {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> anagrams = groupAnagrams.groupAnagrams(strings);
        assertNotNull(anagrams);
    }

    @Test
    public void groupAnagrams_2() {
        String[] strings = {"duh", "ill"};
        List<List<String>> anagrams = groupAnagrams.groupAnagrams(strings);
        assertNotNull(anagrams);
    }

}
