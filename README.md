# Puzzle Application 🧩

## Summary

This project is a puzzle game developed in Java. The application allows users to fetch, solve, and verify Sudoku and HexSudoku puzzles. It was developed as part of a software construction course to demonstrate various software engineering concepts and techniques, such as client & server-side architecture, abstraction, and parsing.

## Features

- **Puzzle Fetching**: Fetch Sudoku and HexSudoku puzzles from a server.
- **Interactive GUI**: Provide an intuitive interface for users to solve puzzles.
- **Input Validation**: Ensure user inputs are valid for the type of puzzle.
- **Solution Verification**: Compare user solutions with correct solutions stored in files.
- **Solution Display**: Show the correct solution upon request.

## Components

- **Main Frame**: The primary window of the application containing buttons to fetch puzzles and submit solutions.
- **Puzzle Panel**: A dynamically generated grid for displaying and interacting with puzzles.
- **Solution Frame**: A separate window to display the correct solution of the puzzle.

## How It Works

1. **Fetch Puzzle**: Upon clicking the "Sudoku" or "HexSudoku" button, the application sends a GET request to the server to fetch a new puzzle.
2. **Display Puzzle**: The fetched puzzle is displayed on a grid where users can fill in their solutions.
3. **Submit Solution**: Users can submit their solutions, which are then saved to a file.
4. **Verify Solution**: The application compares the user's solution file with the correct solution file and provides feedback.
5. **Show Solution**: Users can request to view the correct solution, which is displayed in a new window.

## How to Run

1. **Clone the Repository**: 
    ```sh
    git clone https://github.com/yourusername/puzzle-client.git
    ```
2. **Open the Project** in your preferred Java IDE.
3. **Run the Application**:
   1. navigate to the directory where your .java file is located using the cd command.
     ```sh
      cd Specification&Design&Implementation
      ```
   2. Run server
      ```sh
      java PuzzleServer
      ```
   3. Run Client
        ```sh
        java PuzzleClient
        ```

## Screenshots

![Screenshot 2024-06-24 223154](https://github.com/Samah022/hex-sudoku-game/assets/97039075/be8caaed-c91d-45f1-b340-73d1fc17d2a1)

![Screenshot 2024-06-24 223206](https://github.com/Samah022/hex-sudoku-game/assets/97039075/a25ef619-45ba-48ae-a7fe-740efbcfba93)

![Screenshot 2024-06-24 223220](https://github.com/Samah022/hex-sudoku-game/assets/97039075/426bfc22-8108-4640-b8e0-17f12335ad19)

![Screenshot 2024-06-24 223244](https://github.com/Samah022/hex-sudoku-game/assets/97039075/e594ea59-4ef5-4a09-a457-2a6b0f632e38)

## Contributors ✍️

- Fatima Aljalmoud
- leen khalil
- Rash Ashawe
- Reem Bayazid
- Salwa Shamma
- Samah Shamma
- Sana Shmama

Developed with ❤️ for the Software Construction Course. Enjoy solving puzzles! 🧩✨
