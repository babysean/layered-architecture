package layeredarchitecture.infrastructure;

import java.util.List;
import java.util.Optional;
import layeredarchitecture.infrastructure.entity.StoreFruitListEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreFruitListRepository extends JpaRepository<StoreFruitListEntity, Long> {

    List<StoreFruitListEntity> findByStoreEntityId(Long storeId);

    Optional<StoreFruitListEntity> findByStoreEntityIdAndFruitEntityId(Long storeId, Long fruitId);
}
