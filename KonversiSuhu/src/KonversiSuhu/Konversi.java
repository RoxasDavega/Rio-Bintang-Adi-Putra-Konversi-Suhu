/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonversiSuhu;

/**
 *
 * @author user
 */
class Konversi {
    public double celcius, reamur, kelvin,fahrenheit;
    
    public Konversi(double Celcius){
        this.celcius = Celcius;
    }
    public void inputCelcius(double Celcius){
        this.celcius = Celcius; 
    }
    public double convertReamur(){
        this.reamur = (4*this.celcius)/5;
        return reamur;
    }
    public double convertKelvin(){
         this.kelvin = (double) (this.celcius+273.15); 
         return this.kelvin;
    }
    public double convertFahrenheit(){
        this.fahrenheit = ((9*this.celcius)/5)+32;
        return this.fahrenheit;
    }
    
    public String kondisiAir(){
        if(celcius<=0){
            return "Kondisi Air Beku.";
        }else if(celcius>=100){
            return "Kondisi Air Mendidih.";
        }else{
            return "Kondisi Air Normal.";
        }
    }

}