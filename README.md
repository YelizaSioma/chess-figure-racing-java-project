# Object-Oriented Programming - University Exam in JAVA

## Assignment Overview

In this assignment, you will implement a turn-based game with pieces of different types (Pawn, Bishop, Queen) for two teams (Red and Blue). The game involves the movement of pieces, where each piece has specific movement rules for each team. The game will allow pieces to wear special items, such as acceleration cloaks and jumping boots, which affect their movement.

### Key Concepts:
- **Turn-based movement**: Each piece moves forward a specific number of spaces on its turn.
- **Different teams**: Red and Blue teams have different movement rules for each type of piece.
- **Items affecting movement**: Pieces can wear acceleration cloaks or jumping boots to modify their movement.

## Game Details

### Team Movement Rules:
- **Red Team**:
  - **Pawn**: 1 space
  - **Rifleman**: 3 squares
  - **Queen**: 6 squares
- **Blue Team**:
  - **Pawn**: 1 space
  - **Bishop**: 4 squares
  - **Queen**: 5 squares

### Piece Movement Methods:
- **move()**: Moves the piece forward by a set number of squares based on its type.
- **getPosition()**: Returns the current position of the piece.
- **setPosition(int)**: Sets the position of the piece.

### Additional Features:
- **Items**:
  - **Acceleration Cloak**: Adds 3 extra spaces of movement per turn.
  - **Jumping Boots**: Doubles the number of spaces a piece can move per turn.

### Design Patterns:
- **Decorator Pattern**: Used for the Acceleration Cloak and Jumping Boots to add their effects to a piece.
- **Abstract Factory Pattern**: Used for creating different factories for the Red and Blue teams’ pieces.

## Class Design

### Figure Interface
All pieces implement the `Figure` interface with the following methods:
- `move()`
- `getPosition()`
- `setPosition(int)`

### Concrete Piece Classes
You will create separate classes for each combination of color and piece type (e.g., `RedPawn`, `BlueBishop`, `RedQueen`). These classes will differ only in the number of squares they move per turn.

### Items
- **Acceleration Cloak**: Implements the `Figure` interface and wraps the original figure to add 3 spaces of movement.
- **Jumping Boots**: Implements the `Figure` interface and wraps the original figure to double the movement spaces.

### Factories
- **Red Figure Factory**: Creates red pieces (`RedPawn`, `RedRifleman`, `RedQueen`).
- **Blue Figure Factory**: Creates blue pieces (`BluePawn`, `BlueBishop`, `BlueQueen`).

These factories will implement the `FigureFactory` interface and create pieces based on the team and type.

### Testable Implementation
The solution is designed to be testable using the `ExamFactory` class, with methods that return objects as described in the assignment specification. For testing, the `org.junit.jupiter` library (version 5.8.2) is used.
