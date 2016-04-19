/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemperatureConverter;

/**
 *
 * @author Jennifer
 */
public class TemperatureConverterService {
    /**
     * 
     * @param temperature- the temperature, in Fahrenheit, to be converted to Celsius
     * @return The temperature, converted to Celsius and in String format with 2 decimal places. 
     */
    public String convertFahrenheitToCelsius(String temperature) throws IllegalArgumentException{
        if (temperature == null || temperature.isEmpty()) {
            throw new IllegalArgumentException("SOrry");
        }
        double degrees = Double.parseDouble(temperature);
        
        double conversion =((degrees - 32)/1.8);
         String formatedTemp = String.format("%.2f", conversion);
       
        
        return formatedTemp;
        
    }
    /**
     * 
     * @param temperature the temperature, in Celsius, to be converted to Fahrenheit
     * @return The temperature, converted to Fahrenheit, and in String format with 2 decimal places.
     */
        public String convertCelsiustoFahrenheit(String temperature) throws IllegalArgumentException{
        if (temperature == null || temperature.isEmpty()) {
            throw new IllegalArgumentException();
        }
        
        double degrees = Double.parseDouble(temperature);
        
        double conversion =((degrees *1.8) + 32);
        
       String formatedTemp = String.format("%.2f", conversion);
        
        return formatedTemp;
        
    }
}
