package fr.spring.cinema.dao;


import fr.spring.cinema.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin("http://localhost:4200")
public interface FilmRepository extends JpaRepository<Film,Long> {
}
