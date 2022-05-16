package ifsp.gerenciador.repository;

import ifsp.gerenciador.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
