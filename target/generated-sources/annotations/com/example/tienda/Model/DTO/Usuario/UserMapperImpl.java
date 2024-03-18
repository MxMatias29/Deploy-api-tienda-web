package com.example.tienda.Model.DTO.Usuario;

import com.example.tienda.Model.Entity.UserEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-03-18T15:29:40-0500",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public UserAdminDTO EntityToDto(UserEntity user) {
        if ( user == null ) {
            return null;
        }

        UserAdminDTO userAdminDTO = new UserAdminDTO();

        userAdminDTO.setCodigo( user.getCodigo() );
        userAdminDTO.setNombre( user.getNombre() );
        userAdminDTO.setApellido( user.getApellido() );
        userAdminDTO.setDni( user.getDni() );
        userAdminDTO.setTelefono( user.getTelefono() );
        userAdminDTO.setCorreo( user.getCorreo() );

        return userAdminDTO;
    }
}
