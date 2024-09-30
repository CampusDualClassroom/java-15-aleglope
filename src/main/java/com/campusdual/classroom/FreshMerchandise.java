package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * La clase {@code FreshMerchandise} representa mercancías frescas que
 * extienden de la clase abstracta {@link Merchandise}. Incluye información
 * específica como la fecha de caducidad.
 * <p>
 * Esta clase implementa el método abstracto {@code getSpecificData()} para
 * proporcionar detalles adicionales sobre la mercancía fresca.
 * </p>
 *
 * @author
 * @version 1.0
 */
public class FreshMerchandise extends Merchandise {

    /**
     * Fecha de caducidad de la mercancía fresca.
     */
    private Date expirationDate;

    /**
     * Constructor de la clase {@code FreshMerchandise} que inicializa todos los
     * atributos heredados de {@link Merchandise} además de la fecha de caducidad.
     *
     * @param name           Nombre de la mercancía.
     * @param uniqueId       Identificador único de la mercancía.
     * @param responsibleId  Identificador del responsable de la mercancía.
     * @param zone           Zona donde se almacena la mercancía.
     * @param area           Área específica dentro de la zona.
     * @param shelf          Estante donde se ubica la mercancía.
     * @param quantity       Cantidad disponible de la mercancía.
     * @param expirationDate Fecha de caducidad de la mercancía.
     */
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf,
                            int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    /**
     * Obtiene la fecha de caducidad de la mercancía fresca.
     *
     * @return Objeto {@code Date} que representa la fecha de caducidad.
     */
    public Date getExpirationDate() {
        return this.expirationDate;
    }

    /**
     * Formatea una fecha al patrón "dd-MM-yyyy".
     *
     * @param date Objeto {@code Date} que se desea formatear.
     * @return Cadena de texto con la fecha formateada.
     */
    public String getFormattedDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    /**
     * Implementación del método abstracto {@code getSpecificData()} de la clase
     * {@link Merchandise}. Proporciona información específica sobre la
     * mercancía fresca, incluyendo la localización y la fecha de caducidad.
     *
     * @return Objeto {@code String} con los datos específicos formateados.
     */
    @Override
    public Object getSpecificData() {
        StringBuilder builder = new StringBuilder();

        // Añade la localización de la mercancía
        builder.append("Localización: ");
        builder.append(getLocation());
        builder.append("\n");

        // Añade la fecha de caducidad formateada
        builder.append("Fecha de caducidad: ");
        builder.append(getFormattedDate(this.expirationDate));

        return builder.toString();
    }

    /**
     * Imprime por consola los datos específicos de la mercancía fresca
     * obtenidos mediante el método {@code getSpecificData()}.
     */
    public void printSpecificData() {
        System.out.println(getSpecificData());
    }
}
