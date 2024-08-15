# Weather Application (CS 1103 Week 8 Programming Assignment)

This is a Java-based Weather Information App that provides real-time weather updates to users. The app utilizes JavaFX for the graphical user interface (GUI) and integrates with a weather API to fetch weather data.

## Features

- **Real-Time Weather Data:** Fetches and displays current weather information such as temperature, humidity, wind speed, and conditions.
- **User-Friendly GUI:** Designed using JavaFX with an input field for the user to specify the location.
- **Weather Icons:** Visual representation of weather conditions using icons.
- **Short-Term Forecast:** Displays a short-term weather forecast for the specified location.
- **Unit Conversion:** Allows switching between Celsius and Fahrenheit for temperature and different units for wind speed.
- **Error Handling:** Handles invalid location inputs and failed API requests gracefully.
- **Search History:** Tracks and displays a history of recent weather searches with timestamps.
- **Dynamic Backgrounds:** Changes the background based on the time of day.

## Setup and Installation

### Prerequisites

- **Java Development Kit (JDK) 8 or later** installed on your system.
- **JavaFX SDK** (included in JDK 11 and above).
- An IDE like Visual Studio Code (VSCode) or IntelliJ IDEA.
- Internet connection to fetch weather data via API.

### Folder Structure

Make sure your project folder has the following structure:

```
cs1103/
├── lib/
│   └── javafx-sdk/
│   └── json-20230227.jar
├── bin/
│   └── (compiled .class files and weather.fxml)
├── src/
│   ├── WeatherApp.java
│   ├── WeatherController.java
│   ├── WeatherService.java
│   └── weather.fxml
```

### Getting Started

1. **Clone the Repository:**

   If the project is hosted on a version control system like GitHub, clone it to your local machine:

   ```bash
   git clone https://github.com/your-username/weather-information-app.git
   cd weather-information-app
   ```

2. **Download Dependencies:**

   - Download the `json-20230227.jar` from the [Maven Repository](https://mvnrepository.com/artifact/org.json/json) and place it in the `lib` folder.
   - Ensure that JavaFX SDK is correctly referenced in the `lib` folder.

3. **Compile the Project:**

   Use the following command to compile the project:

   ```bash
   javac --module-path lib --add-modules javafx.controls,javafx.fxml -cp lib/json-20230227.jar -d bin src/*.java
   ```

4. **Run the Application:**

   Use the following command to run the application:

   ```bash
   java --module-path lib --add-modules javafx.controls,javafx.fxml -cp lib/json-20230227.jar:bin WeatherApp
   ```

## Usage

- **Location Input:** Enter the name of a city or geographical coordinates to get the weather information.
- **Temperature Unit Conversion:** Click the unit conversion button to switch between Celsius and Fahrenheit.
- **Search History:** Recent searches are displayed with timestamps for easy reference.

## Error Handling

The application handles the following scenarios:

- **Invalid Location:** If the location is not found, the application will display an error message.
- **Failed API Requests:** If there is an issue with the API request (e.g., no internet connection), an error message will be shown.

## Known Issues

- **Error Handling:** Some edge cases in location input might not be handled perfectly.
- **Limited Forecast:** The forecast feature is currently limited to a short-term forecast.

## Contributing

If you wish to contribute, please fork the repository and submit a pull request. Any improvements or bug fixes are welcome.

## License

This project is licensed under the MIT License. See the `LICENSE` file for more details.
