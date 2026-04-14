public class celsiusConverter {


    public static double convertToCelsius(double fahrenheit){
        return (fahrenheit-32)/1.8;
    }
    public static double convertToFahrenheit(double celsius){
        return (celsius*1.8)+32;
    }
}
