package BaseDatos;

import domain.PersonaDTO;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDAO {
    
    public int insertar(PersonaDTO persona) throws SQLException;
    
    public int Actualizar(PersonaDTO persona) throws SQLException;
    
    public int Eliminar(PersonaDTO persona) throws SQLException;
    
    public List<PersonaDTO> seleccionar() throws SQLException;
}
