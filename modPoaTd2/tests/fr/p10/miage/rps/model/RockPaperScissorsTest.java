package fr.p10.miage.rps.model;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.*;
import sun.awt.SunHints;

import static fr.p10.miage.rps.model.RPSEnum.valueOf;
import static org.testng.Assert.*;

/**
 * Created by keagesil on 27/09/2016.
 */
public class RockPaperScissorsTest {

    RockPaperScissors rps;

    @BeforeClass
    public void setUp() throws Exception {
        rps = new RockPaperScissors();
    }

    @AfterClass
    public void tearDown() throws Exception {
        rps = null;
    }

    @Test
    @Parameters({"paper","paper"})
    public void testTiePlay(String p1, String p2)
    {
        rps.play(valueOf(p1), valueOf(p2));
        assertEquals(rps.play(valueOf(p1), valueOf(p2)), Result.TIE);
    }

    @Test
    @Parameters({"paper","rock"})
    public void testWinPlay(RPSEnum p1, RPSEnum p2)
    {
        rps.play(p1, p2);
        assertEquals(rps.play(p1,p2),Result.WIN);
    }

    @Test
    @Parameters({"paper","rock"})
    public void testWinPlay(String p1, String p2)
    {
        rps.play(valueOf(p1), valueOf(p2));
        assertEquals(rps.play(valueOf(p1),valueOf(p2)),Result.WIN);
    }
}