package repeatedword;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;

public class RepeatedWordTest {
    @Test
    public void testInstantiate() {
        RepeatedWord repeatedWord = new RepeatedWord();
    }

    RepeatedWord repeatedWord;
    String filepath1;
    String filepath2;
    String filepath3;

    @Before
    public void setUp() {
        repeatedWord = new RepeatedWord();
        filepath1 = "/books/testbook1.txt";
        filepath2 = "/books/testbook2.txt";
        filepath3 = "/books/testbook3.txt";
    }

    // test bad file path
    @Test (expected = FileNotFoundException.class)
    public void testBadFilePath() throws FileNotFoundException {
        repeatedWord.findFirstRepeat("/asdf.blah");
    }

    // happy path with correct file
    @Test
    public void happyPath() throws FileNotFoundException {
        assertEquals("a", repeatedWord.findFirstRepeat("books/testbook1.txt"));
    }

    // test lowercase/uppercase with multiple repeats
    @Test
    public void lcUcMultipleRepeats() throws FileNotFoundException {
        assertEquals("it", repeatedWord.findFirstRepeat("books/testbook2.txt"));
    }

    // test punctuation and very imminent repeat
    @Test
    public void puncImminentRepeat() throws FileNotFoundException {
        assertEquals("summer", repeatedWord.findFirstRepeat("books/testbook3.txt"));
    }
}
