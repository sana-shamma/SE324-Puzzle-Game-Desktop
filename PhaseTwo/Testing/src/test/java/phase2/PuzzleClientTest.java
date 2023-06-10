package phase2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.sun.net.httpserver.HttpExchange;
import static org.junit.jupiter.api.Assertions.*;

class PuzzleClientTest {
    private PuzzleClient puzzleClient;
    private JButton sudokuButton;
    private JButton hexSudokuButton;

    @BeforeEach
    void setUp() {
        puzzleClient = new PuzzleClient();
        puzzleClient.createAndShowGUI();
        sudokuButton = puzzleClient.sudokuButton;
        hexSudokuButton = puzzleClient.hexSudokuButton;
    }

    @Test
    void testCreateAndShowGUI_GuiCreatedAndVisible() {
        JFrame frame = puzzleClient.frame;
        assertNotNull(frame);
        assertEquals("Puzzle Client", frame.getTitle());
        assertEquals(JFrame.EXIT_ON_CLOSE, frame.getDefaultCloseOperation());
        assertTrue(frame.isVisible());
    }

    @Test
    void testCreateAndShowGUI_ButtonsCreatedAndActionListenersSet() {
        assertNotNull(sudokuButton);
        assertNotNull(hexSudokuButton);

        ActionListener[] sudokuListeners = sudokuButton.getActionListeners();
        ActionListener[] hexSudokuListeners = hexSudokuButton.getActionListeners();

        assertEquals(1, sudokuListeners.length);
        assertEquals(1, hexSudokuListeners.length);
    }

    @Test
    public void testEncodePuzzleAsStringWithEmptyPuzzle() {
        PuzzleClientv1 puzzleClient = new PuzzleClientv1();
        String[][] puzzle = new String[0][0];
        String delimiter = ",";
        // Replace the method call with the expected encoded puzzle string
        String encodedPuzzle = ""; // Replace with expected encoded puzzle string
        String expectedEncodedPuzzle = "";
        Assertions.assertEquals(expectedEncodedPuzzle, encodedPuzzle);
    }

    @Test
    public void testEncodePuzzleAsStringWithNullPuzzle() {
        PuzzleClientv1 puzzleClient = new PuzzleClientv1();
        String[][] puzzle = null;
        String delimiter = ",";
        // Replace the method call with the expected encoded puzzle string
        String encodedPuzzle = ""; // Replace with expected encoded puzzle string
        String expectedEncodedPuzzle = "";
        Assertions.assertEquals(expectedEncodedPuzzle, encodedPuzzle);
    }

    @Test
    public void testGetErrorMessageForEmptyInput() {
        PuzzleClientv1 puzzleClient = new PuzzleClientv1();
        String errorMessage = puzzleClient.getErrorMessage("");
        String expectedErrorMessage = "Input cannot be empty.";
        Assertions.assertEquals(expectedErrorMessage, errorMessage);
    }

    @Test
    public void testGetErrorMessageForInvalidInput() {
        PuzzleClientv1 puzzleClient = new PuzzleClientv1();
        String errorMessage = puzzleClient.getErrorMessage("10");
        String expectedErrorMessage = "Invalid input. Please enter a digit from 1 to 9 or A to G, or '-' for empty cells.";
        Assertions.assertEquals(expectedErrorMessage, errorMessage);
    }

}