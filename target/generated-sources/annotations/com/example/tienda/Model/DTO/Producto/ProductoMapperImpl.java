package com.example.tienda.Model.DTO.Producto;

import com.example.tienda.Model.Entity.ProductoEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-18T15:29:40-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
public class ProductoMapperImpl implements ProductoMapper {

    @Override
    public ProductoDTO EntityToDto(ProductoEntity producto) {
        if ( producto == null ) {
            return null;
        }

        ProductoDTO productoDTO = new ProductoDTO();

        productoDTO.setCodigo( producto.getCodigo() );
        productoDTO.setNombre( producto.getNombre() );
        productoDTO.setPrecio( (float) producto.getPrecio() );
        productoDTO.setStock( producto.getStock() );

        return productoDTO;
    }

    @Override
    public ProductClienteDTO EntityToDtoCliente(ProductoEntity producto) {
        if ( producto == null ) {
            return null;
        }

        ProductClienteDTO productClienteDTO = new ProductClienteDTO();

        productClienteDTO.setCategoria( producto.getCategoria() );
        productClienteDTO.setCodigo( producto.getCodigo() );
        productClienteDTO.setCodigobarra( producto.getCodigobarra() );
        productClienteDTO.setDescripcion( producto.getDescripcion() );
        productClienteDTO.setEstado( producto.getEstado() );
        productClienteDTO.setFoto( producto.getFoto() );
        productClienteDTO.setMarca( producto.getMarca() );
        productClienteDTO.setNombre( producto.getNombre() );
        productClienteDTO.setPrecio( (float) producto.getPrecio() );
        productClienteDTO.setStock( producto.getStock() );

        return productClienteDTO;
    }
}
