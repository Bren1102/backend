
package com.porfolio.mb.Interface;

import com.porfolio.mb.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer una lista de personas

    /**
     *
     * @return
     */
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona 
    public void savePersona(Persona persona);
    
    //Eliminar un usuario pero lo buscamos por Id
    public void deletePersona(Long id);
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
