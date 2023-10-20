
package com.tienda.service;

import com.tienda.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    public List<Producto> getProductos(boolean activo);
    // Se obtiene un Producto, a partir del id de un categoria
    public Producto getProducto(Producto categoria);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(Producto categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(Producto categoria);
}
