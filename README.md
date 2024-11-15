# MP3 Player

MP3 Player is a simple application built using Java and JavaFX, designed to play MP3 files and display metadata. It leverages the JavaFX platform for building the graphical user interface (GUI) and the JID3Lib library to extract MP3 metadata.

![MP3 Player Preview](preview.jpg)

## Features
- Play MP3 files
- View MP3 metadata (e.g., song title, artist, album)
- Build with Java 21 and JavaFX 21 for a modern desktop experience

## Prerequisites
- Java 21 or higher
- Apache Maven

## Dependencies
This project uses the following dependencies:

- **JavaFX**:
  - `javafx-graphics` (for rendering the UI)
  - `javafx-controls` (for UI controls like buttons, labels, etc.)
  - `javafx-fxml` (for FXML-based UI design)
  - `javafx-media` (for media playback)

- **JID3Lib**: A library to extract metadata from MP3 files (such as song title, artist, and album).

## Setup

1. Clone this repository to your local machine.
2. Ensure you have Java 21 or higher installed. If you don't, you can download and install it from the official [Oracle website](https://www.oracle.com/java/technologies/javase-jdk21-downloads.html).
3. Install Maven if you haven't already. You can download it from the [Apache Maven website](https://maven.apache.org/download.cgi).

4. Build the project with Maven:

    ```bash
    mvn clean install
    ```

5. Run the application:

    ```bash
    mvn javafx:run
    ```
