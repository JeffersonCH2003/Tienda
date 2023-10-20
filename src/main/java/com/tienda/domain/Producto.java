
package com.tienda.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data   //Esta clase va a tener datos
@Entity
@Table(name="producto")
public class Producto implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column( name ="id_producto")
    private Long idProducto;
    
    private String descripcion;
    private String rutaImagen;
    
    private Boolean activo;

    public Producto() {   
    }

    public Producto(String descripcion, Boolean activo) {
        this.descripcion = descripcion;
        this.activo = activo;
    }
    
   
}
