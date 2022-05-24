package circulo;

/**
 * Pruebas de refactorización en NetBeans con la clase Circulito
 *
 * @author profesor
 */
public class Circulito {

    private int coordenadaX;
    private int coordenadaY;
    private double radio;
    private static final double LIMITERADIO = 0.0;

    public Circulito() {
    }

    /**
     * Constructor
     *
     * @param valorX the coordenadaX to set
     * @param valorY the coordenada Y
     * @param valorRadio the radio
     */
    public Circulito(int valorX, int valorY, double valorRadio) {
        coordenadaX = valorX;
        coordenadaY = valorY;
        setRadio(valorRadio);
    }

    /**
     * @return the radio * 2
     */
    public double obtenerDiametro() {
        return getRadio() * 2;
    }

    /**
     * @return the PI * diametro
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**
     * @return the PI * diametro * diametro
     */
    public double obtenerAreaCirculo() {
        return Math.PI * getRadio() * getRadio();
    }

    /**
     * Metodo que imprime por pantalla los valores de x, de y y del radio
     */
    @Override
    public String toString() {
        return "Centro = [" + getCoordenadaX() + "," + getCoordenadaY() + "]; Radio = " + getRadio();
    }

    /**
     * @param trasladarX the coordenadaX
     * @param trasladarY the coordenadaY
     */
    public void trasladarCentro(int trasladarX, int trasladarY) {
        setCoordenadaX(getCoordenadaX() + trasladarX);
        setCoordenadaY(getCoordenadaY() + trasladarY);
    }

    /**
     * @return the coordenadaX
     */
    public int getCoordenadaX() {
        return coordenadaX;
    }

    /**
     * @param coordenadaX the coordenadaX to set
     */
    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    /**
     * @return the coordenadaY
     */
    public int getCoordenadaY() {
        return coordenadaY;
    }

    /**
     * @param coordenadaY the coordenadaY to set
     */
    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = (radio < LIMITERADIO ? LIMITERADIO : radio);
    }
}
