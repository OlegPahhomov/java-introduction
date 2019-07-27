package ee.taltech.itcolledge.planets;

public class Sun {

    public static final int DIFF_BETWEEN_KELVIN_AND_CELCIUS = 273;
    private Integer surfaceTemperatureKelvin;

    public void setSurfaceTemperatureKelvin(Integer surfaceTemperatureKelvin) {
        this.surfaceTemperatureKelvin = surfaceTemperatureKelvin;
    }

    public Integer getSurfaceTemperatureKelvin() {
        return surfaceTemperatureKelvin;
    }

    public Integer getSurfaceTemperatureCelcius() {
        return surfaceTemperatureKelvin - DIFF_BETWEEN_KELVIN_AND_CELCIUS;
    }
}
