package fr.epsi.b32324c1.repository;

import fr.epsi.b32324c1.entity.BeerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeerRepository extends JpaRepository<BeerEntity, Long> {
}

