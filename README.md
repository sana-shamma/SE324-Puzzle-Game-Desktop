
# Puzzle Application 🎮🏆

## Summary 🌐

This project is a puzzle game developed in Java. The application allows users to fetch, solve, and verify Sudoku and HexSudoku puzzles. It was developed as part of a software construction course to demonstrate various software engineering concepts and techniques, such as client & server-side architecture, abstraction, and parsing.

## Features ✨

- **Puzzle Fetching**: Fetch Sudoku and HexSudoku puzzles from a server.
- **Interactive GUI**: Provide an intuitive interface for users to solve puzzles.
- **Input Validation**: Ensure user inputs are valid for the type of puzzle.
- **Solution Verification**: Compare user solutions with correct solutions stored in files.
- **Solution Display**: Show the correct solution upon request.

## Components  📂

- **Main Frame**: The primary window of the application containing buttons to fetch puzzles and submit solutions.
- **Puzzle Panel**: A dynamically generated grid for displaying and interacting with puzzles.
- **Solution Frame**: A separate window to display the correct solution of the puzzle.

## How It Works ⚙️

1. **Fetch Puzzle**: Upon clicking the "Sudoku" or "HexSudoku" button, the application sends a GET request to the server to fetch a new puzzle.
2. **Display Puzzle**: The fetched puzzle is displayed on a grid where users can fill in their solutions.
3. **Submit Solution**: Users can submit their solutions, which are then saved to a file.
4. **Verify Solution**: The application compares the user's solution file with the correct solution file and provides feedback.
5. **Show Solution**: Users can request to view the correct solution, which is displayed in a new window.

## How to Run 📑

1. **Clone the Repository**: 
    ```
    git clone https://github.com/SalwaSh/SE324-Puzzle-Game-Phase2.git
    ```
2. **Open the Project** in your preferred Java IDE.
3. **Run the Application**:
   1. navigate to the directory where your .java file is located using the cd command.
     ```
      cd Specification&Design&Implementation
    ```
   2. Run server
   ```
      java PuzzleServer
   ```
   3. Run Client
    ```
        java PuzzleClient
    ```

## Screenshots 📷

![image](https://github.com/SalwaSh/SE324-Puzzle-Game-Phase2/assets/97047182/525b1ee0-ce78-4e04-b36f-b44e8390d334)

![image](https://github.com/SalwaSh/SE324-Puzzle-Game-Phase2/assets/97047182/ae6dd09e-1182-4023-b373-9be938561c0e)

![image](https://github.com/SalwaSh/SE324-Puzzle-Game-Phase2/assets/97047182/91c042cd-3777-4635-b821-7c4dfe1c4e15)

![image](https://github.com/SalwaSh/SE324-Puzzle-Game-Phase2/assets/97047182/01c45040-7862-442f-9766-39838a3eeda8)


## Contributors ✍️

- Fatima Aljalmoud
- leen khalil
- Rash Ashawe
- Reem Bayazid
- Salwa Shamma
- Samah Shamma
- Sana Shmama

Developed with ❤️ for the Software Construction Course. Enjoy solving puzzles! ✨🏆
