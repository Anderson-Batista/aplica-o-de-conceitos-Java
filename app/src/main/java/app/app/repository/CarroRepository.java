package app.app.repository;

import app.app.entity.Carro;
import app.app.entity.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CarroRepository extends JpaRepository<Carro, Long> {

    public List<Carro> findByNome(String nome);

    public List<Carro> findByMarca(Marca marca);

    public List<Carro> findByMarcaNome(String nome);

    @Query("FROM Carro c WHERE c.ano > :ano")
    public List<Carro> findAcimaAno(int ano);
}
