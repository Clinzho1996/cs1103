import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.json.JSONObject;

public class WeatherController {

    @FXML
    private TextField locationField;

    @FXML
    private Label temperatureLabel;

    @FXML
    private Label humidityLabel;

    @FXML
    private Label windSpeedLabel;

    @FXML
    private Button getWeatherButton;

    @FXML
    public void initialize() {
        getWeatherButton.setOnAction(event -> {
            String location = locationField.getText();
            JSONObject weatherData = WeatherService.getWeatherData(location);

            if (weatherData != null) {
                double temperature = weatherData.getJSONObject("main").getDouble("temp");
                int humidity = weatherData.getJSONObject("main").getInt("humidity");
                double windSpeed = weatherData.getJSONObject("wind").getDouble("speed");

                temperatureLabel.setText(String.format("Temperature: %.2f°C", temperature));
                humidityLabel.setText(String.format("Humidity: %d%%", humidity));
                windSpeedLabel.setText(String.format("Wind Speed: %.2f m/s", windSpeed));
            } else {
                temperatureLabel.setText("Error retrieving data");
                humidityLabel.setText("");
                windSpeedLabel.setText("");
            }
        });
    }
}
