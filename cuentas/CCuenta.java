package cuentas;
/** cuenta bancaria que permite realizar
 * ingresos,
 * retiradas y
 * consulta del saldo
 */
public class CCuenta {
    /** Nombre del titular */
    private String nombre;
    /** Número de cuenta bancaria */
    private String cuenta;
    /** Saldo actual */
    private double saldo;
    /** Tipo de interés */
    private double tipoInterés;

    /**
     * Obtiene el nombre del titular
     * @return nombre del titular
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Modifica el nombre del titular
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Obtiene el número de cuenta
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Modifica el número de cuenta
     * @param cuenta nuevo número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Obtiene el saldo actual
     * @return saldo disponible
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Modifica el saldo
     * @param saldo nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Obtiene el tipo de interés
     * @return tipo de interés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }
    /**
     * Modifica el tipo de interés
     * @param tipoInterés nuevo tipo de interés
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    /**
     * constructor vacío
     */
    public CCuenta()
    {
    }
    /**
     * constructor con parámetros
     *
     * @param nom Nombre del titular
     * @param cue Número de cuenta
     * @param sal Saldo inicial
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * devuelve el total del saldo
     * @return saldo disponible
     */
    public double estado(){
        return saldo;
    }

    /** ingresa una cantidad
     *
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /** reitra una cantidad
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa o no hay saldo suficiente
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
