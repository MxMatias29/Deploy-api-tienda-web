package com.example.tienda.Model.DTO.Proveedor;

import com.example.tienda.Model.Entity.ProveedorEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-18T15:29:40-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
public class ProveedorMapperImpl implements ProveedorMapper {

    @Override
    public ProveedorDTO EntityToDto(ProveedorEntity proveedor) {
        if ( proveedor == null ) {
            return null;
        }

        ProveedorDTO proveedorDTO = new ProveedorDTO();

        proveedorDTO.setCodigo( proveedor.getCodigo() );
        proveedorDTO.setNombre( proveedor.getNombre() );
        proveedorDTO.setRuc( proveedor.getRuc() );
        proveedorDTO.setTelefono( proveedor.getTelefono() );

        return proveedorDTO;
    }
}
