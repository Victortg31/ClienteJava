
package com.victor;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de StatusEnumXsd.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="StatusEnumXsd">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCESSO"/>
 *     &lt;enumeration value="FALHOU"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StatusEnumXsd")
@XmlEnum
public enum StatusEnumXsd {

    SUCESSO,
    FALHOU;

    public String value() {
        return name();
    }

    public static StatusEnumXsd fromValue(String v) {
        return valueOf(v);
    }

}
